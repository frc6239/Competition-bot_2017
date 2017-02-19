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
	

	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a 
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

	Button DumpUp;
	Button DumpDown;	
	
	
	public OI() {

//		try{
//		DumpUp.whenPressed(new DumpUpCommand());
//		DumpDown.whenPressed(new DumpDownCommand());
//		}catch(Exception e){
//			System.out.println(e);
//		}
		gamepad = new Joystick(0);
		LeftJoystick = new JoystickButton(gamepad, 0);
		RightJoystick = new JoystickButton(gamepad, 1); 
		stickcontrolerL = new Joystick(1);
		stickcontrolerR = new Joystick(2);
		RollerGrab = new JoystickButton(stickcontrolerR, 1);
        RollerGrab.whileHeld(new RollerGrabberCommand());
		
		
		
}

}
