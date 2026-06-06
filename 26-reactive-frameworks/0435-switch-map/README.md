# 0435 — SwitchMap

Use the library's switchMap on a virtual/test scheduler so a new outer value cancels the previous inner stream. Built with kotlinx.coroutines Flow using `flatMapLatest` (Flow's switchMap) under `runTest`'s virtual-time scheduler.

## Run

    kotlin SwitchMap.main.kts
