function posteCtrl ($scope, $http) {
    //requete
    $http.get("/poste")
        .success(function (response){

            $scope.poste = [
                {
                    titre: 'Bonjour'
                }
            ];
            console.log(poste.titre);
        })
        .error(function (){
            console.log("Erreur de la requete");
        });
}