angular.module("crispr", ['ngRoute']).config(
    ['$routeProvider', function ($routeProvider) {
        //noinspection JSUnresolvedFunction
        $routeProvider.when('/', {
            templateUrl: 'partials/home.html'
        }).when('/connexion', {
            templateUrl: 'partials/FormConnection.html'
        }).otherwise({
            redirectTo: '/'
        });
    }]);