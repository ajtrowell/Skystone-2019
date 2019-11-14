import com.google.common.truth.Truth;
import static com.google.common.truth.Truth.assertThat;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.hardware.Dimensions;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import org.firstinspires.ftc.teamcode.hardware.MecanumDrive;
import org.firstinspires.ftc.teamcode.hardware.MainHardware;
import com.ftc16626.missioncontrol.math.Vector2;
import com.ftc16626.missioncontrol.math.kinematics.Kinematics;
import com.ftc16626.missioncontrol.math.kinematics.KinematicsIntegrator;

import org.openftc.revextensions2.ExpansionHubEx;
import org.openftc.revextensions2.ExpansionHubMotor;


public class KinematicMecanumTest {

  double encoderCountsPerRev = 386.3 * 2;
  double gearRatio = 1;
  double wheelRadius = 100 / 2;
  public final Dimensions dimensionsDriveTrain = new Dimensions(198.125, 336, 50);
  double length = dimensionsDriveTrain.getLength();
  double width = dimensionsDriveTrain.getWidth();

  Kinematics kinematics;


  @Before
  public void initializeBeforeEachTest() {
    kinematics = new Kinematics(length / 2, width / 2,wheelRadius);
  }

  @Test
  public void kinematicsForwardDriveTest() {
    double traveledWheelRadians = 2 * Math.PI;
      double motorVelFrontLeft = traveledWheelRadians;
      double motorVelFrontRight = traveledWheelRadians;
      double motorVelBackLeft = traveledWheelRadians;
      double motorVelBackRight = traveledWheelRadians;

     double[] motion = kinematics.mecanumDrive(
        motorVelFrontLeft, motorVelFrontRight,
        motorVelBackLeft, motorVelBackRight
        );
     assertThat(motion).isNotEmpty();
  }

}
