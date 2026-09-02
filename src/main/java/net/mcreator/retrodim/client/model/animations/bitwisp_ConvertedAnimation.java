package net.mcreator.retrodim.client.model.animations;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 5.1.6 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class bitwisp_ConvertedAnimation {
	public static final AnimationDefinition animation = AnimationDefinition.Builder.withLength(8.0F).looping()
			.addAnimation("bone2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -45.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(-360.0F, 0.0F, 315.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone2",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, -6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.posVec(1.0F, -12.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(8.0F, KeyframeAnimations.posVec(1.0F, -6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone3",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 360.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone3",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -9.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(-360.0F, -360.0F, 360.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone4",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.0F, 45.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(-315.0F, -315.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone5",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 4.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 45.0F, -45.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(0.0F, -315.0F, 315.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone6",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 8.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone7",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.0F, 45.0F, -45.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(-315.0F, -315.0F, 315.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone7",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 4.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 8.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 4.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("bone8",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(8.0F, KeyframeAnimations.degreeVec(-360.0F, -360.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone8", new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 7.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.0F, KeyframeAnimations.posVec(-3.0F, 8.0F, -4.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(2.0F, KeyframeAnimations.posVec(-2.0F, 11.0F, -9.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(3.0F, KeyframeAnimations.posVec(3.0F, 14.0F, -11.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(4.0F, KeyframeAnimations.posVec(8.0F, 17.0F, -10.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(5.0F, KeyframeAnimations.posVec(12.0F, 18.0F, -5.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(6.0F, KeyframeAnimations.posVec(11.0F, 14.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(7.0F, KeyframeAnimations.posVec(6.0F, 10.0F, 4.0F), AnimationChannel.Interpolations.CATMULLROM), new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 7.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}