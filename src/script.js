/**
 * Created by gorshkov on 28.12.2016.
 */



for (var i = 10; i < 25; i++){
    var inf = Math.pow(2, 53 * i);
    document.write("Math.pow(2, 53 * " + i + ") = " + inf + "<br>");
}

document.write("<br>");


for (var i = 10; i < 25; i++){
    var inf = Math.pow(2, - 53 * i);
    document.write("Math.pow(2, 53 * " + i + ") = " + inf + "<br>");
}

document.write("<br>");

document.write(NaN.toExponential())

x = NaN;

document.write("<br>");

document.write(x != x);
