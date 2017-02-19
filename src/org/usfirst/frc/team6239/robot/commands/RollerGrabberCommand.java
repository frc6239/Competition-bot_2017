package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.subsystems.RollerGrabberSub;

/**
 * Created by HighSchoolDude1 on 2/17/2017.
 */
public class RollerGrabberCommand extends Command {
    public RollerGrabberCommand() {
        requires(Robot.roller_grab);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
    public void execute() {
        Robot.roller_grab.RollerFront();
    }
}
