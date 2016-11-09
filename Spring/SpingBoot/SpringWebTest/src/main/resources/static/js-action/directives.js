/**
 * Created by cloudyao on 2016/11/9.
 */
actionApp.directive('datePicker',function() {
    return {
        restrict:'AC',
        link:function(scope,elem,attrs) {
            elem.datepicker();
        }
    };
});