angular.module('crispr', ['ngRoute']).config(
    ['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/home', {
            templateUrl: 'partials/home.html'
        }).when('/connexion', {
            templateUrl: 'partials/formConnection.html'
        }).otherwise({
            redirectTo: '/home'
        });
    }]);