angular.module('crispr', ['ngRoute']).config(
    ['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {
            templateUrl: 'partials/home.html'
        }).when('/connection', {
            templateUrl: 'partials/FormConnection.html'
        }).otherwise({
            redirectTo: '/'
        });
    }]);