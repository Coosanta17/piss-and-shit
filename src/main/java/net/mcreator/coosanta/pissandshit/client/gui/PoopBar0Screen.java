
package net.mcreator.coosanta.pissandshit.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.coosanta.pissandshit.world.inventory.PoopBar0Menu;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition9Procedure;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition8Procedure;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition7Procedure;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition6Procedure;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition5Procedure;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition4Procedure;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition2Procedure;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition1Procedure;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition10Procedure;
import net.mcreator.coosanta.pissandshit.procedures.PoopBarCondition0Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PoopBar0Screen extends AbstractContainerScreen<PoopBar0Menu> {
	private final static HashMap<String, Object> guistate = PoopBar0Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PoopBar0Screen(PoopBar0Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 25;
		this.imageHeight = 25;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		if (PoopBarCondition0Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_empty.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}
		if (PoopBarCondition1Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_1.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}
		if (PoopBarCondition2Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_2.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_3.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);

		if (PoopBarCondition4Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_4.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}
		if (PoopBarCondition5Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_5.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}
		if (PoopBarCondition6Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_6.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}
		if (PoopBarCondition7Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_7.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}
		if (PoopBarCondition8Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_8.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}
		if (PoopBarCondition9Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_9.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}
		if (PoopBarCondition10Procedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build())) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("piss_and_shit:textures/screens/poop_lvl_10.png"));
			this.blit(ms, this.leftPos + 3, this.topPos + 89, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}

	public static void screenInit() {
	}
}
