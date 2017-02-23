<<<<<<< HEAD
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
            $http.post('http://localhost:8080/CreateArticle').then(function (data) {
                console.log(data);
                $scope.id_article = poste.id_article;
                $scope.titre = poste.titre;
                $scope.repoImage = poste.repoImage;
                $scope.contenu = poste.contenu;
                console.log(poste);
                console.log($scope.id_article);
                console.log($scope.repoImage);
                console.log($scope.titre);
                console.log($scope.contenu);
            }).error(function (reject) {
                console.log(reject);
            });
        }
=======
function posteCtrl ($scope) {
    //requete a faire
    $scope.poste =
        {
            //remplir ces champs avec les valeurs du formulaire
            id_article: 0,
            titre: '',
            repoImage: 'repoImage essai',
            contenu: ''
        };
    $scope.soumettreFormulairePoste = function (poste){
        $scope.id_article = poste.id_article;
        $scope.titre = poste.titre;
        $scope.repoImage = poste.repoImage;
        $scope.contenu = poste.contenu;
        console.log(poste);
        console.log($scope.titre);
    }
>>>>>>> e052e68f71ac2df377224587723d9f49a3757616
}