(function () {
    'use strict';
    angular.module('myApp', ['ui.router', 'ui.bootstrap', 'ui.bootstrap.tpls','ui.bootstrap.pagination', 'ngResource', 'ui.bootstrap',
                              'productModule', 'productDialogModule', 'productDetailsModule', 'navbarModule', 'footerModule'])

       .constant('URL', 'http://localhost:9999')
        .config(function ($stateProvider, $urlRouterProvider, $httpProvider) {
            $urlRouterProvider.otherwise('/home');

            $stateProvider

                .state('home', {
                    url: '/home',
                    views:{
                        'navbar': {
                            templateUrl: 'templates/navbar/navbar.html',
                            controller: 'navbarController'
                        },
                        'content':{

                            templateUrl: 'templates/products/product.html',
                            controller: 'productController'
                        },
                        'footer':{
                            templateUrl: 'templates/footer/footer.html',
                            controller: 'footerController'
                        }
                    }
                })
                .state('productDetails', {
                    url: '/product/:id',
                    views:{
                        'navbar': {
                            templateUrl: 'templates/navbar/navbar.html',
                            controller: 'navbarController'
                        },
                        'content':{

                            templateUrl: 'templates/products/product-detail.html',
                            controller: 'productDetailsController'
                        },
                        'footer':{
                            templateUrl: 'templates/footer/footer.html',
                            controller: 'footerController'
                        }
                    }

                })
                .state('productForm', {
                    url: '/product/new',
                    views:{
                        'navbar': {
                            templateUrl: 'templates/navbar/navbar.html',
                            controller: 'navbarController'
                        },
                        'content':{

                            templateUrl: 'templates/products/product-dialog.html',
                            controller: 'productDialogController'
                        },
                        'footer':{
                            templateUrl: 'templates/footer/footer.html',
                            controller: 'footerController'
                        }
                    }

                })
                .state('productEdit', {
                    url: '/product/:id/edit',
                    views:{
                        'navbar': {
                            templateUrl: 'templates/navbar/navbar.html',
                            controller: 'navbarController'
                        },
                        'content':{

                            templateUrl: 'templates/products/product-dialog.html',
                            controller: 'productDialogController'
                        },
                        'footer':{
                            templateUrl: 'templates/footer/footer.html',
                            controller: 'footerController'
                        }
                    }

                });
        });


})();

