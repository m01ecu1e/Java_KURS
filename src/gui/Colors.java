package gui;

import java.awt.*;

public class Colors
{
    //public static final Color RECTANGLE_COLOR = new Color(94, 86, 51);//Buff
    public static final Color RECTANGLE_COLOR = new Color(250, 204, 147);

    //public static final Color RECTANGLE_COLOR_ALTERNATE = new Color(48, 71, 38);//Bud Green
    public static final Color RECTANGLE_COLOR_ALTERNATE = new Color(120,70,20);

    //public static final Color RECTANGLE_ACTIVE = new Color(255, 250, 205); //Lemon chiffon
    public static final Color RECTANGLE_ACTIVE = new Color(113, 189, 0);


    //public static final Color CHECKER_LIGHTER = Color.GRAY;
    //public static final Color CHECKER_DARKER = Color.BLACK;

    public static final Color CHECKER_LIGHTER = new Color(220,220,220);
    public static final Color CHECKER_DARKER = new Color(40,40,40);

    public static final CheckerColor CHECKER_COLOR_LIGHTER = CheckerColor.WHITE;
    public static final CheckerColor CHECKER_COLOR_DARKER = CheckerColor.BLACK;

    public static Color checkerColor(CheckerColor cc)
    {
        if (cc == CheckerColor.WHITE)
        {
            return CHECKER_LIGHTER;
        } else
        {
            return CHECKER_DARKER;
        }
    }

    boolean a = false;

    public Color alternateColor(Color color2, Color color1)
    {
        Color color = null;
        if (a)
        {
            color = color1;
        } else
        {
            color = color2;
        }
        a = !a;
        return color;
    }
}
