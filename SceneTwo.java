  ImageFilter Test = new ImageFilter("IMG_3784.JPEG");
    drawImage(Test, 0, 0, 400, 400, 0);
    pause(1);
    Test.makeNegative();
    drawImage(Test, 0, 0, 400, 400, 0);
pause(1);
    Test.applySepia();
    drawImage(Test, 0, 0, 400, 400, 0);
    pause(1);
    Test.colorize();
    drawImage(Test, 0, 0, 400, 400, 0);
    pause(1);
    Test.sharpen();
    drawImage(Test, 0, 0, 400, 400, 0);
    pause(1);
    