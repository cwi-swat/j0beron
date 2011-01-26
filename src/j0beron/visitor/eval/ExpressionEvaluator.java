package j0beron.visitor.eval;

import j0beron.visitor.ast.expr.Add;
import j0beron.visitor.ast.expr.And;
import j0beron.visitor.ast.expr.Div;
import j0beron.visitor.ast.expr.Eq;
import j0beron.visitor.ast.expr.GEq;
import j0beron.visitor.ast.expr.GT;
import j0beron.visitor.ast.expr.LEq;
import j0beron.visitor.ast.expr.LT;
import j0beron.visitor.ast.expr.Lookup;
import j0beron.visitor.ast.expr.Mod;
import j0beron.visitor.ast.expr.Mul;
import j0beron.visitor.ast.expr.NEq;
import j0beron.visitor.ast.expr.Neg;
import j0beron.visitor.ast.expr.Not;
import j0beron.visitor.ast.expr.Or;
import j0beron.visitor.ast.expr.Pos;
import j0beron.visitor.ast.expr.Sub;
import j0beron.visitor.eval.env.Env;
import j0beron.visitor.eval.env.Ref;
import j0beron.visitor.eval.values.Bool;
import j0beron.visitor.eval.values.Int;
import j0beron.visitor.eval.values.Value;

public class ExpressionEvaluator {
	/*
	 * Literals and variable lookup
	 */
	
	public Value eval(j0beron.visitor.ast.expr.Int i, Env env) {
		return new Int(i.getValue());
	}
	
	public Value eval(Lookup lookup, Env env) {
		Ref x = lookup.lvalueOf(this, env);
		return x.get();
	}
	
	/*
	 * Binary expressions
	 */
	
	public Value eval(Add add, Env env) {
		Value x = add.getLhs().accept(this, env);
		Value y = add.getRhs().accept(this, env);
		return new Int(((Int)x).getValue() + ((Int)y).getValue());
	}

	public Value eval(Sub sub, Env env) {
		Value x = sub.getLhs().accept(this, env);
		Value y = sub.getRhs().accept(this, env);
		return new Int(((Int)x).getValue() - ((Int)y).getValue());
	}
	
	public Value eval(Mul add, Env env) {
		Value x = add.getLhs().accept(this, env);
		Value y = add.getRhs().accept(this, env);
		return new Int(((Int)x).getValue() * ((Int)y).getValue());
	}
	
	public Value eval(Div div, Env env) {
		Value x = div.getLhs().accept(this, env);
		Value y = div.getRhs().accept(this, env);
		return new Int(((Int)x).getValue() / ((Int)y).getValue());
	}
	
	public Value eval(Mod mod, Env env) {
		Value x = mod.getLhs().accept(this, env);
		Value y = mod.getRhs().accept(this, env);
		return new Int(((Int)x).getValue() % ((Int)y).getValue());
	}
	
	
	public Value eval(Or or, Env env) {
		Value x = or.getLhs().accept(this, env);
		if (((Bool)x).getValue()) {
			return x;
		}
		return or.getRhs().accept(this, env);
	}
	
	public Value eval(And and, Env env) {
		Value x = and.getLhs().accept(this, env);
		if (!((Bool)x).getValue()) {
			return x;
		}
		return and.getRhs().accept(this, env);
	}

	public Value eval(Eq eq, Env env) {
		Value x = eq.getLhs().accept(this, env);
		Value y = eq.getRhs().accept(this, env);
		return new Bool(((Int)x).getValue() == ((Int)y).getValue());
	}

	public Value eval(NEq neq, Env env) {
		Value x = neq.getLhs().accept(this, env);
		Value y = neq.getRhs().accept(this, env);
		return new Bool(((Int)x).getValue() != ((Int)y).getValue());
	}
	public Value eval(GEq geq, Env env) {
		Value x = geq.getLhs().accept(this, env);
		Value y = geq.getRhs().accept(this, env);
		return new Bool(((Int)x).getValue() >= ((Int)y).getValue());
	}
	public Value eval(LEq leq, Env env) {
		Value x = leq.getLhs().accept(this, env);
		Value y = leq.getRhs().accept(this, env);
		return new Bool(((Int)x).getValue() <= ((Int)y).getValue());
	}
	
	public Value eval(GT gt, Env env) {
		Value x = gt.getLhs().accept(this, env);
		Value y = gt.getRhs().accept(this, env);
		return new Bool(((Int)x).getValue() > ((Int)y).getValue());
	}

	public Value eval(LT lt, Env env) {
		Value x = lt.getLhs().accept(this, env);
		Value y = lt.getRhs().accept(this, env);
		return new Bool(((Int)x).getValue() < ((Int)y).getValue());
	}

	/*
	 * Unary expressions
	 */
	
	public Value eval(Not not, Env env) {
		Value x = not.getArg().accept(this, env);
		return new Bool(!((Bool)x).getValue());
	}
	
	public Value eval(Neg neg, Env env) {
		Value x = neg.getArg().accept(this, env);
		return new Int(- ((Int)x).getValue());
	}
	
	public Value eval(Pos pos, Env env) {
		return pos.getArg().accept(this, env);
	}
}
