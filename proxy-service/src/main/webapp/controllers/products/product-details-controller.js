(function(){

    'use strict';
    angular.module('productDetailsModule', [])
            .controller('productDetailsController', productDetailsController);

            productDetailsController.$inject = ['$scope', '$http', 'URL', '$stateParams'];

            function productDetailsController($scope, $http, URL, $stateParams){

                $scope.product = {};
                $scope.productId = $stateParams.id;
                $scope.previous = previous;

                getProduct();

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

                function previous(){
                    window.history.back();
                }
                

            }

})();