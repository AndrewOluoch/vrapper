package net.sourceforge.vrapper.vim.commands.motions;

import net.sourceforge.vrapper.platform.TextContent;

public class MoveLeft extends LeftRightMotion {
	@Override
	protected int destination(int offset, TextContent content, int count) {
	    int lineBegin = content.getLineInformationOfOffset(offset).getBeginOffset();
		return Math.max(lineBegin, offset - count);
	}
}
