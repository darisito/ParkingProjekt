package parkhaus;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "level2Servlet", value = "/level2-servlet")
public class Level2Servlet extends ParkhausServlet {

    @Override
    String NAME(){
        return "Level2";
    }

    @Override
    int MAX(){ // maximum number of parking slots on level 2
        return 12;
    }

    @Override
    String config(){
        return this.MAX() + ",8,20,100,10"; // use default config
        // Config Format is "Max, open_from, open_to, delay, simulation_speed"
        // e.g. return this.MAX() + ",10,20,50,20";
    }
}