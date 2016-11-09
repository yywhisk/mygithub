/**
 * Created by cloudyao on 2016/11/9.
 */
actionApp.controller('View1Controller', ['$rootScope', '$scope', '$http',
    function ($rootScope, $scope, $http) {
        $scope.$on('$ViewContentLoaded', function () {
            console.log('页面加载完成');
        });
        $scope.search = function () {
            personName = $scope.personName;
            $http.get('search', {
                params: {personName: personName}
            }).success(function (data) {
                $scope.person = data;
            })
        };
    }]);

actionApp.controller('View2Controller', ['$rootScope', '$scope', '$http',
    function ($rootScope, $scope, $http) {
        $scope.$on('$ViewContentLoaded', function () {
            console.log('页面加载完成');
        });
    }]);