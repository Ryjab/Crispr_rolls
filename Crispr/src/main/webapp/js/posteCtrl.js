
function posteCtrl ($scope, $http) {
        $scope.poste =
            {
                //remplir ces champs avec les valeurs du formulaire
                id_article: 0,
                titre: '',
                repoImage: 'repoImage essai',
                contenu: ''
            };
        $scope.soumettreFormulairePoste = function (poste) {
            console.log("data"+ poste);
            $http({
            url: 'http://localhost:8080/CreateArticle',
            method: "POST",
            data: poste,
            headers: {'Content-Type': 'application/json'}
        }).success(function (data, status, headers, config) {
                console.log(data); 
            }).error(function (data, status, headers, config) {
               console.log("error"); 
            });
           
        }



}