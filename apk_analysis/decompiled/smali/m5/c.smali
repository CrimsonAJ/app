.class public final Lm5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm5/c;->a:I

    iput-object p2, p0, Lm5/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 8

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm8/c;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Lm8/c;->c()Lm8/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 10
    monitor-exit v0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    iget-object v0, v1, Lm8/a;->c:Lm8/b;

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lm8/c;

    .line 22
    .line 23
    sget-object v3, Lm8/c;->i:Ljava/util/logging/Logger;

    .line 24
    .line 25
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    iget-object v4, v0, Lm8/b;->a:Lm8/c;

    .line 34
    .line 35
    iget-object v4, v4, Lm8/c;->a:Lcom/google/firebase/messaging/u;

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    const-string v6, "starting"

    .line 42
    .line 43
    invoke-static {v1, v0, v6}, Lcom/google/android/gms/internal/measurement/u1;->a(Lm8/a;Lm8/b;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-wide/16 v4, -0x1

    .line 48
    .line 49
    :goto_1
    :try_start_1
    invoke-static {v2, v1}, Lm8/c;->a(Lm8/c;Lm8/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    iget-object v2, v0, Lm8/b;->a:Lm8/c;

    .line 55
    .line 56
    iget-object v2, v2, Lm8/c;->a:Lcom/google/firebase/messaging/u;

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    sub-long/2addr v2, v4

    .line 63
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/u1;->B(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const-string v3, "finished run in "

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/measurement/u1;->a(Lm8/a;Lm8/b;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v6

    .line 78
    :try_start_2
    iget-object v2, v2, Lm8/c;->a:Lcom/google/firebase/messaging/u;

    .line 79
    .line 80
    iget-object v2, v2, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 83
    .line 84
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 85
    .line 86
    .line 87
    throw v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 88
    :catchall_1
    move-exception v2

    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    iget-object v3, v0, Lm8/b;->a:Lm8/c;

    .line 92
    .line 93
    iget-object v3, v3, Lm8/c;->a:Lcom/google/firebase/messaging/u;

    .line 94
    .line 95
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 96
    .line 97
    .line 98
    move-result-wide v6

    .line 99
    sub-long/2addr v6, v4

    .line 100
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/measurement/u1;->B(J)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const-string v4, "failed a run in "

    .line 105
    .line 106
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-static {v1, v0, v3}, Lcom/google/android/gms/internal/measurement/u1;->a(Lm8/a;Lm8/b;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    throw v2

    .line 114
    :catchall_2
    move-exception v1

    .line 115
    monitor-exit v0

    .line 116
    throw v1
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method private final b()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Le1/h;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 11
    .line 12
    iget-object v2, v2, Le1/h;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    instance-of v3, v2, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    sget-object v3, Landroidx/work/impl/workers/ConstraintTrackingWorker;->m:Ljava/lang/String;

    .line 37
    .line 38
    const-string v4, "No worker to delegate to."

    .line 39
    .line 40
    new-array v0, v0, [Ljava/lang/Throwable;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v4, v0}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Le1/m;

    .line 46
    .line 47
    invoke-direct {v0}, Le1/m;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->k:Lp1/j;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lp1/j;->j(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getWorkerFactory()Le1/z;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iget-object v5, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->h:Landroidx/work/WorkerParameters;

    .line 65
    .line 66
    invoke-virtual {v3, v4, v2, v5}, Le1/z;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iput-object v3, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l:Landroidx/work/ListenableWorker;

    .line 71
    .line 72
    if-nez v3, :cond_2

    .line 73
    .line 74
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sget-object v3, Landroidx/work/impl/workers/ConstraintTrackingWorker;->m:Ljava/lang/String;

    .line 79
    .line 80
    const-string v4, "No worker to delegate to."

    .line 81
    .line 82
    new-array v0, v0, [Ljava/lang/Throwable;

    .line 83
    .line 84
    invoke-virtual {v2, v3, v4, v0}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    new-instance v0, Le1/m;

    .line 88
    .line 89
    invoke-direct {v0}, Le1/m;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->k:Lp1/j;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Lp1/j;->j(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v3}, Lf1/k;->b0(Landroid/content/Context;)Lf1/k;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    iget-object v3, v3, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 107
    .line 108
    invoke-virtual {v3}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getId()Ljava/util/UUID;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v3, v4}, LG6/e;->l(Ljava/lang/String;)Ln1/j;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-nez v3, :cond_3

    .line 125
    .line 126
    new-instance v0, Le1/m;

    .line 127
    .line 128
    invoke-direct {v0}, Le1/m;-><init>()V

    .line 129
    .line 130
    .line 131
    iget-object v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->k:Lp1/j;

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Lp1/j;->j(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_3
    new-instance v4, Lj1/c;

    .line 138
    .line 139
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v1}, Landroidx/work/impl/workers/ConstraintTrackingWorker;->getTaskExecutor()Lq1/a;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-direct {v4, v5, v6, v1}, Lj1/c;-><init>(Landroid/content/Context;Lq1/a;Lj1/b;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v4, v3}, Lj1/c;->c(Ljava/util/Collection;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getId()Ljava/util/UUID;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v4, v3}, Lj1/c;->a(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_5

    .line 170
    .line 171
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    sget-object v4, Landroidx/work/impl/workers/ConstraintTrackingWorker;->m:Ljava/lang/String;

    .line 176
    .line 177
    const-string v5, "Constraints met for delegate "

    .line 178
    .line 179
    invoke-static {v5, v2}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    new-array v6, v0, [Ljava/lang/Throwable;

    .line 184
    .line 185
    invoke-virtual {v3, v4, v5, v6}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    :try_start_0
    iget-object v3, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l:Landroidx/work/ListenableWorker;

    .line 189
    .line 190
    invoke-virtual {v3}, Landroidx/work/ListenableWorker;->startWork()LS5/p;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    new-instance v4, Ld2/v;

    .line 195
    .line 196
    const/16 v5, 0xe

    .line 197
    .line 198
    invoke-direct {v4, v1, v5, v3}, Ld2/v;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getBackgroundExecutor()Ljava/util/concurrent/Executor;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-interface {v3, v4, v5}, LS5/p;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :catchall_0
    move-exception v3

    .line 210
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    sget-object v5, Landroidx/work/impl/workers/ConstraintTrackingWorker;->m:Ljava/lang/String;

    .line 215
    .line 216
    const-string v6, "Delegated worker "

    .line 217
    .line 218
    const-string v7, " threw exception in startWork."

    .line 219
    .line 220
    invoke-static {v6, v2, v7}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    const/4 v6, 0x1

    .line 225
    new-array v6, v6, [Ljava/lang/Throwable;

    .line 226
    .line 227
    aput-object v3, v6, v0

    .line 228
    .line 229
    invoke-virtual {v4, v5, v2, v6}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    iget-object v3, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Ljava/lang/Object;

    .line 233
    .line 234
    monitor-enter v3

    .line 235
    :try_start_1
    iget-boolean v2, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Z

    .line 236
    .line 237
    if-eqz v2, :cond_4

    .line 238
    .line 239
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    const-string v4, "Constraints were unmet, Retrying."

    .line 244
    .line 245
    new-array v0, v0, [Ljava/lang/Throwable;

    .line 246
    .line 247
    invoke-virtual {v2, v5, v4, v0}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    new-instance v0, Le1/n;

    .line 251
    .line 252
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 253
    .line 254
    .line 255
    iget-object v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->k:Lp1/j;

    .line 256
    .line 257
    invoke-virtual {v1, v0}, Lp1/j;->j(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto :goto_1

    .line 261
    :catchall_1
    move-exception v0

    .line 262
    goto :goto_2

    .line 263
    :cond_4
    new-instance v0, Le1/m;

    .line 264
    .line 265
    invoke-direct {v0}, Le1/m;-><init>()V

    .line 266
    .line 267
    .line 268
    iget-object v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->k:Lp1/j;

    .line 269
    .line 270
    invoke-virtual {v1, v0}, Lp1/j;->j(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    :goto_1
    monitor-exit v3

    .line 274
    return-void

    .line 275
    :goto_2
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 276
    throw v0

    .line 277
    :cond_5
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    sget-object v4, Landroidx/work/impl/workers/ConstraintTrackingWorker;->m:Ljava/lang/String;

    .line 282
    .line 283
    const-string v5, "Constraints not met for delegate "

    .line 284
    .line 285
    const-string v6, ". Requesting retry."

    .line 286
    .line 287
    invoke-static {v5, v2, v6}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    new-array v0, v0, [Ljava/lang/Throwable;

    .line 292
    .line 293
    invoke-virtual {v3, v4, v2, v0}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    new-instance v0, Le1/n;

    .line 297
    .line 298
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 299
    .line 300
    .line 301
    iget-object v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->k:Lp1/j;

    .line 302
    .line 303
    invoke-virtual {v1, v0}, Lp1/j;->j(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    return-void
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lm5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly4/p;

    .line 9
    .line 10
    sget-object v1, Ly4/p;->i:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    invoke-virtual {v0}, Ly4/p;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/16 v2, 0xf

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ly4/p;->f(I)Z

    .line 26
    .line 27
    .line 28
    monitor-exit v1

    .line 29
    :goto_0
    return-void

    .line 30
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw v0

    .line 32
    :pswitch_0
    const/4 v0, 0x0

    .line 33
    iget-object v1, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lw4/i;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lw4/i;->g(Z)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    iget-object v0, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lt0/X;

    .line 44
    .line 45
    invoke-virtual {v0}, Lt0/X;->a()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_2
    invoke-direct {p0}, Lm5/c;->b()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_3
    iget-object v0, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:Lp/l;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0}, Lp/l;->n()Z

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void

    .line 69
    :pswitch_4
    iget-object v0, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 72
    .line 73
    iget-boolean v1, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->f:Z

    .line 74
    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-string v2, "input_method"

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 91
    .line 92
    .line 93
    iput-boolean v2, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->f:Z

    .line 94
    .line 95
    :cond_2
    return-void

    .line 96
    :pswitch_5
    const/4 v0, 0x0

    .line 97
    iget-object v1, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Lp/o0;

    .line 100
    .line 101
    iput-object v0, v1, Lp/o0;->l:Lm5/c;

    .line 102
    .line 103
    invoke-virtual {v1}, Lp/o0;->drawableStateChanged()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_6
    invoke-direct {p0}, Lm5/c;->a()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_7
    const/4 v0, 0x0

    .line 112
    iget-object v1, p0, Lm5/c;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, LD4/n;

    .line 115
    .line 116
    iput-boolean v0, v1, LD4/n;->c:Z

    .line 117
    .line 118
    iget-object v0, v1, LD4/n;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 121
    .line 122
    iget-object v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:LV/d;

    .line 123
    .line 124
    if-eqz v2, :cond_3

    .line 125
    .line 126
    invoke-virtual {v2}, LV/d;->f()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_3

    .line 131
    .line 132
    iget v0, v1, LD4/n;->d:I

    .line 133
    .line 134
    invoke-virtual {v1, v0}, LD4/n;->h(I)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    iget v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    .line 139
    .line 140
    const/4 v3, 0x2

    .line 141
    if-ne v2, v3, :cond_4

    .line 142
    .line 143
    iget v1, v1, LD4/n;->d:I

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 146
    .line 147
    .line 148
    :cond_4
    :goto_2
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method
