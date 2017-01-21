angular.module('crispr', []).config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl : 'partials/home.html'
        })
        .when('/connexion', {
            templateUrl : 'partials/connexion.html'
        })
        .otherwise({redirectTo : '/'});
}]);