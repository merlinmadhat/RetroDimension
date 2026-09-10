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
public class pastel_flipperAnimation {
	public static final AnimationDefinition Swing = AnimationDefinition.Builder.withLength(2.0559F)
			.addAnimation("bone", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4744F, KeyframeAnimations.degreeVec(0.0F, 22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.7907F, KeyframeAnimations.degreeVec(0.0F, 7.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.107F, KeyframeAnimations.degreeVec(0.0F, 55.0F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.2652F, KeyframeAnimations.degreeVec(0.0F, -87.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.6869F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.9504F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone",
					new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2109F, KeyframeAnimations.scaleVec(1.0F, 1.06F, 1.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.5799F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.7907F, KeyframeAnimations.scaleVec(1.0F, 1.04F, 1.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.1597F, KeyframeAnimations.scaleVec(1.0F, 0.98F, 1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.476F, KeyframeAnimations.scaleVec(1.0F, 1.14F, 1.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.7923F, KeyframeAnimations.scaleVec(1.0F, 1.05F, 1.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.9504F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone2",
					new AnimationChannel(AnimationChannel.Targets.SCALE, new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.9F, 0.8F, 0.9F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.1054F, KeyframeAnimations.scaleVec(0.8F, 0.8F, 1.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(0.2636F, KeyframeAnimations.scaleVec(1.0F, 0.8F, 0.9F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.4217F, KeyframeAnimations.scaleVec(1.0F, 0.8F, 1.1F), AnimationChannel.Interpolations.LINEAR), new Keyframe(1.5814F, KeyframeAnimations.scaleVec(0.9F, 1.0F, 0.9F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.9504F, KeyframeAnimations.scaleVec(0.9F, 0.8F, 0.9F), AnimationChannel.Interpolations.LINEAR)))
			.build();
}