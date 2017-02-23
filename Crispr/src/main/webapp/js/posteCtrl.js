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
}