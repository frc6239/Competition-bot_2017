package org.usfirst.frc.team6239.robot;

import edu.wpi.first.wpilibj.Joystick; 
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6239.robot.commands.DumpDownCommand;
import org.usfirst.frc.team6239.robot.commands.DumpUpCommand;

import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team6239.robot.commands.RollerGrabberCommand;
import org.usfirst.frc.team6239.robot.subsystems.RollerGrabberSub;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {


	public Joystick gamepad;
	public Button LeftJoystick;
	public Button RightJoystick;
	public Joystick stickcontrolerL;
	public Joystick stickcontrolerR;
	public Button RollerGrab;
	public Button CancelRoller;
	public Button DumpUp;
	public Button DumpDown;
	
	
	public OI() {
	
		gamepad = new Joystick(0);
		LeftJoystick = new JoystickButton(gamepad, 0);
		RightJoystick = new JoystickButton(gamepad, 1); 
		stickcontrolerL = new Joystick(1);
		stickcontrolerR = new Joystick(2);
		RollerGrab = new JoystickButton(stickcontrolerR, 1);
        RollerGrab.whileHeld(new RollerGrabberCommand());
    	DumpUp = new JoystickButton(stickcontrolerL,2);
		DumpDown = new JoystickButton(stickcontrolerR,2);
		try {
			DumpUp.whenPressed(new DumpUpCommand());
			DumpDown.whenPressed(new DumpDownCommand());
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
}
	public boolean isMoving() {

		return (stickcontrolerL.getY() < -.05 && stickcontrolerR.getY() < -.05);

	}

}
