package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

public class DriveSubsystem {
    /**
     * The hardware map for the robot, granted by the OpMode, used to initialize hardware devices.
     */
    private final HardwareMap hardwareMap;

    // Declare hardware devices below
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private IMU imu;

    /**
     * Constructor for the Drive_Subsystem class.
     *
     * @param hardwareMap The hardware map for the robot, granted by the OpMode, used to initialize hardware devices.
     */
    public DriveSubsystem(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
    }

    /**
     * Initializes the hardware devices for the drive subsystem.
     */
    public void init() {
        leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        rightMotor = hardwareMap.get(DcMotor.class, "right_motor");
        imu = hardwareMap.get(IMU.class, "imu");
        imu.initialize(new IMU.Parameters(
                new RevHubOrientationOnRobot(
                        RevHubOrientationOnRobot.LogoFacingDirection.UP,
                        RevHubOrientationOnRobot.UsbFacingDirection.LEFT
                )
        ));
    }


}
