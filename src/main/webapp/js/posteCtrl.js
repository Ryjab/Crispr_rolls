function posteCtrl ($scope) {
    //requete
    $http.get("/poste")
        .success(function (response){
            $scope.poste = [
                {
                    titre: response.data
                }
            ];
        })
        .error();
}