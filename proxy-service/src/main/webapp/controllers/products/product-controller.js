(function () {
    'use strict';
    angular.module('productModule', [])

        .controller('productController', productController);
        productController.$inject = ['$scope', '$state', 'URL', '$http'];
        function productController($scope, $state, URL, $http) {

        $scope.products = [];
        $scope.supprimer = supprimer;

        getAllProducts();

        function getAllProducts() {

            $http({url: URL + '/product-service/api/product/all', method: 'GET'})
                .then(function successCallBack(response) {
                    $scope.products = response.data;

                }, function errorCallBack(error) {
                    console.log(error);
                });
        }

        function supprimer(id){
            
            if(confirm("Voulez-vous vraiment supprimer ce produit ? ")){
                $http({url: URL + '/product-service/api/product/' + id, method: 'DELETE', transformResponse: [function(data){return data;}]})
                    .then(function successCallBack(response) {
                        //$scope.products = response.data;
                        getAllProducts();
                    }, function errorCallBack(error) {
                        console.log(error);
                    });
            }

        }



    }

})();