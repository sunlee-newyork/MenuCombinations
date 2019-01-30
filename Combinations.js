class Combinations {
	constructor() {
		this.combos = []
	}

	combine(list, target, combo, i) {
		// if the combo reached the target
		if (target <= 0) {
			// combo hit target
			if (target === 0) this.combos.push([...combo])

			return
		}

		// Last iteration will return recursion
		if (i === list.length) return

		// Keep adding and run again
		combo.push(list[i])
		this.combine(list, target - list[i], combo, i + 1)

		// Keep removing and run again
		combo.pop()
		this.combine(list, target, combo, i + 1)
	}

	run(list, target) {
		this.combine(list, target, [], 0)

		return this.combos
	}
}

/*****************/
/* SAMPLE RUNNER */
/*****************/

const c = new Combinations()
c.run([6,2,3,4,5,1,2], 10)