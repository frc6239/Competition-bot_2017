package org.usfirst.frc.team6239.robot.AutoCommand;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6239.robot.Robot;

/**
 * Created by eliwa on 3/15/2017.
 */
public class TurnRobot extends Command {
    double degree,direction,intirot;
public TurnRobot(double degrees,double initrot, double direction){

    this.degree = degrees;
    this.direction = direction;
    this.intirot = initrot;

    requires(Robot.DRIVE_SUB);
}
    @Override
    protected void initialize() {
Robot.DRIVE_SUB.setInitialDegree(this.intirot);
    }



    @Override
    protected void execute() {
    Robot.DRIVE_SUB.TurnRobot(this.degree, this.direction);
    }

    @Override
    protected void end() {
    	Robot.DRIVE_SUB.tank(0,0);
    }

    @Override
    protected boolean isFinished() {
        return Robot.DRIVE_SUB.getIsDone();
    }

    @Override
    protected void interrupted() {

    }
}
