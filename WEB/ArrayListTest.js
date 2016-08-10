var a = [33, 4, 1111, 222];
console.log(a.join());
console.log(a.reverse().join());
console.log(a.join(" "));
console.log(a.join(""));
var b = new Array(10);
console.log(b.join('- '));

console.log(a.sort());
console.log(a.sort(function(a, b) {
    return a-b;
}));

console.log(a.sort(function(a, b) {
    return b-a;
}));

var c = ['ant','Bug','cat','Dog'];
console.log(c.sort());
console.log(c.sort(function(s,t) {
    var a = s.toLowerCase();
    var b = t.toLowerCase();
    if(a > b) return 1;
    if(a < b) return -1;
    return 0;
}));

console.log(a.concat(4, 5));
console.log(a.concat([4, 5]));
console.log(a.concat([4,5],[6,7]));
console.log(a.concat(4, [5,[6,7]]));
console.log(a);
a = a.concat(4, [5,[6,7]]);
console.log(a);

console.log(a.slice(0,3));
console.log(a.slice(3,-2));
console.log(a.slice(3));

console.log(a.splice(5));
console.log(a);

console.log(a.splice(1,2));
console.log(a);

a.splice(1,1,[3,[2,1]],1,6,2);
console.log(a);

a.pop();
a.pop();
a.push(666,[1,[2,3]]);
console.log(a);

a.unshift(2,[1,[2,3]]);
a.shift();
console.log(a);

console.log(a.toString());

var data = [1,2,3,4,5];
var sum = 0;
data.forEach(function(value) {
    sum += value;
});
console.log(sum);
data.forEach(function(v, i, a)
{
    a[i] = v + 1;
}
);
console.log(data);

console.log(data.map(function(x) {
    return x*x;
})) ;

data = data.filter(function(x) {return x < 4;});
console.log(data);

if(data.every(function(x) {return x<10;}))
{
    console.log("we are so small");
}

if(data.some(function(x) {return x%2 === 0; }))
{
    console.log("we have a num");
}

data.push(4);
//数组求和
var sum = data.reduce(function(x, y) {return x+y;}, 0);
console.log(sum);
//数组求积
var product = data.reduce(function(x,y) {return x*y;}, 1);
console.log(product);
//求最大值
var max = data.reduce(function(x, y) {return (x>y)?x:y;})
console.log(max);

var big = data.reduceRight(function (accumulator,value) {
    return Math.pow(value, accumulator);
})
console.log(big);

data.push(2,3);
console.log(data.indexOf(2));
console.log(data.lastIndexOf(2));
console.log(data.indexOf(2,3));
console.log(data.lastIndexOf(2,-1));

if(Array.isArray(data))
{
    console.log("I am an Array");
}

var e = {"0":"a", "1":"b", "2":"c", length:3};
console.log(Array.prototype.join.call(e,"+"));
console.log(Array.prototype.slice.call(e,1,2));
console.log(Array.prototype.map.call(e,function(x) {return x.toUpperCase();}));

Array.join = Array.join || function (a,sep) {
        return Array.prototype.join.call(a,sep);
    };
console.log(Array.join(e,"-"));
