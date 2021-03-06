package jadx.core.dex.visitors;

import jadx.core.dex.nodes.ClassNode;
import jadx.core.dex.nodes.MethodNode;
import jadx.core.utils.exceptions.JadxException;

public class AbstractVisitor implements IDexTreeVisitor {

	@Override
	public boolean visit(ClassNode cls) throws JadxException {
		return true;
	}

	@Override
	public void visit(MethodNode mth) throws JadxException {
	}

}
