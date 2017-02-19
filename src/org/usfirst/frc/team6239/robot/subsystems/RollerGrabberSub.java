package org.usfirst.frc.team6239.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.RollerGrabberCommand;

/**
 * Created by HighSchoolDude1 on 2/17/2017.
 */
public class RollerGrabberSub extends Subsystem {

    @Override
    protected void initDefaultCommand() {
        //setDefaultCommand(new RollerGrabberCommand);
    }
    public void RollerFront() {

        if (Robot.robotmap.dumperUp || !Robot.robotmap.driving) {
            RollerBack();
        }else {
            Robot.robotmap.RollerGrabTal.set(1);

        }


    }
    public void RollerBack() {
        Robot.robotmap.RollerGrabTal.set(-1);
    }
}
