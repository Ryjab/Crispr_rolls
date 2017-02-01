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
        console.log(poste);
    }
}