/**
 * Created by elabassi-work on 22/11/2016.
 */

angular.module("crispr", ['ngRoute']).config(
    ['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {
            templateUrl: 'partials/home.html'
        }).when('/connexion', {
            templateUrl: 'partials/connexion.html'
        }).when('/poste', {
            templateUrl: 'partials/poste.html',
            controller : posteCtrl
        }).when('/publication', {
            templateUrl: 'partials/formulairePoste.html',
            controller : posteCtrl
        }).otherwise({
            redirectTo: '/'
        });
    }]);