function max() {
    var max = Number.NEGATIVE_INFINITY;
    for(var i = 0; i < arguments.length; i++)
    if (arguments[i] > max) max = arguments[i];
    return max;
}
var largest = max(1,2,3,4,5,6,7,8,9,10);
console.log(largest);

var factorial = function (x) {
    if(x <= 1) return 1;
    return x*arguments.callee(x-1);
};
console.log(factorial(5));

var a = [function (x) {
    return x*x;
}, 20];
console.log(a[0](a[1]));

var factorial1 = function (n) {
    if(n > 0 && isFinite(n) && n == Math.round(n)) {
        if (!(n in factorial1))
            factorial1[n] = n*factorial1(n-1);
        return factorial1[n];
    }
    else return NaN;
}
factorial1[1] = 1;
factorial1(6);
console.log(factorial1[5]);

function compose(f, g) {
    return function () {
        return f.call(this, g.apply(this, arguments));
    };
}
var square = function(x) {
    return x*x;
}

var sum = function(x, y) {
    return x+y;
}

var squareofsum = compose(square, sum);
console.log(squareofsum(2,3));

