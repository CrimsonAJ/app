.class public final Lj3/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements LN3/w;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:I

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public final a:[Lj3/d;

.field public final b:Ljava/util/Set;

.field public final c:[Lj3/d;

.field public final d:Li4/s;

.field public final e:Li4/w;

.field public final f:Lj3/i;

.field public f0:Z

.field public final g:Lk4/f;

.field public g0:I

.field public final h:Ll4/w;

.field public h0:Lj3/I;

.field public final i:Landroid/os/HandlerThread;

.field public i0:J

.field public final j:Landroid/os/Looper;

.field public j0:I

.field public final k:Lj3/D0;

.field public k0:Z

.field public final l:Lj3/C0;

.field public l0:Lj3/m;

.field public final m:J

.field public m0:J

.field public final n:Lj3/j;

.field public final o:Ljava/util/ArrayList;

.field public final p:Ll4/u;

.field public final q:Lj3/s;

.field public final r:Lj3/e0;

.field public final s:LF5/o;

.field public final t:Lj3/h;

.field public final u:J

.field public v:Lj3/x0;

.field public w:Lj3/l0;

.field public x:Lj3/G;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>([Lj3/d;Li4/s;Li4/w;Lj3/i;Lk4/f;IZLk3/e;Lj3/x0;Lj3/h;JLandroid/os/Looper;Ll4/u;Lj3/s;Lk3/l;)V
    .locals 5

    .line 1
    move-object/from16 v0, p14

    .line 2
    .line 3
    move-object/from16 v1, p16

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p15

    .line 9
    .line 10
    iput-object v2, p0, Lj3/J;->q:Lj3/s;

    .line 11
    .line 12
    iput-object p1, p0, Lj3/J;->a:[Lj3/d;

    .line 13
    .line 14
    iput-object p2, p0, Lj3/J;->d:Li4/s;

    .line 15
    .line 16
    iput-object p3, p0, Lj3/J;->e:Li4/w;

    .line 17
    .line 18
    iput-object p4, p0, Lj3/J;->f:Lj3/i;

    .line 19
    .line 20
    iput-object p5, p0, Lj3/J;->g:Lk4/f;

    .line 21
    .line 22
    iput p6, p0, Lj3/J;->D:I

    .line 23
    .line 24
    iput-boolean p7, p0, Lj3/J;->X:Z

    .line 25
    .line 26
    move-object v2, p9

    .line 27
    iput-object v2, p0, Lj3/J;->v:Lj3/x0;

    .line 28
    .line 29
    move-object v2, p10

    .line 30
    iput-object v2, p0, Lj3/J;->t:Lj3/h;

    .line 31
    .line 32
    move-wide/from16 v2, p11

    .line 33
    .line 34
    iput-wide v2, p0, Lj3/J;->u:J

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    iput-boolean v2, p0, Lj3/J;->z:Z

    .line 38
    .line 39
    iput-object v0, p0, Lj3/J;->p:Ll4/u;

    .line 40
    .line 41
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    iput-wide v3, p0, Lj3/J;->m0:J

    .line 47
    .line 48
    iget-wide v3, p4, Lj3/i;->g:J

    .line 49
    .line 50
    iput-wide v3, p0, Lj3/J;->m:J

    .line 51
    .line 52
    invoke-static {p3}, Lj3/l0;->h(Li4/w;)Lj3/l0;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    iput-object p3, p0, Lj3/J;->w:Lj3/l0;

    .line 57
    .line 58
    new-instance p4, Lj3/G;

    .line 59
    .line 60
    invoke-direct {p4, p3}, Lj3/G;-><init>(Lj3/l0;)V

    .line 61
    .line 62
    .line 63
    iput-object p4, p0, Lj3/J;->x:Lj3/G;

    .line 64
    .line 65
    array-length p3, p1

    .line 66
    new-array p3, p3, [Lj3/d;

    .line 67
    .line 68
    iput-object p3, p0, Lj3/J;->c:[Lj3/d;

    .line 69
    .line 70
    :goto_0
    array-length p3, p1

    .line 71
    if-ge v2, p3, :cond_0

    .line 72
    .line 73
    aget-object p3, p1, v2

    .line 74
    .line 75
    iput v2, p3, Lj3/d;->d:I

    .line 76
    .line 77
    iput-object v1, p3, Lj3/d;->e:Lk3/l;

    .line 78
    .line 79
    iget-object p4, p0, Lj3/J;->c:[Lj3/d;

    .line 80
    .line 81
    aput-object p3, p4, v2

    .line 82
    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    new-instance p1, Lj3/j;

    .line 87
    .line 88
    invoke-direct {p1, p0, v0}, Lj3/j;-><init>(Lj3/J;Ll4/u;)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, Lj3/J;->n:Lj3/j;

    .line 92
    .line 93
    new-instance p1, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, Lj3/J;->o:Ljava/util/ArrayList;

    .line 99
    .line 100
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 101
    .line 102
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Lj3/J;->b:Ljava/util/Set;

    .line 110
    .line 111
    new-instance p1, Lj3/D0;

    .line 112
    .line 113
    invoke-direct {p1}, Lj3/D0;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Lj3/J;->k:Lj3/D0;

    .line 117
    .line 118
    new-instance p1, Lj3/C0;

    .line 119
    .line 120
    invoke-direct {p1}, Lj3/C0;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, Lj3/J;->l:Lj3/C0;

    .line 124
    .line 125
    iput-object p0, p2, Li4/s;->a:Lj3/J;

    .line 126
    .line 127
    iput-object p5, p2, Li4/s;->b:Lk4/f;

    .line 128
    .line 129
    const/4 p1, 0x1

    .line 130
    iput-boolean p1, p0, Lj3/J;->k0:Z

    .line 131
    .line 132
    new-instance p1, Landroid/os/Handler;

    .line 133
    .line 134
    move-object/from16 p2, p13

    .line 135
    .line 136
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 137
    .line 138
    .line 139
    new-instance p2, Lj3/e0;

    .line 140
    .line 141
    invoke-direct {p2, p1, p8}, Lj3/e0;-><init>(Landroid/os/Handler;Lk3/e;)V

    .line 142
    .line 143
    .line 144
    iput-object p2, p0, Lj3/J;->r:Lj3/e0;

    .line 145
    .line 146
    new-instance p2, LF5/o;

    .line 147
    .line 148
    invoke-direct {p2, p0, p8, p1, v1}, LF5/o;-><init>(Lj3/J;Lk3/e;Landroid/os/Handler;Lk3/l;)V

    .line 149
    .line 150
    .line 151
    iput-object p2, p0, Lj3/J;->s:LF5/o;

    .line 152
    .line 153
    new-instance p1, Landroid/os/HandlerThread;

    .line 154
    .line 155
    const-string p2, "ExoPlayer:Playback"

    .line 156
    .line 157
    const/16 p3, -0x10

    .line 158
    .line 159
    invoke-direct {p1, p2, p3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 160
    .line 161
    .line 162
    iput-object p1, p0, Lj3/J;->i:Landroid/os/HandlerThread;

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iput-object p1, p0, Lj3/J;->j:Landroid/os/Looper;

    .line 172
    .line 173
    invoke-virtual {v0, p1, p0}, Ll4/u;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll4/w;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iput-object p1, p0, Lj3/J;->h:Ll4/w;

    .line 178
    .line 179
    return-void
.end method

.method public static F(Lj3/E0;Lj3/I;ZIZLj3/D0;Lj3/C0;)Landroid/util/Pair;
    .locals 9

    .line 1
    iget-object v0, p1, Lj3/I;->a:Lj3/E0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lj3/E0;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v2, v0

    .line 20
    :goto_0
    :try_start_0
    iget v5, p1, Lj3/I;->b:I

    .line 21
    .line 22
    iget-wide v6, p1, Lj3/I;->c:J

    .line 23
    .line 24
    move-object v3, p5

    .line 25
    move-object v4, p6

    .line 26
    invoke-virtual/range {v2 .. v7}, Lj3/E0;->i(Lj3/D0;Lj3/C0;IJ)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    move-object v5, v4

    .line 31
    move-object v4, v3

    .line 32
    invoke-virtual {p0, v2}, Lj3/E0;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p6

    .line 36
    if-eqz p6, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object p6, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p0, p6}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result p6

    .line 45
    const/4 v0, -0x1

    .line 46
    if-eq p6, v0, :cond_4

    .line 47
    .line 48
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v2, p2, v5}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-boolean p2, p2, Lj3/C0;->f:Z

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    iget p2, v5, Lj3/C0;->c:I

    .line 59
    .line 60
    const-wide/16 p3, 0x0

    .line 61
    .line 62
    invoke-virtual {v2, p2, v4, p3, p4}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget p2, p2, Lj3/D0;->o:I

    .line 67
    .line 68
    iget-object p3, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v2, p3}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-ne p2, p3, :cond_3

    .line 75
    .line 76
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {p0, p2, v5}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget v6, p2, Lj3/C0;->c:I

    .line 83
    .line 84
    iget-wide v7, p1, Lj3/I;->c:J

    .line 85
    .line 86
    move-object v3, p0

    .line 87
    invoke-virtual/range {v3 .. v8}, Lj3/E0;->i(Lj3/D0;Lj3/C0;IJ)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_3
    :goto_1
    return-object p5

    .line 93
    :cond_4
    move-object v3, p0

    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    iget-object p0, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 97
    .line 98
    move p2, p3

    .line 99
    move p3, p4

    .line 100
    move-object p5, v2

    .line 101
    move-object p6, v3

    .line 102
    move-object p1, v5

    .line 103
    move-object p4, p0

    .line 104
    move-object p0, v4

    .line 105
    invoke-static/range {p0 .. p6}, Lj3/J;->G(Lj3/D0;Lj3/C0;IZLjava/lang/Object;Lj3/E0;Lj3/E0;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-eqz p2, :cond_5

    .line 110
    .line 111
    invoke-virtual {v3, p2, v5}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    iget v6, p0, Lj3/C0;->c:I

    .line 116
    .line 117
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v3 .. v8}, Lj3/E0;->i(Lj3/D0;Lj3/C0;IJ)Landroid/util/Pair;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :catch_0
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 128
    return-object p0
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
.end method

.method public static G(Lj3/D0;Lj3/C0;IZLjava/lang/Object;Lj3/E0;Lj3/E0;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p5, p4}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    invoke-virtual {p5}, Lj3/E0;->h()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v4, p4

    .line 12
    move p4, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    if-ne p4, v1, :cond_1

    .line 16
    .line 17
    move-object v6, p0

    .line 18
    move-object v5, p1

    .line 19
    move v7, p2

    .line 20
    move v8, p3

    .line 21
    move-object v3, p5

    .line 22
    invoke-virtual/range {v3 .. v8}, Lj3/E0;->d(ILj3/C0;Lj3/D0;IZ)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ne v4, v1, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v3, v4}, Lj3/E0;->l(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p6, p0}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    move-object p5, v3

    .line 40
    move-object p1, v5

    .line 41
    move-object p0, v6

    .line 42
    move p2, v7

    .line 43
    move p3, v8

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    :goto_1
    if-ne p4, v1, :cond_2

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-virtual {p6, p4}, Lj3/E0;->l(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
.end method

.method public static M(Lj3/d;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lj3/d;->k:Z

    .line 3
    .line 4
    instance-of v0, p0, LY3/l;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, LY3/l;

    .line 9
    .line 10
    iget-boolean v0, p0, Lj3/d;->k:Z

    .line 11
    .line 12
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, LY3/l;->A:J

    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public static o(Lj3/d;)Z
    .locals 0

    .line 1
    iget p0, p0, Lj3/d;->f:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final A(ZZZZ)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v0, v1, Lj3/J;->h:Ll4/w;

    .line 5
    .line 6
    iget-object v0, v0, Ll4/w;->a:Landroid/os/Handler;

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iput-object v3, v1, Lj3/J;->l0:Lj3/m;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    iput-boolean v4, v1, Lj3/J;->B:Z

    .line 17
    .line 18
    iget-object v0, v1, Lj3/J;->n:Lj3/j;

    .line 19
    .line 20
    iput-boolean v4, v0, Lj3/j;->f:Z

    .line 21
    .line 22
    iget-object v0, v0, Lj3/j;->a:Lb5/c0;

    .line 23
    .line 24
    iget-boolean v5, v0, Lb5/c0;->a:Z

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lb5/c0;->b()J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    invoke-virtual {v0, v5, v6}, Lb5/c0;->d(J)V

    .line 33
    .line 34
    .line 35
    iput-boolean v4, v0, Lb5/c0;->a:Z

    .line 36
    .line 37
    :cond_0
    const-wide v5, 0xe8d4a51000L

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    iput-wide v5, v1, Lj3/J;->i0:J

    .line 43
    .line 44
    iget-object v5, v1, Lj3/J;->a:[Lj3/d;

    .line 45
    .line 46
    array-length v6, v5

    .line 47
    move v7, v4

    .line 48
    :goto_0
    const-string v8, "ExoPlayerImplInternal"

    .line 49
    .line 50
    if-ge v7, v6, :cond_1

    .line 51
    .line 52
    aget-object v0, v5, v7

    .line 53
    .line 54
    :try_start_0
    invoke-virtual {v1, v0}, Lj3/J;->b(Lj3/d;)V
    :try_end_0
    .catch Lj3/m; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catch_0
    move-exception v0

    .line 59
    goto :goto_1

    .line 60
    :catch_1
    move-exception v0

    .line 61
    :goto_1
    const-string v9, "Disable failed."

    .line 62
    .line 63
    invoke-static {v8, v9, v0}, Ll4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/2addr v7, v2

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    if-eqz p1, :cond_3

    .line 69
    .line 70
    iget-object v5, v1, Lj3/J;->a:[Lj3/d;

    .line 71
    .line 72
    array-length v6, v5

    .line 73
    move v7, v4

    .line 74
    :goto_3
    if-ge v7, v6, :cond_3

    .line 75
    .line 76
    aget-object v0, v5, v7

    .line 77
    .line 78
    iget-object v9, v1, Lj3/J;->b:Ljava/util/Set;

    .line 79
    .line 80
    invoke-interface {v9, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_2

    .line 85
    .line 86
    :try_start_1
    invoke-virtual {v0}, Lj3/d;->u()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 87
    .line 88
    .line 89
    goto :goto_4

    .line 90
    :catch_2
    move-exception v0

    .line 91
    const-string v9, "Reset failed."

    .line 92
    .line 93
    invoke-static {v8, v9, v0}, Ll4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    :goto_4
    add-int/2addr v7, v2

    .line 97
    goto :goto_3

    .line 98
    :cond_3
    iput v4, v1, Lj3/J;->g0:I

    .line 99
    .line 100
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 101
    .line 102
    iget-object v5, v0, Lj3/l0;->b:LN3/A;

    .line 103
    .line 104
    iget-wide v6, v0, Lj3/l0;->r:J

    .line 105
    .line 106
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 107
    .line 108
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 109
    .line 110
    invoke-virtual {v0}, LN3/y;->a()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_5

    .line 115
    .line 116
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 117
    .line 118
    iget-object v8, v1, Lj3/J;->l:Lj3/C0;

    .line 119
    .line 120
    iget-object v9, v0, Lj3/l0;->b:LN3/A;

    .line 121
    .line 122
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 123
    .line 124
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    if-nez v10, :cond_5

    .line 129
    .line 130
    iget-object v9, v9, LN3/y;->a:Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {v0, v9, v8}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget-boolean v0, v0, Lj3/C0;->f:Z

    .line 137
    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_4
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 142
    .line 143
    iget-wide v8, v0, Lj3/l0;->r:J

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_5
    :goto_5
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 147
    .line 148
    iget-wide v8, v0, Lj3/l0;->c:J

    .line 149
    .line 150
    :goto_6
    if-eqz p2, :cond_6

    .line 151
    .line 152
    iput-object v3, v1, Lj3/J;->h0:Lj3/I;

    .line 153
    .line 154
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 155
    .line 156
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 157
    .line 158
    invoke-virtual {v1, v0}, Lj3/J;->f(Lj3/E0;)Landroid/util/Pair;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v5, LN3/A;

    .line 165
    .line 166
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Ljava/lang/Long;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide v6

    .line 174
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 175
    .line 176
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 177
    .line 178
    invoke-virtual {v5, v0}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    if-nez v0, :cond_6

    .line 188
    .line 189
    :goto_7
    move-wide v10, v6

    .line 190
    move-object v7, v5

    .line 191
    goto :goto_8

    .line 192
    :cond_6
    move v2, v4

    .line 193
    goto :goto_7

    .line 194
    :goto_8
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;

    .line 195
    .line 196
    invoke-virtual {v0}, Lj3/e0;->b()V

    .line 197
    .line 198
    .line 199
    iput-boolean v4, v1, Lj3/J;->C:Z

    .line 200
    .line 201
    new-instance v5, Lj3/l0;

    .line 202
    .line 203
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 204
    .line 205
    iget-object v6, v0, Lj3/l0;->a:Lj3/E0;

    .line 206
    .line 207
    iget v12, v0, Lj3/l0;->e:I

    .line 208
    .line 209
    if-eqz p4, :cond_7

    .line 210
    .line 211
    :goto_9
    move-object v13, v3

    .line 212
    goto :goto_a

    .line 213
    :cond_7
    iget-object v3, v0, Lj3/l0;->f:Lj3/m;

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :goto_a
    if-eqz v2, :cond_8

    .line 217
    .line 218
    sget-object v3, LN3/n0;->d:LN3/n0;

    .line 219
    .line 220
    :goto_b
    move-object v15, v3

    .line 221
    goto :goto_c

    .line 222
    :cond_8
    iget-object v3, v0, Lj3/l0;->h:LN3/n0;

    .line 223
    .line 224
    goto :goto_b

    .line 225
    :goto_c
    if-eqz v2, :cond_9

    .line 226
    .line 227
    iget-object v3, v1, Lj3/J;->e:Li4/w;

    .line 228
    .line 229
    :goto_d
    move-object/from16 v16, v3

    .line 230
    .line 231
    goto :goto_e

    .line 232
    :cond_9
    iget-object v3, v0, Lj3/l0;->i:Li4/w;

    .line 233
    .line 234
    goto :goto_d

    .line 235
    :goto_e
    if-eqz v2, :cond_a

    .line 236
    .line 237
    sget-object v2, LP5/F;->b:LP5/D;

    .line 238
    .line 239
    sget-object v2, LP5/S;->e:LP5/S;

    .line 240
    .line 241
    :goto_f
    move-object/from16 v17, v2

    .line 242
    .line 243
    goto :goto_10

    .line 244
    :cond_a
    iget-object v2, v0, Lj3/l0;->j:Ljava/util/List;

    .line 245
    .line 246
    goto :goto_f

    .line 247
    :goto_10
    iget-boolean v2, v0, Lj3/l0;->l:Z

    .line 248
    .line 249
    iget v3, v0, Lj3/l0;->m:I

    .line 250
    .line 251
    iget-object v0, v0, Lj3/l0;->n:Lj3/m0;

    .line 252
    .line 253
    const/16 v28, 0x0

    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const-wide/16 v24, 0x0

    .line 257
    .line 258
    move-object/from16 v18, v7

    .line 259
    .line 260
    move-wide/from16 v22, v10

    .line 261
    .line 262
    move-wide/from16 v26, v10

    .line 263
    .line 264
    move-object/from16 v21, v0

    .line 265
    .line 266
    move/from16 v19, v2

    .line 267
    .line 268
    move/from16 v20, v3

    .line 269
    .line 270
    invoke-direct/range {v5 .. v28}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 271
    .line 272
    .line 273
    iput-object v5, v1, Lj3/J;->w:Lj3/l0;

    .line 274
    .line 275
    if-eqz p3, :cond_c

    .line 276
    .line 277
    iget-object v2, v1, Lj3/J;->s:LF5/o;

    .line 278
    .line 279
    iget-object v0, v2, LF5/o;->i:Ljava/lang/Object;

    .line 280
    .line 281
    move-object v3, v0

    .line 282
    check-cast v3, Ljava/util/HashMap;

    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    if-eqz v0, :cond_b

    .line 297
    .line 298
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    move-object v6, v0

    .line 303
    check-cast v6, Lj3/h0;

    .line 304
    .line 305
    :try_start_2
    iget-object v0, v6, Lj3/h0;->a:LN3/a;

    .line 306
    .line 307
    iget-object v7, v6, Lj3/h0;->b:Lj3/g0;

    .line 308
    .line 309
    invoke-virtual {v0, v7}, LN3/a;->q(LN3/B;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 310
    .line 311
    .line 312
    goto :goto_12

    .line 313
    :catch_3
    move-exception v0

    .line 314
    const-string v7, "MediaSourceList"

    .line 315
    .line 316
    const-string v8, "Failed to release child source."

    .line 317
    .line 318
    invoke-static {v7, v8, v0}, Ll4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 319
    .line 320
    .line 321
    :goto_12
    iget-object v0, v6, Lj3/h0;->a:LN3/a;

    .line 322
    .line 323
    iget-object v7, v6, Lj3/h0;->c:Lcom/google/firebase/messaging/s;

    .line 324
    .line 325
    invoke-virtual {v0, v7}, LN3/a;->u(LN3/H;)V

    .line 326
    .line 327
    .line 328
    iget-object v0, v6, Lj3/h0;->a:LN3/a;

    .line 329
    .line 330
    invoke-virtual {v0, v7}, LN3/a;->t(Ln3/m;)V

    .line 331
    .line 332
    .line 333
    goto :goto_11

    .line 334
    :cond_b
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 335
    .line 336
    .line 337
    iget-object v0, v2, LF5/o;->j:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Ljava/util/HashSet;

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 342
    .line 343
    .line 344
    iput-boolean v4, v2, LF5/o;->a:Z

    .line 345
    .line 346
    :cond_c
    return-void
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
.end method

.method public final B()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 2
    .line 3
    iget-object v0, v0, Lj3/e0;->h:Lj3/c0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lj3/c0;->f:Lj3/d0;

    .line 8
    .line 9
    iget-boolean v0, v0, Lj3/d0;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lj3/J;->z:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-boolean v0, p0, Lj3/J;->A:Z

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final C(LN3/x;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/J;->h:Ll4/w;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ll4/w;->a(ILjava/lang/Object;)Ll4/v;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ll4/v;->b()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final D(J)V
    .locals 6

    .line 1
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 2
    .line 3
    iget-object v1, v0, Lj3/e0;->h:Lj3/c0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-wide v1, 0xe8d4a51000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    add-long/2addr p1, v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v1, v1, Lj3/c0;->o:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iput-wide p1, p0, Lj3/J;->i0:J

    .line 18
    .line 19
    iget-object v1, p0, Lj3/J;->n:Lj3/j;

    .line 20
    .line 21
    iget-object v1, v1, Lj3/j;->a:Lb5/c0;

    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, Lb5/c0;->d(J)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lj3/J;->a:[Lj3/d;

    .line 27
    .line 28
    array-length p2, p1

    .line 29
    const/4 v1, 0x0

    .line 30
    move v2, v1

    .line 31
    :goto_2
    if-ge v2, p2, :cond_2

    .line 32
    .line 33
    aget-object v3, p1, v2

    .line 34
    .line 35
    invoke-static {v3}, Lj3/J;->o(Lj3/d;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    iget-wide v4, p0, Lj3/J;->i0:J

    .line 42
    .line 43
    iput-boolean v1, v3, Lj3/d;->k:Z

    .line 44
    .line 45
    iput-wide v4, v3, Lj3/d;->j:J

    .line 46
    .line 47
    invoke-virtual {v3, v4, v5, v1}, Lj3/d;->m(JZ)V

    .line 48
    .line 49
    .line 50
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    iget-object p1, v0, Lj3/e0;->h:Lj3/c0;

    .line 54
    .line 55
    :goto_3
    if-eqz p1, :cond_5

    .line 56
    .line 57
    iget-object p2, p1, Lj3/c0;->n:Li4/w;

    .line 58
    .line 59
    iget-object p2, p2, Li4/w;->c:[Li4/q;

    .line 60
    .line 61
    array-length v0, p2

    .line 62
    move v2, v1

    .line 63
    :goto_4
    if-ge v2, v0, :cond_4

    .line 64
    .line 65
    aget-object v3, p2, v2

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    invoke-interface {v3}, Li4/q;->s()V

    .line 70
    .line 71
    .line 72
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    iget-object p1, p1, Lj3/c0;->l:Lj3/c0;

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final E(Lj3/E0;Lj3/E0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lj3/E0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lj3/E0;->p()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Lj3/J;->o:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    add-int/lit8 p2, p2, -0x1

    .line 21
    .line 22
    if-gez p2, :cond_1

    .line 23
    .line 24
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, LA0/a;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final H(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 2
    .line 3
    iget-object v0, v0, Lj3/e0;->h:Lj3/c0;

    .line 4
    .line 5
    iget-object v0, v0, Lj3/c0;->f:Lj3/d0;

    .line 6
    .line 7
    iget-object v2, v0, Lj3/d0;->a:LN3/A;

    .line 8
    .line 9
    iget-object v0, p0, Lj3/J;->w:Lj3/l0;

    .line 10
    .line 11
    iget-wide v3, v0, Lj3/l0;->r:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    invoke-virtual/range {v1 .. v6}, Lj3/J;->J(LN3/A;JZZ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 21
    .line 22
    iget-wide v5, v0, Lj3/l0;->r:J

    .line 23
    .line 24
    cmp-long v0, v3, v5

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 29
    .line 30
    iget-wide v5, v0, Lj3/l0;->c:J

    .line 31
    .line 32
    iget-wide v7, v0, Lj3/l0;->d:J

    .line 33
    .line 34
    const/4 v10, 0x5

    .line 35
    move v9, p1

    .line 36
    invoke-virtual/range {v1 .. v10}, Lj3/J;->m(LN3/A;JJJZI)Lj3/l0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, v1, Lj3/J;->w:Lj3/l0;

    .line 41
    .line 42
    :cond_0
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final I(Lj3/I;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lj3/J;->x:Lj3/G;

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    invoke-virtual {v0, v9}, Lj3/G;->a(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 10
    .line 11
    iget-object v2, v0, Lj3/l0;->a:Lj3/E0;

    .line 12
    .line 13
    iget v5, v1, Lj3/J;->D:I

    .line 14
    .line 15
    iget-boolean v6, v1, Lj3/J;->X:Z

    .line 16
    .line 17
    iget-object v7, v1, Lj3/J;->k:Lj3/D0;

    .line 18
    .line 19
    iget-object v8, v1, Lj3/J;->l:Lj3/C0;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    move-object/from16 v3, p1

    .line 23
    .line 24
    invoke-static/range {v2 .. v8}, Lj3/J;->F(Lj3/E0;Lj3/I;ZIZLj3/D0;Lj3/C0;)Landroid/util/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 37
    .line 38
    iget-object v2, v2, Lj3/l0;->a:Lj3/E0;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lj3/J;->f(Lj3/E0;)Landroid/util/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v10, LN3/A;

    .line 47
    .line 48
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v11

    .line 56
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 57
    .line 58
    iget-object v2, v2, Lj3/l0;->a:Lj3/E0;

    .line 59
    .line 60
    invoke-virtual {v2}, Lj3/E0;->p()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    xor-int/2addr v2, v9

    .line 65
    move-wide v5, v6

    .line 66
    :goto_0
    const-wide/16 v15, 0x0

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_0
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v10, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v11

    .line 79
    iget-wide v13, v3, Lj3/I;->c:J

    .line 80
    .line 81
    cmp-long v10, v13, v6

    .line 82
    .line 83
    if-nez v10, :cond_1

    .line 84
    .line 85
    move-wide v13, v6

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move-wide v13, v11

    .line 88
    :goto_1
    iget-object v10, v1, Lj3/J;->r:Lj3/e0;

    .line 89
    .line 90
    iget-object v15, v1, Lj3/J;->w:Lj3/l0;

    .line 91
    .line 92
    iget-object v15, v15, Lj3/l0;->a:Lj3/E0;

    .line 93
    .line 94
    invoke-virtual {v10, v15, v2, v11, v12}, Lj3/e0;->m(Lj3/E0;Ljava/lang/Object;J)LN3/A;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v10}, LN3/y;->a()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 105
    .line 106
    iget-object v2, v2, Lj3/l0;->a:Lj3/E0;

    .line 107
    .line 108
    iget-object v6, v10, LN3/y;->a:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v7, v1, Lj3/J;->l:Lj3/C0;

    .line 111
    .line 112
    invoke-virtual {v2, v6, v7}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 113
    .line 114
    .line 115
    iget-object v2, v1, Lj3/J;->l:Lj3/C0;

    .line 116
    .line 117
    iget v6, v10, LN3/y;->b:I

    .line 118
    .line 119
    invoke-virtual {v2, v6}, Lj3/C0;->f(I)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    iget v6, v10, LN3/y;->c:I

    .line 124
    .line 125
    if-ne v2, v6, :cond_2

    .line 126
    .line 127
    iget-object v2, v1, Lj3/J;->l:Lj3/C0;

    .line 128
    .line 129
    iget-object v2, v2, Lj3/C0;->g:LO3/b;

    .line 130
    .line 131
    iget-wide v6, v2, LO3/b;->b:J

    .line 132
    .line 133
    move-wide v11, v6

    .line 134
    goto :goto_2

    .line 135
    :cond_2
    const-wide/16 v11, 0x0

    .line 136
    .line 137
    :goto_2
    move v2, v9

    .line 138
    move-wide v5, v13

    .line 139
    goto :goto_0

    .line 140
    :cond_3
    const-wide/16 v15, 0x0

    .line 141
    .line 142
    iget-wide v4, v3, Lj3/I;->c:J

    .line 143
    .line 144
    cmp-long v2, v4, v6

    .line 145
    .line 146
    if-nez v2, :cond_4

    .line 147
    .line 148
    move v2, v9

    .line 149
    goto :goto_3

    .line 150
    :cond_4
    move v2, v8

    .line 151
    :goto_3
    move-wide v5, v13

    .line 152
    :goto_4
    :try_start_0
    iget-object v4, v1, Lj3/J;->w:Lj3/l0;

    .line 153
    .line 154
    iget-object v4, v4, Lj3/l0;->a:Lj3/E0;

    .line 155
    .line 156
    invoke-virtual {v4}, Lj3/E0;->p()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_5

    .line 161
    .line 162
    iput-object v3, v1, Lj3/J;->h0:Lj3/I;

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    move v9, v2

    .line 167
    :goto_5
    move-object v2, v10

    .line 168
    :goto_6
    move-wide v3, v11

    .line 169
    goto/16 :goto_13

    .line 170
    .line 171
    :cond_5
    const/4 v3, 0x4

    .line 172
    if-nez v0, :cond_7

    .line 173
    .line 174
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 175
    .line 176
    iget v0, v0, Lj3/l0;->e:I

    .line 177
    .line 178
    if-eq v0, v9, :cond_6

    .line 179
    .line 180
    invoke-virtual {v1, v3}, Lj3/J;->W(I)V

    .line 181
    .line 182
    .line 183
    :cond_6
    invoke-virtual {v1, v8, v9, v8, v9}, Lj3/J;->A(ZZZZ)V

    .line 184
    .line 185
    .line 186
    :goto_7
    move v9, v2

    .line 187
    move-object v2, v10

    .line 188
    move-wide v3, v11

    .line 189
    goto/16 :goto_10

    .line 190
    .line 191
    :cond_7
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 192
    .line 193
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 194
    .line 195
    invoke-virtual {v10, v0}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    :try_start_1
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 202
    .line 203
    :try_start_2
    iget-object v0, v0, Lj3/e0;->h:Lj3/c0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 204
    .line 205
    if-eqz v0, :cond_8

    .line 206
    .line 207
    :try_start_3
    iget-boolean v4, v0, Lj3/c0;->d:Z

    .line 208
    .line 209
    if-eqz v4, :cond_8

    .line 210
    .line 211
    cmp-long v4, v11, v15

    .line 212
    .line 213
    if-eqz v4, :cond_8

    .line 214
    .line 215
    iget-object v0, v0, Lj3/c0;->a:Ljava/lang/Object;

    .line 216
    .line 217
    iget-object v4, v1, Lj3/J;->v:Lj3/x0;

    .line 218
    .line 219
    invoke-interface {v0, v11, v12, v4}, LN3/x;->c(JLj3/x0;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 223
    goto :goto_8

    .line 224
    :cond_8
    move-wide v13, v11

    .line 225
    :goto_8
    :try_start_4
    invoke-static {v13, v14}, Ll4/y;->T(J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v15

    .line 229
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 230
    .line 231
    iget-wide v8, v0, Lj3/l0;->r:J

    .line 232
    .line 233
    invoke-static {v8, v9}, Ll4/y;->T(J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v8

    .line 237
    cmp-long v0, v15, v8

    .line 238
    .line 239
    if-nez v0, :cond_9

    .line 240
    .line 241
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 242
    .line 243
    iget v4, v0, Lj3/l0;->e:I

    .line 244
    .line 245
    const/4 v8, 0x2

    .line 246
    if-eq v4, v8, :cond_a

    .line 247
    .line 248
    const/4 v8, 0x3

    .line 249
    if-ne v4, v8, :cond_9

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_9
    move v9, v2

    .line 253
    move-wide v15, v5

    .line 254
    move-object v2, v10

    .line 255
    goto :goto_b

    .line 256
    :cond_a
    :goto_9
    iget-wide v3, v0, Lj3/l0;->r:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 257
    .line 258
    move v9, v2

    .line 259
    move-object v2, v10

    .line 260
    const/4 v10, 0x2

    .line 261
    move-wide v7, v3

    .line 262
    :goto_a
    invoke-virtual/range {v1 .. v10}, Lj3/J;->m(LN3/A;JJJZI)Lj3/l0;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iput-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 267
    .line 268
    return-void

    .line 269
    :catchall_1
    move-exception v0

    .line 270
    move v9, v2

    .line 271
    move-wide v15, v5

    .line 272
    goto :goto_5

    .line 273
    :catchall_2
    move-exception v0

    .line 274
    move v9, v2

    .line 275
    move-wide v15, v5

    .line 276
    move-object v2, v10

    .line 277
    move-wide v3, v11

    .line 278
    move-wide v5, v15

    .line 279
    goto/16 :goto_13

    .line 280
    .line 281
    :cond_b
    move v9, v2

    .line 282
    move-wide v15, v5

    .line 283
    move-object v2, v10

    .line 284
    move-wide v13, v11

    .line 285
    :goto_b
    :try_start_5
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 286
    .line 287
    iget v0, v0, Lj3/l0;->e:I

    .line 288
    .line 289
    if-ne v0, v3, :cond_c

    .line 290
    .line 291
    const/4 v6, 0x1

    .line 292
    goto :goto_c

    .line 293
    :cond_c
    const/4 v6, 0x0

    .line 294
    :goto_c
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;

    .line 295
    .line 296
    iget-object v3, v0, Lj3/e0;->h:Lj3/c0;

    .line 297
    .line 298
    iget-object v0, v0, Lj3/e0;->i:Lj3/c0;

    .line 299
    .line 300
    if-eq v3, v0, :cond_d

    .line 301
    .line 302
    const/4 v5, 0x1

    .line 303
    :goto_d
    move-wide v3, v13

    .line 304
    goto :goto_e

    .line 305
    :cond_d
    const/4 v5, 0x0

    .line 306
    goto :goto_d

    .line 307
    :goto_e
    invoke-virtual/range {v1 .. v6}, Lj3/J;->J(LN3/A;JZZ)J

    .line 308
    .line 309
    .line 310
    move-result-wide v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 311
    cmp-long v0, v11, v13

    .line 312
    .line 313
    if-eqz v0, :cond_e

    .line 314
    .line 315
    const/16 v17, 0x1

    .line 316
    .line 317
    goto :goto_f

    .line 318
    :cond_e
    const/16 v17, 0x0

    .line 319
    .line 320
    :goto_f
    or-int v8, v9, v17

    .line 321
    .line 322
    :try_start_6
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 323
    .line 324
    move-object v3, v2

    .line 325
    :try_start_7
    iget-object v2, v0, Lj3/l0;->a:Lj3/E0;

    .line 326
    .line 327
    iget-object v5, v0, Lj3/l0;->b:LN3/A;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 328
    .line 329
    move-object v4, v2

    .line 330
    move-wide v6, v15

    .line 331
    :try_start_8
    invoke-virtual/range {v1 .. v7}, Lj3/J;->f0(Lj3/E0;LN3/A;Lj3/E0;LN3/A;J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 332
    .line 333
    .line 334
    move-object v2, v3

    .line 335
    move-wide v5, v6

    .line 336
    move v9, v8

    .line 337
    move-wide v3, v13

    .line 338
    :goto_10
    const/4 v10, 0x2

    .line 339
    move-wide v7, v3

    .line 340
    move-object/from16 v1, p0

    .line 341
    .line 342
    goto :goto_a

    .line 343
    :catchall_3
    move-exception v0

    .line 344
    move-object v2, v3

    .line 345
    move-wide v5, v6

    .line 346
    :goto_11
    move v9, v8

    .line 347
    move-wide v3, v13

    .line 348
    goto :goto_13

    .line 349
    :catchall_4
    move-exception v0

    .line 350
    move-object v2, v3

    .line 351
    :goto_12
    move-wide v5, v15

    .line 352
    goto :goto_11

    .line 353
    :catchall_5
    move-exception v0

    .line 354
    goto :goto_12

    .line 355
    :catchall_6
    move-exception v0

    .line 356
    move-wide v5, v15

    .line 357
    goto/16 :goto_6

    .line 358
    .line 359
    :goto_13
    const/4 v10, 0x2

    .line 360
    move-wide v7, v3

    .line 361
    invoke-virtual/range {v1 .. v10}, Lj3/J;->m(LN3/A;JJJZI)Lj3/l0;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    iput-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 366
    .line 367
    throw v0
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

.method public final J(LN3/A;JZZ)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lj3/J;->b0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lj3/J;->B:Z

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-nez p5, :cond_0

    .line 9
    .line 10
    iget-object p5, p0, Lj3/J;->w:Lj3/l0;

    .line 11
    .line 12
    iget p5, p5, Lj3/l0;->e:I

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-ne p5, v2, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, v1}, Lj3/J;->W(I)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object p5, p0, Lj3/J;->r:Lj3/e0;

    .line 21
    .line 22
    iget-object v2, p5, Lj3/e0;->h:Lj3/c0;

    .line 23
    .line 24
    move-object v3, v2

    .line 25
    :goto_0
    if-eqz v3, :cond_3

    .line 26
    .line 27
    iget-object v4, v3, Lj3/c0;->f:Lj3/d0;

    .line 28
    .line 29
    iget-object v4, v4, Lj3/d0;->a:LN3/A;

    .line 30
    .line 31
    invoke-virtual {p1, v4}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v3, v3, Lj3/c0;->l:Lj3/c0;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 42
    .line 43
    if-ne v2, v3, :cond_4

    .line 44
    .line 45
    if-eqz v3, :cond_7

    .line 46
    .line 47
    iget-wide v4, v3, Lj3/c0;->o:J

    .line 48
    .line 49
    add-long/2addr v4, p2

    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    cmp-long p1, v4, v6

    .line 53
    .line 54
    if-gez p1, :cond_7

    .line 55
    .line 56
    :cond_4
    iget-object p1, p0, Lj3/J;->a:[Lj3/d;

    .line 57
    .line 58
    array-length p4, p1

    .line 59
    move v2, v0

    .line 60
    :goto_2
    if-ge v2, p4, :cond_5

    .line 61
    .line 62
    aget-object v4, p1, v2

    .line 63
    .line 64
    invoke-virtual {p0, v4}, Lj3/J;->b(Lj3/d;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    if-eqz v3, :cond_7

    .line 71
    .line 72
    :goto_3
    iget-object p4, p5, Lj3/e0;->h:Lj3/c0;

    .line 73
    .line 74
    if-eq p4, v3, :cond_6

    .line 75
    .line 76
    invoke-virtual {p5}, Lj3/e0;->a()Lj3/c0;

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    invoke-virtual {p5, v3}, Lj3/e0;->k(Lj3/c0;)Z

    .line 81
    .line 82
    .line 83
    const-wide v4, 0xe8d4a51000L

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    iput-wide v4, v3, Lj3/c0;->o:J

    .line 89
    .line 90
    array-length p1, p1

    .line 91
    new-array p1, p1, [Z

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lj3/J;->d([Z)V

    .line 94
    .line 95
    .line 96
    :cond_7
    if-eqz v3, :cond_a

    .line 97
    .line 98
    invoke-virtual {p5, v3}, Lj3/e0;->k(Lj3/c0;)Z

    .line 99
    .line 100
    .line 101
    iget-boolean p1, v3, Lj3/c0;->d:Z

    .line 102
    .line 103
    if-nez p1, :cond_8

    .line 104
    .line 105
    iget-object p1, v3, Lj3/c0;->f:Lj3/d0;

    .line 106
    .line 107
    invoke-virtual {p1, p2, p3}, Lj3/d0;->b(J)Lj3/d0;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, v3, Lj3/c0;->f:Lj3/d0;

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    iget-boolean p1, v3, Lj3/c0;->e:Z

    .line 115
    .line 116
    if-eqz p1, :cond_9

    .line 117
    .line 118
    iget-object p1, v3, Lj3/c0;->a:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-interface {p1, p2, p3}, LN3/x;->w(J)J

    .line 121
    .line 122
    .line 123
    move-result-wide p2

    .line 124
    iget-wide p4, p0, Lj3/J;->m:J

    .line 125
    .line 126
    sub-long p4, p2, p4

    .line 127
    .line 128
    invoke-interface {p1, p4, p5}, LN3/x;->x(J)V

    .line 129
    .line 130
    .line 131
    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, Lj3/J;->D(J)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lj3/J;->q()V

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_a
    invoke-virtual {p5}, Lj3/e0;->b()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p2, p3}, Lj3/J;->D(J)V

    .line 142
    .line 143
    .line 144
    :goto_5
    invoke-virtual {p0, v0}, Lj3/J;->i(Z)V

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, Lj3/J;->h:Ll4/w;

    .line 148
    .line 149
    invoke-virtual {p1, v1}, Ll4/w;->c(I)Z

    .line 150
    .line 151
    .line 152
    return-wide p2
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
.end method

.method public final K(Lj3/t0;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lj3/t0;->f:Landroid/os/Looper;

    .line 2
    .line 3
    iget-object v1, p0, Lj3/J;->j:Landroid/os/Looper;

    .line 4
    .line 5
    iget-object v2, p0, Lj3/J;->h:Ll4/w;

    .line 6
    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    monitor-exit p1

    .line 11
    const/4 v0, 0x1

    .line 12
    :try_start_0
    iget-object v1, p1, Lj3/t0;->a:Lj3/s0;

    .line 13
    .line 14
    iget v3, p1, Lj3/t0;->d:I

    .line 15
    .line 16
    iget-object v4, p1, Lj3/t0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v1, v3, v4}, Lj3/s0;->d(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lj3/t0;->b(Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 25
    .line 26
    iget p1, p1, Lj3/l0;->e:I

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    const/4 v1, 0x2

    .line 30
    if-eq p1, v0, :cond_1

    .line 31
    .line 32
    if-ne p1, v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v2, v1}, Ll4/w;->c(I)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-virtual {p1, v0}, Lj3/t0;->b(Z)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :cond_2
    const/16 v0, 0xf

    .line 46
    .line 47
    invoke-virtual {v2, v0, p1}, Ll4/w;->a(ILjava/lang/Object;)Ll4/v;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Ll4/v;->b()V

    .line 52
    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final L(Lj3/t0;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lj3/t0;->f:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v0, "TAG"

    .line 14
    .line 15
    const-string v1, "Trying to send message on a dead thread."

    .line 16
    .line 17
    invoke-static {v0, v1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Lj3/t0;->b(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    iget-object v2, p0, Lj3/J;->p:Ll4/u;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Ll4/u;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll4/w;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, LA6/r;

    .line 33
    .line 34
    const/16 v2, 0xf

    .line 35
    .line 36
    invoke-direct {v1, p0, v2, p1}, LA6/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v0, Ll4/w;->a:Landroid/os/Handler;

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 42
    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final N(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lj3/J;->Y:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lj3/J;->Y:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lj3/J;->a:[Lj3/d;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    invoke-static {v2}, Lj3/J;->o(Lj3/d;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Lj3/J;->b:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, Lj3/d;->u()V

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz p2, :cond_2

    .line 38
    .line 39
    monitor-enter p0

    .line 40
    const/4 p1, 0x1

    .line 41
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p1

    .line 52
    :cond_2
    return-void
.end method

.method public final O(Lj3/F;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lj3/J;->x:Lj3/G;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lj3/G;->a(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, Lj3/F;->c:I

    .line 8
    .line 9
    iget-object v1, p1, Lj3/F;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iget-object v3, p1, Lj3/F;->b:LN3/g0;

    .line 13
    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    new-instance v0, Lj3/I;

    .line 17
    .line 18
    new-instance v2, Lj3/u0;

    .line 19
    .line 20
    invoke-direct {v2, v1, v3}, Lj3/u0;-><init>(Ljava/util/ArrayList;LN3/g0;)V

    .line 21
    .line 22
    .line 23
    iget v4, p1, Lj3/F;->c:I

    .line 24
    .line 25
    iget-wide v5, p1, Lj3/F;->d:J

    .line 26
    .line 27
    invoke-direct {v0, v2, v4, v5, v6}, Lj3/I;-><init>(Lj3/E0;IJ)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lj3/J;->h0:Lj3/I;

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, Lj3/J;->s:LF5/o;

    .line 33
    .line 34
    iget-object v0, p1, LF5/o;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-virtual {p1, v4, v2}, LF5/o;->i(II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1, v0, v1, v3}, LF5/o;->a(ILjava/util/ArrayList;LN3/g0;)Lj3/E0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1, v4}, Lj3/J;->j(Lj3/E0;Z)V

    .line 55
    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final P(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj3/J;->f0:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Lj3/J;->f0:Z

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 11
    .line 12
    iget-boolean p1, p1, Lj3/l0;->o:Z

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lj3/J;->h:Ll4/w;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-virtual {p1, v0}, Ll4/w;->c(I)Z

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final Q(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lj3/J;->z:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lj3/J;->B()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lj3/J;->A:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lj3/J;->r:Lj3/e0;

    .line 11
    .line 12
    iget-object v0, p1, Lj3/e0;->i:Lj3/c0;

    .line 13
    .line 14
    iget-object p1, p1, Lj3/e0;->h:Lj3/c0;

    .line 15
    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lj3/J;->H(Z)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Lj3/J;->i(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final R(IIZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lj3/J;->x:Lj3/G;

    .line 2
    .line 3
    invoke-virtual {v0, p4}, Lj3/G;->a(I)V

    .line 4
    .line 5
    .line 6
    iget-object p4, p0, Lj3/J;->x:Lj3/G;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p4, Lj3/G;->a:Z

    .line 10
    .line 11
    iput-boolean v0, p4, Lj3/G;->f:Z

    .line 12
    .line 13
    iput p2, p4, Lj3/G;->g:I

    .line 14
    .line 15
    iget-object p2, p0, Lj3/J;->w:Lj3/l0;

    .line 16
    .line 17
    invoke-virtual {p2, p1, p3}, Lj3/l0;->c(IZ)Lj3/l0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, Lj3/J;->B:Z

    .line 25
    .line 26
    iget-object p2, p0, Lj3/J;->r:Lj3/e0;

    .line 27
    .line 28
    iget-object p2, p2, Lj3/e0;->h:Lj3/c0;

    .line 29
    .line 30
    :goto_0
    if-eqz p2, :cond_2

    .line 31
    .line 32
    iget-object p4, p2, Lj3/c0;->n:Li4/w;

    .line 33
    .line 34
    iget-object p4, p4, Li4/w;->c:[Li4/q;

    .line 35
    .line 36
    array-length v0, p4

    .line 37
    move v1, p1

    .line 38
    :goto_1
    if-ge v1, v0, :cond_1

    .line 39
    .line 40
    aget-object v2, p4, v1

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-interface {v2, p3}, Li4/q;->b(Z)V

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-object p2, p2, Lj3/c0;->l:Lj3/c0;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p0}, Lj3/J;->X()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, Lj3/J;->b0()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lj3/J;->e0()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    iget-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 67
    .line 68
    iget p1, p1, Lj3/l0;->e:I

    .line 69
    .line 70
    const/4 p2, 0x3

    .line 71
    iget-object p3, p0, Lj3/J;->h:Ll4/w;

    .line 72
    .line 73
    const/4 p4, 0x2

    .line 74
    if-ne p1, p2, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0}, Lj3/J;->Z()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, p4}, Ll4/w;->c(I)Z

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    if-ne p1, p4, :cond_5

    .line 84
    .line 85
    invoke-virtual {p3, p4}, Ll4/w;->c(I)Z

    .line 86
    .line 87
    .line 88
    :cond_5
    return-void
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
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
.end method

.method public final S(Lj3/m0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/J;->n:Lj3/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lj3/j;->a(Lj3/m0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lj3/j;->c()Lj3/m0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget v0, p1, Lj3/m0;->a:F

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, p1, v0, v1, v1}, Lj3/J;->l(Lj3/m0;FZZ)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final T(I)V
    .locals 2

    .line 1
    iput p1, p0, Lj3/J;->D:I

    .line 2
    .line 3
    iget-object v0, p0, Lj3/J;->w:Lj3/l0;

    .line 4
    .line 5
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 6
    .line 7
    iget-object v1, p0, Lj3/J;->r:Lj3/e0;

    .line 8
    .line 9
    iput p1, v1, Lj3/e0;->f:I

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lj3/e0;->n(Lj3/E0;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lj3/J;->H(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lj3/J;->i(Z)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final U(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lj3/J;->X:Z

    .line 2
    .line 3
    iget-object v0, p0, Lj3/J;->w:Lj3/l0;

    .line 4
    .line 5
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 6
    .line 7
    iget-object v1, p0, Lj3/J;->r:Lj3/e0;

    .line 8
    .line 9
    iput-boolean p1, v1, Lj3/e0;->g:Z

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lj3/e0;->n(Lj3/E0;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, Lj3/J;->H(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lj3/J;->i(Z)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final V(LN3/g0;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lj3/J;->x:Lj3/G;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lj3/G;->a(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lj3/J;->s:LF5/o;

    .line 8
    .line 9
    iget-object v1, v0, LF5/o;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p1, LN3/g0;->b:[I

    .line 18
    .line 19
    array-length v2, v2

    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    new-instance v2, LN3/g0;

    .line 23
    .line 24
    new-instance v3, Ljava/util/Random;

    .line 25
    .line 26
    iget-object p1, p1, LN3/g0;->a:Ljava/util/Random;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-direct {v3, v4, v5}, Ljava/util/Random;-><init>(J)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v3}, LN3/g0;-><init>(Ljava/util/Random;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, LN3/g0;->a(I)LN3/g0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_0
    iput-object p1, v0, LF5/o;->k:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0}, LF5/o;->c()Lj3/E0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, p1, v0}, Lj3/J;->j(Lj3/E0;Z)V

    .line 50
    .line 51
    .line 52
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final W(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lj3/J;->w:Lj3/l0;

    .line 2
    .line 3
    iget v1, v0, Lj3/l0;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, Lj3/J;->m0:J

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lj3/l0;->f(I)Lj3/l0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 22
    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final X()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/J;->w:Lj3/l0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lj3/l0;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lj3/l0;->m:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final Y(Lj3/E0;LN3/A;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, LN3/y;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lj3/E0;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p2, p2, LN3/y;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, p0, Lj3/J;->l:Lj3/C0;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget p2, p2, Lj3/C0;->c:I

    .line 23
    .line 24
    iget-object v0, p0, Lj3/J;->k:Lj3/D0;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v0}, Lj3/E0;->n(ILj3/D0;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lj3/D0;->a()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-boolean p1, v0, Lj3/D0;->i:Z

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-wide p1, v0, Lj3/D0;->f:J

    .line 40
    .line 41
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmp-long p1, p1, v0

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 53
    return p1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
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
.end method

.method public final Z()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lj3/J;->B:Z

    .line 3
    .line 4
    iget-object v1, p0, Lj3/J;->n:Lj3/j;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    iput-boolean v2, v1, Lj3/j;->f:Z

    .line 8
    .line 9
    iget-object v1, v1, Lj3/j;->a:Lb5/c0;

    .line 10
    .line 11
    invoke-virtual {v1}, Lb5/c0;->e()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lj3/J;->a:[Lj3/d;

    .line 15
    .line 16
    array-length v3, v1

    .line 17
    move v4, v0

    .line 18
    :goto_0
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    aget-object v5, v1, v4

    .line 21
    .line 22
    invoke-static {v5}, Lj3/J;->o(Lj3/d;)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_1

    .line 27
    .line 28
    iget v6, v5, Lj3/d;->f:I

    .line 29
    .line 30
    if-ne v6, v2, :cond_0

    .line 31
    .line 32
    move v6, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v6, v0

    .line 35
    :goto_1
    invoke-static {v6}, Ll4/a;->m(Z)V

    .line 36
    .line 37
    .line 38
    const/4 v6, 0x2

    .line 39
    iput v6, v5, Lj3/d;->f:I

    .line 40
    .line 41
    invoke-virtual {v5}, Lj3/d;->o()V

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final a(Lj3/F;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/J;->x:Lj3/G;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lj3/G;->a(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iget-object v1, p0, Lj3/J;->s:LF5/o;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    iget-object p2, v1, LF5/o;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    :cond_0
    iget-object v0, p1, Lj3/F;->a:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object p1, p1, Lj3/F;->b:LN3/g0;

    .line 23
    .line 24
    invoke-virtual {v1, p2, v0, p1}, LF5/o;->a(ILjava/util/ArrayList;LN3/g0;)Lj3/E0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p0, p1, p2}, Lj3/J;->j(Lj3/E0;Z)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final a0(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lj3/J;->Y:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v1

    .line 13
    :goto_1
    invoke-virtual {p0, p1, v0, v1, v0}, Lj3/J;->A(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lj3/J;->x:Lj3/G;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lj3/G;->a(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lj3/J;->f:Lj3/i;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lj3/i;->b(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lj3/J;->W(I)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final b(Lj3/d;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lj3/J;->o(Lj3/d;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lj3/J;->n:Lj3/j;

    .line 9
    .line 10
    iget-object v1, v0, Lj3/j;->c:Lj3/d;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-ne p1, v1, :cond_1

    .line 15
    .line 16
    iput-object v3, v0, Lj3/j;->d:Ll4/m;

    .line 17
    .line 18
    iput-object v3, v0, Lj3/j;->c:Lj3/d;

    .line 19
    .line 20
    iput-boolean v2, v0, Lj3/j;->e:Z

    .line 21
    .line 22
    :cond_1
    iget v0, p1, Lj3/d;->f:I

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v4, 0x2

    .line 26
    if-ne v0, v4, :cond_3

    .line 27
    .line 28
    if-ne v0, v4, :cond_2

    .line 29
    .line 30
    move v0, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    move v0, v1

    .line 33
    :goto_0
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 34
    .line 35
    .line 36
    iput v2, p1, Lj3/d;->f:I

    .line 37
    .line 38
    invoke-virtual {p1}, Lj3/d;->p()V

    .line 39
    .line 40
    .line 41
    :cond_3
    iget v0, p1, Lj3/d;->f:I

    .line 42
    .line 43
    if-ne v0, v2, :cond_4

    .line 44
    .line 45
    move v0, v2

    .line 46
    goto :goto_1

    .line 47
    :cond_4
    move v0, v1

    .line 48
    :goto_1
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p1, Lj3/d;->b:LO0/c;

    .line 52
    .line 53
    invoke-virtual {v0}, LO0/c;->j()V

    .line 54
    .line 55
    .line 56
    iput v1, p1, Lj3/d;->f:I

    .line 57
    .line 58
    iput-object v3, p1, Lj3/d;->g:LN3/d0;

    .line 59
    .line 60
    iput-object v3, p1, Lj3/d;->h:[Lj3/M;

    .line 61
    .line 62
    iput-boolean v1, p1, Lj3/d;->k:Z

    .line 63
    .line 64
    invoke-virtual {p1}, Lj3/d;->k()V

    .line 65
    .line 66
    .line 67
    iget p1, p0, Lj3/J;->g0:I

    .line 68
    .line 69
    sub-int/2addr p1, v2

    .line 70
    iput p1, p0, Lj3/J;->g0:I

    .line 71
    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final b0()V
    .locals 8

    .line 1
    iget-object v0, p0, Lj3/J;->n:Lj3/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lj3/j;->f:Z

    .line 5
    .line 6
    iget-object v0, v0, Lj3/j;->a:Lb5/c0;

    .line 7
    .line 8
    iget-boolean v2, v0, Lb5/c0;->a:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lb5/c0;->b()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {v0, v2, v3}, Lb5/c0;->d(J)V

    .line 17
    .line 18
    .line 19
    iput-boolean v1, v0, Lb5/c0;->a:Z

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lj3/J;->a:[Lj3/d;

    .line 22
    .line 23
    array-length v2, v0

    .line 24
    move v3, v1

    .line 25
    :goto_0
    if-ge v3, v2, :cond_3

    .line 26
    .line 27
    aget-object v4, v0, v3

    .line 28
    .line 29
    invoke-static {v4}, Lj3/J;->o(Lj3/d;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    iget v5, v4, Lj3/d;->f:I

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    if-ne v5, v6, :cond_2

    .line 39
    .line 40
    const/4 v7, 0x1

    .line 41
    if-ne v5, v6, :cond_1

    .line 42
    .line 43
    move v5, v7

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move v5, v1

    .line 46
    :goto_1
    invoke-static {v5}, Ll4/a;->m(Z)V

    .line 47
    .line 48
    .line 49
    iput v7, v4, Lj3/d;->f:I

    .line 50
    .line 51
    invoke-virtual {v4}, Lj3/d;->p()V

    .line 52
    .line 53
    .line 54
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final c()V
    .locals 50

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lj3/J;->p:Ll4/u;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v11

    .line 12
    iget-object v0, v1, Lj3/J;->h:Ll4/w;

    .line 13
    .line 14
    iget-object v0, v0, Ll4/w;->a:Landroid/os/Handler;

    .line 15
    .line 16
    const/4 v13, 0x2

    .line 17
    invoke-virtual {v0, v13}, Landroid/os/Handler;->removeMessages(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 21
    .line 22
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const-wide/high16 v14, -0x8000000000000000L

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget-object v0, v1, Lj3/J;->s:LF5/o;

    .line 34
    .line 35
    iget-boolean v0, v0, LF5/o;->a:Z

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    :cond_0
    move-wide/from16 v20, v11

    .line 40
    .line 41
    move-wide/from16 v25, v14

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    move-object v12, v10

    .line 51
    goto/16 :goto_1b

    .line 52
    .line 53
    :cond_1
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;

    .line 54
    .line 55
    iget-wide v4, v1, Lj3/J;->i0:J

    .line 56
    .line 57
    iget-object v0, v0, Lj3/e0;->j:Lj3/c0;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-object v6, v0, Lj3/c0;->l:Lj3/c0;

    .line 62
    .line 63
    if-nez v6, :cond_2

    .line 64
    .line 65
    const/4 v6, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const/4 v6, 0x0

    .line 68
    :goto_0
    invoke-static {v6}, Ll4/a;->m(Z)V

    .line 69
    .line 70
    .line 71
    iget-boolean v6, v0, Lj3/c0;->d:Z

    .line 72
    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    iget-object v6, v0, Lj3/c0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    iget-wide v2, v0, Lj3/c0;->o:J

    .line 83
    .line 84
    sub-long/2addr v4, v2

    .line 85
    invoke-interface {v6, v4, v5}, LN3/f0;->B(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    :goto_1
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;

    .line 95
    .line 96
    iget-object v2, v0, Lj3/e0;->j:Lj3/c0;

    .line 97
    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    iget-object v3, v2, Lj3/c0;->f:Lj3/d0;

    .line 101
    .line 102
    iget-boolean v3, v3, Lj3/d0;->i:Z

    .line 103
    .line 104
    if-nez v3, :cond_5

    .line 105
    .line 106
    iget-boolean v3, v2, Lj3/c0;->d:Z

    .line 107
    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    iget-boolean v3, v2, Lj3/c0;->e:Z

    .line 111
    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    iget-object v2, v2, Lj3/c0;->a:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-interface {v2}, LN3/f0;->p()J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    cmp-long v2, v2, v14

    .line 121
    .line 122
    if-nez v2, :cond_5

    .line 123
    .line 124
    :cond_4
    iget-object v2, v0, Lj3/e0;->j:Lj3/c0;

    .line 125
    .line 126
    iget-object v2, v2, Lj3/c0;->f:Lj3/d0;

    .line 127
    .line 128
    iget-wide v2, v2, Lj3/d0;->e:J

    .line 129
    .line 130
    cmp-long v2, v2, v16

    .line 131
    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    iget v0, v0, Lj3/e0;->k:I

    .line 135
    .line 136
    const/16 v2, 0x64

    .line 137
    .line 138
    if-ge v0, v2, :cond_5

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    move-wide/from16 v25, v14

    .line 142
    .line 143
    :cond_6
    const/4 v15, 0x0

    .line 144
    const/16 v18, 0x1

    .line 145
    .line 146
    goto/16 :goto_6

    .line 147
    .line 148
    :cond_7
    :goto_2
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;

    .line 149
    .line 150
    iget-wide v2, v1, Lj3/J;->i0:J

    .line 151
    .line 152
    iget-object v4, v1, Lj3/J;->w:Lj3/l0;

    .line 153
    .line 154
    iget-object v5, v0, Lj3/e0;->j:Lj3/c0;

    .line 155
    .line 156
    if-nez v5, :cond_8

    .line 157
    .line 158
    iget-object v2, v4, Lj3/l0;->a:Lj3/E0;

    .line 159
    .line 160
    iget-object v3, v4, Lj3/l0;->b:LN3/A;

    .line 161
    .line 162
    iget-wide v5, v4, Lj3/l0;->c:J

    .line 163
    .line 164
    move-wide/from16 v25, v14

    .line 165
    .line 166
    iget-wide v14, v4, Lj3/l0;->r:J

    .line 167
    .line 168
    move-object/from16 v18, v0

    .line 169
    .line 170
    move-object/from16 v19, v2

    .line 171
    .line 172
    move-object/from16 v20, v3

    .line 173
    .line 174
    move-wide/from16 v21, v5

    .line 175
    .line 176
    move-wide/from16 v23, v14

    .line 177
    .line 178
    invoke-virtual/range {v18 .. v24}, Lj3/e0;->d(Lj3/E0;LN3/A;JJ)Lj3/d0;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    goto :goto_3

    .line 183
    :cond_8
    move-wide/from16 v25, v14

    .line 184
    .line 185
    iget-object v4, v4, Lj3/l0;->a:Lj3/E0;

    .line 186
    .line 187
    invoke-virtual {v0, v4, v5, v2, v3}, Lj3/e0;->c(Lj3/E0;Lj3/c0;J)Lj3/d0;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :goto_3
    if-eqz v0, :cond_6

    .line 192
    .line 193
    iget-object v2, v1, Lj3/J;->r:Lj3/e0;

    .line 194
    .line 195
    iget-object v3, v1, Lj3/J;->c:[Lj3/d;

    .line 196
    .line 197
    iget-object v4, v1, Lj3/J;->d:Li4/s;

    .line 198
    .line 199
    iget-object v5, v1, Lj3/J;->f:Lj3/i;

    .line 200
    .line 201
    iget-object v5, v5, Lj3/i;->a:Lk4/q;

    .line 202
    .line 203
    iget-object v6, v1, Lj3/J;->s:LF5/o;

    .line 204
    .line 205
    iget-object v7, v1, Lj3/J;->e:Li4/w;

    .line 206
    .line 207
    iget-object v14, v2, Lj3/e0;->j:Lj3/c0;

    .line 208
    .line 209
    if-nez v14, :cond_9

    .line 210
    .line 211
    const-wide v14, 0xe8d4a51000L

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    move-wide/from16 v29, v14

    .line 217
    .line 218
    const/16 v18, 0x1

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_9
    const/16 v18, 0x1

    .line 222
    .line 223
    iget-wide v8, v14, Lj3/c0;->o:J

    .line 224
    .line 225
    iget-object v14, v14, Lj3/c0;->f:Lj3/d0;

    .line 226
    .line 227
    iget-wide v13, v14, Lj3/d0;->e:J

    .line 228
    .line 229
    add-long/2addr v8, v13

    .line 230
    iget-wide v13, v0, Lj3/d0;->b:J

    .line 231
    .line 232
    sub-long/2addr v8, v13

    .line 233
    move-wide/from16 v29, v8

    .line 234
    .line 235
    :goto_4
    new-instance v27, Lj3/c0;

    .line 236
    .line 237
    move-object/from16 v34, v0

    .line 238
    .line 239
    move-object/from16 v28, v3

    .line 240
    .line 241
    move-object/from16 v31, v4

    .line 242
    .line 243
    move-object/from16 v32, v5

    .line 244
    .line 245
    move-object/from16 v33, v6

    .line 246
    .line 247
    move-object/from16 v35, v7

    .line 248
    .line 249
    invoke-direct/range {v27 .. v35}, Lj3/c0;-><init>([Lj3/d;JLi4/s;Lk4/q;LF5/o;Lj3/d0;Li4/w;)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v3, v27

    .line 253
    .line 254
    iget-object v4, v2, Lj3/e0;->j:Lj3/c0;

    .line 255
    .line 256
    if-eqz v4, :cond_b

    .line 257
    .line 258
    iget-object v5, v4, Lj3/c0;->l:Lj3/c0;

    .line 259
    .line 260
    if-ne v3, v5, :cond_a

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_a
    invoke-virtual {v4}, Lj3/c0;->b()V

    .line 264
    .line 265
    .line 266
    iput-object v3, v4, Lj3/c0;->l:Lj3/c0;

    .line 267
    .line 268
    invoke-virtual {v4}, Lj3/c0;->c()V

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_b
    iput-object v3, v2, Lj3/e0;->h:Lj3/c0;

    .line 273
    .line 274
    iput-object v3, v2, Lj3/e0;->i:Lj3/c0;

    .line 275
    .line 276
    :goto_5
    iput-object v10, v2, Lj3/e0;->l:Ljava/lang/Object;

    .line 277
    .line 278
    iput-object v3, v2, Lj3/e0;->j:Lj3/c0;

    .line 279
    .line 280
    iget v4, v2, Lj3/e0;->k:I

    .line 281
    .line 282
    add-int/lit8 v4, v4, 0x1

    .line 283
    .line 284
    iput v4, v2, Lj3/e0;->k:I

    .line 285
    .line 286
    invoke-virtual {v2}, Lj3/e0;->j()V

    .line 287
    .line 288
    .line 289
    iget-object v2, v3, Lj3/c0;->a:Ljava/lang/Object;

    .line 290
    .line 291
    iget-wide v4, v0, Lj3/d0;->b:J

    .line 292
    .line 293
    invoke-interface {v2, v1, v4, v5}, LN3/x;->o(LN3/w;J)V

    .line 294
    .line 295
    .line 296
    iget-object v2, v1, Lj3/J;->r:Lj3/e0;

    .line 297
    .line 298
    iget-object v2, v2, Lj3/e0;->h:Lj3/c0;

    .line 299
    .line 300
    if-ne v2, v3, :cond_c

    .line 301
    .line 302
    iget-wide v2, v0, Lj3/d0;->b:J

    .line 303
    .line 304
    invoke-virtual {v1, v2, v3}, Lj3/J;->D(J)V

    .line 305
    .line 306
    .line 307
    :cond_c
    const/4 v15, 0x0

    .line 308
    invoke-virtual {v1, v15}, Lj3/J;->i(Z)V

    .line 309
    .line 310
    .line 311
    :goto_6
    iget-boolean v0, v1, Lj3/J;->C:Z

    .line 312
    .line 313
    if-eqz v0, :cond_d

    .line 314
    .line 315
    invoke-virtual {v1}, Lj3/J;->n()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    iput-boolean v0, v1, Lj3/J;->C:Z

    .line 320
    .line 321
    invoke-virtual {v1}, Lj3/J;->c0()V

    .line 322
    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_d
    invoke-virtual {v1}, Lj3/J;->q()V

    .line 326
    .line 327
    .line 328
    :goto_7
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;

    .line 329
    .line 330
    iget-object v2, v0, Lj3/e0;->i:Lj3/c0;

    .line 331
    .line 332
    if-nez v2, :cond_f

    .line 333
    .line 334
    :cond_e
    :goto_8
    move-wide/from16 v20, v11

    .line 335
    .line 336
    move-wide/from16 v10, v16

    .line 337
    .line 338
    goto/16 :goto_11

    .line 339
    .line 340
    :cond_f
    iget-object v3, v2, Lj3/c0;->l:Lj3/c0;

    .line 341
    .line 342
    iget-object v8, v1, Lj3/J;->a:[Lj3/d;

    .line 343
    .line 344
    if-eqz v3, :cond_10

    .line 345
    .line 346
    iget-boolean v3, v1, Lj3/J;->A:Z

    .line 347
    .line 348
    if-eqz v3, :cond_11

    .line 349
    .line 350
    :cond_10
    move-wide/from16 v20, v11

    .line 351
    .line 352
    move-wide/from16 v10, v16

    .line 353
    .line 354
    goto/16 :goto_e

    .line 355
    .line 356
    :cond_11
    iget-boolean v3, v2, Lj3/c0;->d:Z

    .line 357
    .line 358
    if-nez v3, :cond_12

    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_12
    move v3, v15

    .line 362
    :goto_9
    array-length v4, v8

    .line 363
    if-ge v3, v4, :cond_14

    .line 364
    .line 365
    aget-object v4, v8, v3

    .line 366
    .line 367
    iget-object v5, v2, Lj3/c0;->c:[LN3/d0;

    .line 368
    .line 369
    aget-object v5, v5, v3

    .line 370
    .line 371
    iget-object v6, v4, Lj3/d;->g:LN3/d0;

    .line 372
    .line 373
    if-ne v6, v5, :cond_e

    .line 374
    .line 375
    if-eqz v5, :cond_13

    .line 376
    .line 377
    invoke-virtual {v4}, Lj3/d;->h()Z

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    if-nez v5, :cond_13

    .line 382
    .line 383
    iget-object v5, v2, Lj3/c0;->l:Lj3/c0;

    .line 384
    .line 385
    iget-object v6, v2, Lj3/c0;->f:Lj3/d0;

    .line 386
    .line 387
    iget-boolean v6, v6, Lj3/d0;->f:Z

    .line 388
    .line 389
    if-eqz v6, :cond_e

    .line 390
    .line 391
    iget-boolean v6, v5, Lj3/c0;->d:Z

    .line 392
    .line 393
    if-eqz v6, :cond_e

    .line 394
    .line 395
    instance-of v6, v4, LY3/l;

    .line 396
    .line 397
    if-nez v6, :cond_13

    .line 398
    .line 399
    instance-of v6, v4, LD3/f;

    .line 400
    .line 401
    if-nez v6, :cond_13

    .line 402
    .line 403
    iget-wide v6, v4, Lj3/d;->j:J

    .line 404
    .line 405
    invoke-virtual {v5}, Lj3/c0;->e()J

    .line 406
    .line 407
    .line 408
    move-result-wide v4

    .line 409
    cmp-long v4, v6, v4

    .line 410
    .line 411
    if-ltz v4, :cond_e

    .line 412
    .line 413
    :cond_13
    add-int/lit8 v3, v3, 0x1

    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_14
    iget-object v3, v2, Lj3/c0;->l:Lj3/c0;

    .line 417
    .line 418
    iget-boolean v4, v3, Lj3/c0;->d:Z

    .line 419
    .line 420
    if-nez v4, :cond_15

    .line 421
    .line 422
    iget-wide v4, v1, Lj3/J;->i0:J

    .line 423
    .line 424
    invoke-virtual {v3}, Lj3/c0;->e()J

    .line 425
    .line 426
    .line 427
    move-result-wide v6

    .line 428
    cmp-long v3, v4, v6

    .line 429
    .line 430
    if-gez v3, :cond_15

    .line 431
    .line 432
    goto :goto_8

    .line 433
    :cond_15
    iget-object v9, v2, Lj3/c0;->n:Li4/w;

    .line 434
    .line 435
    iget-object v3, v0, Lj3/e0;->i:Lj3/c0;

    .line 436
    .line 437
    if-eqz v3, :cond_16

    .line 438
    .line 439
    iget-object v3, v3, Lj3/c0;->l:Lj3/c0;

    .line 440
    .line 441
    if-eqz v3, :cond_16

    .line 442
    .line 443
    move/from16 v3, v18

    .line 444
    .line 445
    goto :goto_a

    .line 446
    :cond_16
    move v3, v15

    .line 447
    :goto_a
    invoke-static {v3}, Ll4/a;->m(Z)V

    .line 448
    .line 449
    .line 450
    iget-object v3, v0, Lj3/e0;->i:Lj3/c0;

    .line 451
    .line 452
    iget-object v3, v3, Lj3/c0;->l:Lj3/c0;

    .line 453
    .line 454
    iput-object v3, v0, Lj3/e0;->i:Lj3/c0;

    .line 455
    .line 456
    invoke-virtual {v0}, Lj3/e0;->j()V

    .line 457
    .line 458
    .line 459
    iget-object v0, v0, Lj3/e0;->i:Lj3/c0;

    .line 460
    .line 461
    iget-object v13, v0, Lj3/c0;->n:Li4/w;

    .line 462
    .line 463
    iget-object v3, v1, Lj3/J;->w:Lj3/l0;

    .line 464
    .line 465
    iget-object v3, v3, Lj3/l0;->a:Lj3/E0;

    .line 466
    .line 467
    iget-object v4, v0, Lj3/c0;->f:Lj3/d0;

    .line 468
    .line 469
    iget-object v4, v4, Lj3/d0;->a:LN3/A;

    .line 470
    .line 471
    iget-object v2, v2, Lj3/c0;->f:Lj3/d0;

    .line 472
    .line 473
    iget-object v5, v2, Lj3/d0;->a:LN3/A;

    .line 474
    .line 475
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    move-object v2, v3

    .line 481
    move-object v3, v4

    .line 482
    move-object v4, v2

    .line 483
    move-wide/from16 v20, v11

    .line 484
    .line 485
    move-wide/from16 v10, v16

    .line 486
    .line 487
    invoke-virtual/range {v1 .. v7}, Lj3/J;->f0(Lj3/E0;LN3/A;Lj3/E0;LN3/A;J)V

    .line 488
    .line 489
    .line 490
    iget-boolean v2, v0, Lj3/c0;->d:Z

    .line 491
    .line 492
    if-eqz v2, :cond_18

    .line 493
    .line 494
    iget-object v2, v0, Lj3/c0;->a:Ljava/lang/Object;

    .line 495
    .line 496
    invoke-interface {v2}, LN3/x;->k()J

    .line 497
    .line 498
    .line 499
    move-result-wide v2

    .line 500
    cmp-long v2, v2, v10

    .line 501
    .line 502
    if-eqz v2, :cond_18

    .line 503
    .line 504
    invoke-virtual {v0}, Lj3/c0;->e()J

    .line 505
    .line 506
    .line 507
    move-result-wide v2

    .line 508
    array-length v0, v8

    .line 509
    move v4, v15

    .line 510
    :goto_b
    if-ge v4, v0, :cond_1f

    .line 511
    .line 512
    aget-object v5, v8, v4

    .line 513
    .line 514
    iget-object v6, v5, Lj3/d;->g:LN3/d0;

    .line 515
    .line 516
    if-eqz v6, :cond_17

    .line 517
    .line 518
    invoke-static {v5, v2, v3}, Lj3/J;->M(Lj3/d;J)V

    .line 519
    .line 520
    .line 521
    :cond_17
    add-int/lit8 v4, v4, 0x1

    .line 522
    .line 523
    goto :goto_b

    .line 524
    :cond_18
    move v2, v15

    .line 525
    :goto_c
    array-length v3, v8

    .line 526
    if-ge v2, v3, :cond_1f

    .line 527
    .line 528
    invoke-virtual {v9, v2}, Li4/w;->b(I)Z

    .line 529
    .line 530
    .line 531
    move-result v3

    .line 532
    invoke-virtual {v13, v2}, Li4/w;->b(I)Z

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    if-eqz v3, :cond_1b

    .line 537
    .line 538
    aget-object v3, v8, v2

    .line 539
    .line 540
    iget-boolean v3, v3, Lj3/d;->k:Z

    .line 541
    .line 542
    if-nez v3, :cond_1b

    .line 543
    .line 544
    iget-object v3, v1, Lj3/J;->c:[Lj3/d;

    .line 545
    .line 546
    aget-object v3, v3, v2

    .line 547
    .line 548
    iget v3, v3, Lj3/d;->a:I

    .line 549
    .line 550
    const/4 v5, -0x2

    .line 551
    if-ne v3, v5, :cond_19

    .line 552
    .line 553
    move/from16 v3, v18

    .line 554
    .line 555
    goto :goto_d

    .line 556
    :cond_19
    move v3, v15

    .line 557
    :goto_d
    iget-object v5, v9, Li4/w;->b:[Lj3/w0;

    .line 558
    .line 559
    aget-object v5, v5, v2

    .line 560
    .line 561
    iget-object v6, v13, Li4/w;->b:[Lj3/w0;

    .line 562
    .line 563
    aget-object v6, v6, v2

    .line 564
    .line 565
    if-eqz v4, :cond_1a

    .line 566
    .line 567
    invoke-virtual {v6, v5}, Lj3/w0;->equals(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    if-eqz v4, :cond_1a

    .line 572
    .line 573
    if-eqz v3, :cond_1b

    .line 574
    .line 575
    :cond_1a
    aget-object v3, v8, v2

    .line 576
    .line 577
    invoke-virtual {v0}, Lj3/c0;->e()J

    .line 578
    .line 579
    .line 580
    move-result-wide v4

    .line 581
    invoke-static {v3, v4, v5}, Lj3/J;->M(Lj3/d;J)V

    .line 582
    .line 583
    .line 584
    :cond_1b
    add-int/lit8 v2, v2, 0x1

    .line 585
    .line 586
    goto :goto_c

    .line 587
    :goto_e
    iget-object v0, v2, Lj3/c0;->f:Lj3/d0;

    .line 588
    .line 589
    iget-boolean v0, v0, Lj3/d0;->i:Z

    .line 590
    .line 591
    if-nez v0, :cond_1c

    .line 592
    .line 593
    iget-boolean v0, v1, Lj3/J;->A:Z

    .line 594
    .line 595
    if-eqz v0, :cond_1f

    .line 596
    .line 597
    :cond_1c
    move v0, v15

    .line 598
    :goto_f
    array-length v3, v8

    .line 599
    if-ge v0, v3, :cond_1f

    .line 600
    .line 601
    aget-object v3, v8, v0

    .line 602
    .line 603
    iget-object v4, v2, Lj3/c0;->c:[LN3/d0;

    .line 604
    .line 605
    aget-object v4, v4, v0

    .line 606
    .line 607
    if-eqz v4, :cond_1e

    .line 608
    .line 609
    iget-object v5, v3, Lj3/d;->g:LN3/d0;

    .line 610
    .line 611
    if-ne v5, v4, :cond_1e

    .line 612
    .line 613
    invoke-virtual {v3}, Lj3/d;->h()Z

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    if-eqz v4, :cond_1e

    .line 618
    .line 619
    iget-object v4, v2, Lj3/c0;->f:Lj3/d0;

    .line 620
    .line 621
    iget-wide v4, v4, Lj3/d0;->e:J

    .line 622
    .line 623
    cmp-long v6, v4, v10

    .line 624
    .line 625
    if-eqz v6, :cond_1d

    .line 626
    .line 627
    cmp-long v6, v4, v25

    .line 628
    .line 629
    if-eqz v6, :cond_1d

    .line 630
    .line 631
    iget-wide v6, v2, Lj3/c0;->o:J

    .line 632
    .line 633
    add-long/2addr v4, v6

    .line 634
    goto :goto_10

    .line 635
    :cond_1d
    move-wide v4, v10

    .line 636
    :goto_10
    invoke-static {v3, v4, v5}, Lj3/J;->M(Lj3/d;J)V

    .line 637
    .line 638
    .line 639
    :cond_1e
    add-int/lit8 v0, v0, 0x1

    .line 640
    .line 641
    goto :goto_f

    .line 642
    :cond_1f
    :goto_11
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;

    .line 643
    .line 644
    iget-object v2, v0, Lj3/e0;->i:Lj3/c0;

    .line 645
    .line 646
    if-eqz v2, :cond_29

    .line 647
    .line 648
    iget-object v0, v0, Lj3/e0;->h:Lj3/c0;

    .line 649
    .line 650
    if-eq v0, v2, :cond_29

    .line 651
    .line 652
    iget-boolean v0, v2, Lj3/c0;->g:Z

    .line 653
    .line 654
    if-eqz v0, :cond_20

    .line 655
    .line 656
    goto/16 :goto_17

    .line 657
    .line 658
    :cond_20
    iget-object v0, v2, Lj3/c0;->n:Li4/w;

    .line 659
    .line 660
    move v3, v15

    .line 661
    move v4, v3

    .line 662
    :goto_12
    iget-object v5, v1, Lj3/J;->a:[Lj3/d;

    .line 663
    .line 664
    array-length v6, v5

    .line 665
    if-ge v3, v6, :cond_28

    .line 666
    .line 667
    aget-object v5, v5, v3

    .line 668
    .line 669
    invoke-static {v5}, Lj3/J;->o(Lj3/d;)Z

    .line 670
    .line 671
    .line 672
    move-result v6

    .line 673
    if-nez v6, :cond_21

    .line 674
    .line 675
    goto :goto_16

    .line 676
    :cond_21
    iget-object v6, v5, Lj3/d;->g:LN3/d0;

    .line 677
    .line 678
    iget-object v7, v2, Lj3/c0;->c:[LN3/d0;

    .line 679
    .line 680
    aget-object v8, v7, v3

    .line 681
    .line 682
    if-eq v6, v8, :cond_22

    .line 683
    .line 684
    move/from16 v6, v18

    .line 685
    .line 686
    goto :goto_13

    .line 687
    :cond_22
    move v6, v15

    .line 688
    :goto_13
    invoke-virtual {v0, v3}, Li4/w;->b(I)Z

    .line 689
    .line 690
    .line 691
    move-result v8

    .line 692
    if-eqz v8, :cond_23

    .line 693
    .line 694
    if-nez v6, :cond_23

    .line 695
    .line 696
    goto :goto_16

    .line 697
    :cond_23
    iget-boolean v6, v5, Lj3/d;->k:Z

    .line 698
    .line 699
    if-nez v6, :cond_26

    .line 700
    .line 701
    iget-object v6, v0, Li4/w;->c:[Li4/q;

    .line 702
    .line 703
    aget-object v6, v6, v3

    .line 704
    .line 705
    if-eqz v6, :cond_24

    .line 706
    .line 707
    invoke-interface {v6}, Li4/q;->length()I

    .line 708
    .line 709
    .line 710
    move-result v8

    .line 711
    goto :goto_14

    .line 712
    :cond_24
    move v8, v15

    .line 713
    :goto_14
    new-array v9, v8, [Lj3/M;

    .line 714
    .line 715
    move v13, v15

    .line 716
    :goto_15
    if-ge v13, v8, :cond_25

    .line 717
    .line 718
    invoke-interface {v6, v13}, Li4/q;->c(I)Lj3/M;

    .line 719
    .line 720
    .line 721
    move-result-object v14

    .line 722
    aput-object v14, v9, v13

    .line 723
    .line 724
    add-int/lit8 v13, v13, 0x1

    .line 725
    .line 726
    goto :goto_15

    .line 727
    :cond_25
    aget-object v29, v7, v3

    .line 728
    .line 729
    invoke-virtual {v2}, Lj3/c0;->e()J

    .line 730
    .line 731
    .line 732
    move-result-wide v30

    .line 733
    iget-wide v6, v2, Lj3/c0;->o:J

    .line 734
    .line 735
    move-object/from16 v27, v5

    .line 736
    .line 737
    move-wide/from16 v32, v6

    .line 738
    .line 739
    move-object/from16 v28, v9

    .line 740
    .line 741
    invoke-virtual/range {v27 .. v33}, Lj3/d;->t([Lj3/M;LN3/d0;JJ)V

    .line 742
    .line 743
    .line 744
    goto :goto_16

    .line 745
    :cond_26
    invoke-virtual {v5}, Lj3/d;->i()Z

    .line 746
    .line 747
    .line 748
    move-result v6

    .line 749
    if-eqz v6, :cond_27

    .line 750
    .line 751
    invoke-virtual {v1, v5}, Lj3/J;->b(Lj3/d;)V

    .line 752
    .line 753
    .line 754
    goto :goto_16

    .line 755
    :cond_27
    move/from16 v4, v18

    .line 756
    .line 757
    :goto_16
    add-int/lit8 v3, v3, 0x1

    .line 758
    .line 759
    goto :goto_12

    .line 760
    :cond_28
    if-nez v4, :cond_29

    .line 761
    .line 762
    array-length v0, v5

    .line 763
    new-array v0, v0, [Z

    .line 764
    .line 765
    invoke-virtual {v1, v0}, Lj3/J;->d([Z)V

    .line 766
    .line 767
    .line 768
    :cond_29
    :goto_17
    move v0, v15

    .line 769
    :goto_18
    invoke-virtual {v1}, Lj3/J;->X()Z

    .line 770
    .line 771
    .line 772
    move-result v2

    .line 773
    if-nez v2, :cond_2b

    .line 774
    .line 775
    :cond_2a
    :goto_19
    move-wide v13, v10

    .line 776
    move/from16 v0, v18

    .line 777
    .line 778
    const/4 v12, 0x0

    .line 779
    goto/16 :goto_1b

    .line 780
    .line 781
    :cond_2b
    iget-boolean v2, v1, Lj3/J;->A:Z

    .line 782
    .line 783
    if-eqz v2, :cond_2c

    .line 784
    .line 785
    goto :goto_19

    .line 786
    :cond_2c
    iget-object v2, v1, Lj3/J;->r:Lj3/e0;

    .line 787
    .line 788
    iget-object v3, v2, Lj3/e0;->h:Lj3/c0;

    .line 789
    .line 790
    if-nez v3, :cond_2d

    .line 791
    .line 792
    goto :goto_19

    .line 793
    :cond_2d
    iget-object v3, v3, Lj3/c0;->l:Lj3/c0;

    .line 794
    .line 795
    if-eqz v3, :cond_2a

    .line 796
    .line 797
    iget-wide v4, v1, Lj3/J;->i0:J

    .line 798
    .line 799
    invoke-virtual {v3}, Lj3/c0;->e()J

    .line 800
    .line 801
    .line 802
    move-result-wide v6

    .line 803
    cmp-long v4, v4, v6

    .line 804
    .line 805
    if-ltz v4, :cond_2a

    .line 806
    .line 807
    iget-boolean v3, v3, Lj3/c0;->g:Z

    .line 808
    .line 809
    if-eqz v3, :cond_2a

    .line 810
    .line 811
    if-eqz v0, :cond_2e

    .line 812
    .line 813
    invoke-virtual {v1}, Lj3/J;->r()V

    .line 814
    .line 815
    .line 816
    :cond_2e
    invoke-virtual {v2}, Lj3/e0;->a()Lj3/c0;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 824
    .line 825
    iget-object v2, v2, Lj3/l0;->b:LN3/A;

    .line 826
    .line 827
    iget-object v2, v2, LN3/y;->a:Ljava/lang/Object;

    .line 828
    .line 829
    iget-object v3, v0, Lj3/c0;->f:Lj3/d0;

    .line 830
    .line 831
    iget-object v3, v3, Lj3/d0;->a:LN3/A;

    .line 832
    .line 833
    iget-object v3, v3, LN3/y;->a:Ljava/lang/Object;

    .line 834
    .line 835
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    if-eqz v2, :cond_2f

    .line 840
    .line 841
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 842
    .line 843
    iget-object v2, v2, Lj3/l0;->b:LN3/A;

    .line 844
    .line 845
    iget v3, v2, LN3/y;->b:I

    .line 846
    .line 847
    const/4 v4, -0x1

    .line 848
    if-ne v3, v4, :cond_2f

    .line 849
    .line 850
    iget-object v3, v0, Lj3/c0;->f:Lj3/d0;

    .line 851
    .line 852
    iget-object v3, v3, Lj3/d0;->a:LN3/A;

    .line 853
    .line 854
    iget v5, v3, LN3/y;->b:I

    .line 855
    .line 856
    if-ne v5, v4, :cond_2f

    .line 857
    .line 858
    iget v2, v2, LN3/y;->e:I

    .line 859
    .line 860
    iget v3, v3, LN3/y;->e:I

    .line 861
    .line 862
    if-eq v2, v3, :cond_2f

    .line 863
    .line 864
    move/from16 v2, v18

    .line 865
    .line 866
    goto :goto_1a

    .line 867
    :cond_2f
    move v2, v15

    .line 868
    :goto_1a
    iget-object v0, v0, Lj3/c0;->f:Lj3/d0;

    .line 869
    .line 870
    move v3, v2

    .line 871
    iget-object v2, v0, Lj3/d0;->a:LN3/A;

    .line 872
    .line 873
    move v5, v3

    .line 874
    iget-wide v3, v0, Lj3/d0;->b:J

    .line 875
    .line 876
    iget-wide v6, v0, Lj3/d0;->c:J

    .line 877
    .line 878
    xor-int/lit8 v9, v5, 0x1

    .line 879
    .line 880
    move-wide/from16 v16, v10

    .line 881
    .line 882
    const/4 v10, 0x0

    .line 883
    move-wide v5, v6

    .line 884
    move-wide v7, v3

    .line 885
    move-wide/from16 v13, v16

    .line 886
    .line 887
    move/from16 v0, v18

    .line 888
    .line 889
    const/4 v12, 0x0

    .line 890
    invoke-virtual/range {v1 .. v10}, Lj3/J;->m(LN3/A;JJJZI)Lj3/l0;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    iput-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 895
    .line 896
    invoke-virtual {v1}, Lj3/J;->B()V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v1}, Lj3/J;->e0()V

    .line 900
    .line 901
    .line 902
    move-wide v10, v13

    .line 903
    goto/16 :goto_18

    .line 904
    .line 905
    :goto_1b
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 906
    .line 907
    iget v2, v2, Lj3/l0;->e:I

    .line 908
    .line 909
    if-eq v2, v0, :cond_63

    .line 910
    .line 911
    const/4 v3, 0x4

    .line 912
    if-ne v2, v3, :cond_30

    .line 913
    .line 914
    goto/16 :goto_39

    .line 915
    .line 916
    :cond_30
    iget-object v2, v1, Lj3/J;->r:Lj3/e0;

    .line 917
    .line 918
    iget-object v2, v2, Lj3/e0;->h:Lj3/c0;

    .line 919
    .line 920
    const-wide/16 v4, 0xa

    .line 921
    .line 922
    if-nez v2, :cond_31

    .line 923
    .line 924
    add-long v11, v20, v4

    .line 925
    .line 926
    iget-object v0, v1, Lj3/J;->h:Ll4/w;

    .line 927
    .line 928
    iget-object v0, v0, Ll4/w;->a:Landroid/os/Handler;

    .line 929
    .line 930
    const/4 v2, 0x2

    .line 931
    invoke-virtual {v0, v2, v11, v12}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 932
    .line 933
    .line 934
    return-void

    .line 935
    :cond_31
    const-string v6, "doSomeWork"

    .line 936
    .line 937
    invoke-static {v6}, Ll4/a;->c(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v1}, Lj3/J;->e0()V

    .line 941
    .line 942
    .line 943
    iget-boolean v6, v2, Lj3/c0;->d:Z

    .line 944
    .line 945
    const-wide/16 v7, 0x3e8

    .line 946
    .line 947
    if-eqz v6, :cond_3b

    .line 948
    .line 949
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 950
    .line 951
    .line 952
    move-result-wide v9

    .line 953
    mul-long/2addr v9, v7

    .line 954
    iget-object v6, v2, Lj3/c0;->a:Ljava/lang/Object;

    .line 955
    .line 956
    iget-object v11, v1, Lj3/J;->w:Lj3/l0;

    .line 957
    .line 958
    move-wide/from16 v16, v4

    .line 959
    .line 960
    iget-wide v4, v11, Lj3/l0;->r:J

    .line 961
    .line 962
    move-wide/from16 v22, v7

    .line 963
    .line 964
    iget-wide v7, v1, Lj3/J;->m:J

    .line 965
    .line 966
    sub-long/2addr v4, v7

    .line 967
    invoke-interface {v6, v4, v5}, LN3/x;->x(J)V

    .line 968
    .line 969
    .line 970
    move v4, v0

    .line 971
    move v5, v4

    .line 972
    move v8, v15

    .line 973
    :goto_1c
    iget-object v6, v1, Lj3/J;->a:[Lj3/d;

    .line 974
    .line 975
    array-length v7, v6

    .line 976
    if-ge v8, v7, :cond_3a

    .line 977
    .line 978
    aget-object v6, v6, v8

    .line 979
    .line 980
    invoke-static {v6}, Lj3/J;->o(Lj3/d;)Z

    .line 981
    .line 982
    .line 983
    move-result v7

    .line 984
    if-nez v7, :cond_32

    .line 985
    .line 986
    move-wide/from16 v27, v13

    .line 987
    .line 988
    goto :goto_23

    .line 989
    :cond_32
    move-wide/from16 v27, v13

    .line 990
    .line 991
    iget-wide v13, v1, Lj3/J;->i0:J

    .line 992
    .line 993
    invoke-virtual {v6, v13, v14, v9, v10}, Lj3/d;->s(JJ)V

    .line 994
    .line 995
    .line 996
    if-eqz v4, :cond_33

    .line 997
    .line 998
    invoke-virtual {v6}, Lj3/d;->i()Z

    .line 999
    .line 1000
    .line 1001
    move-result v4

    .line 1002
    if-eqz v4, :cond_33

    .line 1003
    .line 1004
    move v4, v0

    .line 1005
    goto :goto_1d

    .line 1006
    :cond_33
    move v4, v15

    .line 1007
    :goto_1d
    iget-object v7, v2, Lj3/c0;->c:[LN3/d0;

    .line 1008
    .line 1009
    aget-object v7, v7, v8

    .line 1010
    .line 1011
    iget-object v11, v6, Lj3/d;->g:LN3/d0;

    .line 1012
    .line 1013
    if-eq v7, v11, :cond_34

    .line 1014
    .line 1015
    move v7, v0

    .line 1016
    goto :goto_1e

    .line 1017
    :cond_34
    move v7, v15

    .line 1018
    :goto_1e
    if-nez v7, :cond_35

    .line 1019
    .line 1020
    invoke-virtual {v6}, Lj3/d;->h()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v11

    .line 1024
    if-eqz v11, :cond_35

    .line 1025
    .line 1026
    move v11, v0

    .line 1027
    goto :goto_1f

    .line 1028
    :cond_35
    move v11, v15

    .line 1029
    :goto_1f
    if-nez v7, :cond_37

    .line 1030
    .line 1031
    if-nez v11, :cond_37

    .line 1032
    .line 1033
    invoke-virtual {v6}, Lj3/d;->j()Z

    .line 1034
    .line 1035
    .line 1036
    move-result v7

    .line 1037
    if-nez v7, :cond_37

    .line 1038
    .line 1039
    invoke-virtual {v6}, Lj3/d;->i()Z

    .line 1040
    .line 1041
    .line 1042
    move-result v7

    .line 1043
    if-eqz v7, :cond_36

    .line 1044
    .line 1045
    goto :goto_20

    .line 1046
    :cond_36
    move v7, v15

    .line 1047
    goto :goto_21

    .line 1048
    :cond_37
    :goto_20
    move v7, v0

    .line 1049
    :goto_21
    if-eqz v5, :cond_38

    .line 1050
    .line 1051
    if-eqz v7, :cond_38

    .line 1052
    .line 1053
    move v5, v0

    .line 1054
    goto :goto_22

    .line 1055
    :cond_38
    move v5, v15

    .line 1056
    :goto_22
    if-nez v7, :cond_39

    .line 1057
    .line 1058
    iget-object v6, v6, Lj3/d;->g:LN3/d0;

    .line 1059
    .line 1060
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    invoke-interface {v6}, LN3/d0;->b()V

    .line 1064
    .line 1065
    .line 1066
    :cond_39
    :goto_23
    add-int/lit8 v8, v8, 0x1

    .line 1067
    .line 1068
    move-wide/from16 v13, v27

    .line 1069
    .line 1070
    goto :goto_1c

    .line 1071
    :cond_3a
    move-wide/from16 v27, v13

    .line 1072
    .line 1073
    move v9, v4

    .line 1074
    goto :goto_24

    .line 1075
    :cond_3b
    move-wide/from16 v16, v4

    .line 1076
    .line 1077
    move-wide/from16 v22, v7

    .line 1078
    .line 1079
    move-wide/from16 v27, v13

    .line 1080
    .line 1081
    iget-object v4, v2, Lj3/c0;->a:Ljava/lang/Object;

    .line 1082
    .line 1083
    invoke-interface {v4}, LN3/x;->q()V

    .line 1084
    .line 1085
    .line 1086
    move v5, v0

    .line 1087
    move v9, v5

    .line 1088
    :goto_24
    iget-object v4, v2, Lj3/c0;->f:Lj3/d0;

    .line 1089
    .line 1090
    iget-wide v6, v4, Lj3/d0;->e:J

    .line 1091
    .line 1092
    if-eqz v9, :cond_3d

    .line 1093
    .line 1094
    iget-boolean v4, v2, Lj3/c0;->d:Z

    .line 1095
    .line 1096
    if-eqz v4, :cond_3d

    .line 1097
    .line 1098
    cmp-long v4, v6, v27

    .line 1099
    .line 1100
    if-eqz v4, :cond_3c

    .line 1101
    .line 1102
    iget-object v4, v1, Lj3/J;->w:Lj3/l0;

    .line 1103
    .line 1104
    iget-wide v8, v4, Lj3/l0;->r:J

    .line 1105
    .line 1106
    cmp-long v4, v6, v8

    .line 1107
    .line 1108
    if-gtz v4, :cond_3d

    .line 1109
    .line 1110
    :cond_3c
    move v8, v0

    .line 1111
    goto :goto_25

    .line 1112
    :cond_3d
    move v8, v15

    .line 1113
    :goto_25
    if-eqz v8, :cond_3e

    .line 1114
    .line 1115
    iget-boolean v4, v1, Lj3/J;->A:Z

    .line 1116
    .line 1117
    if-eqz v4, :cond_3e

    .line 1118
    .line 1119
    iput-boolean v15, v1, Lj3/J;->A:Z

    .line 1120
    .line 1121
    iget-object v4, v1, Lj3/J;->w:Lj3/l0;

    .line 1122
    .line 1123
    iget v4, v4, Lj3/l0;->m:I

    .line 1124
    .line 1125
    const/4 v6, 0x5

    .line 1126
    invoke-virtual {v1, v4, v6, v15, v15}, Lj3/J;->R(IIZZ)V

    .line 1127
    .line 1128
    .line 1129
    :cond_3e
    if-eqz v8, :cond_3f

    .line 1130
    .line 1131
    iget-object v6, v2, Lj3/c0;->f:Lj3/d0;

    .line 1132
    .line 1133
    iget-boolean v6, v6, Lj3/d0;->i:Z

    .line 1134
    .line 1135
    if-eqz v6, :cond_3f

    .line 1136
    .line 1137
    invoke-virtual {v1, v3}, Lj3/J;->W(I)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v1}, Lj3/J;->b0()V

    .line 1141
    .line 1142
    .line 1143
    goto/16 :goto_30

    .line 1144
    .line 1145
    :cond_3f
    iget-object v6, v1, Lj3/J;->w:Lj3/l0;

    .line 1146
    .line 1147
    iget v7, v6, Lj3/l0;->e:I

    .line 1148
    .line 1149
    const/4 v8, 0x2

    .line 1150
    if-ne v7, v8, :cond_4c

    .line 1151
    .line 1152
    iget v7, v1, Lj3/J;->g0:I

    .line 1153
    .line 1154
    if-nez v7, :cond_40

    .line 1155
    .line 1156
    invoke-virtual {v1}, Lj3/J;->p()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v8

    .line 1160
    goto/16 :goto_2c

    .line 1161
    .line 1162
    :cond_40
    if-nez v5, :cond_42

    .line 1163
    .line 1164
    :cond_41
    move v8, v15

    .line 1165
    goto/16 :goto_2c

    .line 1166
    .line 1167
    :cond_42
    iget-boolean v7, v6, Lj3/l0;->g:Z

    .line 1168
    .line 1169
    if-nez v7, :cond_44

    .line 1170
    .line 1171
    :cond_43
    :goto_26
    move v8, v0

    .line 1172
    goto/16 :goto_2c

    .line 1173
    .line 1174
    :cond_44
    iget-object v6, v6, Lj3/l0;->a:Lj3/E0;

    .line 1175
    .line 1176
    iget-object v7, v1, Lj3/J;->r:Lj3/e0;

    .line 1177
    .line 1178
    iget-object v8, v7, Lj3/e0;->h:Lj3/c0;

    .line 1179
    .line 1180
    iget-object v8, v8, Lj3/c0;->f:Lj3/d0;

    .line 1181
    .line 1182
    iget-object v8, v8, Lj3/d0;->a:LN3/A;

    .line 1183
    .line 1184
    invoke-virtual {v1, v6, v8}, Lj3/J;->Y(Lj3/E0;LN3/A;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v6

    .line 1188
    if-eqz v6, :cond_45

    .line 1189
    .line 1190
    iget-object v6, v1, Lj3/J;->t:Lj3/h;

    .line 1191
    .line 1192
    iget-wide v8, v6, Lj3/h;->h:J

    .line 1193
    .line 1194
    goto :goto_27

    .line 1195
    :cond_45
    move-wide/from16 v8, v27

    .line 1196
    .line 1197
    :goto_27
    iget-object v6, v7, Lj3/e0;->j:Lj3/c0;

    .line 1198
    .line 1199
    iget-boolean v7, v6, Lj3/c0;->d:Z

    .line 1200
    .line 1201
    if-eqz v7, :cond_47

    .line 1202
    .line 1203
    iget-boolean v7, v6, Lj3/c0;->e:Z

    .line 1204
    .line 1205
    if-eqz v7, :cond_46

    .line 1206
    .line 1207
    iget-object v7, v6, Lj3/c0;->a:Ljava/lang/Object;

    .line 1208
    .line 1209
    invoke-interface {v7}, LN3/f0;->p()J

    .line 1210
    .line 1211
    .line 1212
    move-result-wide v10

    .line 1213
    cmp-long v7, v10, v25

    .line 1214
    .line 1215
    if-nez v7, :cond_47

    .line 1216
    .line 1217
    :cond_46
    iget-object v7, v6, Lj3/c0;->f:Lj3/d0;

    .line 1218
    .line 1219
    iget-boolean v7, v7, Lj3/d0;->i:Z

    .line 1220
    .line 1221
    if-eqz v7, :cond_47

    .line 1222
    .line 1223
    move v7, v0

    .line 1224
    goto :goto_28

    .line 1225
    :cond_47
    move v7, v15

    .line 1226
    :goto_28
    iget-object v10, v6, Lj3/c0;->f:Lj3/d0;

    .line 1227
    .line 1228
    iget-object v10, v10, Lj3/d0;->a:LN3/A;

    .line 1229
    .line 1230
    invoke-virtual {v10}, LN3/y;->a()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v10

    .line 1234
    if-eqz v10, :cond_48

    .line 1235
    .line 1236
    iget-boolean v6, v6, Lj3/c0;->d:Z

    .line 1237
    .line 1238
    if-nez v6, :cond_48

    .line 1239
    .line 1240
    move v6, v0

    .line 1241
    goto :goto_29

    .line 1242
    :cond_48
    move v6, v15

    .line 1243
    :goto_29
    if-nez v7, :cond_43

    .line 1244
    .line 1245
    if-nez v6, :cond_43

    .line 1246
    .line 1247
    iget-object v6, v1, Lj3/J;->w:Lj3/l0;

    .line 1248
    .line 1249
    iget-wide v6, v6, Lj3/l0;->p:J

    .line 1250
    .line 1251
    iget-object v10, v1, Lj3/J;->r:Lj3/e0;

    .line 1252
    .line 1253
    iget-object v10, v10, Lj3/e0;->j:Lj3/c0;

    .line 1254
    .line 1255
    const-wide/16 v13, 0x0

    .line 1256
    .line 1257
    if-nez v10, :cond_49

    .line 1258
    .line 1259
    move-wide v3, v13

    .line 1260
    goto :goto_2a

    .line 1261
    :cond_49
    iget-wide v3, v1, Lj3/J;->i0:J

    .line 1262
    .line 1263
    iget-wide v11, v10, Lj3/c0;->o:J

    .line 1264
    .line 1265
    sub-long/2addr v3, v11

    .line 1266
    sub-long/2addr v6, v3

    .line 1267
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 1268
    .line 1269
    .line 1270
    move-result-wide v3

    .line 1271
    :goto_2a
    iget-object v6, v1, Lj3/J;->n:Lj3/j;

    .line 1272
    .line 1273
    invoke-virtual {v6}, Lj3/j;->c()Lj3/m0;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v6

    .line 1277
    iget v6, v6, Lj3/m0;->a:F

    .line 1278
    .line 1279
    iget-boolean v7, v1, Lj3/J;->B:Z

    .line 1280
    .line 1281
    iget-object v10, v1, Lj3/J;->f:Lj3/i;

    .line 1282
    .line 1283
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1284
    .line 1285
    .line 1286
    invoke-static {v3, v4, v6}, Ll4/y;->y(JF)J

    .line 1287
    .line 1288
    .line 1289
    move-result-wide v3

    .line 1290
    if-eqz v7, :cond_4a

    .line 1291
    .line 1292
    iget-wide v6, v10, Lj3/i;->e:J

    .line 1293
    .line 1294
    goto :goto_2b

    .line 1295
    :cond_4a
    iget-wide v6, v10, Lj3/i;->d:J

    .line 1296
    .line 1297
    :goto_2b
    cmp-long v11, v8, v27

    .line 1298
    .line 1299
    if-eqz v11, :cond_4b

    .line 1300
    .line 1301
    const-wide/16 v11, 0x2

    .line 1302
    .line 1303
    div-long/2addr v8, v11

    .line 1304
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 1305
    .line 1306
    .line 1307
    move-result-wide v6

    .line 1308
    :cond_4b
    cmp-long v8, v6, v13

    .line 1309
    .line 1310
    if-lez v8, :cond_43

    .line 1311
    .line 1312
    cmp-long v3, v3, v6

    .line 1313
    .line 1314
    if-gez v3, :cond_43

    .line 1315
    .line 1316
    iget-object v3, v10, Lj3/i;->a:Lk4/q;

    .line 1317
    .line 1318
    monitor-enter v3

    .line 1319
    :try_start_0
    iget v4, v3, Lk4/q;->d:I

    .line 1320
    .line 1321
    iget v6, v3, Lk4/q;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1322
    .line 1323
    mul-int/2addr v4, v6

    .line 1324
    monitor-exit v3

    .line 1325
    iget v3, v10, Lj3/i;->h:I

    .line 1326
    .line 1327
    if-lt v4, v3, :cond_41

    .line 1328
    .line 1329
    goto/16 :goto_26

    .line 1330
    .line 1331
    :catchall_0
    move-exception v0

    .line 1332
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1333
    throw v0

    .line 1334
    :goto_2c
    if-eqz v8, :cond_4c

    .line 1335
    .line 1336
    const/4 v3, 0x3

    .line 1337
    invoke-virtual {v1, v3}, Lj3/J;->W(I)V

    .line 1338
    .line 1339
    .line 1340
    const/4 v12, 0x0

    .line 1341
    iput-object v12, v1, Lj3/J;->l0:Lj3/m;

    .line 1342
    .line 1343
    invoke-virtual {v1}, Lj3/J;->X()Z

    .line 1344
    .line 1345
    .line 1346
    move-result v4

    .line 1347
    if-eqz v4, :cond_55

    .line 1348
    .line 1349
    invoke-virtual {v1}, Lj3/J;->Z()V

    .line 1350
    .line 1351
    .line 1352
    goto :goto_30

    .line 1353
    :cond_4c
    const/4 v3, 0x3

    .line 1354
    iget-object v4, v1, Lj3/J;->w:Lj3/l0;

    .line 1355
    .line 1356
    iget v4, v4, Lj3/l0;->e:I

    .line 1357
    .line 1358
    if-ne v4, v3, :cond_55

    .line 1359
    .line 1360
    iget v3, v1, Lj3/J;->g0:I

    .line 1361
    .line 1362
    if-nez v3, :cond_4d

    .line 1363
    .line 1364
    invoke-virtual {v1}, Lj3/J;->p()Z

    .line 1365
    .line 1366
    .line 1367
    move-result v3

    .line 1368
    if-eqz v3, :cond_4e

    .line 1369
    .line 1370
    goto :goto_30

    .line 1371
    :cond_4d
    if-nez v5, :cond_55

    .line 1372
    .line 1373
    :cond_4e
    invoke-virtual {v1}, Lj3/J;->X()Z

    .line 1374
    .line 1375
    .line 1376
    move-result v3

    .line 1377
    iput-boolean v3, v1, Lj3/J;->B:Z

    .line 1378
    .line 1379
    const/4 v8, 0x2

    .line 1380
    invoke-virtual {v1, v8}, Lj3/J;->W(I)V

    .line 1381
    .line 1382
    .line 1383
    iget-boolean v3, v1, Lj3/J;->B:Z

    .line 1384
    .line 1385
    if-eqz v3, :cond_54

    .line 1386
    .line 1387
    iget-object v3, v1, Lj3/J;->r:Lj3/e0;

    .line 1388
    .line 1389
    iget-object v3, v3, Lj3/e0;->h:Lj3/c0;

    .line 1390
    .line 1391
    :goto_2d
    if-eqz v3, :cond_51

    .line 1392
    .line 1393
    iget-object v4, v3, Lj3/c0;->n:Li4/w;

    .line 1394
    .line 1395
    iget-object v4, v4, Li4/w;->c:[Li4/q;

    .line 1396
    .line 1397
    array-length v5, v4

    .line 1398
    move v8, v15

    .line 1399
    :goto_2e
    if-ge v8, v5, :cond_50

    .line 1400
    .line 1401
    aget-object v6, v4, v8

    .line 1402
    .line 1403
    if-eqz v6, :cond_4f

    .line 1404
    .line 1405
    invoke-interface {v6}, Li4/q;->t()V

    .line 1406
    .line 1407
    .line 1408
    :cond_4f
    add-int/lit8 v8, v8, 0x1

    .line 1409
    .line 1410
    goto :goto_2e

    .line 1411
    :cond_50
    iget-object v3, v3, Lj3/c0;->l:Lj3/c0;

    .line 1412
    .line 1413
    goto :goto_2d

    .line 1414
    :cond_51
    iget-object v3, v1, Lj3/J;->t:Lj3/h;

    .line 1415
    .line 1416
    iget-wide v4, v3, Lj3/h;->h:J

    .line 1417
    .line 1418
    cmp-long v6, v4, v27

    .line 1419
    .line 1420
    if-nez v6, :cond_52

    .line 1421
    .line 1422
    goto :goto_2f

    .line 1423
    :cond_52
    iget-wide v6, v3, Lj3/h;->b:J

    .line 1424
    .line 1425
    add-long/2addr v4, v6

    .line 1426
    iput-wide v4, v3, Lj3/h;->h:J

    .line 1427
    .line 1428
    iget-wide v6, v3, Lj3/h;->g:J

    .line 1429
    .line 1430
    cmp-long v8, v6, v27

    .line 1431
    .line 1432
    if-eqz v8, :cond_53

    .line 1433
    .line 1434
    cmp-long v4, v4, v6

    .line 1435
    .line 1436
    if-lez v4, :cond_53

    .line 1437
    .line 1438
    iput-wide v6, v3, Lj3/h;->h:J

    .line 1439
    .line 1440
    :cond_53
    move-wide/from16 v10, v27

    .line 1441
    .line 1442
    iput-wide v10, v3, Lj3/h;->l:J

    .line 1443
    .line 1444
    :cond_54
    :goto_2f
    invoke-virtual {v1}, Lj3/J;->b0()V

    .line 1445
    .line 1446
    .line 1447
    :cond_55
    :goto_30
    iget-object v3, v1, Lj3/J;->w:Lj3/l0;

    .line 1448
    .line 1449
    iget v3, v3, Lj3/l0;->e:I

    .line 1450
    .line 1451
    const/4 v8, 0x2

    .line 1452
    if-ne v3, v8, :cond_58

    .line 1453
    .line 1454
    move v8, v15

    .line 1455
    :goto_31
    iget-object v3, v1, Lj3/J;->a:[Lj3/d;

    .line 1456
    .line 1457
    array-length v4, v3

    .line 1458
    if-ge v8, v4, :cond_57

    .line 1459
    .line 1460
    aget-object v3, v3, v8

    .line 1461
    .line 1462
    invoke-static {v3}, Lj3/J;->o(Lj3/d;)Z

    .line 1463
    .line 1464
    .line 1465
    move-result v3

    .line 1466
    if-eqz v3, :cond_56

    .line 1467
    .line 1468
    iget-object v3, v1, Lj3/J;->a:[Lj3/d;

    .line 1469
    .line 1470
    aget-object v3, v3, v8

    .line 1471
    .line 1472
    iget-object v3, v3, Lj3/d;->g:LN3/d0;

    .line 1473
    .line 1474
    iget-object v4, v2, Lj3/c0;->c:[LN3/d0;

    .line 1475
    .line 1476
    aget-object v4, v4, v8

    .line 1477
    .line 1478
    if-ne v3, v4, :cond_56

    .line 1479
    .line 1480
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1481
    .line 1482
    .line 1483
    invoke-interface {v3}, LN3/d0;->b()V

    .line 1484
    .line 1485
    .line 1486
    :cond_56
    add-int/lit8 v8, v8, 0x1

    .line 1487
    .line 1488
    goto :goto_31

    .line 1489
    :cond_57
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 1490
    .line 1491
    iget-boolean v3, v2, Lj3/l0;->g:Z

    .line 1492
    .line 1493
    if-nez v3, :cond_58

    .line 1494
    .line 1495
    iget-wide v2, v2, Lj3/l0;->q:J

    .line 1496
    .line 1497
    const-wide/32 v4, 0x7a120

    .line 1498
    .line 1499
    .line 1500
    cmp-long v2, v2, v4

    .line 1501
    .line 1502
    if-gez v2, :cond_58

    .line 1503
    .line 1504
    invoke-virtual {v1}, Lj3/J;->n()Z

    .line 1505
    .line 1506
    .line 1507
    move-result v2

    .line 1508
    if-eqz v2, :cond_58

    .line 1509
    .line 1510
    move v8, v0

    .line 1511
    goto :goto_32

    .line 1512
    :cond_58
    move v8, v15

    .line 1513
    :goto_32
    if-nez v8, :cond_59

    .line 1514
    .line 1515
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    iput-wide v10, v1, Lj3/J;->m0:J

    .line 1521
    .line 1522
    goto :goto_33

    .line 1523
    :cond_59
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    iget-wide v2, v1, Lj3/J;->m0:J

    .line 1529
    .line 1530
    cmp-long v2, v2, v10

    .line 1531
    .line 1532
    if-nez v2, :cond_5a

    .line 1533
    .line 1534
    iget-object v2, v1, Lj3/J;->p:Ll4/u;

    .line 1535
    .line 1536
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1537
    .line 1538
    .line 1539
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1540
    .line 1541
    .line 1542
    move-result-wide v2

    .line 1543
    iput-wide v2, v1, Lj3/J;->m0:J

    .line 1544
    .line 1545
    goto :goto_33

    .line 1546
    :cond_5a
    iget-object v2, v1, Lj3/J;->p:Ll4/u;

    .line 1547
    .line 1548
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1549
    .line 1550
    .line 1551
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1552
    .line 1553
    .line 1554
    move-result-wide v2

    .line 1555
    iget-wide v4, v1, Lj3/J;->m0:J

    .line 1556
    .line 1557
    sub-long/2addr v2, v4

    .line 1558
    const-wide/16 v4, 0xfa0

    .line 1559
    .line 1560
    cmp-long v2, v2, v4

    .line 1561
    .line 1562
    if-gez v2, :cond_62

    .line 1563
    .line 1564
    :goto_33
    invoke-virtual {v1}, Lj3/J;->X()Z

    .line 1565
    .line 1566
    .line 1567
    move-result v2

    .line 1568
    if-eqz v2, :cond_5b

    .line 1569
    .line 1570
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 1571
    .line 1572
    iget v2, v2, Lj3/l0;->e:I

    .line 1573
    .line 1574
    const/4 v3, 0x3

    .line 1575
    if-ne v2, v3, :cond_5b

    .line 1576
    .line 1577
    move v8, v0

    .line 1578
    goto :goto_34

    .line 1579
    :cond_5b
    move v8, v15

    .line 1580
    :goto_34
    iget-boolean v2, v1, Lj3/J;->f0:Z

    .line 1581
    .line 1582
    if-eqz v2, :cond_5c

    .line 1583
    .line 1584
    iget-boolean v2, v1, Lj3/J;->Z:Z

    .line 1585
    .line 1586
    if-eqz v2, :cond_5c

    .line 1587
    .line 1588
    if-eqz v8, :cond_5c

    .line 1589
    .line 1590
    goto :goto_35

    .line 1591
    :cond_5c
    move v0, v15

    .line 1592
    :goto_35
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 1593
    .line 1594
    iget-boolean v3, v2, Lj3/l0;->o:Z

    .line 1595
    .line 1596
    if-eq v3, v0, :cond_5d

    .line 1597
    .line 1598
    new-instance v26, Lj3/l0;

    .line 1599
    .line 1600
    iget-object v3, v2, Lj3/l0;->a:Lj3/E0;

    .line 1601
    .line 1602
    iget-object v4, v2, Lj3/l0;->b:LN3/A;

    .line 1603
    .line 1604
    iget-wide v5, v2, Lj3/l0;->c:J

    .line 1605
    .line 1606
    iget-wide v9, v2, Lj3/l0;->d:J

    .line 1607
    .line 1608
    iget v7, v2, Lj3/l0;->e:I

    .line 1609
    .line 1610
    iget-object v11, v2, Lj3/l0;->f:Lj3/m;

    .line 1611
    .line 1612
    iget-boolean v12, v2, Lj3/l0;->g:Z

    .line 1613
    .line 1614
    iget-object v13, v2, Lj3/l0;->h:LN3/n0;

    .line 1615
    .line 1616
    iget-object v14, v2, Lj3/l0;->i:Li4/w;

    .line 1617
    .line 1618
    iget-object v15, v2, Lj3/l0;->j:Ljava/util/List;

    .line 1619
    .line 1620
    move/from16 v49, v0

    .line 1621
    .line 1622
    iget-object v0, v2, Lj3/l0;->k:LN3/A;

    .line 1623
    .line 1624
    move-object/from16 v39, v0

    .line 1625
    .line 1626
    iget-boolean v0, v2, Lj3/l0;->l:Z

    .line 1627
    .line 1628
    move/from16 v40, v0

    .line 1629
    .line 1630
    iget v0, v2, Lj3/l0;->m:I

    .line 1631
    .line 1632
    move/from16 v41, v0

    .line 1633
    .line 1634
    iget-object v0, v2, Lj3/l0;->n:Lj3/m0;

    .line 1635
    .line 1636
    move-object/from16 v27, v3

    .line 1637
    .line 1638
    move-object/from16 v28, v4

    .line 1639
    .line 1640
    iget-wide v3, v2, Lj3/l0;->p:J

    .line 1641
    .line 1642
    move-wide/from16 v43, v3

    .line 1643
    .line 1644
    iget-wide v3, v2, Lj3/l0;->q:J

    .line 1645
    .line 1646
    move-wide/from16 v45, v3

    .line 1647
    .line 1648
    iget-wide v2, v2, Lj3/l0;->r:J

    .line 1649
    .line 1650
    move-object/from16 v42, v0

    .line 1651
    .line 1652
    move-wide/from16 v47, v2

    .line 1653
    .line 1654
    move-wide/from16 v29, v5

    .line 1655
    .line 1656
    move/from16 v33, v7

    .line 1657
    .line 1658
    move-wide/from16 v31, v9

    .line 1659
    .line 1660
    move-object/from16 v34, v11

    .line 1661
    .line 1662
    move/from16 v35, v12

    .line 1663
    .line 1664
    move-object/from16 v36, v13

    .line 1665
    .line 1666
    move-object/from16 v37, v14

    .line 1667
    .line 1668
    move-object/from16 v38, v15

    .line 1669
    .line 1670
    invoke-direct/range {v26 .. v49}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 1671
    .line 1672
    .line 1673
    move-object/from16 v0, v26

    .line 1674
    .line 1675
    iput-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 1676
    .line 1677
    const/4 v15, 0x0

    .line 1678
    goto :goto_36

    .line 1679
    :cond_5d
    move/from16 v49, v0

    .line 1680
    .line 1681
    :goto_36
    iput-boolean v15, v1, Lj3/J;->Z:Z

    .line 1682
    .line 1683
    if-nez v49, :cond_61

    .line 1684
    .line 1685
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 1686
    .line 1687
    iget v0, v0, Lj3/l0;->e:I

    .line 1688
    .line 1689
    const/4 v11, 0x4

    .line 1690
    if-ne v0, v11, :cond_5e

    .line 1691
    .line 1692
    goto :goto_38

    .line 1693
    :cond_5e
    if-nez v8, :cond_60

    .line 1694
    .line 1695
    const/4 v8, 0x2

    .line 1696
    if-ne v0, v8, :cond_5f

    .line 1697
    .line 1698
    goto :goto_37

    .line 1699
    :cond_5f
    const/4 v3, 0x3

    .line 1700
    if-ne v0, v3, :cond_61

    .line 1701
    .line 1702
    iget v0, v1, Lj3/J;->g0:I

    .line 1703
    .line 1704
    if-eqz v0, :cond_61

    .line 1705
    .line 1706
    add-long v11, v20, v22

    .line 1707
    .line 1708
    iget-object v0, v1, Lj3/J;->h:Ll4/w;

    .line 1709
    .line 1710
    iget-object v0, v0, Ll4/w;->a:Landroid/os/Handler;

    .line 1711
    .line 1712
    invoke-virtual {v0, v8, v11, v12}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 1713
    .line 1714
    .line 1715
    goto :goto_38

    .line 1716
    :cond_60
    const/4 v8, 0x2

    .line 1717
    :goto_37
    add-long v11, v20, v16

    .line 1718
    .line 1719
    iget-object v0, v1, Lj3/J;->h:Ll4/w;

    .line 1720
    .line 1721
    iget-object v0, v0, Ll4/w;->a:Landroid/os/Handler;

    .line 1722
    .line 1723
    invoke-virtual {v0, v8, v11, v12}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 1724
    .line 1725
    .line 1726
    :cond_61
    :goto_38
    invoke-static {}, Ll4/a;->v()V

    .line 1727
    .line 1728
    .line 1729
    return-void

    .line 1730
    :cond_62
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1731
    .line 1732
    const-string v2, "Playback stuck buffering and not loading"

    .line 1733
    .line 1734
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1735
    .line 1736
    .line 1737
    throw v0

    .line 1738
    :cond_63
    :goto_39
    return-void
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
.end method

.method public final c0()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj3/J;->r:Lj3/e0;

    .line 4
    .line 5
    iget-object v1, v1, Lj3/e0;->j:Lj3/c0;

    .line 6
    .line 7
    iget-boolean v2, v0, Lj3/J;->C:Z

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, Lj3/c0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v1}, LN3/f0;->a()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    move v11, v1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_1
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :goto_2
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 28
    .line 29
    iget-boolean v2, v1, Lj3/l0;->g:Z

    .line 30
    .line 31
    if-eq v11, v2, :cond_2

    .line 32
    .line 33
    new-instance v2, Lj3/l0;

    .line 34
    .line 35
    iget-object v3, v1, Lj3/l0;->a:Lj3/E0;

    .line 36
    .line 37
    iget-object v4, v1, Lj3/l0;->b:LN3/A;

    .line 38
    .line 39
    iget-wide v5, v1, Lj3/l0;->c:J

    .line 40
    .line 41
    iget-wide v7, v1, Lj3/l0;->d:J

    .line 42
    .line 43
    iget v9, v1, Lj3/l0;->e:I

    .line 44
    .line 45
    iget-object v10, v1, Lj3/l0;->f:Lj3/m;

    .line 46
    .line 47
    iget-object v12, v1, Lj3/l0;->h:LN3/n0;

    .line 48
    .line 49
    iget-object v13, v1, Lj3/l0;->i:Li4/w;

    .line 50
    .line 51
    iget-object v14, v1, Lj3/l0;->j:Ljava/util/List;

    .line 52
    .line 53
    iget-object v15, v1, Lj3/l0;->k:LN3/A;

    .line 54
    .line 55
    move-object/from16 v16, v2

    .line 56
    .line 57
    iget-boolean v2, v1, Lj3/l0;->l:Z

    .line 58
    .line 59
    move/from16 v17, v2

    .line 60
    .line 61
    iget v2, v1, Lj3/l0;->m:I

    .line 62
    .line 63
    move/from16 v18, v2

    .line 64
    .line 65
    iget-object v2, v1, Lj3/l0;->n:Lj3/m0;

    .line 66
    .line 67
    move-object/from16 v20, v2

    .line 68
    .line 69
    move-object/from16 v19, v3

    .line 70
    .line 71
    iget-wide v2, v1, Lj3/l0;->p:J

    .line 72
    .line 73
    move-wide/from16 v21, v2

    .line 74
    .line 75
    iget-wide v2, v1, Lj3/l0;->q:J

    .line 76
    .line 77
    move-wide/from16 v23, v2

    .line 78
    .line 79
    iget-wide v2, v1, Lj3/l0;->r:J

    .line 80
    .line 81
    iget-boolean v1, v1, Lj3/l0;->o:Z

    .line 82
    .line 83
    move/from16 v25, v1

    .line 84
    .line 85
    move-wide/from16 v26, v2

    .line 86
    .line 87
    move-object/from16 v2, v16

    .line 88
    .line 89
    move/from16 v16, v17

    .line 90
    .line 91
    move/from16 v17, v18

    .line 92
    .line 93
    move-object/from16 v3, v19

    .line 94
    .line 95
    move-object/from16 v18, v20

    .line 96
    .line 97
    move-wide/from16 v19, v21

    .line 98
    .line 99
    move-wide/from16 v21, v23

    .line 100
    .line 101
    move-wide/from16 v23, v26

    .line 102
    .line 103
    invoke-direct/range {v2 .. v25}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 104
    .line 105
    .line 106
    iput-object v2, v0, Lj3/J;->w:Lj3/l0;

    .line 107
    .line 108
    :cond_2
    return-void
.end method

.method public final d([Z)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj3/J;->r:Lj3/e0;

    .line 4
    .line 5
    iget-object v2, v1, Lj3/e0;->i:Lj3/c0;

    .line 6
    .line 7
    iget-object v3, v2, Lj3/c0;->n:Li4/w;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    :goto_0
    iget-object v6, v0, Lj3/J;->a:[Lj3/d;

    .line 11
    .line 12
    array-length v7, v6

    .line 13
    iget-object v8, v0, Lj3/J;->b:Ljava/util/Set;

    .line 14
    .line 15
    if-ge v5, v7, :cond_1

    .line 16
    .line 17
    invoke-virtual {v3, v5}, Li4/w;->b(I)Z

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    if-nez v7, :cond_0

    .line 22
    .line 23
    aget-object v7, v6, v5

    .line 24
    .line 25
    invoke-interface {v8, v7}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    aget-object v6, v6, v5

    .line 32
    .line 33
    invoke-virtual {v6}, Lj3/d;->u()V

    .line 34
    .line 35
    .line 36
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v5, 0x0

    .line 40
    :goto_1
    array-length v7, v6

    .line 41
    if-ge v5, v7, :cond_e

    .line 42
    .line 43
    invoke-virtual {v3, v5}, Li4/w;->b(I)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_c

    .line 48
    .line 49
    aget-boolean v7, p1, v5

    .line 50
    .line 51
    aget-object v10, v6, v5

    .line 52
    .line 53
    invoke-static {v10}, Lj3/J;->o(Lj3/d;)Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-eqz v11, :cond_2

    .line 58
    .line 59
    goto/16 :goto_a

    .line 60
    .line 61
    :cond_2
    iget-object v11, v1, Lj3/e0;->i:Lj3/c0;

    .line 62
    .line 63
    iget-object v12, v1, Lj3/e0;->h:Lj3/c0;

    .line 64
    .line 65
    if-ne v11, v12, :cond_3

    .line 66
    .line 67
    const/4 v12, 0x1

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    const/4 v12, 0x0

    .line 70
    :goto_2
    iget-object v13, v11, Lj3/c0;->n:Li4/w;

    .line 71
    .line 72
    iget-object v14, v13, Li4/w;->b:[Lj3/w0;

    .line 73
    .line 74
    aget-object v14, v14, v5

    .line 75
    .line 76
    iget-object v13, v13, Li4/w;->c:[Li4/q;

    .line 77
    .line 78
    aget-object v13, v13, v5

    .line 79
    .line 80
    if-eqz v13, :cond_4

    .line 81
    .line 82
    invoke-interface {v13}, Li4/q;->length()I

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    const/4 v15, 0x0

    .line 88
    :goto_3
    new-array v4, v15, [Lj3/M;

    .line 89
    .line 90
    const/4 v9, 0x0

    .line 91
    const/16 v17, 0x1

    .line 92
    .line 93
    :goto_4
    if-ge v9, v15, :cond_5

    .line 94
    .line 95
    invoke-interface {v13, v9}, Li4/q;->c(I)Lj3/M;

    .line 96
    .line 97
    .line 98
    move-result-object v16

    .line 99
    aput-object v16, v4, v9

    .line 100
    .line 101
    add-int/lit8 v9, v9, 0x1

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    invoke-virtual {v0}, Lj3/J;->X()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_6

    .line 109
    .line 110
    iget-object v9, v0, Lj3/J;->w:Lj3/l0;

    .line 111
    .line 112
    iget v9, v9, Lj3/l0;->e:I

    .line 113
    .line 114
    const/4 v13, 0x3

    .line 115
    if-ne v9, v13, :cond_6

    .line 116
    .line 117
    move/from16 v9, v17

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_6
    const/4 v9, 0x0

    .line 121
    :goto_5
    if-nez v7, :cond_7

    .line 122
    .line 123
    if-eqz v9, :cond_7

    .line 124
    .line 125
    move/from16 v7, v17

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_7
    const/4 v7, 0x0

    .line 129
    :goto_6
    iget v13, v0, Lj3/J;->g0:I

    .line 130
    .line 131
    add-int/lit8 v13, v13, 0x1

    .line 132
    .line 133
    iput v13, v0, Lj3/J;->g0:I

    .line 134
    .line 135
    invoke-interface {v8, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    iget-object v13, v11, Lj3/c0;->c:[LN3/d0;

    .line 139
    .line 140
    aget-object v13, v13, v5

    .line 141
    .line 142
    move-object/from16 v18, v3

    .line 143
    .line 144
    move-object v15, v4

    .line 145
    iget-wide v3, v0, Lj3/J;->i0:J

    .line 146
    .line 147
    invoke-virtual {v11}, Lj3/c0;->e()J

    .line 148
    .line 149
    .line 150
    move-result-wide v19

    .line 151
    move/from16 v22, v5

    .line 152
    .line 153
    move-object/from16 v21, v6

    .line 154
    .line 155
    iget-wide v5, v11, Lj3/c0;->o:J

    .line 156
    .line 157
    iget v11, v10, Lj3/d;->f:I

    .line 158
    .line 159
    if-nez v11, :cond_8

    .line 160
    .line 161
    move/from16 v11, v17

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_8
    const/4 v11, 0x0

    .line 165
    :goto_7
    invoke-static {v11}, Ll4/a;->m(Z)V

    .line 166
    .line 167
    .line 168
    iput-object v14, v10, Lj3/d;->c:Lj3/w0;

    .line 169
    .line 170
    move/from16 v11, v17

    .line 171
    .line 172
    iput v11, v10, Lj3/d;->f:I

    .line 173
    .line 174
    invoke-virtual {v10, v7, v12}, Lj3/d;->l(ZZ)V

    .line 175
    .line 176
    .line 177
    move-object v12, v13

    .line 178
    move-object v11, v15

    .line 179
    move-wide/from16 v13, v19

    .line 180
    .line 181
    move-wide v15, v5

    .line 182
    invoke-virtual/range {v10 .. v16}, Lj3/d;->t([Lj3/M;LN3/d0;JJ)V

    .line 183
    .line 184
    .line 185
    const/4 v5, 0x0

    .line 186
    iput-boolean v5, v10, Lj3/d;->k:Z

    .line 187
    .line 188
    iput-wide v3, v10, Lj3/d;->j:J

    .line 189
    .line 190
    invoke-virtual {v10, v3, v4, v7}, Lj3/d;->m(JZ)V

    .line 191
    .line 192
    .line 193
    new-instance v3, Lj3/E;

    .line 194
    .line 195
    invoke-direct {v3, v0}, Lj3/E;-><init>(Lj3/J;)V

    .line 196
    .line 197
    .line 198
    const/16 v4, 0xb

    .line 199
    .line 200
    invoke-interface {v10, v4, v3}, Lj3/s0;->d(ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v3, v0, Lj3/J;->n:Lj3/j;

    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v10}, Lj3/d;->f()Ll4/m;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    const/4 v6, 0x2

    .line 213
    if-eqz v4, :cond_a

    .line 214
    .line 215
    iget-object v7, v3, Lj3/j;->d:Ll4/m;

    .line 216
    .line 217
    if-eq v4, v7, :cond_a

    .line 218
    .line 219
    if-nez v7, :cond_9

    .line 220
    .line 221
    iput-object v4, v3, Lj3/j;->d:Ll4/m;

    .line 222
    .line 223
    iput-object v10, v3, Lj3/j;->c:Lj3/d;

    .line 224
    .line 225
    iget-object v3, v3, Lj3/j;->a:Lb5/c0;

    .line 226
    .line 227
    iget-object v3, v3, Lb5/c0;->e:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v3, Lj3/m0;

    .line 230
    .line 231
    check-cast v4, Ll3/H;

    .line 232
    .line 233
    invoke-virtual {v4, v3}, Ll3/H;->a(Lj3/m0;)V

    .line 234
    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 238
    .line 239
    const-string v2, "Multiple renderer media clocks enabled."

    .line 240
    .line 241
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    new-instance v2, Lj3/m;

    .line 245
    .line 246
    const/16 v3, 0x3e8

    .line 247
    .line 248
    invoke-direct {v2, v6, v1, v3}, Lj3/m;-><init>(ILjava/lang/Exception;I)V

    .line 249
    .line 250
    .line 251
    throw v2

    .line 252
    :cond_a
    :goto_8
    if-eqz v9, :cond_d

    .line 253
    .line 254
    iget v3, v10, Lj3/d;->f:I

    .line 255
    .line 256
    const/4 v11, 0x1

    .line 257
    if-ne v3, v11, :cond_b

    .line 258
    .line 259
    const/4 v9, 0x1

    .line 260
    goto :goto_9

    .line 261
    :cond_b
    move v9, v5

    .line 262
    :goto_9
    invoke-static {v9}, Ll4/a;->m(Z)V

    .line 263
    .line 264
    .line 265
    iput v6, v10, Lj3/d;->f:I

    .line 266
    .line 267
    invoke-virtual {v10}, Lj3/d;->o()V

    .line 268
    .line 269
    .line 270
    goto :goto_b

    .line 271
    :cond_c
    :goto_a
    move-object/from16 v18, v3

    .line 272
    .line 273
    move/from16 v22, v5

    .line 274
    .line 275
    move-object/from16 v21, v6

    .line 276
    .line 277
    const/4 v5, 0x0

    .line 278
    :cond_d
    :goto_b
    add-int/lit8 v3, v22, 0x1

    .line 279
    .line 280
    move v5, v3

    .line 281
    move-object/from16 v3, v18

    .line 282
    .line 283
    move-object/from16 v6, v21

    .line 284
    .line 285
    goto/16 :goto_1

    .line 286
    .line 287
    :cond_e
    const/4 v11, 0x1

    .line 288
    iput-boolean v11, v2, Lj3/c0;->g:Z

    .line 289
    .line 290
    return-void
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

.method public final d0(Li4/w;)V
    .locals 6

    .line 1
    iget-object p1, p1, Li4/w;->c:[Li4/q;

    .line 2
    .line 3
    iget-object v0, p0, Lj3/J;->f:Lj3/i;

    .line 4
    .line 5
    iget v1, v0, Lj3/i;->f:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne v1, v2, :cond_2

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    iget-object v3, p0, Lj3/J;->a:[Lj3/d;

    .line 13
    .line 14
    array-length v4, v3

    .line 15
    const/high16 v5, 0xc80000

    .line 16
    .line 17
    if-ge v1, v4, :cond_1

    .line 18
    .line 19
    aget-object v4, p1, v1

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    aget-object v3, v3, v1

    .line 24
    .line 25
    iget v3, v3, Lj3/d;->a:I

    .line 26
    .line 27
    const/high16 v4, 0x20000

    .line 28
    .line 29
    packed-switch v3, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :pswitch_0
    move v5, v4

    .line 39
    goto :goto_1

    .line 40
    :pswitch_1
    const/high16 v5, 0x7d00000

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :pswitch_2
    const/high16 v5, 0x89a0000

    .line 44
    .line 45
    :goto_1
    :pswitch_3
    add-int/2addr v2, v5

    .line 46
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    :cond_2
    iput v1, v0, Lj3/i;->h:I

    .line 54
    .line 55
    iget-object p1, v0, Lj3/i;->a:Lk4/q;

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Lk4/q;->a(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final e(Lj3/E0;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lj3/J;->l:Lj3/C0;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Lj3/C0;->c:I

    .line 8
    .line 9
    iget-object v1, p0, Lj3/J;->k:Lj3/D0;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v1}, Lj3/E0;->n(ILj3/D0;)V

    .line 12
    .line 13
    .line 14
    iget-wide p1, v1, Lj3/D0;->f:J

    .line 15
    .line 16
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long p1, p1, v2

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Lj3/D0;->a()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-boolean p1, v1, Lj3/D0;->i:Z

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-wide p1, v1, Lj3/D0;->g:J

    .line 37
    .line 38
    invoke-static {p1, p2}, Ll4/y;->v(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    iget-wide v1, v1, Lj3/D0;->f:J

    .line 43
    .line 44
    sub-long/2addr p1, v1

    .line 45
    invoke-static {p1, p2}, Ll4/y;->H(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    iget-wide v0, v0, Lj3/C0;->e:J

    .line 50
    .line 51
    add-long/2addr p3, v0

    .line 52
    sub-long/2addr p1, p3

    .line 53
    return-wide p1

    .line 54
    :cond_1
    :goto_0
    return-wide v2
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
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
.end method

.method public final e0()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v10, 0x3

    .line 4
    const/4 v11, 0x0

    .line 5
    const/4 v12, 0x1

    .line 6
    iget-object v1, v0, Lj3/J;->r:Lj3/e0;

    .line 7
    .line 8
    iget-object v1, v1, Lj3/e0;->h:Lj3/c0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_f

    .line 13
    .line 14
    :cond_0
    iget-boolean v2, v1, Lj3/c0;->d:Z

    .line 15
    .line 16
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v1, Lj3/c0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-interface {v2}, LN3/x;->k()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-wide v2, v13

    .line 31
    :goto_0
    cmp-long v4, v2, v13

    .line 32
    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v2, v3}, Lj3/J;->D(J)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 39
    .line 40
    iget-wide v4, v1, Lj3/l0;->r:J

    .line 41
    .line 42
    cmp-long v1, v2, v4

    .line 43
    .line 44
    if-eqz v1, :cond_10

    .line 45
    .line 46
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 47
    .line 48
    iget-object v4, v1, Lj3/l0;->b:LN3/A;

    .line 49
    .line 50
    iget-wide v5, v1, Lj3/l0;->c:J

    .line 51
    .line 52
    const/4 v8, 0x1

    .line 53
    const/4 v9, 0x5

    .line 54
    move-object v1, v4

    .line 55
    move-wide v4, v5

    .line 56
    move-wide v6, v2

    .line 57
    invoke-virtual/range {v0 .. v9}, Lj3/J;->m(LN3/A;JJJZI)Lj3/l0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 62
    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_2
    iget-object v2, v0, Lj3/J;->n:Lj3/j;

    .line 66
    .line 67
    iget-object v3, v0, Lj3/J;->r:Lj3/e0;

    .line 68
    .line 69
    iget-object v3, v3, Lj3/e0;->i:Lj3/c0;

    .line 70
    .line 71
    if-eq v1, v3, :cond_3

    .line 72
    .line 73
    move v3, v12

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move v3, v11

    .line 76
    :goto_1
    iget-object v4, v2, Lj3/j;->c:Lj3/d;

    .line 77
    .line 78
    iget-object v5, v2, Lj3/j;->a:Lb5/c0;

    .line 79
    .line 80
    if-eqz v4, :cond_7

    .line 81
    .line 82
    invoke-virtual {v4}, Lj3/d;->i()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_7

    .line 87
    .line 88
    iget-object v4, v2, Lj3/j;->c:Lj3/d;

    .line 89
    .line 90
    invoke-virtual {v4}, Lj3/d;->j()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_4

    .line 95
    .line 96
    if-nez v3, :cond_7

    .line 97
    .line 98
    iget-object v3, v2, Lj3/j;->c:Lj3/d;

    .line 99
    .line 100
    invoke-virtual {v3}, Lj3/d;->h()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    iget-object v3, v2, Lj3/j;->d:Ll4/m;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-interface {v3}, Ll4/m;->b()J

    .line 113
    .line 114
    .line 115
    move-result-wide v6

    .line 116
    iget-boolean v4, v2, Lj3/j;->e:Z

    .line 117
    .line 118
    if-eqz v4, :cond_6

    .line 119
    .line 120
    invoke-virtual {v5}, Lb5/c0;->b()J

    .line 121
    .line 122
    .line 123
    move-result-wide v8

    .line 124
    cmp-long v4, v6, v8

    .line 125
    .line 126
    if-gez v4, :cond_5

    .line 127
    .line 128
    iget-boolean v3, v5, Lb5/c0;->a:Z

    .line 129
    .line 130
    if-eqz v3, :cond_8

    .line 131
    .line 132
    invoke-virtual {v5}, Lb5/c0;->b()J

    .line 133
    .line 134
    .line 135
    move-result-wide v3

    .line 136
    invoke-virtual {v5, v3, v4}, Lb5/c0;->d(J)V

    .line 137
    .line 138
    .line 139
    iput-boolean v11, v5, Lb5/c0;->a:Z

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    iput-boolean v11, v2, Lj3/j;->e:Z

    .line 143
    .line 144
    iget-boolean v4, v2, Lj3/j;->f:Z

    .line 145
    .line 146
    if-eqz v4, :cond_6

    .line 147
    .line 148
    invoke-virtual {v5}, Lb5/c0;->e()V

    .line 149
    .line 150
    .line 151
    :cond_6
    invoke-virtual {v5, v6, v7}, Lb5/c0;->d(J)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v3}, Ll4/m;->c()Lj3/m0;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iget-object v4, v5, Lb5/c0;->e:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v4, Lj3/m0;

    .line 161
    .line 162
    invoke-virtual {v3, v4}, Lj3/m0;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_8

    .line 167
    .line 168
    invoke-virtual {v5, v3}, Lb5/c0;->a(Lj3/m0;)V

    .line 169
    .line 170
    .line 171
    iget-object v4, v2, Lj3/j;->b:Lj3/J;

    .line 172
    .line 173
    iget-object v4, v4, Lj3/J;->h:Ll4/w;

    .line 174
    .line 175
    const/16 v5, 0x10

    .line 176
    .line 177
    invoke-virtual {v4, v5, v3}, Ll4/w;->a(ILjava/lang/Object;)Ll4/v;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-virtual {v3}, Ll4/v;->b()V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    :goto_2
    iput-boolean v12, v2, Lj3/j;->e:Z

    .line 186
    .line 187
    iget-boolean v3, v2, Lj3/j;->f:Z

    .line 188
    .line 189
    if-eqz v3, :cond_8

    .line 190
    .line 191
    invoke-virtual {v5}, Lb5/c0;->e()V

    .line 192
    .line 193
    .line 194
    :cond_8
    :goto_3
    invoke-virtual {v2}, Lj3/j;->b()J

    .line 195
    .line 196
    .line 197
    move-result-wide v2

    .line 198
    iput-wide v2, v0, Lj3/J;->i0:J

    .line 199
    .line 200
    iget-wide v4, v1, Lj3/c0;->o:J

    .line 201
    .line 202
    sub-long/2addr v2, v4

    .line 203
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 204
    .line 205
    iget-wide v4, v1, Lj3/l0;->r:J

    .line 206
    .line 207
    iget-object v1, v0, Lj3/J;->o:Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-nez v1, :cond_f

    .line 214
    .line 215
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 216
    .line 217
    iget-object v1, v1, Lj3/l0;->b:LN3/A;

    .line 218
    .line 219
    invoke-virtual {v1}, LN3/y;->a()Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_9

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_9
    iget-boolean v1, v0, Lj3/J;->k0:Z

    .line 227
    .line 228
    if-eqz v1, :cond_a

    .line 229
    .line 230
    iput-boolean v11, v0, Lj3/J;->k0:Z

    .line 231
    .line 232
    :cond_a
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 233
    .line 234
    iget-object v4, v1, Lj3/l0;->a:Lj3/E0;

    .line 235
    .line 236
    iget-object v1, v1, Lj3/l0;->b:LN3/A;

    .line 237
    .line 238
    iget-object v1, v1, LN3/y;->a:Ljava/lang/Object;

    .line 239
    .line 240
    invoke-virtual {v4, v1}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 241
    .line 242
    .line 243
    iget v1, v0, Lj3/J;->j0:I

    .line 244
    .line 245
    iget-object v4, v0, Lj3/J;->o:Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-lez v1, :cond_c

    .line 256
    .line 257
    iget-object v4, v0, Lj3/J;->o:Ljava/util/ArrayList;

    .line 258
    .line 259
    add-int/lit8 v5, v1, -0x1

    .line 260
    .line 261
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    if-nez v4, :cond_b

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_b
    new-instance v1, Ljava/lang/ClassCastException;

    .line 269
    .line 270
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 271
    .line 272
    .line 273
    throw v1

    .line 274
    :cond_c
    :goto_4
    iget-object v4, v0, Lj3/J;->o:Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-ge v1, v4, :cond_e

    .line 281
    .line 282
    iget-object v4, v0, Lj3/J;->o:Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    if-nez v4, :cond_d

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_d
    new-instance v1, Ljava/lang/ClassCastException;

    .line 292
    .line 293
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 294
    .line 295
    .line 296
    throw v1

    .line 297
    :cond_e
    :goto_5
    iput v1, v0, Lj3/J;->j0:I

    .line 298
    .line 299
    :cond_f
    :goto_6
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 300
    .line 301
    iput-wide v2, v1, Lj3/l0;->r:J

    .line 302
    .line 303
    :cond_10
    :goto_7
    iget-object v1, v0, Lj3/J;->r:Lj3/e0;

    .line 304
    .line 305
    iget-object v1, v1, Lj3/e0;->j:Lj3/c0;

    .line 306
    .line 307
    iget-object v2, v0, Lj3/J;->w:Lj3/l0;

    .line 308
    .line 309
    invoke-virtual {v1}, Lj3/c0;->d()J

    .line 310
    .line 311
    .line 312
    move-result-wide v3

    .line 313
    iput-wide v3, v2, Lj3/l0;->p:J

    .line 314
    .line 315
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 316
    .line 317
    iget-wide v2, v1, Lj3/l0;->p:J

    .line 318
    .line 319
    iget-object v4, v0, Lj3/J;->r:Lj3/e0;

    .line 320
    .line 321
    iget-object v4, v4, Lj3/e0;->j:Lj3/c0;

    .line 322
    .line 323
    const-wide/16 v5, 0x0

    .line 324
    .line 325
    if-nez v4, :cond_11

    .line 326
    .line 327
    move-wide v2, v5

    .line 328
    move v9, v12

    .line 329
    move-wide v15, v13

    .line 330
    goto :goto_8

    .line 331
    :cond_11
    iget-wide v7, v0, Lj3/J;->i0:J

    .line 332
    .line 333
    move v9, v12

    .line 334
    move-wide v15, v13

    .line 335
    iget-wide v12, v4, Lj3/c0;->o:J

    .line 336
    .line 337
    sub-long/2addr v7, v12

    .line 338
    sub-long/2addr v2, v7

    .line 339
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 340
    .line 341
    .line 342
    move-result-wide v2

    .line 343
    :goto_8
    iput-wide v2, v1, Lj3/l0;->q:J

    .line 344
    .line 345
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 346
    .line 347
    iget-boolean v2, v1, Lj3/l0;->l:Z

    .line 348
    .line 349
    if-eqz v2, :cond_1b

    .line 350
    .line 351
    iget v2, v1, Lj3/l0;->e:I

    .line 352
    .line 353
    if-ne v2, v10, :cond_1b

    .line 354
    .line 355
    iget-object v2, v1, Lj3/l0;->a:Lj3/E0;

    .line 356
    .line 357
    iget-object v1, v1, Lj3/l0;->b:LN3/A;

    .line 358
    .line 359
    invoke-virtual {v0, v2, v1}, Lj3/J;->Y(Lj3/E0;LN3/A;)Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    if-eqz v1, :cond_1b

    .line 364
    .line 365
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 366
    .line 367
    iget-object v2, v1, Lj3/l0;->n:Lj3/m0;

    .line 368
    .line 369
    iget v2, v2, Lj3/m0;->a:F

    .line 370
    .line 371
    const/high16 v3, 0x3f800000    # 1.0f

    .line 372
    .line 373
    cmpl-float v2, v2, v3

    .line 374
    .line 375
    if-nez v2, :cond_1b

    .line 376
    .line 377
    iget-object v2, v0, Lj3/J;->t:Lj3/h;

    .line 378
    .line 379
    iget-object v4, v1, Lj3/l0;->a:Lj3/E0;

    .line 380
    .line 381
    iget-object v7, v1, Lj3/l0;->b:LN3/A;

    .line 382
    .line 383
    iget-object v7, v7, LN3/y;->a:Ljava/lang/Object;

    .line 384
    .line 385
    iget-wide v12, v1, Lj3/l0;->r:J

    .line 386
    .line 387
    invoke-virtual {v0, v4, v7, v12, v13}, Lj3/J;->e(Lj3/E0;Ljava/lang/Object;J)J

    .line 388
    .line 389
    .line 390
    move-result-wide v7

    .line 391
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 392
    .line 393
    iget-wide v12, v1, Lj3/l0;->p:J

    .line 394
    .line 395
    iget-object v1, v0, Lj3/J;->r:Lj3/e0;

    .line 396
    .line 397
    iget-object v1, v1, Lj3/e0;->j:Lj3/c0;

    .line 398
    .line 399
    if-nez v1, :cond_12

    .line 400
    .line 401
    move v4, v11

    .line 402
    move-wide v11, v5

    .line 403
    goto :goto_9

    .line 404
    :cond_12
    move v4, v11

    .line 405
    move-wide/from16 v17, v12

    .line 406
    .line 407
    iget-wide v11, v0, Lj3/J;->i0:J

    .line 408
    .line 409
    iget-wide v13, v1, Lj3/c0;->o:J

    .line 410
    .line 411
    sub-long/2addr v11, v13

    .line 412
    sub-long v11, v17, v11

    .line 413
    .line 414
    invoke-static {v5, v6, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 415
    .line 416
    .line 417
    move-result-wide v11

    .line 418
    :goto_9
    iget-wide v13, v2, Lj3/h;->c:J

    .line 419
    .line 420
    cmp-long v1, v13, v15

    .line 421
    .line 422
    if-nez v1, :cond_13

    .line 423
    .line 424
    move v1, v4

    .line 425
    goto/16 :goto_e

    .line 426
    .line 427
    :cond_13
    sub-long v11, v7, v11

    .line 428
    .line 429
    iget-wide v13, v2, Lj3/h;->m:J

    .line 430
    .line 431
    cmp-long v1, v13, v15

    .line 432
    .line 433
    if-nez v1, :cond_14

    .line 434
    .line 435
    iput-wide v11, v2, Lj3/h;->m:J

    .line 436
    .line 437
    iput-wide v5, v2, Lj3/h;->n:J

    .line 438
    .line 439
    move v1, v4

    .line 440
    goto :goto_a

    .line 441
    :cond_14
    long-to-float v1, v13

    .line 442
    const v5, 0x3f7fbe77    # 0.999f

    .line 443
    .line 444
    .line 445
    mul-float/2addr v1, v5

    .line 446
    long-to-float v6, v11

    .line 447
    const v13, 0x3a831200    # 9.999871E-4f

    .line 448
    .line 449
    .line 450
    mul-float/2addr v6, v13

    .line 451
    add-float/2addr v6, v1

    .line 452
    move v1, v4

    .line 453
    move v14, v5

    .line 454
    float-to-long v4, v6

    .line 455
    invoke-static {v11, v12, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 456
    .line 457
    .line 458
    move-result-wide v4

    .line 459
    iput-wide v4, v2, Lj3/h;->m:J

    .line 460
    .line 461
    sub-long/2addr v11, v4

    .line 462
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    .line 463
    .line 464
    .line 465
    move-result-wide v4

    .line 466
    iget-wide v11, v2, Lj3/h;->n:J

    .line 467
    .line 468
    long-to-float v6, v11

    .line 469
    mul-float/2addr v6, v14

    .line 470
    long-to-float v4, v4

    .line 471
    mul-float/2addr v13, v4

    .line 472
    add-float/2addr v13, v6

    .line 473
    float-to-long v4, v13

    .line 474
    iput-wide v4, v2, Lj3/h;->n:J

    .line 475
    .line 476
    :goto_a
    iget-wide v4, v2, Lj3/h;->l:J

    .line 477
    .line 478
    cmp-long v4, v4, v15

    .line 479
    .line 480
    const-wide/16 v5, 0x3e8

    .line 481
    .line 482
    if-eqz v4, :cond_15

    .line 483
    .line 484
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 485
    .line 486
    .line 487
    move-result-wide v11

    .line 488
    iget-wide v13, v2, Lj3/h;->l:J

    .line 489
    .line 490
    sub-long/2addr v11, v13

    .line 491
    cmp-long v4, v11, v5

    .line 492
    .line 493
    if-gez v4, :cond_15

    .line 494
    .line 495
    iget v3, v2, Lj3/h;->k:F

    .line 496
    .line 497
    goto/16 :goto_e

    .line 498
    .line 499
    :cond_15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 500
    .line 501
    .line 502
    move-result-wide v11

    .line 503
    iput-wide v11, v2, Lj3/h;->l:J

    .line 504
    .line 505
    iget-wide v11, v2, Lj3/h;->m:J

    .line 506
    .line 507
    const-wide/16 v13, 0x3

    .line 508
    .line 509
    move-wide/from16 v17, v5

    .line 510
    .line 511
    iget-wide v5, v2, Lj3/h;->n:J

    .line 512
    .line 513
    mul-long/2addr v5, v13

    .line 514
    add-long v23, v5, v11

    .line 515
    .line 516
    iget-wide v4, v2, Lj3/h;->h:J

    .line 517
    .line 518
    cmp-long v4, v4, v23

    .line 519
    .line 520
    if-lez v4, :cond_18

    .line 521
    .line 522
    invoke-static/range {v17 .. v18}, Ll4/y;->H(J)J

    .line 523
    .line 524
    .line 525
    move-result-wide v11

    .line 526
    iget v4, v2, Lj3/h;->k:F

    .line 527
    .line 528
    sub-float/2addr v4, v3

    .line 529
    long-to-float v6, v11

    .line 530
    mul-float/2addr v4, v6

    .line 531
    float-to-long v11, v4

    .line 532
    iget v4, v2, Lj3/h;->i:F

    .line 533
    .line 534
    sub-float/2addr v4, v3

    .line 535
    mul-float/2addr v4, v6

    .line 536
    float-to-long v13, v4

    .line 537
    add-long/2addr v11, v13

    .line 538
    iget-wide v13, v2, Lj3/h;->e:J

    .line 539
    .line 540
    const v4, 0x33d6bf95    # 1.0E-7f

    .line 541
    .line 542
    .line 543
    iget-wide v5, v2, Lj3/h;->h:J

    .line 544
    .line 545
    sub-long/2addr v5, v11

    .line 546
    new-array v11, v10, [J

    .line 547
    .line 548
    aput-wide v23, v11, v1

    .line 549
    .line 550
    aput-wide v13, v11, v9

    .line 551
    .line 552
    const/4 v12, 0x2

    .line 553
    aput-wide v5, v11, v12

    .line 554
    .line 555
    aget-wide v5, v11, v1

    .line 556
    .line 557
    move v12, v9

    .line 558
    :goto_b
    if-ge v12, v10, :cond_17

    .line 559
    .line 560
    aget-wide v13, v11, v12

    .line 561
    .line 562
    cmp-long v15, v13, v5

    .line 563
    .line 564
    if-lez v15, :cond_16

    .line 565
    .line 566
    move-wide v5, v13

    .line 567
    :cond_16
    add-int/2addr v12, v9

    .line 568
    goto :goto_b

    .line 569
    :cond_17
    iput-wide v5, v2, Lj3/h;->h:J

    .line 570
    .line 571
    goto :goto_c

    .line 572
    :cond_18
    const v4, 0x33d6bf95    # 1.0E-7f

    .line 573
    .line 574
    .line 575
    iget v5, v2, Lj3/h;->k:F

    .line 576
    .line 577
    sub-float/2addr v5, v3

    .line 578
    const/4 v6, 0x0

    .line 579
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    .line 580
    .line 581
    .line 582
    move-result v5

    .line 583
    div-float/2addr v5, v4

    .line 584
    float-to-long v5, v5

    .line 585
    sub-long v19, v7, v5

    .line 586
    .line 587
    iget-wide v5, v2, Lj3/h;->h:J

    .line 588
    .line 589
    move-wide/from16 v21, v5

    .line 590
    .line 591
    invoke-static/range {v19 .. v24}, Ll4/y;->j(JJJ)J

    .line 592
    .line 593
    .line 594
    move-result-wide v5

    .line 595
    iput-wide v5, v2, Lj3/h;->h:J

    .line 596
    .line 597
    iget-wide v9, v2, Lj3/h;->g:J

    .line 598
    .line 599
    cmp-long v11, v9, v15

    .line 600
    .line 601
    if-eqz v11, :cond_19

    .line 602
    .line 603
    cmp-long v5, v5, v9

    .line 604
    .line 605
    if-lez v5, :cond_19

    .line 606
    .line 607
    iput-wide v9, v2, Lj3/h;->h:J

    .line 608
    .line 609
    :cond_19
    :goto_c
    iget-wide v5, v2, Lj3/h;->h:J

    .line 610
    .line 611
    sub-long/2addr v7, v5

    .line 612
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 613
    .line 614
    .line 615
    move-result-wide v5

    .line 616
    iget-wide v9, v2, Lj3/h;->a:J

    .line 617
    .line 618
    cmp-long v5, v5, v9

    .line 619
    .line 620
    if-gez v5, :cond_1a

    .line 621
    .line 622
    iput v3, v2, Lj3/h;->k:F

    .line 623
    .line 624
    goto :goto_d

    .line 625
    :cond_1a
    long-to-float v5, v7

    .line 626
    mul-float/2addr v5, v4

    .line 627
    add-float/2addr v5, v3

    .line 628
    iget v3, v2, Lj3/h;->j:F

    .line 629
    .line 630
    iget v4, v2, Lj3/h;->i:F

    .line 631
    .line 632
    invoke-static {v5, v3, v4}, Ll4/y;->h(FFF)F

    .line 633
    .line 634
    .line 635
    move-result v3

    .line 636
    iput v3, v2, Lj3/h;->k:F

    .line 637
    .line 638
    :goto_d
    iget v3, v2, Lj3/h;->k:F

    .line 639
    .line 640
    :goto_e
    iget-object v2, v0, Lj3/J;->n:Lj3/j;

    .line 641
    .line 642
    invoke-virtual {v2}, Lj3/j;->c()Lj3/m0;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    iget v2, v2, Lj3/m0;->a:F

    .line 647
    .line 648
    cmpl-float v2, v2, v3

    .line 649
    .line 650
    if-eqz v2, :cond_1b

    .line 651
    .line 652
    iget-object v2, v0, Lj3/J;->n:Lj3/j;

    .line 653
    .line 654
    iget-object v4, v0, Lj3/J;->w:Lj3/l0;

    .line 655
    .line 656
    iget-object v4, v4, Lj3/l0;->n:Lj3/m0;

    .line 657
    .line 658
    new-instance v5, Lj3/m0;

    .line 659
    .line 660
    iget v4, v4, Lj3/m0;->b:F

    .line 661
    .line 662
    invoke-direct {v5, v3, v4}, Lj3/m0;-><init>(FF)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v2, v5}, Lj3/j;->a(Lj3/m0;)V

    .line 666
    .line 667
    .line 668
    iget-object v2, v0, Lj3/J;->w:Lj3/l0;

    .line 669
    .line 670
    iget-object v2, v2, Lj3/l0;->n:Lj3/m0;

    .line 671
    .line 672
    iget-object v3, v0, Lj3/J;->n:Lj3/j;

    .line 673
    .line 674
    invoke-virtual {v3}, Lj3/j;->c()Lj3/m0;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    iget v3, v3, Lj3/m0;->a:F

    .line 679
    .line 680
    invoke-virtual {v0, v2, v3, v1, v1}, Lj3/J;->l(Lj3/m0;FZZ)V

    .line 681
    .line 682
    .line 683
    :cond_1b
    :goto_f
    return-void
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
.end method

.method public final f(Lj3/E0;)Landroid/util/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lj3/E0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lj3/l0;->s:LN3/A;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-boolean v0, p0, Lj3/J;->X:Z

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lj3/E0;->a(Z)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    iget-object v5, p0, Lj3/J;->l:Lj3/C0;

    .line 27
    .line 28
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Lj3/J;->k:Lj3/D0;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, Lj3/E0;->i(Lj3/D0;Lj3/C0;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 41
    .line 42
    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v3, v4, v1, v2}, Lj3/e0;->m(Lj3/E0;Ljava/lang/Object;J)LN3/A;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-virtual {v0}, LN3/y;->a()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    iget-object p1, v0, LN3/y;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v4, p0, Lj3/J;->l:Lj3/C0;

    .line 65
    .line 66
    invoke-virtual {v3, p1, v4}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 67
    .line 68
    .line 69
    iget p1, v0, LN3/y;->b:I

    .line 70
    .line 71
    invoke-virtual {v4, p1}, Lj3/C0;->f(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iget v3, v0, LN3/y;->c:I

    .line 76
    .line 77
    if-ne v3, p1, :cond_1

    .line 78
    .line 79
    iget-object p1, v4, Lj3/C0;->g:LO3/b;

    .line 80
    .line 81
    iget-wide v1, p1, LO3/b;->b:J

    .line 82
    .line 83
    :cond_1
    move-wide v4, v1

    .line 84
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final f0(Lj3/E0;LN3/A;Lj3/E0;LN3/A;J)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Lj3/J;->Y(Lj3/E0;LN3/A;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, LN3/y;->a()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lj3/m0;->d:Lj3/m0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 17
    .line 18
    iget-object p1, p1, Lj3/l0;->n:Lj3/m0;

    .line 19
    .line 20
    :goto_0
    iget-object p2, p0, Lj3/J;->n:Lj3/j;

    .line 21
    .line 22
    invoke-virtual {p2}, Lj3/j;->c()Lj3/m0;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p3, p1}, Lj3/m0;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-nez p3, :cond_7

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Lj3/j;->a(Lj3/m0;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p2, p2, LN3/y;->a:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v0, p0, Lj3/J;->l:Lj3/C0;

    .line 39
    .line 40
    invoke-virtual {p1, p2, v0}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget v1, v1, Lj3/C0;->c:I

    .line 45
    .line 46
    iget-object v2, p0, Lj3/J;->k:Lj3/D0;

    .line 47
    .line 48
    invoke-virtual {p1, v1, v2}, Lj3/E0;->n(ILj3/D0;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v2, Lj3/D0;->k:Lj3/T;

    .line 52
    .line 53
    sget v3, Ll4/y;->a:I

    .line 54
    .line 55
    iget-object v3, p0, Lj3/J;->t:Lj3/h;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-wide v4, v1, Lj3/T;->a:J

    .line 61
    .line 62
    invoke-static {v4, v5}, Ll4/y;->H(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    iput-wide v4, v3, Lj3/h;->c:J

    .line 67
    .line 68
    iget-wide v4, v1, Lj3/T;->b:J

    .line 69
    .line 70
    invoke-static {v4, v5}, Ll4/y;->H(J)J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    iput-wide v4, v3, Lj3/h;->f:J

    .line 75
    .line 76
    iget-wide v4, v1, Lj3/T;->c:J

    .line 77
    .line 78
    invoke-static {v4, v5}, Ll4/y;->H(J)J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    iput-wide v4, v3, Lj3/h;->g:J

    .line 83
    .line 84
    iget v4, v1, Lj3/T;->d:F

    .line 85
    .line 86
    const v5, -0x800001

    .line 87
    .line 88
    .line 89
    cmpl-float v6, v4, v5

    .line 90
    .line 91
    if-eqz v6, :cond_2

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    const v4, 0x3f7851ec    # 0.97f

    .line 95
    .line 96
    .line 97
    :goto_1
    iput v4, v3, Lj3/h;->j:F

    .line 98
    .line 99
    iget v1, v1, Lj3/T;->e:F

    .line 100
    .line 101
    cmpl-float v5, v1, v5

    .line 102
    .line 103
    if-eqz v5, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    const v1, 0x3f83d70a    # 1.03f

    .line 107
    .line 108
    .line 109
    :goto_2
    iput v1, v3, Lj3/h;->i:F

    .line 110
    .line 111
    const/high16 v5, 0x3f800000    # 1.0f

    .line 112
    .line 113
    cmpl-float v4, v4, v5

    .line 114
    .line 115
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    if-nez v4, :cond_4

    .line 121
    .line 122
    cmpl-float v1, v1, v5

    .line 123
    .line 124
    if-nez v1, :cond_4

    .line 125
    .line 126
    iput-wide v6, v3, Lj3/h;->c:J

    .line 127
    .line 128
    :cond_4
    invoke-virtual {v3}, Lj3/h;->a()V

    .line 129
    .line 130
    .line 131
    cmp-long v1, p5, v6

    .line 132
    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    invoke-virtual {p0, p1, p2, p5, p6}, Lj3/J;->e(Lj3/E0;Ljava/lang/Object;J)J

    .line 136
    .line 137
    .line 138
    move-result-wide p1

    .line 139
    iput-wide p1, v3, Lj3/h;->d:J

    .line 140
    .line 141
    invoke-virtual {v3}, Lj3/h;->a()V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_5
    iget-object p1, v2, Lj3/D0;->a:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-virtual {p3}, Lj3/E0;->p()Z

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    if-nez p2, :cond_6

    .line 152
    .line 153
    iget-object p2, p4, LN3/y;->a:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {p3, p2, v0}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    iget p2, p2, Lj3/C0;->c:I

    .line 160
    .line 161
    const-wide/16 p4, 0x0

    .line 162
    .line 163
    invoke-virtual {p3, p2, v2, p4, p5}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    iget-object p2, p2, Lj3/D0;->a:Ljava/lang/Object;

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_6
    const/4 p2, 0x0

    .line 171
    :goto_3
    invoke-static {p2, p1}, Ll4/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-nez p1, :cond_7

    .line 176
    .line 177
    iput-wide v6, v3, Lj3/h;->d:J

    .line 178
    .line 179
    invoke-virtual {v3}, Lj3/h;->a()V

    .line 180
    .line 181
    .line 182
    :cond_7
    return-void
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public final g(LN3/x;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 2
    .line 3
    iget-object v0, v0, Lj3/e0;->j:Lj3/c0;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, v0, Lj3/c0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne v1, p1, :cond_2

    .line 10
    .line 11
    iget-wide v1, p0, Lj3/J;->i0:J

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p1, v0, Lj3/c0;->l:Lj3/c0;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    invoke-static {p1}, Ll4/a;->m(Z)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, v0, Lj3/c0;->d:Z

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v0, Lj3/c0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    iget-wide v3, v0, Lj3/c0;->o:J

    .line 32
    .line 33
    sub-long/2addr v1, v3

    .line 34
    invoke-interface {p1, v1, v2}, LN3/f0;->B(J)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, Lj3/J;->q()V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final declared-synchronized g0(LN3/l;J)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lj3/J;->p:Ll4/u;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    add-long/2addr v0, p2

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-virtual {p1}, LN3/l;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    cmp-long v3, p2, v3

    .line 28
    .line 29
    if-lez v3, :cond_0

    .line 30
    .line 31
    :try_start_1
    iget-object v3, p0, Lj3/J;->p:Ll4/u;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :catch_0
    const/4 p2, 0x1

    .line 43
    move v2, p2

    .line 44
    :goto_1
    :try_start_2
    iget-object p2, p0, Lj3/J;->p:Ll4/u;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    sub-long p2, v0, p2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    .line 65
    :cond_1
    monitor-exit p0

    .line 66
    return-void

    .line 67
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    throw p1
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
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
.end method

.method public final h(ILjava/io/IOException;)V
    .locals 2

    .line 1
    new-instance v0, Lj3/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p2, p1}, Lj3/m;-><init>(ILjava/lang/Exception;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lj3/J;->r:Lj3/e0;

    .line 8
    .line 9
    iget-object p1, p1, Lj3/e0;->h:Lj3/c0;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lj3/c0;->f:Lj3/d0;

    .line 14
    .line 15
    iget-object p1, p1, Lj3/d0;->a:LN3/A;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lj3/m;->a(LN3/y;)Lj3/m;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    const-string p1, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string p2, "Playback error"

    .line 24
    .line 25
    invoke-static {p1, p2, v0}, Ll4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v1}, Lj3/J;->a0(ZZ)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lj3/l0;->d(Lj3/m;)Lj3/l0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    const-string v0, "Playback error"

    .line 2
    .line 3
    const-string v1, "ExoPlayerImplInternal"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0x3e8

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    :try_start_0
    iget v5, p1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    return v4

    .line 15
    :pswitch_0
    invoke-virtual {p0, v2}, Lj3/J;->H(Z)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_e

    .line 19
    .line 20
    :pswitch_1
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 21
    .line 22
    if-ne p1, v2, :cond_0

    .line 23
    .line 24
    move p1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v4

    .line 27
    :goto_0
    invoke-virtual {p0, p1}, Lj3/J;->P(Z)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_e

    .line 31
    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :catch_1
    move-exception p1

    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :catch_2
    move-exception p1

    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    :catch_3
    move-exception p1

    .line 42
    goto/16 :goto_8

    .line 43
    .line 44
    :catch_4
    move-exception p1

    .line 45
    goto/16 :goto_9

    .line 46
    .line 47
    :catch_5
    move-exception p1

    .line 48
    goto/16 :goto_c

    .line 49
    .line 50
    :catch_6
    move-exception p1

    .line 51
    goto/16 :goto_d

    .line 52
    .line 53
    :pswitch_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    move p1, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move p1, v4

    .line 60
    :goto_1
    invoke-virtual {p0, p1}, Lj3/J;->Q(Z)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_e

    .line 64
    .line 65
    :pswitch_3
    invoke-virtual {p0}, Lj3/J;->s()V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_e

    .line 69
    .line 70
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, LN3/g0;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lj3/J;->V(LN3/g0;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_e

    .line 78
    .line 79
    :pswitch_5
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 80
    .line 81
    iget v6, p1, Landroid/os/Message;->arg2:I

    .line 82
    .line 83
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, LN3/g0;

    .line 86
    .line 87
    invoke-virtual {p0, v5, v6, p1}, Lj3/J;->y(IILN3/g0;)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_e

    .line 91
    .line 92
    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {p1}, LA0/a;->x(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lj3/J;->t()V

    .line 98
    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    throw p1

    .line 102
    :pswitch_7
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v5, Lj3/F;

    .line 105
    .line 106
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 107
    .line 108
    invoke-virtual {p0, v5, p1}, Lj3/J;->a(Lj3/F;I)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_e

    .line 112
    .line 113
    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, Lj3/F;

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Lj3/J;->O(Lj3/F;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_e

    .line 121
    .line 122
    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Lj3/m0;

    .line 125
    .line 126
    iget v5, p1, Lj3/m0;->a:F

    .line 127
    .line 128
    invoke-virtual {p0, p1, v5, v2, v4}, Lj3/J;->l(Lj3/m0;FZZ)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_e

    .line 132
    .line 133
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, Lj3/t0;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Lj3/J;->L(Lj3/t0;)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_e

    .line 141
    .line 142
    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p1, Lj3/t0;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0, p1}, Lj3/J;->K(Lj3/t0;)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_e

    .line 153
    .line 154
    :pswitch_c
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 155
    .line 156
    if-eqz v5, :cond_2

    .line 157
    .line 158
    move v5, v2

    .line 159
    goto :goto_2

    .line 160
    :cond_2
    move v5, v4

    .line 161
    :goto_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 164
    .line 165
    invoke-virtual {p0, v5, p1}, Lj3/J;->N(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_e

    .line 169
    .line 170
    :pswitch_d
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 171
    .line 172
    if-eqz p1, :cond_3

    .line 173
    .line 174
    move p1, v2

    .line 175
    goto :goto_3

    .line 176
    :cond_3
    move p1, v4

    .line 177
    :goto_3
    invoke-virtual {p0, p1}, Lj3/J;->U(Z)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_e

    .line 181
    .line 182
    :pswitch_e
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 183
    .line 184
    invoke-virtual {p0, p1}, Lj3/J;->T(I)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_e

    .line 188
    .line 189
    :pswitch_f
    invoke-virtual {p0}, Lj3/J;->z()V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_e

    .line 193
    .line 194
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p1, LN3/x;

    .line 197
    .line 198
    invoke-virtual {p0, p1}, Lj3/J;->g(LN3/x;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_e

    .line 202
    .line 203
    :pswitch_11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p1, LN3/x;

    .line 206
    .line 207
    invoke-virtual {p0, p1}, Lj3/J;->k(LN3/x;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_e

    .line 211
    .line 212
    :pswitch_12
    invoke-virtual {p0}, Lj3/J;->x()V

    .line 213
    .line 214
    .line 215
    return v2

    .line 216
    :pswitch_13
    invoke-virtual {p0, v4, v2}, Lj3/J;->a0(ZZ)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_e

    .line 220
    .line 221
    :pswitch_14
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p1, Lj3/x0;

    .line 224
    .line 225
    iput-object p1, p0, Lj3/J;->v:Lj3/x0;

    .line 226
    .line 227
    goto/16 :goto_e

    .line 228
    .line 229
    :pswitch_15
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p1, Lj3/m0;

    .line 232
    .line 233
    invoke-virtual {p0, p1}, Lj3/J;->S(Lj3/m0;)V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_e

    .line 237
    .line 238
    :pswitch_16
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p1, Lj3/I;

    .line 241
    .line 242
    invoke-virtual {p0, p1}, Lj3/J;->I(Lj3/I;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_e

    .line 246
    .line 247
    :pswitch_17
    invoke-virtual {p0}, Lj3/J;->c()V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_e

    .line 251
    .line 252
    :pswitch_18
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 253
    .line 254
    if-eqz v5, :cond_4

    .line 255
    .line 256
    move v5, v2

    .line 257
    goto :goto_4

    .line 258
    :cond_4
    move v5, v4

    .line 259
    :goto_4
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 260
    .line 261
    invoke-virtual {p0, p1, v2, v5, v2}, Lj3/J;->R(IIZZ)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_e

    .line 265
    .line 266
    :pswitch_19
    invoke-virtual {p0}, Lj3/J;->u()V
    :try_end_0
    .catch Lj3/m; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ln3/h; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lj3/j0; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lk4/n; {:try_start_0 .. :try_end_0} :catch_3
    .catch LN3/b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 267
    .line 268
    .line 269
    goto/16 :goto_e

    .line 270
    .line 271
    :goto_5
    instance-of v5, p1, Ljava/lang/IllegalStateException;

    .line 272
    .line 273
    if-nez v5, :cond_5

    .line 274
    .line 275
    instance-of v5, p1, Ljava/lang/IllegalArgumentException;

    .line 276
    .line 277
    if-eqz v5, :cond_6

    .line 278
    .line 279
    :cond_5
    const/16 v3, 0x3ec

    .line 280
    .line 281
    :cond_6
    new-instance v5, Lj3/m;

    .line 282
    .line 283
    const/4 v6, 0x2

    .line 284
    invoke-direct {v5, v6, p1, v3}, Lj3/m;-><init>(ILjava/lang/Exception;I)V

    .line 285
    .line 286
    .line 287
    invoke-static {v1, v0, v5}, Ll4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, v2, v4}, Lj3/J;->a0(ZZ)V

    .line 291
    .line 292
    .line 293
    iget-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 294
    .line 295
    invoke-virtual {p1, v5}, Lj3/l0;->d(Lj3/m;)Lj3/l0;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    iput-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 300
    .line 301
    goto/16 :goto_e

    .line 302
    .line 303
    :goto_6
    const/16 v0, 0x7d0

    .line 304
    .line 305
    invoke-virtual {p0, v0, p1}, Lj3/J;->h(ILjava/io/IOException;)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_e

    .line 309
    .line 310
    :goto_7
    const/16 v0, 0x3ea

    .line 311
    .line 312
    invoke-virtual {p0, v0, p1}, Lj3/J;->h(ILjava/io/IOException;)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_e

    .line 316
    .line 317
    :goto_8
    iget v0, p1, Lk4/n;->a:I

    .line 318
    .line 319
    invoke-virtual {p0, v0, p1}, Lj3/J;->h(ILjava/io/IOException;)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_e

    .line 323
    .line 324
    :goto_9
    iget-boolean v0, p1, Lj3/j0;->a:Z

    .line 325
    .line 326
    iget v1, p1, Lj3/j0;->b:I

    .line 327
    .line 328
    if-ne v1, v2, :cond_8

    .line 329
    .line 330
    if-eqz v0, :cond_7

    .line 331
    .line 332
    const/16 v0, 0xbb9

    .line 333
    .line 334
    :goto_a
    move v3, v0

    .line 335
    goto :goto_b

    .line 336
    :cond_7
    const/16 v0, 0xbbb

    .line 337
    .line 338
    goto :goto_a

    .line 339
    :cond_8
    const/4 v4, 0x4

    .line 340
    if-ne v1, v4, :cond_a

    .line 341
    .line 342
    if-eqz v0, :cond_9

    .line 343
    .line 344
    const/16 v0, 0xbba

    .line 345
    .line 346
    goto :goto_a

    .line 347
    :cond_9
    const/16 v0, 0xbbc

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_a
    :goto_b
    invoke-virtual {p0, v3, p1}, Lj3/J;->h(ILjava/io/IOException;)V

    .line 351
    .line 352
    .line 353
    goto :goto_e

    .line 354
    :goto_c
    iget v0, p1, Ln3/h;->a:I

    .line 355
    .line 356
    invoke-virtual {p0, v0, p1}, Lj3/J;->h(ILjava/io/IOException;)V

    .line 357
    .line 358
    .line 359
    goto :goto_e

    .line 360
    :goto_d
    iget v3, p1, Lj3/m;->c:I

    .line 361
    .line 362
    if-ne v3, v2, :cond_b

    .line 363
    .line 364
    iget-object v3, p0, Lj3/J;->r:Lj3/e0;

    .line 365
    .line 366
    iget-object v3, v3, Lj3/e0;->i:Lj3/c0;

    .line 367
    .line 368
    if-eqz v3, :cond_b

    .line 369
    .line 370
    iget-object v3, v3, Lj3/c0;->f:Lj3/d0;

    .line 371
    .line 372
    iget-object v3, v3, Lj3/d0;->a:LN3/A;

    .line 373
    .line 374
    invoke-virtual {p1, v3}, Lj3/m;->a(LN3/y;)Lj3/m;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    :cond_b
    iget-boolean v3, p1, Lj3/m;->i:Z

    .line 379
    .line 380
    if-eqz v3, :cond_c

    .line 381
    .line 382
    iget-object v3, p0, Lj3/J;->l0:Lj3/m;

    .line 383
    .line 384
    if-nez v3, :cond_c

    .line 385
    .line 386
    const-string v0, "Recoverable renderer error"

    .line 387
    .line 388
    invoke-static {v1, v0, p1}, Ll4/a;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 389
    .line 390
    .line 391
    iput-object p1, p0, Lj3/J;->l0:Lj3/m;

    .line 392
    .line 393
    const/16 v0, 0x19

    .line 394
    .line 395
    iget-object v1, p0, Lj3/J;->h:Ll4/w;

    .line 396
    .line 397
    invoke-virtual {v1, v0, p1}, Ll4/w;->a(ILjava/lang/Object;)Ll4/v;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    iget-object v0, p1, Ll4/v;->a:Landroid/os/Message;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    iget-object v1, v1, Ll4/w;->a:Landroid/os/Handler;

    .line 410
    .line 411
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1}, Ll4/v;->a()V

    .line 415
    .line 416
    .line 417
    goto :goto_e

    .line 418
    :cond_c
    iget-object v3, p0, Lj3/J;->l0:Lj3/m;

    .line 419
    .line 420
    if-eqz v3, :cond_d

    .line 421
    .line 422
    invoke-virtual {v3, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 423
    .line 424
    .line 425
    iget-object p1, p0, Lj3/J;->l0:Lj3/m;

    .line 426
    .line 427
    :cond_d
    invoke-static {v1, v0, p1}, Ll4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {p0, v2, v4}, Lj3/J;->a0(ZZ)V

    .line 431
    .line 432
    .line 433
    iget-object v0, p0, Lj3/J;->w:Lj3/l0;

    .line 434
    .line 435
    invoke-virtual {v0, p1}, Lj3/l0;->d(Lj3/m;)Lj3/l0;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    iput-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 440
    .line 441
    :goto_e
    invoke-virtual {p0}, Lj3/J;->r()V

    .line 442
    .line 443
    .line 444
    return v2

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

.method public final i(Z)V
    .locals 12

    .line 1
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 2
    .line 3
    iget-object v0, v0, Lj3/e0;->j:Lj3/c0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lj3/J;->w:Lj3/l0;

    .line 8
    .line 9
    iget-object v1, v1, Lj3/l0;->b:LN3/A;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, Lj3/c0;->f:Lj3/d0;

    .line 13
    .line 14
    iget-object v1, v1, Lj3/d0;->a:LN3/A;

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, Lj3/J;->w:Lj3/l0;

    .line 17
    .line 18
    iget-object v2, v2, Lj3/l0;->k:LN3/A;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v3, p0, Lj3/J;->w:Lj3/l0;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Lj3/l0;->a(LN3/A;)Lj3/l0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Lj3/J;->w:Lj3/l0;

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, Lj3/J;->w:Lj3/l0;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-wide v3, v1, Lj3/l0;->r:J

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v0}, Lj3/c0;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_1
    iput-wide v3, v1, Lj3/l0;->p:J

    .line 46
    .line 47
    iget-object v1, p0, Lj3/J;->w:Lj3/l0;

    .line 48
    .line 49
    iget-wide v3, v1, Lj3/l0;->p:J

    .line 50
    .line 51
    iget-object v5, p0, Lj3/J;->r:Lj3/e0;

    .line 52
    .line 53
    iget-object v5, v5, Lj3/e0;->j:Lj3/c0;

    .line 54
    .line 55
    const-wide/16 v6, 0x0

    .line 56
    .line 57
    if-nez v5, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    iget-wide v8, p0, Lj3/J;->i0:J

    .line 61
    .line 62
    iget-wide v10, v5, Lj3/c0;->o:J

    .line 63
    .line 64
    sub-long/2addr v8, v10

    .line 65
    sub-long/2addr v3, v8

    .line 66
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v6

    .line 70
    :goto_2
    iput-wide v6, v1, Lj3/l0;->q:J

    .line 71
    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    :cond_4
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-boolean p1, v0, Lj3/c0;->d:Z

    .line 79
    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    iget-object p1, v0, Lj3/c0;->n:Li4/w;

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lj3/J;->d0(Li4/w;)V

    .line 85
    .line 86
    .line 87
    :cond_5
    return-void
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final j(Lj3/E0;Z)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 4
    .line 5
    iget-object v3, v1, Lj3/J;->h0:Lj3/I;

    .line 6
    .line 7
    iget-object v9, v1, Lj3/J;->r:Lj3/e0;

    .line 8
    .line 9
    iget v4, v1, Lj3/J;->D:I

    .line 10
    .line 11
    iget-boolean v5, v1, Lj3/J;->X:Z

    .line 12
    .line 13
    iget-object v2, v1, Lj3/J;->k:Lj3/D0;

    .line 14
    .line 15
    iget-object v8, v1, Lj3/J;->l:Lj3/C0;

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Lj3/E0;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-eqz v6, :cond_0

    .line 22
    .line 23
    new-instance v17, Lj3/H;

    .line 24
    .line 25
    sget-object v18, Lj3/l0;->s:LN3/A;

    .line 26
    .line 27
    const/16 v24, 0x1

    .line 28
    .line 29
    const/16 v25, 0x0

    .line 30
    .line 31
    const-wide/16 v19, 0x0

    .line 32
    .line 33
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const/16 v23, 0x0

    .line 39
    .line 40
    invoke-direct/range {v17 .. v25}, Lj3/H;-><init>(LN3/A;JJZZZ)V

    .line 41
    .line 42
    .line 43
    move-object/from16 v2, p1

    .line 44
    .line 45
    move-object/from16 v8, v17

    .line 46
    .line 47
    const/4 v13, 0x4

    .line 48
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    goto/16 :goto_18

    .line 54
    .line 55
    :cond_0
    iget-object v6, v0, Lj3/l0;->b:LN3/A;

    .line 56
    .line 57
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    iget-object v15, v6, LN3/y;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v7, v0, Lj3/l0;->a:Lj3/E0;

    .line 65
    .line 66
    invoke-virtual {v7}, Lj3/E0;->p()Z

    .line 67
    .line 68
    .line 69
    move-result v19

    .line 70
    if-nez v19, :cond_2

    .line 71
    .line 72
    iget-object v11, v6, LN3/y;->a:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v7, v11, v8}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    iget-boolean v7, v7, Lj3/C0;->f:Z

    .line 79
    .line 80
    if-eqz v7, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    const/4 v11, 0x0

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    :goto_0
    const/4 v11, 0x1

    .line 86
    :goto_1
    iget-object v7, v0, Lj3/l0;->b:LN3/A;

    .line 87
    .line 88
    invoke-virtual {v7}, LN3/y;->a()Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-nez v7, :cond_3

    .line 93
    .line 94
    if-eqz v11, :cond_4

    .line 95
    .line 96
    :cond_3
    move/from16 v21, v11

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    move/from16 v21, v11

    .line 100
    .line 101
    iget-wide v10, v0, Lj3/l0;->r:J

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :goto_2
    iget-wide v10, v0, Lj3/l0;->c:J

    .line 105
    .line 106
    :goto_3
    if-eqz v3, :cond_8

    .line 107
    .line 108
    move-object v7, v6

    .line 109
    move v6, v5

    .line 110
    move v5, v4

    .line 111
    const/4 v4, 0x1

    .line 112
    move-object v12, v7

    .line 113
    const/4 v13, 0x4

    .line 114
    move-object v7, v2

    .line 115
    move-object/from16 v2, p1

    .line 116
    .line 117
    invoke-static/range {v2 .. v8}, Lj3/J;->F(Lj3/E0;Lj3/I;ZIZLj3/D0;Lj3/C0;)Landroid/util/Pair;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    if-nez v4, :cond_5

    .line 122
    .line 123
    invoke-virtual {v2, v6}, Lj3/E0;->a(Z)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    move v5, v3

    .line 128
    move-wide v3, v10

    .line 129
    const/4 v6, 0x1

    .line 130
    const/4 v14, 0x0

    .line 131
    const/16 v24, 0x0

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_5
    iget-wide v5, v3, Lj3/I;->c:J

    .line 135
    .line 136
    cmp-long v3, v5, v17

    .line 137
    .line 138
    if-nez v3, :cond_6

    .line 139
    .line 140
    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual {v2, v3, v8}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    iget v3, v3, Lj3/C0;->c:I

    .line 147
    .line 148
    move v5, v3

    .line 149
    move-wide v3, v10

    .line 150
    const/4 v6, 0x0

    .line 151
    goto :goto_4

    .line 152
    :cond_6
    iget-object v15, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 153
    .line 154
    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v3, Ljava/lang/Long;

    .line 157
    .line 158
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 159
    .line 160
    .line 161
    move-result-wide v3

    .line 162
    const/4 v5, -0x1

    .line 163
    const/4 v6, 0x1

    .line 164
    :goto_4
    iget v14, v0, Lj3/l0;->e:I

    .line 165
    .line 166
    if-ne v14, v13, :cond_7

    .line 167
    .line 168
    const/4 v14, 0x1

    .line 169
    goto :goto_5

    .line 170
    :cond_7
    const/4 v14, 0x0

    .line 171
    :goto_5
    move/from16 v24, v6

    .line 172
    .line 173
    const/4 v6, 0x0

    .line 174
    :goto_6
    move v2, v5

    .line 175
    move/from16 v29, v6

    .line 176
    .line 177
    move/from16 v28, v14

    .line 178
    .line 179
    move-object v6, v15

    .line 180
    move/from16 v30, v24

    .line 181
    .line 182
    const-wide/16 v14, 0x0

    .line 183
    .line 184
    move-wide v4, v3

    .line 185
    move-object v3, v7

    .line 186
    const/4 v7, -0x1

    .line 187
    goto/16 :goto_c

    .line 188
    .line 189
    :cond_8
    move-object v7, v2

    .line 190
    move-object v12, v6

    .line 191
    const/4 v13, 0x4

    .line 192
    move-object/from16 v2, p1

    .line 193
    .line 194
    move v6, v5

    .line 195
    move v5, v4

    .line 196
    iget-object v3, v0, Lj3/l0;->a:Lj3/E0;

    .line 197
    .line 198
    invoke-virtual {v3}, Lj3/E0;->p()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_9

    .line 203
    .line 204
    invoke-virtual {v2, v6}, Lj3/E0;->a(Z)I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    move v2, v3

    .line 209
    move-object v3, v7

    .line 210
    move-wide v4, v10

    .line 211
    move-object v6, v15

    .line 212
    :goto_7
    const/4 v7, -0x1

    .line 213
    const-wide/16 v14, 0x0

    .line 214
    .line 215
    :goto_8
    const/16 v28, 0x0

    .line 216
    .line 217
    const/16 v29, 0x0

    .line 218
    .line 219
    :goto_9
    const/16 v30, 0x0

    .line 220
    .line 221
    goto/16 :goto_c

    .line 222
    .line 223
    :cond_9
    invoke-virtual {v2, v15}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    const/4 v4, -0x1

    .line 228
    if-ne v3, v4, :cond_b

    .line 229
    .line 230
    move-object v3, v7

    .line 231
    iget-object v7, v0, Lj3/l0;->a:Lj3/E0;

    .line 232
    .line 233
    move-object v4, v8

    .line 234
    move-object v8, v2

    .line 235
    move-object v2, v3

    .line 236
    move-object v3, v4

    .line 237
    move v4, v5

    .line 238
    move v5, v6

    .line 239
    move-object v6, v15

    .line 240
    invoke-static/range {v2 .. v8}, Lj3/J;->G(Lj3/D0;Lj3/C0;IZLjava/lang/Object;Lj3/E0;Lj3/E0;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    move-object/from16 v31, v3

    .line 245
    .line 246
    move-object v3, v2

    .line 247
    move-object v2, v8

    .line 248
    move-object/from16 v8, v31

    .line 249
    .line 250
    if-nez v4, :cond_a

    .line 251
    .line 252
    invoke-virtual {v2, v5}, Lj3/E0;->a(Z)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    const/4 v5, 0x1

    .line 257
    goto :goto_a

    .line 258
    :cond_a
    invoke-virtual {v2, v4, v8}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    iget v4, v4, Lj3/C0;->c:I

    .line 263
    .line 264
    const/4 v5, 0x0

    .line 265
    :goto_a
    move v2, v4

    .line 266
    move/from16 v29, v5

    .line 267
    .line 268
    move-wide v4, v10

    .line 269
    const/4 v7, -0x1

    .line 270
    const-wide/16 v14, 0x0

    .line 271
    .line 272
    const/16 v28, 0x0

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_b
    move-object v3, v7

    .line 276
    move-object v6, v15

    .line 277
    cmp-long v4, v10, v17

    .line 278
    .line 279
    if-nez v4, :cond_c

    .line 280
    .line 281
    invoke-virtual {v2, v6, v8}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    iget v4, v4, Lj3/C0;->c:I

    .line 286
    .line 287
    move v2, v4

    .line 288
    move-wide v4, v10

    .line 289
    goto :goto_7

    .line 290
    :cond_c
    if-eqz v21, :cond_e

    .line 291
    .line 292
    iget-object v4, v0, Lj3/l0;->a:Lj3/E0;

    .line 293
    .line 294
    iget-object v5, v12, LN3/y;->a:Ljava/lang/Object;

    .line 295
    .line 296
    invoke-virtual {v4, v5, v8}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 297
    .line 298
    .line 299
    iget-object v4, v0, Lj3/l0;->a:Lj3/E0;

    .line 300
    .line 301
    iget v5, v8, Lj3/C0;->c:I

    .line 302
    .line 303
    const-wide/16 v14, 0x0

    .line 304
    .line 305
    invoke-virtual {v4, v5, v3, v14, v15}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    iget v4, v4, Lj3/D0;->o:I

    .line 310
    .line 311
    iget-object v5, v0, Lj3/l0;->a:Lj3/E0;

    .line 312
    .line 313
    iget-object v7, v12, LN3/y;->a:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-virtual {v5, v7}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-ne v4, v5, :cond_d

    .line 320
    .line 321
    iget-wide v4, v8, Lj3/C0;->e:J

    .line 322
    .line 323
    add-long/2addr v4, v10

    .line 324
    invoke-virtual {v2, v6, v8}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    iget v6, v6, Lj3/C0;->c:I

    .line 329
    .line 330
    move-wide/from16 v31, v4

    .line 331
    .line 332
    move v5, v6

    .line 333
    move-wide/from16 v6, v31

    .line 334
    .line 335
    move-object v4, v8

    .line 336
    invoke-virtual/range {v2 .. v7}, Lj3/E0;->i(Lj3/D0;Lj3/C0;IJ)Landroid/util/Pair;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    iget-object v2, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 341
    .line 342
    iget-object v4, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v4, Ljava/lang/Long;

    .line 345
    .line 346
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 347
    .line 348
    .line 349
    move-result-wide v4

    .line 350
    goto :goto_b

    .line 351
    :cond_d
    move-object v2, v6

    .line 352
    move-wide v4, v10

    .line 353
    :goto_b
    move-object v6, v2

    .line 354
    const/4 v2, -0x1

    .line 355
    const/4 v7, -0x1

    .line 356
    const/16 v28, 0x0

    .line 357
    .line 358
    const/16 v29, 0x0

    .line 359
    .line 360
    const/16 v30, 0x1

    .line 361
    .line 362
    goto :goto_c

    .line 363
    :cond_e
    const-wide/16 v14, 0x0

    .line 364
    .line 365
    move-wide v4, v10

    .line 366
    const/4 v2, -0x1

    .line 367
    const/4 v7, -0x1

    .line 368
    goto/16 :goto_8

    .line 369
    .line 370
    :goto_c
    if-eq v2, v7, :cond_f

    .line 371
    .line 372
    move/from16 v16, v7

    .line 373
    .line 374
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    move v5, v2

    .line 380
    move-object v4, v8

    .line 381
    move/from16 v8, v16

    .line 382
    .line 383
    move-object/from16 v2, p1

    .line 384
    .line 385
    invoke-virtual/range {v2 .. v7}, Lj3/E0;->i(Lj3/D0;Lj3/C0;IJ)Landroid/util/Pair;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    move-object v7, v4

    .line 390
    iget-object v6, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 391
    .line 392
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v3, Ljava/lang/Long;

    .line 395
    .line 396
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 397
    .line 398
    .line 399
    move-result-wide v4

    .line 400
    move-wide/from16 v26, v17

    .line 401
    .line 402
    goto :goto_d

    .line 403
    :cond_f
    move-object v2, v8

    .line 404
    move v8, v7

    .line 405
    move-object v7, v2

    .line 406
    move-object/from16 v2, p1

    .line 407
    .line 408
    move-wide/from16 v26, v4

    .line 409
    .line 410
    :goto_d
    invoke-virtual {v9, v2, v6, v4, v5}, Lj3/e0;->m(Lj3/E0;Ljava/lang/Object;J)LN3/A;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    iget v9, v3, LN3/y;->e:I

    .line 415
    .line 416
    if-eq v9, v8, :cond_11

    .line 417
    .line 418
    iget v14, v12, LN3/y;->e:I

    .line 419
    .line 420
    if-eq v14, v8, :cond_10

    .line 421
    .line 422
    if-lt v9, v14, :cond_10

    .line 423
    .line 424
    goto :goto_e

    .line 425
    :cond_10
    const/4 v8, 0x0

    .line 426
    goto :goto_f

    .line 427
    :cond_11
    :goto_e
    const/4 v8, 0x1

    .line 428
    :goto_f
    iget-object v9, v12, LN3/y;->a:Ljava/lang/Object;

    .line 429
    .line 430
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    if-eqz v9, :cond_12

    .line 435
    .line 436
    invoke-virtual {v12}, LN3/y;->a()Z

    .line 437
    .line 438
    .line 439
    move-result v9

    .line 440
    if-nez v9, :cond_12

    .line 441
    .line 442
    invoke-virtual {v3}, LN3/y;->a()Z

    .line 443
    .line 444
    .line 445
    move-result v9

    .line 446
    if-nez v9, :cond_12

    .line 447
    .line 448
    if-eqz v8, :cond_12

    .line 449
    .line 450
    const/4 v8, 0x1

    .line 451
    goto :goto_10

    .line 452
    :cond_12
    const/4 v8, 0x0

    .line 453
    :goto_10
    invoke-virtual {v2, v6, v7}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    if-nez v21, :cond_14

    .line 458
    .line 459
    cmp-long v9, v10, v26

    .line 460
    .line 461
    if-nez v9, :cond_14

    .line 462
    .line 463
    iget-object v9, v12, LN3/y;->a:Ljava/lang/Object;

    .line 464
    .line 465
    iget-object v10, v3, LN3/y;->a:Ljava/lang/Object;

    .line 466
    .line 467
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v9

    .line 471
    if-nez v9, :cond_13

    .line 472
    .line 473
    goto :goto_12

    .line 474
    :cond_13
    invoke-virtual {v12}, LN3/y;->a()Z

    .line 475
    .line 476
    .line 477
    move-result v9

    .line 478
    if-eqz v9, :cond_15

    .line 479
    .line 480
    iget v9, v12, LN3/y;->b:I

    .line 481
    .line 482
    invoke-virtual {v6, v9}, Lj3/C0;->g(I)Z

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    if-eqz v10, :cond_15

    .line 487
    .line 488
    iget v10, v12, LN3/y;->c:I

    .line 489
    .line 490
    invoke-virtual {v6, v9, v10}, Lj3/C0;->e(II)I

    .line 491
    .line 492
    .line 493
    move-result v11

    .line 494
    if-eq v11, v13, :cond_14

    .line 495
    .line 496
    invoke-virtual {v6, v9, v10}, Lj3/C0;->e(II)I

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    const/4 v9, 0x2

    .line 501
    if-eq v6, v9, :cond_14

    .line 502
    .line 503
    :goto_11
    const/4 v6, 0x1

    .line 504
    goto :goto_13

    .line 505
    :cond_14
    :goto_12
    const/4 v6, 0x0

    .line 506
    goto :goto_13

    .line 507
    :cond_15
    invoke-virtual {v3}, LN3/y;->a()Z

    .line 508
    .line 509
    .line 510
    move-result v9

    .line 511
    if-eqz v9, :cond_14

    .line 512
    .line 513
    iget v9, v3, LN3/y;->b:I

    .line 514
    .line 515
    invoke-virtual {v6, v9}, Lj3/C0;->g(I)Z

    .line 516
    .line 517
    .line 518
    move-result v6

    .line 519
    if-eqz v6, :cond_14

    .line 520
    .line 521
    goto :goto_11

    .line 522
    :goto_13
    if-nez v8, :cond_17

    .line 523
    .line 524
    if-eqz v6, :cond_16

    .line 525
    .line 526
    goto :goto_14

    .line 527
    :cond_16
    move-object v6, v3

    .line 528
    goto :goto_15

    .line 529
    :cond_17
    :goto_14
    move-object v6, v12

    .line 530
    :goto_15
    invoke-virtual {v6}, LN3/y;->a()Z

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    if-eqz v3, :cond_18

    .line 535
    .line 536
    invoke-virtual {v6, v12}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    if-eqz v3, :cond_19

    .line 541
    .line 542
    iget-wide v4, v0, Lj3/l0;->r:J

    .line 543
    .line 544
    :cond_18
    :goto_16
    move-wide/from16 v24, v4

    .line 545
    .line 546
    goto :goto_17

    .line 547
    :cond_19
    iget-object v0, v6, LN3/y;->a:Ljava/lang/Object;

    .line 548
    .line 549
    invoke-virtual {v2, v0, v7}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 550
    .line 551
    .line 552
    iget v0, v6, LN3/y;->c:I

    .line 553
    .line 554
    iget v3, v6, LN3/y;->b:I

    .line 555
    .line 556
    invoke-virtual {v7, v3}, Lj3/C0;->f(I)I

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    if-ne v0, v3, :cond_1a

    .line 561
    .line 562
    iget-object v0, v7, Lj3/C0;->g:LO3/b;

    .line 563
    .line 564
    iget-wide v3, v0, LO3/b;->b:J

    .line 565
    .line 566
    move-wide v4, v3

    .line 567
    goto :goto_16

    .line 568
    :cond_1a
    const-wide/16 v4, 0x0

    .line 569
    .line 570
    goto :goto_16

    .line 571
    :goto_17
    new-instance v22, Lj3/H;

    .line 572
    .line 573
    move-object/from16 v23, v6

    .line 574
    .line 575
    invoke-direct/range {v22 .. v30}, Lj3/H;-><init>(LN3/A;JJZZZ)V

    .line 576
    .line 577
    .line 578
    move-object/from16 v8, v22

    .line 579
    .line 580
    :goto_18
    iget-object v9, v8, Lj3/H;->a:LN3/A;

    .line 581
    .line 582
    iget-wide v10, v8, Lj3/H;->c:J

    .line 583
    .line 584
    iget-boolean v6, v8, Lj3/H;->d:Z

    .line 585
    .line 586
    iget-wide v14, v8, Lj3/H;->b:J

    .line 587
    .line 588
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 589
    .line 590
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 591
    .line 592
    invoke-virtual {v0, v9}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move-result v0

    .line 596
    if-eqz v0, :cond_1c

    .line 597
    .line 598
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 599
    .line 600
    iget-wide v3, v0, Lj3/l0;->r:J

    .line 601
    .line 602
    cmp-long v0, v14, v3

    .line 603
    .line 604
    if-eqz v0, :cond_1b

    .line 605
    .line 606
    goto :goto_19

    .line 607
    :cond_1b
    const/4 v12, 0x0

    .line 608
    goto :goto_1a

    .line 609
    :cond_1c
    :goto_19
    const/4 v12, 0x1

    .line 610
    :goto_1a
    const/16 v21, 0x3

    .line 611
    .line 612
    :try_start_0
    iget-boolean v0, v8, Lj3/H;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    .line 613
    .line 614
    if-eqz v0, :cond_1e

    .line 615
    .line 616
    :try_start_1
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 617
    .line 618
    iget v0, v0, Lj3/l0;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 619
    .line 620
    const/4 v4, 0x1

    .line 621
    if-eq v0, v4, :cond_1d

    .line 622
    .line 623
    :try_start_2
    invoke-virtual {v1, v13}, Lj3/J;->W(I)V

    .line 624
    .line 625
    .line 626
    :cond_1d
    const/4 v5, 0x0

    .line 627
    goto :goto_1c

    .line 628
    :catchall_0
    move-exception v0

    .line 629
    :goto_1b
    move-wide/from16 v31, v10

    .line 630
    .line 631
    move-object v11, v2

    .line 632
    move-object v2, v9

    .line 633
    move-wide/from16 v9, v31

    .line 634
    .line 635
    move/from16 v20, v4

    .line 636
    .line 637
    const/4 v13, 0x0

    .line 638
    goto/16 :goto_2f

    .line 639
    .line 640
    :goto_1c
    invoke-virtual {v1, v5, v5, v5, v4}, Lj3/J;->A(ZZZZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 641
    .line 642
    .line 643
    goto :goto_1d

    .line 644
    :catchall_1
    move-exception v0

    .line 645
    const/4 v4, 0x1

    .line 646
    goto :goto_1b

    .line 647
    :cond_1e
    const/4 v4, 0x1

    .line 648
    :goto_1d
    if-nez v12, :cond_26

    .line 649
    .line 650
    :try_start_3
    iget-object v2, v1, Lj3/J;->r:Lj3/e0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 651
    .line 652
    move/from16 v20, v4

    .line 653
    .line 654
    :try_start_4
    iget-wide v4, v1, Lj3/J;->i0:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 655
    .line 656
    :try_start_5
    iget-object v0, v2, Lj3/e0;->i:Lj3/c0;

    .line 657
    .line 658
    if-nez v0, :cond_1f

    .line 659
    .line 660
    move-object/from16 v3, p1

    .line 661
    .line 662
    const-wide/16 v6, 0x0

    .line 663
    .line 664
    :goto_1e
    const/4 v13, 0x0

    .line 665
    goto :goto_21

    .line 666
    :cond_1f
    iget-wide v6, v0, Lj3/c0;->o:J

    .line 667
    .line 668
    iget-boolean v3, v0, Lj3/c0;->d:Z

    .line 669
    .line 670
    if-nez v3, :cond_20

    .line 671
    .line 672
    move-object/from16 v3, p1

    .line 673
    .line 674
    goto :goto_1e

    .line 675
    :cond_20
    const/4 v3, 0x0

    .line 676
    :goto_1f
    iget-object v13, v1, Lj3/J;->a:[Lj3/d;

    .line 677
    .line 678
    move-object/from16 v24, v2

    .line 679
    .line 680
    array-length v2, v13

    .line 681
    if-ge v3, v2, :cond_24

    .line 682
    .line 683
    aget-object v2, v13, v3

    .line 684
    .line 685
    invoke-static {v2}, Lj3/J;->o(Lj3/d;)Z

    .line 686
    .line 687
    .line 688
    move-result v2

    .line 689
    if-eqz v2, :cond_23

    .line 690
    .line 691
    aget-object v2, v13, v3

    .line 692
    .line 693
    iget-object v13, v2, Lj3/d;->g:LN3/d0;

    .line 694
    .line 695
    move/from16 v25, v3

    .line 696
    .line 697
    iget-object v3, v0, Lj3/c0;->c:[LN3/d0;

    .line 698
    .line 699
    aget-object v3, v3, v25

    .line 700
    .line 701
    if-eq v13, v3, :cond_21

    .line 702
    .line 703
    goto :goto_20

    .line 704
    :cond_21
    iget-wide v2, v2, Lj3/d;->j:J

    .line 705
    .line 706
    const-wide/high16 v26, -0x8000000000000000L

    .line 707
    .line 708
    cmp-long v13, v2, v26

    .line 709
    .line 710
    if-nez v13, :cond_22

    .line 711
    .line 712
    move-object/from16 v3, p1

    .line 713
    .line 714
    move-object/from16 v2, v24

    .line 715
    .line 716
    move-wide/from16 v6, v26

    .line 717
    .line 718
    goto :goto_1e

    .line 719
    :cond_22
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 720
    .line 721
    .line 722
    move-result-wide v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 723
    goto :goto_20

    .line 724
    :cond_23
    move/from16 v25, v3

    .line 725
    .line 726
    :goto_20
    add-int/lit8 v3, v25, 0x1

    .line 727
    .line 728
    move-object/from16 v2, v24

    .line 729
    .line 730
    goto :goto_1f

    .line 731
    :cond_24
    move-object/from16 v3, p1

    .line 732
    .line 733
    move-object/from16 v2, v24

    .line 734
    .line 735
    goto :goto_1e

    .line 736
    :goto_21
    :try_start_6
    invoke-virtual/range {v2 .. v7}, Lj3/e0;->o(Lj3/E0;JJ)Z

    .line 737
    .line 738
    .line 739
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 740
    move-object v7, v3

    .line 741
    if-nez v0, :cond_25

    .line 742
    .line 743
    const/4 v5, 0x0

    .line 744
    :try_start_7
    invoke-virtual {v1, v5}, Lj3/J;->H(Z)V

    .line 745
    .line 746
    .line 747
    :cond_25
    move-object v2, v9

    .line 748
    goto/16 :goto_28

    .line 749
    .line 750
    :catchall_2
    move-exception v0

    .line 751
    :goto_22
    move-object v2, v9

    .line 752
    :goto_23
    move-wide v9, v10

    .line 753
    move-object v11, v7

    .line 754
    goto/16 :goto_2f

    .line 755
    .line 756
    :catchall_3
    move-exception v0

    .line 757
    move-object v7, v3

    .line 758
    goto :goto_22

    .line 759
    :catchall_4
    move-exception v0

    .line 760
    move-object/from16 v7, p1

    .line 761
    .line 762
    goto :goto_24

    .line 763
    :catchall_5
    move-exception v0

    .line 764
    move-object/from16 v7, p1

    .line 765
    .line 766
    :goto_24
    const/4 v13, 0x0

    .line 767
    goto :goto_22

    .line 768
    :catchall_6
    move-exception v0

    .line 769
    move-object/from16 v7, p1

    .line 770
    .line 771
    move/from16 v20, v4

    .line 772
    .line 773
    goto :goto_24

    .line 774
    :cond_26
    move-object v7, v2

    .line 775
    move/from16 v20, v4

    .line 776
    .line 777
    const/4 v13, 0x0

    .line 778
    invoke-virtual {v7}, Lj3/E0;->p()Z

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    if-nez v0, :cond_25

    .line 783
    .line 784
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 785
    .line 786
    :try_start_8
    iget-object v0, v0, Lj3/e0;->h:Lj3/c0;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 787
    .line 788
    :goto_25
    if-eqz v0, :cond_28

    .line 789
    .line 790
    :try_start_9
    iget-object v2, v0, Lj3/c0;->f:Lj3/d0;

    .line 791
    .line 792
    iget-object v2, v2, Lj3/d0;->a:LN3/A;

    .line 793
    .line 794
    invoke-virtual {v2, v9}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    if-eqz v2, :cond_27

    .line 799
    .line 800
    iget-object v2, v1, Lj3/J;->r:Lj3/e0;

    .line 801
    .line 802
    iget-object v3, v0, Lj3/c0;->f:Lj3/d0;

    .line 803
    .line 804
    invoke-virtual {v2, v7, v3}, Lj3/e0;->g(Lj3/E0;Lj3/d0;)Lj3/d0;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    iput-object v2, v0, Lj3/c0;->f:Lj3/d0;

    .line 809
    .line 810
    invoke-virtual {v0}, Lj3/c0;->h()V

    .line 811
    .line 812
    .line 813
    :cond_27
    iget-object v0, v0, Lj3/c0;->l:Lj3/c0;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 814
    .line 815
    goto :goto_25

    .line 816
    :cond_28
    :try_start_a
    iget-object v0, v1, Lj3/J;->r:Lj3/e0;

    .line 817
    .line 818
    iget-object v2, v0, Lj3/e0;->h:Lj3/c0;

    .line 819
    .line 820
    iget-object v0, v0, Lj3/e0;->i:Lj3/c0;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 821
    .line 822
    if-eq v2, v0, :cond_29

    .line 823
    .line 824
    move/from16 v5, v20

    .line 825
    .line 826
    :goto_26
    move-object v2, v9

    .line 827
    move-wide v3, v14

    .line 828
    goto :goto_27

    .line 829
    :cond_29
    const/4 v5, 0x0

    .line 830
    goto :goto_26

    .line 831
    :goto_27
    :try_start_b
    invoke-virtual/range {v1 .. v6}, Lj3/J;->J(LN3/A;JZZ)J

    .line 832
    .line 833
    .line 834
    move-result-wide v14
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 835
    goto :goto_28

    .line 836
    :catchall_7
    move-exception v0

    .line 837
    move-wide v14, v3

    .line 838
    goto :goto_23

    .line 839
    :catchall_8
    move-exception v0

    .line 840
    goto :goto_22

    .line 841
    :goto_28
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 842
    .line 843
    iget-object v4, v0, Lj3/l0;->a:Lj3/E0;

    .line 844
    .line 845
    iget-object v5, v0, Lj3/l0;->b:LN3/A;

    .line 846
    .line 847
    iget-boolean v0, v8, Lj3/H;->f:Z

    .line 848
    .line 849
    if-eqz v0, :cond_2a

    .line 850
    .line 851
    move-object v3, v2

    .line 852
    move-object v2, v7

    .line 853
    move-wide v6, v14

    .line 854
    goto :goto_29

    .line 855
    :cond_2a
    move-object v3, v2

    .line 856
    move-object v2, v7

    .line 857
    move-wide/from16 v6, v17

    .line 858
    .line 859
    :goto_29
    invoke-virtual/range {v1 .. v7}, Lj3/J;->f0(Lj3/E0;LN3/A;Lj3/E0;LN3/A;J)V

    .line 860
    .line 861
    .line 862
    if-nez v12, :cond_2c

    .line 863
    .line 864
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 865
    .line 866
    iget-wide v4, v0, Lj3/l0;->c:J

    .line 867
    .line 868
    cmp-long v0, v10, v4

    .line 869
    .line 870
    if-eqz v0, :cond_2b

    .line 871
    .line 872
    goto :goto_2a

    .line 873
    :cond_2b
    move-object v11, v2

    .line 874
    goto :goto_2e

    .line 875
    :cond_2c
    :goto_2a
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 876
    .line 877
    iget-object v4, v0, Lj3/l0;->b:LN3/A;

    .line 878
    .line 879
    iget-object v4, v4, LN3/y;->a:Ljava/lang/Object;

    .line 880
    .line 881
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 882
    .line 883
    if-eqz v12, :cond_2d

    .line 884
    .line 885
    if-eqz p2, :cond_2d

    .line 886
    .line 887
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 888
    .line 889
    .line 890
    move-result v5

    .line 891
    if-nez v5, :cond_2d

    .line 892
    .line 893
    iget-object v5, v1, Lj3/J;->l:Lj3/C0;

    .line 894
    .line 895
    invoke-virtual {v0, v4, v5}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    iget-boolean v0, v0, Lj3/C0;->f:Z

    .line 900
    .line 901
    if-nez v0, :cond_2d

    .line 902
    .line 903
    move/from16 v9, v20

    .line 904
    .line 905
    goto :goto_2b

    .line 906
    :cond_2d
    const/4 v9, 0x0

    .line 907
    :goto_2b
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 908
    .line 909
    iget-wide v7, v0, Lj3/l0;->d:J

    .line 910
    .line 911
    invoke-virtual {v2, v4}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 912
    .line 913
    .line 914
    move-result v0

    .line 915
    const/4 v4, -0x1

    .line 916
    if-ne v0, v4, :cond_2e

    .line 917
    .line 918
    move-wide v5, v10

    .line 919
    const/4 v10, 0x4

    .line 920
    :goto_2c
    move-object v11, v2

    .line 921
    move-object v2, v3

    .line 922
    move-wide v3, v14

    .line 923
    goto :goto_2d

    .line 924
    :cond_2e
    move-wide v5, v10

    .line 925
    move/from16 v10, v21

    .line 926
    .line 927
    goto :goto_2c

    .line 928
    :goto_2d
    invoke-virtual/range {v1 .. v10}, Lj3/J;->m(LN3/A;JJJZI)Lj3/l0;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    iput-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 933
    .line 934
    :goto_2e
    invoke-virtual {v1}, Lj3/J;->B()V

    .line 935
    .line 936
    .line 937
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 938
    .line 939
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 940
    .line 941
    invoke-virtual {v1, v11, v0}, Lj3/J;->E(Lj3/E0;Lj3/E0;)V

    .line 942
    .line 943
    .line 944
    iget-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 945
    .line 946
    invoke-virtual {v0, v11}, Lj3/l0;->g(Lj3/E0;)Lj3/l0;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    iput-object v0, v1, Lj3/J;->w:Lj3/l0;

    .line 951
    .line 952
    invoke-virtual {v11}, Lj3/E0;->p()Z

    .line 953
    .line 954
    .line 955
    move-result v0

    .line 956
    if-nez v0, :cond_2f

    .line 957
    .line 958
    iput-object v13, v1, Lj3/J;->h0:Lj3/I;

    .line 959
    .line 960
    :cond_2f
    const/4 v5, 0x0

    .line 961
    invoke-virtual {v1, v5}, Lj3/J;->i(Z)V

    .line 962
    .line 963
    .line 964
    return-void

    .line 965
    :catchall_9
    move-exception v0

    .line 966
    move-wide/from16 v31, v10

    .line 967
    .line 968
    move-object v11, v2

    .line 969
    move-object v2, v9

    .line 970
    move-wide/from16 v9, v31

    .line 971
    .line 972
    const/4 v13, 0x0

    .line 973
    const/16 v20, 0x1

    .line 974
    .line 975
    :goto_2f
    iget-object v3, v1, Lj3/J;->w:Lj3/l0;

    .line 976
    .line 977
    iget-object v4, v3, Lj3/l0;->a:Lj3/E0;

    .line 978
    .line 979
    iget-object v5, v3, Lj3/l0;->b:LN3/A;

    .line 980
    .line 981
    iget-boolean v3, v8, Lj3/H;->f:Z

    .line 982
    .line 983
    if-eqz v3, :cond_30

    .line 984
    .line 985
    move-wide v6, v14

    .line 986
    :goto_30
    move-object v3, v2

    .line 987
    move-object v2, v11

    .line 988
    goto :goto_31

    .line 989
    :cond_30
    move-wide/from16 v6, v17

    .line 990
    .line 991
    goto :goto_30

    .line 992
    :goto_31
    invoke-virtual/range {v1 .. v7}, Lj3/J;->f0(Lj3/E0;LN3/A;Lj3/E0;LN3/A;J)V

    .line 993
    .line 994
    .line 995
    move-object v11, v2

    .line 996
    move-object v2, v3

    .line 997
    if-nez v12, :cond_31

    .line 998
    .line 999
    iget-object v3, v1, Lj3/J;->w:Lj3/l0;

    .line 1000
    .line 1001
    iget-wide v3, v3, Lj3/l0;->c:J

    .line 1002
    .line 1003
    cmp-long v3, v9, v3

    .line 1004
    .line 1005
    if-eqz v3, :cond_34

    .line 1006
    .line 1007
    :cond_31
    iget-object v3, v1, Lj3/J;->w:Lj3/l0;

    .line 1008
    .line 1009
    iget-object v4, v3, Lj3/l0;->b:LN3/A;

    .line 1010
    .line 1011
    iget-object v4, v4, LN3/y;->a:Ljava/lang/Object;

    .line 1012
    .line 1013
    iget-object v3, v3, Lj3/l0;->a:Lj3/E0;

    .line 1014
    .line 1015
    if-eqz v12, :cond_32

    .line 1016
    .line 1017
    if-eqz p2, :cond_32

    .line 1018
    .line 1019
    invoke-virtual {v3}, Lj3/E0;->p()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v5

    .line 1023
    if-nez v5, :cond_32

    .line 1024
    .line 1025
    iget-object v5, v1, Lj3/J;->l:Lj3/C0;

    .line 1026
    .line 1027
    invoke-virtual {v3, v4, v5}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v3

    .line 1031
    iget-boolean v3, v3, Lj3/C0;->f:Z

    .line 1032
    .line 1033
    if-nez v3, :cond_32

    .line 1034
    .line 1035
    move-wide v5, v9

    .line 1036
    move/from16 v9, v20

    .line 1037
    .line 1038
    goto :goto_32

    .line 1039
    :cond_32
    move-wide v5, v9

    .line 1040
    const/4 v9, 0x0

    .line 1041
    :goto_32
    iget-object v3, v1, Lj3/J;->w:Lj3/l0;

    .line 1042
    .line 1043
    iget-wide v7, v3, Lj3/l0;->d:J

    .line 1044
    .line 1045
    invoke-virtual {v11, v4}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 1046
    .line 1047
    .line 1048
    move-result v3

    .line 1049
    const/4 v4, -0x1

    .line 1050
    if-ne v3, v4, :cond_33

    .line 1051
    .line 1052
    const/4 v10, 0x4

    .line 1053
    :goto_33
    move-wide v3, v14

    .line 1054
    goto :goto_34

    .line 1055
    :cond_33
    move/from16 v10, v21

    .line 1056
    .line 1057
    goto :goto_33

    .line 1058
    :goto_34
    invoke-virtual/range {v1 .. v10}, Lj3/J;->m(LN3/A;JJJZI)Lj3/l0;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v2

    .line 1062
    iput-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 1063
    .line 1064
    :cond_34
    invoke-virtual {v1}, Lj3/J;->B()V

    .line 1065
    .line 1066
    .line 1067
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 1068
    .line 1069
    iget-object v2, v2, Lj3/l0;->a:Lj3/E0;

    .line 1070
    .line 1071
    invoke-virtual {v1, v11, v2}, Lj3/J;->E(Lj3/E0;Lj3/E0;)V

    .line 1072
    .line 1073
    .line 1074
    iget-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 1075
    .line 1076
    invoke-virtual {v2, v11}, Lj3/l0;->g(Lj3/E0;)Lj3/l0;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v2

    .line 1080
    iput-object v2, v1, Lj3/J;->w:Lj3/l0;

    .line 1081
    .line 1082
    invoke-virtual {v11}, Lj3/E0;->p()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v2

    .line 1086
    if-nez v2, :cond_35

    .line 1087
    .line 1088
    iput-object v13, v1, Lj3/J;->h0:Lj3/I;

    .line 1089
    .line 1090
    :cond_35
    const/4 v5, 0x0

    .line 1091
    invoke-virtual {v1, v5}, Lj3/J;->i(Z)V

    .line 1092
    .line 1093
    .line 1094
    throw v0
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
    .line 3751
    .line 3752
    .line 3753
    .line 3754
    .line 3755
    .line 3756
    .line 3757
    .line 3758
    .line 3759
    .line 3760
    .line 3761
    .line 3762
    .line 3763
    .line 3764
    .line 3765
    .line 3766
    .line 3767
    .line 3768
    .line 3769
    .line 3770
    .line 3771
    .line 3772
    .line 3773
    .line 3774
    .line 3775
    .line 3776
    .line 3777
    .line 3778
    .line 3779
    .line 3780
    .line 3781
    .line 3782
    .line 3783
    .line 3784
    .line 3785
    .line 3786
    .line 3787
    .line 3788
    .line 3789
    .line 3790
    .line 3791
    .line 3792
    .line 3793
    .line 3794
    .line 3795
    .line 3796
    .line 3797
    .line 3798
    .line 3799
    .line 3800
    .line 3801
    .line 3802
    .line 3803
    .line 3804
    .line 3805
    .line 3806
    .line 3807
    .line 3808
    .line 3809
    .line 3810
    .line 3811
    .line 3812
    .line 3813
    .line 3814
    .line 3815
    .line 3816
    .line 3817
    .line 3818
    .line 3819
    .line 3820
    .line 3821
    .line 3822
    .line 3823
    .line 3824
    .line 3825
    .line 3826
    .line 3827
    .line 3828
    .line 3829
    .line 3830
    .line 3831
    .line 3832
    .line 3833
    .line 3834
    .line 3835
    .line 3836
    .line 3837
    .line 3838
    .line 3839
    .line 3840
    .line 3841
    .line 3842
    .line 3843
    .line 3844
    .line 3845
    .line 3846
    .line 3847
    .line 3848
    .line 3849
    .line 3850
    .line 3851
    .line 3852
    .line 3853
    .line 3854
    .line 3855
    .line 3856
    .line 3857
    .line 3858
    .line 3859
    .line 3860
    .line 3861
    .line 3862
    .line 3863
    .line 3864
    .line 3865
    .line 3866
    .line 3867
    .line 3868
    .line 3869
    .line 3870
    .line 3871
    .line 3872
    .line 3873
    .line 3874
    .line 3875
    .line 3876
    .line 3877
    .line 3878
    .line 3879
    .line 3880
    .line 3881
    .line 3882
    .line 3883
    .line 3884
    .line 3885
    .line 3886
    .line 3887
    .line 3888
    .line 3889
    .line 3890
    .line 3891
    .line 3892
    .line 3893
    .line 3894
    .line 3895
    .line 3896
    .line 3897
    .line 3898
    .line 3899
    .line 3900
    .line 3901
    .line 3902
    .line 3903
    .line 3904
    .line 3905
    .line 3906
    .line 3907
    .line 3908
    .line 3909
    .line 3910
    .line 3911
    .line 3912
    .line 3913
    .line 3914
    .line 3915
    .line 3916
    .line 3917
    .line 3918
    .line 3919
    .line 3920
    .line 3921
    .line 3922
    .line 3923
    .line 3924
    .line 3925
    .line 3926
    .line 3927
    .line 3928
    .line 3929
    .line 3930
    .line 3931
    .line 3932
    .line 3933
    .line 3934
    .line 3935
    .line 3936
    .line 3937
    .line 3938
    .line 3939
    .line 3940
    .line 3941
    .line 3942
    .line 3943
    .line 3944
    .line 3945
    .line 3946
    .line 3947
    .line 3948
    .line 3949
    .line 3950
    .line 3951
    .line 3952
    .line 3953
    .line 3954
    .line 3955
    .line 3956
    .line 3957
    .line 3958
    .line 3959
    .line 3960
    .line 3961
    .line 3962
    .line 3963
    .line 3964
    .line 3965
    .line 3966
    .line 3967
    .line 3968
    .line 3969
    .line 3970
    .line 3971
    .line 3972
    .line 3973
    .line 3974
    .line 3975
    .line 3976
    .line 3977
    .line 3978
    .line 3979
    .line 3980
    .line 3981
    .line 3982
    .line 3983
    .line 3984
    .line 3985
    .line 3986
    .line 3987
    .line 3988
    .line 3989
    .line 3990
    .line 3991
    .line 3992
    .line 3993
    .line 3994
    .line 3995
    .line 3996
    .line 3997
    .line 3998
    .line 3999
    .line 4000
    .line 4001
    .line 4002
    .line 4003
    .line 4004
    .line 4005
    .line 4006
    .line 4007
    .line 4008
    .line 4009
    .line 4010
    .line 4011
    .line 4012
    .line 4013
    .line 4014
    .line 4015
    .line 4016
    .line 4017
    .line 4018
    .line 4019
    .line 4020
    .line 4021
    .line 4022
    .line 4023
    .line 4024
    .line 4025
    .line 4026
    .line 4027
    .line 4028
    .line 4029
    .line 4030
    .line 4031
    .line 4032
    .line 4033
    .line 4034
    .line 4035
    .line 4036
    .line 4037
    .line 4038
    .line 4039
    .line 4040
    .line 4041
    .line 4042
    .line 4043
    .line 4044
    .line 4045
    .line 4046
    .line 4047
    .line 4048
    .line 4049
    .line 4050
    .line 4051
    .line 4052
    .line 4053
    .line 4054
    .line 4055
    .line 4056
    .line 4057
    .line 4058
    .line 4059
    .line 4060
    .line 4061
    .line 4062
    .line 4063
    .line 4064
    .line 4065
    .line 4066
    .line 4067
    .line 4068
    .line 4069
    .line 4070
    .line 4071
    .line 4072
    .line 4073
    .line 4074
    .line 4075
    .line 4076
    .line 4077
    .line 4078
    .line 4079
    .line 4080
    .line 4081
    .line 4082
    .line 4083
    .line 4084
    .line 4085
    .line 4086
    .line 4087
    .line 4088
    .line 4089
    .line 4090
    .line 4091
    .line 4092
    .line 4093
    .line 4094
    .line 4095
    .line 4096
    .line 4097
    .line 4098
    .line 4099
    .line 4100
    .line 4101
    .line 4102
    .line 4103
    .line 4104
    .line 4105
    .line 4106
    .line 4107
    .line 4108
    .line 4109
    .line 4110
    .line 4111
    .line 4112
    .line 4113
    .line 4114
    .line 4115
    .line 4116
    .line 4117
    .line 4118
    .line 4119
    .line 4120
    .line 4121
    .line 4122
    .line 4123
    .line 4124
    .line 4125
    .line 4126
    .line 4127
    .line 4128
    .line 4129
    .line 4130
    .line 4131
    .line 4132
    .line 4133
    .line 4134
    .line 4135
    .line 4136
    .line 4137
    .line 4138
    .line 4139
    .line 4140
    .line 4141
    .line 4142
    .line 4143
    .line 4144
    .line 4145
    .line 4146
    .line 4147
    .line 4148
    .line 4149
    .line 4150
    .line 4151
    .line 4152
    .line 4153
    .line 4154
    .line 4155
    .line 4156
    .line 4157
    .line 4158
    .line 4159
    .line 4160
    .line 4161
    .line 4162
    .line 4163
    .line 4164
    .line 4165
    .line 4166
    .line 4167
    .line 4168
    .line 4169
    .line 4170
    .line 4171
    .line 4172
    .line 4173
    .line 4174
    .line 4175
    .line 4176
    .line 4177
    .line 4178
    .line 4179
    .line 4180
    .line 4181
    .line 4182
    .line 4183
    .line 4184
    .line 4185
    .line 4186
    .line 4187
    .line 4188
    .line 4189
    .line 4190
    .line 4191
    .line 4192
    .line 4193
    .line 4194
    .line 4195
    .line 4196
    .line 4197
    .line 4198
    .line 4199
    .line 4200
    .line 4201
    .line 4202
    .line 4203
    .line 4204
    .line 4205
    .line 4206
    .line 4207
    .line 4208
    .line 4209
    .line 4210
    .line 4211
    .line 4212
    .line 4213
    .line 4214
    .line 4215
    .line 4216
    .line 4217
    .line 4218
    .line 4219
    .line 4220
    .line 4221
    .line 4222
    .line 4223
    .line 4224
    .line 4225
    .line 4226
    .line 4227
    .line 4228
    .line 4229
    .line 4230
    .line 4231
    .line 4232
    .line 4233
    .line 4234
    .line 4235
    .line 4236
    .line 4237
    .line 4238
    .line 4239
    .line 4240
    .line 4241
    .line 4242
    .line 4243
    .line 4244
    .line 4245
    .line 4246
    .line 4247
    .line 4248
    .line 4249
    .line 4250
    .line 4251
    .line 4252
    .line 4253
    .line 4254
    .line 4255
    .line 4256
    .line 4257
    .line 4258
    .line 4259
    .line 4260
    .line 4261
    .line 4262
    .line 4263
    .line 4264
    .line 4265
    .line 4266
    .line 4267
    .line 4268
    .line 4269
    .line 4270
    .line 4271
    .line 4272
    .line 4273
    .line 4274
    .line 4275
    .line 4276
    .line 4277
    .line 4278
    .line 4279
    .line 4280
    .line 4281
    .line 4282
    .line 4283
    .line 4284
    .line 4285
    .line 4286
    .line 4287
    .line 4288
    .line 4289
    .line 4290
    .line 4291
    .line 4292
    .line 4293
    .line 4294
    .line 4295
    .line 4296
    .line 4297
    .line 4298
    .line 4299
    .line 4300
    .line 4301
    .line 4302
    .line 4303
    .line 4304
    .line 4305
    .line 4306
    .line 4307
    .line 4308
    .line 4309
    .line 4310
    .line 4311
    .line 4312
    .line 4313
    .line 4314
    .line 4315
    .line 4316
    .line 4317
    .line 4318
    .line 4319
    .line 4320
    .line 4321
    .line 4322
    .line 4323
    .line 4324
    .line 4325
    .line 4326
    .line 4327
    .line 4328
    .line 4329
    .line 4330
    .line 4331
    .line 4332
    .line 4333
    .line 4334
    .line 4335
    .line 4336
    .line 4337
    .line 4338
    .line 4339
    .line 4340
    .line 4341
    .line 4342
    .line 4343
    .line 4344
    .line 4345
    .line 4346
    .line 4347
    .line 4348
    .line 4349
    .line 4350
    .line 4351
    .line 4352
    .line 4353
    .line 4354
    .line 4355
    .line 4356
    .line 4357
    .line 4358
    .line 4359
    .line 4360
    .line 4361
    .line 4362
    .line 4363
    .line 4364
    .line 4365
    .line 4366
    .line 4367
    .line 4368
    .line 4369
    .line 4370
    .line 4371
    .line 4372
    .line 4373
    .line 4374
    .line 4375
    .line 4376
    .line 4377
    .line 4378
    .line 4379
    .line 4380
    .line 4381
    .line 4382
    .line 4383
    .line 4384
    .line 4385
    .line 4386
    .line 4387
    .line 4388
    .line 4389
    .line 4390
    .line 4391
    .line 4392
    .line 4393
    .line 4394
    .line 4395
    .line 4396
    .line 4397
    .line 4398
    .line 4399
    .line 4400
    .line 4401
    .line 4402
    .line 4403
    .line 4404
    .line 4405
    .line 4406
    .line 4407
    .line 4408
    .line 4409
    .line 4410
    .line 4411
    .line 4412
    .line 4413
    .line 4414
    .line 4415
    .line 4416
    .line 4417
    .line 4418
    .line 4419
    .line 4420
    .line 4421
    .line 4422
    .line 4423
    .line 4424
    .line 4425
    .line 4426
    .line 4427
    .line 4428
    .line 4429
    .line 4430
    .line 4431
    .line 4432
    .line 4433
    .line 4434
    .line 4435
    .line 4436
    .line 4437
    .line 4438
    .line 4439
    .line 4440
    .line 4441
    .line 4442
    .line 4443
    .line 4444
    .line 4445
    .line 4446
    .line 4447
    .line 4448
    .line 4449
    .line 4450
    .line 4451
    .line 4452
    .line 4453
    .line 4454
    .line 4455
    .line 4456
    .line 4457
    .line 4458
    .line 4459
    .line 4460
    .line 4461
    .line 4462
    .line 4463
    .line 4464
    .line 4465
    .line 4466
    .line 4467
    .line 4468
    .line 4469
    .line 4470
    .line 4471
    .line 4472
    .line 4473
    .line 4474
    .line 4475
    .line 4476
    .line 4477
    .line 4478
    .line 4479
    .line 4480
    .line 4481
    .line 4482
    .line 4483
    .line 4484
    .line 4485
    .line 4486
    .line 4487
    .line 4488
    .line 4489
    .line 4490
    .line 4491
    .line 4492
    .line 4493
    .line 4494
    .line 4495
    .line 4496
    .line 4497
    .line 4498
    .line 4499
    .line 4500
    .line 4501
    .line 4502
    .line 4503
    .line 4504
    .line 4505
    .line 4506
    .line 4507
    .line 4508
    .line 4509
    .line 4510
    .line 4511
    .line 4512
    .line 4513
    .line 4514
    .line 4515
    .line 4516
    .line 4517
    .line 4518
    .line 4519
    .line 4520
    .line 4521
    .line 4522
    .line 4523
    .line 4524
    .line 4525
    .line 4526
    .line 4527
    .line 4528
    .line 4529
    .line 4530
    .line 4531
    .line 4532
    .line 4533
    .line 4534
    .line 4535
    .line 4536
    .line 4537
    .line 4538
    .line 4539
    .line 4540
    .line 4541
    .line 4542
    .line 4543
    .line 4544
    .line 4545
    .line 4546
    .line 4547
    .line 4548
    .line 4549
    .line 4550
    .line 4551
    .line 4552
    .line 4553
    .line 4554
    .line 4555
    .line 4556
    .line 4557
    .line 4558
    .line 4559
    .line 4560
    .line 4561
    .line 4562
    .line 4563
    .line 4564
    .line 4565
    .line 4566
    .line 4567
    .line 4568
    .line 4569
    .line 4570
    .line 4571
    .line 4572
    .line 4573
    .line 4574
    .line 4575
    .line 4576
    .line 4577
    .line 4578
    .line 4579
    .line 4580
    .line 4581
    .line 4582
    .line 4583
    .line 4584
    .line 4585
    .line 4586
    .line 4587
    .line 4588
    .line 4589
    .line 4590
    .line 4591
    .line 4592
    .line 4593
    .line 4594
    .line 4595
    .line 4596
    .line 4597
    .line 4598
    .line 4599
    .line 4600
    .line 4601
    .line 4602
    .line 4603
    .line 4604
    .line 4605
    .line 4606
    .line 4607
    .line 4608
    .line 4609
    .line 4610
    .line 4611
    .line 4612
    .line 4613
    .line 4614
    .line 4615
    .line 4616
    .line 4617
    .line 4618
.end method

.method public final k(LN3/x;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 2
    .line 3
    iget-object v1, v0, Lj3/e0;->j:Lj3/c0;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-object v2, v1, Lj3/c0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne v2, p1, :cond_2

    .line 10
    .line 11
    iget-object p1, p0, Lj3/J;->n:Lj3/j;

    .line 12
    .line 13
    invoke-virtual {p1}, Lj3/j;->c()Lj3/m0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget p1, p1, Lj3/m0;->a:F

    .line 18
    .line 19
    iget-object v2, p0, Lj3/J;->w:Lj3/l0;

    .line 20
    .line 21
    iget-object v2, v2, Lj3/l0;->a:Lj3/E0;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    iput-boolean v3, v1, Lj3/c0;->d:Z

    .line 25
    .line 26
    iget-object v3, v1, Lj3/c0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-interface {v3}, LN3/x;->l()LN3/n0;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iput-object v3, v1, Lj3/c0;->m:LN3/n0;

    .line 33
    .line 34
    invoke-virtual {v1, p1, v2}, Lj3/c0;->g(FLj3/E0;)Li4/w;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object p1, v1, Lj3/c0;->f:Lj3/d0;

    .line 39
    .line 40
    iget-wide v3, p1, Lj3/d0;->e:J

    .line 41
    .line 42
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long v5, v3, v5

    .line 48
    .line 49
    iget-wide v6, p1, Lj3/d0;->b:J

    .line 50
    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    cmp-long p1, v6, v3

    .line 54
    .line 55
    if-ltz p1, :cond_0

    .line 56
    .line 57
    const-wide/16 v5, 0x1

    .line 58
    .line 59
    sub-long/2addr v3, v5

    .line 60
    const-wide/16 v5, 0x0

    .line 61
    .line 62
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    :cond_0
    move-wide v3, v6

    .line 67
    iget-object p1, v1, Lj3/c0;->i:[Lj3/d;

    .line 68
    .line 69
    array-length p1, p1

    .line 70
    new-array v6, p1, [Z

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    invoke-virtual/range {v1 .. v6}, Lj3/c0;->a(Li4/w;JZ[Z)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    iget-wide v4, v1, Lj3/c0;->o:J

    .line 78
    .line 79
    iget-object p1, v1, Lj3/c0;->f:Lj3/d0;

    .line 80
    .line 81
    iget-wide v6, p1, Lj3/d0;->b:J

    .line 82
    .line 83
    sub-long/2addr v6, v2

    .line 84
    add-long/2addr v6, v4

    .line 85
    iput-wide v6, v1, Lj3/c0;->o:J

    .line 86
    .line 87
    invoke-virtual {p1, v2, v3}, Lj3/d0;->b(J)Lj3/d0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, v1, Lj3/c0;->f:Lj3/d0;

    .line 92
    .line 93
    iget-object p1, v1, Lj3/c0;->n:Li4/w;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lj3/J;->d0(Li4/w;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, v0, Lj3/e0;->h:Lj3/c0;

    .line 99
    .line 100
    if-ne v1, p1, :cond_1

    .line 101
    .line 102
    iget-object p1, v1, Lj3/c0;->f:Lj3/d0;

    .line 103
    .line 104
    iget-wide v2, p1, Lj3/d0;->b:J

    .line 105
    .line 106
    invoke-virtual {p0, v2, v3}, Lj3/J;->D(J)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Lj3/J;->a:[Lj3/d;

    .line 110
    .line 111
    array-length p1, p1

    .line 112
    new-array p1, p1, [Z

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Lj3/J;->d([Z)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lj3/J;->w:Lj3/l0;

    .line 118
    .line 119
    iget-object v3, p1, Lj3/l0;->b:LN3/A;

    .line 120
    .line 121
    iget-object v0, v1, Lj3/c0;->f:Lj3/d0;

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    const/4 v11, 0x5

    .line 125
    iget-wide v4, v0, Lj3/d0;->b:J

    .line 126
    .line 127
    iget-wide v6, p1, Lj3/l0;->c:J

    .line 128
    .line 129
    move-wide v8, v4

    .line 130
    move-object v2, p0

    .line 131
    invoke-virtual/range {v2 .. v11}, Lj3/J;->m(LN3/A;JJJZI)Lj3/l0;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, v2, Lj3/J;->w:Lj3/l0;

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    move-object v2, p0

    .line 139
    :goto_0
    invoke-virtual {p0}, Lj3/J;->q()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_2
    move-object v2, p0

    .line 144
    return-void
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
.end method

.method public final l(Lj3/m0;FZZ)V
    .locals 4

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lj3/J;->x:Lj3/G;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, Lj3/G;->a(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, Lj3/J;->w:Lj3/l0;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Lj3/l0;->e(Lj3/m0;)Lj3/l0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Lj3/J;->w:Lj3/l0;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, Lj3/m0;->a:F

    .line 20
    .line 21
    iget-object p4, p0, Lj3/J;->r:Lj3/e0;

    .line 22
    .line 23
    iget-object p4, p4, Lj3/e0;->h:Lj3/c0;

    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    if-eqz p4, :cond_4

    .line 27
    .line 28
    iget-object v1, p4, Lj3/c0;->n:Li4/w;

    .line 29
    .line 30
    iget-object v1, v1, Li4/w;->c:[Li4/q;

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    :goto_1
    if-ge v0, v2, :cond_3

    .line 34
    .line 35
    aget-object v3, v1, v0

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v3, p3}, Li4/q;->q(F)V

    .line 40
    .line 41
    .line 42
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget-object p4, p4, Lj3/c0;->l:Lj3/c0;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-object p3, p0, Lj3/J;->a:[Lj3/d;

    .line 49
    .line 50
    array-length p4, p3

    .line 51
    :goto_2
    if-ge v0, p4, :cond_6

    .line 52
    .line 53
    aget-object v1, p3, v0

    .line 54
    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    iget v2, p1, Lj3/m0;->a:F

    .line 58
    .line 59
    invoke-virtual {v1, p2, v2}, Lj3/d;->v(FF)V

    .line 60
    .line 61
    .line 62
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_6
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
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
.end method

.method public final m(LN3/A;JJJZI)Lj3/l0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v5, p4

    .line 6
    .line 7
    move/from16 v1, p9

    .line 8
    .line 9
    iget-boolean v3, v0, Lj3/J;->k0:Z

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, Lj3/J;->w:Lj3/l0;

    .line 15
    .line 16
    iget-wide v8, v3, Lj3/l0;->r:J

    .line 17
    .line 18
    cmp-long v3, p2, v8

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-object v3, v0, Lj3/J;->w:Lj3/l0;

    .line 23
    .line 24
    iget-object v3, v3, Lj3/l0;->b:LN3/A;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 36
    :goto_1
    iput-boolean v3, v0, Lj3/J;->k0:Z

    .line 37
    .line 38
    invoke-virtual {v0}, Lj3/J;->B()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Lj3/J;->w:Lj3/l0;

    .line 42
    .line 43
    iget-object v8, v3, Lj3/l0;->h:LN3/n0;

    .line 44
    .line 45
    iget-object v9, v3, Lj3/l0;->i:Li4/w;

    .line 46
    .line 47
    iget-object v10, v3, Lj3/l0;->j:Ljava/util/List;

    .line 48
    .line 49
    iget-object v11, v0, Lj3/J;->s:LF5/o;

    .line 50
    .line 51
    iget-boolean v11, v11, LF5/o;->a:Z

    .line 52
    .line 53
    if-eqz v11, :cond_9

    .line 54
    .line 55
    iget-object v3, v0, Lj3/J;->r:Lj3/e0;

    .line 56
    .line 57
    iget-object v3, v3, Lj3/e0;->h:Lj3/c0;

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    sget-object v8, LN3/n0;->d:LN3/n0;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v8, v3, Lj3/c0;->m:LN3/n0;

    .line 65
    .line 66
    :goto_2
    if-nez v3, :cond_3

    .line 67
    .line 68
    iget-object v9, v0, Lj3/J;->e:Li4/w;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v9, v3, Lj3/c0;->n:Li4/w;

    .line 72
    .line 73
    :goto_3
    iget-object v10, v9, Li4/w;->c:[Li4/q;

    .line 74
    .line 75
    new-instance v11, LP5/C;

    .line 76
    .line 77
    invoke-direct {v11}, LP5/C;-><init>()V

    .line 78
    .line 79
    .line 80
    array-length v12, v10

    .line 81
    move v13, v4

    .line 82
    move v14, v13

    .line 83
    :goto_4
    if-ge v13, v12, :cond_6

    .line 84
    .line 85
    aget-object v15, v10, v13

    .line 86
    .line 87
    if-eqz v15, :cond_5

    .line 88
    .line 89
    invoke-interface {v15, v4}, Li4/q;->c(I)Lj3/M;

    .line 90
    .line 91
    .line 92
    move-result-object v15

    .line 93
    iget-object v15, v15, Lj3/M;->j:LD3/c;

    .line 94
    .line 95
    if-nez v15, :cond_4

    .line 96
    .line 97
    new-instance v15, LD3/c;

    .line 98
    .line 99
    const/16 v16, 0x1

    .line 100
    .line 101
    new-array v7, v4, [LD3/b;

    .line 102
    .line 103
    invoke-direct {v15, v7}, LD3/c;-><init>([LD3/b;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v11, v15}, LP5/C;->a(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_4
    const/16 v16, 0x1

    .line 111
    .line 112
    invoke-virtual {v11, v15}, LP5/C;->a(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move/from16 v14, v16

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    const/16 v16, 0x1

    .line 119
    .line 120
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    const/16 v16, 0x1

    .line 124
    .line 125
    if-eqz v14, :cond_7

    .line 126
    .line 127
    invoke-virtual {v11}, LP5/C;->d()LP5/S;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    :goto_6
    move-object v10, v7

    .line 132
    goto :goto_7

    .line 133
    :cond_7
    sget-object v7, LP5/F;->b:LP5/D;

    .line 134
    .line 135
    sget-object v7, LP5/S;->e:LP5/S;

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :goto_7
    if-eqz v3, :cond_8

    .line 139
    .line 140
    iget-object v7, v3, Lj3/c0;->f:Lj3/d0;

    .line 141
    .line 142
    iget-wide v11, v7, Lj3/d0;->c:J

    .line 143
    .line 144
    cmp-long v11, v11, v5

    .line 145
    .line 146
    if-eqz v11, :cond_8

    .line 147
    .line 148
    invoke-virtual {v7, v5, v6}, Lj3/d0;->a(J)Lj3/d0;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    iput-object v7, v3, Lj3/c0;->f:Lj3/d0;

    .line 153
    .line 154
    :cond_8
    :goto_8
    move-object v11, v8

    .line 155
    move-object v12, v9

    .line 156
    move-object v13, v10

    .line 157
    goto :goto_9

    .line 158
    :cond_9
    const/16 v16, 0x1

    .line 159
    .line 160
    iget-object v3, v3, Lj3/l0;->b:LN3/A;

    .line 161
    .line 162
    invoke-virtual {v2, v3}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-nez v3, :cond_8

    .line 167
    .line 168
    sget-object v8, LN3/n0;->d:LN3/n0;

    .line 169
    .line 170
    iget-object v9, v0, Lj3/J;->e:Li4/w;

    .line 171
    .line 172
    sget-object v10, LP5/S;->e:LP5/S;

    .line 173
    .line 174
    goto :goto_8

    .line 175
    :goto_9
    if-eqz p8, :cond_c

    .line 176
    .line 177
    iget-object v3, v0, Lj3/J;->x:Lj3/G;

    .line 178
    .line 179
    iget-boolean v7, v3, Lj3/G;->d:Z

    .line 180
    .line 181
    if-eqz v7, :cond_b

    .line 182
    .line 183
    iget v7, v3, Lj3/G;->e:I

    .line 184
    .line 185
    const/4 v8, 0x5

    .line 186
    if-eq v7, v8, :cond_b

    .line 187
    .line 188
    if-ne v1, v8, :cond_a

    .line 189
    .line 190
    move/from16 v4, v16

    .line 191
    .line 192
    :cond_a
    invoke-static {v4}, Ll4/a;->h(Z)V

    .line 193
    .line 194
    .line 195
    goto :goto_a

    .line 196
    :cond_b
    move/from16 v4, v16

    .line 197
    .line 198
    iput-boolean v4, v3, Lj3/G;->a:Z

    .line 199
    .line 200
    iput-boolean v4, v3, Lj3/G;->d:Z

    .line 201
    .line 202
    iput v1, v3, Lj3/G;->e:I

    .line 203
    .line 204
    :cond_c
    :goto_a
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 205
    .line 206
    iget-wide v3, v1, Lj3/l0;->p:J

    .line 207
    .line 208
    iget-object v7, v0, Lj3/J;->r:Lj3/e0;

    .line 209
    .line 210
    iget-object v7, v7, Lj3/e0;->j:Lj3/c0;

    .line 211
    .line 212
    if-nez v7, :cond_d

    .line 213
    .line 214
    const-wide/16 v9, 0x0

    .line 215
    .line 216
    :goto_b
    move-wide/from16 v3, p2

    .line 217
    .line 218
    move-wide/from16 v7, p6

    .line 219
    .line 220
    goto :goto_c

    .line 221
    :cond_d
    iget-wide v14, v0, Lj3/J;->i0:J

    .line 222
    .line 223
    iget-wide v8, v7, Lj3/c0;->o:J

    .line 224
    .line 225
    sub-long/2addr v14, v8

    .line 226
    sub-long/2addr v3, v14

    .line 227
    const-wide/16 v7, 0x0

    .line 228
    .line 229
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 230
    .line 231
    .line 232
    move-result-wide v8

    .line 233
    move-wide v9, v8

    .line 234
    goto :goto_b

    .line 235
    :goto_c
    invoke-virtual/range {v1 .. v13}, Lj3/l0;->b(LN3/A;JJJJLN3/n0;Li4/w;Ljava/util/List;)Lj3/l0;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    return-object v1
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
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
.end method

.method public final n()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 2
    .line 3
    iget-object v0, v0, Lj3/e0;->j:Lj3/c0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-boolean v1, v0, Lj3/c0;->d:Z

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, v0, Lj3/c0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-interface {v0}, LN3/f0;->h()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    :goto_0
    const-wide/high16 v2, -0x8000000000000000L

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    :goto_1
    const/4 v0, 0x0

    .line 28
    return v0

    .line 29
    :cond_2
    const/4 v0, 0x1

    .line 30
    return v0
    .line 31
    .line 32
.end method

.method public final p()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 2
    .line 3
    iget-object v0, v0, Lj3/e0;->h:Lj3/c0;

    .line 4
    .line 5
    iget-object v1, v0, Lj3/c0;->f:Lj3/d0;

    .line 6
    .line 7
    iget-wide v1, v1, Lj3/d0;->e:J

    .line 8
    .line 9
    iget-boolean v0, v0, Lj3/c0;->d:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v1, v3

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lj3/J;->w:Lj3/l0;

    .line 23
    .line 24
    iget-wide v3, v0, Lj3/l0;->r:J

    .line 25
    .line 26
    cmp-long v0, v3, v1

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lj3/J;->X()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    return v0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final q()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lj3/J;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 11
    .line 12
    iget-object v0, v0, Lj3/e0;->j:Lj3/c0;

    .line 13
    .line 14
    iget-boolean v2, v0, Lj3/c0;->d:Z

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    move-wide v5, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, v0, Lj3/c0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-interface {v0}, LN3/f0;->h()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    :goto_0
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 29
    .line 30
    iget-object v0, v0, Lj3/e0;->j:Lj3/c0;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    move-wide v5, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    iget-wide v7, p0, Lj3/J;->i0:J

    .line 37
    .line 38
    iget-wide v9, v0, Lj3/c0;->o:J

    .line 39
    .line 40
    sub-long/2addr v7, v9

    .line 41
    sub-long/2addr v5, v7

    .line 42
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    :goto_1
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 47
    .line 48
    iget-object v0, v0, Lj3/e0;->h:Lj3/c0;

    .line 49
    .line 50
    iget-object v0, p0, Lj3/J;->f:Lj3/i;

    .line 51
    .line 52
    iget-object v2, p0, Lj3/J;->n:Lj3/j;

    .line 53
    .line 54
    invoke-virtual {v2}, Lj3/j;->c()Lj3/m0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget v2, v2, Lj3/m0;->a:F

    .line 59
    .line 60
    invoke-virtual {v0, v5, v6, v2}, Lj3/i;->c(JF)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    const-wide/32 v7, 0x7a120

    .line 67
    .line 68
    .line 69
    cmp-long v2, v5, v7

    .line 70
    .line 71
    if-gez v2, :cond_4

    .line 72
    .line 73
    iget-wide v7, p0, Lj3/J;->m:J

    .line 74
    .line 75
    cmp-long v2, v7, v3

    .line 76
    .line 77
    if-gtz v2, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 81
    .line 82
    iget-object v0, v0, Lj3/e0;->h:Lj3/c0;

    .line 83
    .line 84
    iget-object v0, v0, Lj3/c0;->a:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v2, p0, Lj3/J;->w:Lj3/l0;

    .line 87
    .line 88
    iget-wide v2, v2, Lj3/l0;->r:J

    .line 89
    .line 90
    invoke-interface {v0, v2, v3}, LN3/x;->x(J)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lj3/J;->f:Lj3/i;

    .line 94
    .line 95
    iget-object v2, p0, Lj3/J;->n:Lj3/j;

    .line 96
    .line 97
    invoke-virtual {v2}, Lj3/j;->c()Lj3/m0;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    iget v2, v2, Lj3/m0;->a:F

    .line 102
    .line 103
    invoke-virtual {v0, v5, v6, v2}, Lj3/i;->c(JF)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    :cond_4
    :goto_2
    iput-boolean v0, p0, Lj3/J;->C:Z

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    iget-object v0, p0, Lj3/J;->r:Lj3/e0;

    .line 112
    .line 113
    iget-object v0, v0, Lj3/e0;->j:Lj3/c0;

    .line 114
    .line 115
    iget-wide v2, p0, Lj3/J;->i0:J

    .line 116
    .line 117
    iget-object v4, v0, Lj3/c0;->l:Lj3/c0;

    .line 118
    .line 119
    if-nez v4, :cond_5

    .line 120
    .line 121
    const/4 v1, 0x1

    .line 122
    :cond_5
    invoke-static {v1}, Ll4/a;->m(Z)V

    .line 123
    .line 124
    .line 125
    iget-wide v4, v0, Lj3/c0;->o:J

    .line 126
    .line 127
    sub-long/2addr v2, v4

    .line 128
    iget-object v0, v0, Lj3/c0;->a:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-interface {v0, v2, v3}, LN3/f0;->z(J)Z

    .line 131
    .line 132
    .line 133
    :cond_6
    invoke-virtual {p0}, Lj3/J;->c0()V

    .line 134
    .line 135
    .line 136
    return-void
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

.method public final r()V
    .locals 5

    .line 1
    iget-object v0, p0, Lj3/J;->x:Lj3/G;

    .line 2
    .line 3
    iget-object v1, p0, Lj3/J;->w:Lj3/l0;

    .line 4
    .line 5
    iget-boolean v2, v0, Lj3/G;->a:Z

    .line 6
    .line 7
    iget-object v3, v0, Lj3/G;->b:Lj3/l0;

    .line 8
    .line 9
    if-eq v3, v1, :cond_0

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v3, 0x0

    .line 14
    :goto_0
    or-int/2addr v2, v3

    .line 15
    iput-boolean v2, v0, Lj3/G;->a:Z

    .line 16
    .line 17
    iput-object v1, v0, Lj3/G;->b:Lj3/l0;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lj3/J;->q:Lj3/s;

    .line 22
    .line 23
    iget-object v1, v1, Lj3/s;->a:Lj3/D;

    .line 24
    .line 25
    iget-object v2, v1, Lj3/D;->i:Ll4/w;

    .line 26
    .line 27
    new-instance v3, LA6/r;

    .line 28
    .line 29
    const/16 v4, 0xe

    .line 30
    .line 31
    invoke-direct {v3, v1, v4, v0}, LA6/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v2, Ll4/w;->a:Landroid/os/Handler;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    new-instance v0, Lj3/G;

    .line 40
    .line 41
    iget-object v1, p0, Lj3/J;->w:Lj3/l0;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lj3/G;-><init>(Lj3/l0;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lj3/J;->x:Lj3/G;

    .line 47
    .line 48
    :cond_1
    return-void
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/J;->s:LF5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LF5/o;->c()Lj3/E0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v0, v1}, Lj3/J;->j(Lj3/E0;Z)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final t()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/J;->x:Lj3/G;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lj3/G;->a(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    throw v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final u()V
    .locals 6

    .line 1
    iget-object v0, p0, Lj3/J;->x:Lj3/G;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lj3/G;->a(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, v0, v1}, Lj3/J;->A(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lj3/J;->f:Lj3/i;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Lj3/i;->b(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lj3/J;->w:Lj3/l0;

    .line 17
    .line 18
    iget-object v2, v2, Lj3/l0;->a:Lj3/E0;

    .line 19
    .line 20
    invoke-virtual {v2}, Lj3/E0;->p()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v3

    .line 30
    :goto_0
    invoke-virtual {p0, v2}, Lj3/J;->W(I)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lj3/J;->g:Lk4/f;

    .line 34
    .line 35
    check-cast v2, Lk4/s;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v4, p0, Lj3/J;->s:LF5/o;

    .line 41
    .line 42
    iget-boolean v5, v4, LF5/o;->a:Z

    .line 43
    .line 44
    xor-int/2addr v5, v1

    .line 45
    invoke-static {v5}, Ll4/a;->m(Z)V

    .line 46
    .line 47
    .line 48
    iput-object v2, v4, LF5/o;->l:Ljava/lang/Object;

    .line 49
    .line 50
    :goto_1
    iget-object v2, v4, LF5/o;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-ge v0, v5, :cond_1

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lj3/i0;

    .line 65
    .line 66
    invoke-virtual {v4, v2}, LF5/o;->g(Lj3/i0;)V

    .line 67
    .line 68
    .line 69
    iget-object v5, v4, LF5/o;->j:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v5, Ljava/util/HashSet;

    .line 72
    .line 73
    invoke-virtual {v5, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    add-int/lit8 v0, v0, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    iput-boolean v1, v4, LF5/o;->a:Z

    .line 80
    .line 81
    iget-object v0, p0, Lj3/J;->h:Ll4/w;

    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ll4/w;->c(I)Z

    .line 84
    .line 85
    .line 86
    return-void
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final v(LN3/f0;)V
    .locals 2

    .line 1
    check-cast p1, LN3/x;

    .line 2
    .line 3
    iget-object v0, p0, Lj3/J;->h:Ll4/w;

    .line 4
    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Ll4/w;->a(ILjava/lang/Object;)Ll4/v;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ll4/v;->b()V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final declared-synchronized w()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lj3/J;->y:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lj3/J;->i:Landroid/os/HandlerThread;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lj3/J;->h:Ll4/w;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    invoke-virtual {v0, v1}, Ll4/w;->c(I)Z

    .line 19
    .line 20
    .line 21
    new-instance v0, LN3/l;

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    invoke-direct {v0, v1, p0}, LN3/l;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-wide v1, p0, Lj3/J;->u:J

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, v2}, Lj3/J;->g0(LN3/l;J)V

    .line 30
    .line 31
    .line 32
    iget-boolean v0, p0, Lj3/J;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit p0

    .line 35
    return v0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    monitor-exit p0

    .line 39
    const/4 v0, 0x1

    .line 40
    return v0

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public final x()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v1, v0, v1, v0}, Lj3/J;->A(ZZZZ)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj3/J;->f:Lj3/i;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lj3/i;->b(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lj3/J;->W(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lj3/J;->i:Landroid/os/HandlerThread;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 17
    .line 18
    .line 19
    monitor-enter p0

    .line 20
    :try_start_0
    iput-boolean v1, p0, Lj3/J;->y:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v0
    .line 30
    .line 31
    .line 32
.end method

.method public final y(IILN3/g0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lj3/J;->x:Lj3/G;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lj3/G;->a(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lj3/J;->s:LF5/o;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ltz p1, :cond_0

    .line 14
    .line 15
    if-gt p1, p2, :cond_0

    .line 16
    .line 17
    iget-object v3, v0, LF5/o;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-gt p2, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v1, v2

    .line 29
    :goto_0
    invoke-static {v1}, Ll4/a;->h(Z)V

    .line 30
    .line 31
    .line 32
    iput-object p3, v0, LF5/o;->k:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, LF5/o;->i(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, LF5/o;->c()Lj3/E0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1, v2}, Lj3/J;->j(Lj3/E0;Z)V

    .line 42
    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
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
.end method

.method public final z()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj3/J;->n:Lj3/j;

    .line 4
    .line 5
    invoke-virtual {v1}, Lj3/j;->c()Lj3/m0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lj3/m0;->a:F

    .line 10
    .line 11
    iget-object v2, v0, Lj3/J;->r:Lj3/e0;

    .line 12
    .line 13
    iget-object v3, v2, Lj3/e0;->h:Lj3/c0;

    .line 14
    .line 15
    iget-object v2, v2, Lj3/e0;->i:Lj3/c0;

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    move-object v4, v3

    .line 19
    move v3, v10

    .line 20
    :goto_0
    if-eqz v4, :cond_d

    .line 21
    .line 22
    iget-boolean v5, v4, Lj3/c0;->d:Z

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    goto/16 :goto_7

    .line 27
    .line 28
    :cond_0
    iget-object v5, v0, Lj3/J;->w:Lj3/l0;

    .line 29
    .line 30
    iget-object v5, v5, Lj3/l0;->a:Lj3/E0;

    .line 31
    .line 32
    invoke-virtual {v4, v1, v5}, Lj3/c0;->g(FLj3/E0;)Li4/w;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v6, v4, Lj3/c0;->n:Li4/w;

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v6, :cond_5

    .line 40
    .line 41
    iget-object v8, v6, Li4/w;->c:[Li4/q;

    .line 42
    .line 43
    array-length v8, v8

    .line 44
    iget-object v9, v5, Li4/w;->c:[Li4/q;

    .line 45
    .line 46
    array-length v11, v9

    .line 47
    if-eq v8, v11, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    move v8, v7

    .line 51
    :goto_1
    array-length v11, v9

    .line 52
    if-ge v8, v11, :cond_3

    .line 53
    .line 54
    invoke-virtual {v5, v6, v8}, Li4/w;->a(Li4/w;I)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-nez v11, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    if-ne v4, v2, :cond_4

    .line 65
    .line 66
    move v3, v7

    .line 67
    :cond_4
    iget-object v4, v4, Lj3/c0;->l:Lj3/c0;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_5
    :goto_2
    const/4 v1, 0x4

    .line 71
    if-eqz v3, :cond_b

    .line 72
    .line 73
    iget-object v2, v0, Lj3/J;->r:Lj3/e0;

    .line 74
    .line 75
    iget-object v11, v2, Lj3/e0;->h:Lj3/c0;

    .line 76
    .line 77
    invoke-virtual {v2, v11}, Lj3/e0;->k(Lj3/c0;)Z

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    iget-object v2, v0, Lj3/J;->a:[Lj3/d;

    .line 82
    .line 83
    array-length v2, v2

    .line 84
    new-array v2, v2, [Z

    .line 85
    .line 86
    iget-object v3, v0, Lj3/J;->w:Lj3/l0;

    .line 87
    .line 88
    iget-wide v13, v3, Lj3/l0;->r:J

    .line 89
    .line 90
    move-object/from16 v16, v2

    .line 91
    .line 92
    move-object v12, v5

    .line 93
    invoke-virtual/range {v11 .. v16}, Lj3/c0;->a(Li4/w;JZ[Z)J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    iget-object v4, v0, Lj3/J;->w:Lj3/l0;

    .line 98
    .line 99
    iget v5, v4, Lj3/l0;->e:I

    .line 100
    .line 101
    if-eq v5, v1, :cond_6

    .line 102
    .line 103
    iget-wide v4, v4, Lj3/l0;->r:J

    .line 104
    .line 105
    cmp-long v4, v2, v4

    .line 106
    .line 107
    if-eqz v4, :cond_6

    .line 108
    .line 109
    move v8, v10

    .line 110
    goto :goto_3

    .line 111
    :cond_6
    move v8, v7

    .line 112
    :goto_3
    iget-object v4, v0, Lj3/J;->w:Lj3/l0;

    .line 113
    .line 114
    move v5, v1

    .line 115
    iget-object v1, v4, Lj3/l0;->b:LN3/A;

    .line 116
    .line 117
    iget-wide v12, v4, Lj3/l0;->c:J

    .line 118
    .line 119
    iget-wide v14, v4, Lj3/l0;->d:J

    .line 120
    .line 121
    const/4 v9, 0x5

    .line 122
    move-wide/from16 v17, v12

    .line 123
    .line 124
    move v13, v5

    .line 125
    move-wide/from16 v4, v17

    .line 126
    .line 127
    move v12, v7

    .line 128
    move-wide v6, v14

    .line 129
    invoke-virtual/range {v0 .. v9}, Lj3/J;->m(LN3/A;JJJZI)Lj3/l0;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iput-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 134
    .line 135
    if-eqz v8, :cond_7

    .line 136
    .line 137
    invoke-virtual {v0, v2, v3}, Lj3/J;->D(J)V

    .line 138
    .line 139
    .line 140
    :cond_7
    iget-object v1, v0, Lj3/J;->a:[Lj3/d;

    .line 141
    .line 142
    array-length v1, v1

    .line 143
    new-array v1, v1, [Z

    .line 144
    .line 145
    move v7, v12

    .line 146
    :goto_4
    iget-object v2, v0, Lj3/J;->a:[Lj3/d;

    .line 147
    .line 148
    array-length v3, v2

    .line 149
    if-ge v7, v3, :cond_a

    .line 150
    .line 151
    aget-object v2, v2, v7

    .line 152
    .line 153
    invoke-static {v2}, Lj3/J;->o(Lj3/d;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    aput-boolean v3, v1, v7

    .line 158
    .line 159
    iget-object v4, v11, Lj3/c0;->c:[LN3/d0;

    .line 160
    .line 161
    aget-object v4, v4, v7

    .line 162
    .line 163
    if-eqz v3, :cond_9

    .line 164
    .line 165
    iget-object v3, v2, Lj3/d;->g:LN3/d0;

    .line 166
    .line 167
    if-eq v4, v3, :cond_8

    .line 168
    .line 169
    invoke-virtual {v0, v2}, Lj3/J;->b(Lj3/d;)V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    aget-boolean v3, v16, v7

    .line 174
    .line 175
    if-eqz v3, :cond_9

    .line 176
    .line 177
    iget-wide v3, v0, Lj3/J;->i0:J

    .line 178
    .line 179
    iput-boolean v12, v2, Lj3/d;->k:Z

    .line 180
    .line 181
    iput-wide v3, v2, Lj3/d;->j:J

    .line 182
    .line 183
    invoke-virtual {v2, v3, v4, v12}, Lj3/d;->m(JZ)V

    .line 184
    .line 185
    .line 186
    :cond_9
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_a
    invoke-virtual {v0, v1}, Lj3/J;->d([Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_b
    move v13, v1

    .line 194
    iget-object v1, v0, Lj3/J;->r:Lj3/e0;

    .line 195
    .line 196
    invoke-virtual {v1, v4}, Lj3/e0;->k(Lj3/c0;)Z

    .line 197
    .line 198
    .line 199
    iget-boolean v1, v4, Lj3/c0;->d:Z

    .line 200
    .line 201
    if-eqz v1, :cond_c

    .line 202
    .line 203
    iget-object v1, v4, Lj3/c0;->f:Lj3/d0;

    .line 204
    .line 205
    iget-wide v1, v1, Lj3/d0;->b:J

    .line 206
    .line 207
    iget-wide v6, v0, Lj3/J;->i0:J

    .line 208
    .line 209
    iget-wide v8, v4, Lj3/c0;->o:J

    .line 210
    .line 211
    sub-long/2addr v6, v8

    .line 212
    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 213
    .line 214
    .line 215
    move-result-wide v6

    .line 216
    iget-object v1, v4, Lj3/c0;->i:[Lj3/d;

    .line 217
    .line 218
    array-length v1, v1

    .line 219
    new-array v9, v1, [Z

    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    invoke-virtual/range {v4 .. v9}, Lj3/c0;->a(Li4/w;JZ[Z)J

    .line 223
    .line 224
    .line 225
    :cond_c
    :goto_6
    invoke-virtual {v0, v10}, Lj3/J;->i(Z)V

    .line 226
    .line 227
    .line 228
    iget-object v1, v0, Lj3/J;->w:Lj3/l0;

    .line 229
    .line 230
    iget v1, v1, Lj3/l0;->e:I

    .line 231
    .line 232
    if-eq v1, v13, :cond_d

    .line 233
    .line 234
    invoke-virtual {v0}, Lj3/J;->q()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Lj3/J;->e0()V

    .line 238
    .line 239
    .line 240
    iget-object v1, v0, Lj3/J;->h:Ll4/w;

    .line 241
    .line 242
    const/4 v2, 0x2

    .line 243
    invoke-virtual {v1, v2}, Ll4/w;->c(I)Z

    .line 244
    .line 245
    .line 246
    :cond_d
    :goto_7
    return-void
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
