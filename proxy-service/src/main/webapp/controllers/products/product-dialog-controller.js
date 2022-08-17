(function(){

    'use strict';
    angular.module('productDialogModule', [])
            .controller('productDialogController', productDialogController);

            productDialogController.$inject = ['$scope', '$http', 'URL', '$stateParams'];

            function productDialogController($scope, $http, URL, $stateParams){

               
                $scope.product = {};
                $scope.productId = $stateParams.id;
                $scope.save = save;

                if($scope.productId){
                    getProduct();
                }

                function getProduct(){

                    $http({url: URL + '/product-service/api/product/' + $scope.productId, method: 'GET'}).then(
                        function successCallBack(response){
                            $scope.product = response.data;
                        },
                        function errorCallBack(error){
                            console.log(error);
                        }
                    );
                }

                function save(){

                    if($scope.productId){

                        $http({url: URL + '/product-service/api/product/update', method: 'PUT', data: $scope.product}).then(
                            function successCallBack(response){
                                //$scope.product = response.data;
                                $scope.product = {};
                            },
                            function errorCallBack(error){
                                console.log(error);
                            }
                        );

                    }else{

                        $http({url: URL + '/product-service/api/product/create', method: 'POST', data: $scope.product}).then(
                            function successCallBack(response){
                                //$scope.product = response.data;
                                $scope.product = {};
                            },
                            function errorCallBack(error){
                                console.log(error);
                            }
                        );

                    }

                }
                 

            }

})();