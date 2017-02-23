function posteCtrl ($scope) {
    //requete a faire
    $scope.poste =
        {
            //remplir ces champs avec les valeurs du formulaire
            titre: '',
            repoImage: 'repoImage essai',
            contenu: ''
        };
    $scope.soumettreFormulairePoste = function (poste){
        $scope.titre = poste.titre;
        console.log(poste);
        console.log($scope.titre);
    }
}