
package edu.neu.csye6200.ca;

/**
 * @author gaura
 *
 */



public class BasicRule extends RuleA {

	
	public BasicRule() {
		//gaurang
	}



	@Override
	public int createNextCell(int inVal) {
		
		int outdir = 0;
		for (int i = 0; i < 6; i++) {
			if (ParticleCell.hasDirectionFlag(inVal, i))
				outdir = ParticleCell.setFlag(outdir, ParticleCell.getOppositeDirection(i)); 
		}
		
		return outdir;
	}

}

