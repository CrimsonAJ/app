.class public final Lj3/D;
.super LD/n;
.source "SourceFile"

# interfaces
.implements Lj3/q;


# instance fields
.field public final A:Lj3/c;

.field public final A0:Z

.field public final B:Lj3/z0;

.field public B0:Z

.field public final C:Ld0/w;

.field public final C0:Lj3/l;

.field public final D:Le0/c;

.field public D0:Lm4/v;

.field public E0:Lj3/b0;

.field public F0:Lj3/l0;

.field public G0:I

.field public H0:J

.field public final X:J

.field public Y:I

.field public Z:Z

.field public final b:Li4/w;

.field public final c:Lj3/n0;

.field public final d:LH1/k;

.field public final e:Landroid/content/Context;

.field public final f:Lj3/D;

.field public f0:I

.field public final g:[Lj3/d;

.field public g0:I

.field public final h:Li4/s;

.field public h0:Z

.field public final i:Ll4/w;

.field public i0:I

.field public final j:Lj3/s;

.field public j0:LN3/g0;

.field public final k:Lj3/J;

.field public k0:Lj3/n0;

.field public final l:Ll4/l;

.field public l0:Lj3/b0;

.field public final m:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public m0:Landroid/media/AudioTrack;

.field public final n:Lj3/C0;

.field public n0:Ljava/lang/Object;

.field public final o:Ljava/util/ArrayList;

.field public o0:Landroid/view/Surface;

.field public final p:Z

.field public p0:Landroid/view/SurfaceHolder;

.field public final q:LN3/z;

.field public q0:Ln4/k;

.field public final r:Lk3/e;

.field public r0:Z

.field public final s:Landroid/os/Looper;

.field public s0:Landroid/view/TextureView;

.field public final t:Lk4/f;

.field public final t0:I

.field public final u:J

.field public u0:Ll4/t;

.field public final v:J

.field public final v0:I

.field public final w:Ll4/u;

.field public final w0:Ll3/e;

.field public final x:Lj3/A;

.field public final x0:F

.field public final y:Lj3/B;

.field public y0:Z

.field public final z:Lcom/google/android/gms/internal/measurement/C1;

.field public z0:LY3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "goog.exo.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, Lj3/K;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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

.method public constructor <init>(Lj3/p;)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    const-string v10, " [ExoPlayerLib/2.18.2] ["

    .line 7
    .line 8
    const-string v11, "Init "

    .line 9
    .line 10
    const/4 v12, 0x4

    .line 11
    invoke-direct {v1, v12}, LD/n;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v13, LH1/k;

    .line 15
    .line 16
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v13, v1, Lj3/D;->d:LH1/k;

    .line 20
    .line 21
    :try_start_0
    const-string v13, "ExoPlayerImpl"

    .line 22
    .line 23
    new-instance v14, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v14, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    sget-object v10, Ll4/y;->e:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v10, "]"

    .line 48
    .line 49
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-static {v13, v10}, Ll4/a;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v10, v0, Lj3/p;->a:Landroid/content/Context;

    .line 60
    .line 61
    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    iput-object v10, v1, Lj3/D;->e:Landroid/content/Context;

    .line 66
    .line 67
    iget-object v11, v0, Lj3/p;->b:Ll4/u;

    .line 68
    .line 69
    new-instance v13, Lk3/e;

    .line 70
    .line 71
    invoke-direct {v13, v11}, Lk3/e;-><init>(Ll4/u;)V

    .line 72
    .line 73
    .line 74
    iput-object v13, v1, Lj3/D;->r:Lk3/e;

    .line 75
    .line 76
    iget-object v11, v0, Lj3/p;->h:Ll3/e;

    .line 77
    .line 78
    iput-object v11, v1, Lj3/D;->w0:Ll3/e;

    .line 79
    .line 80
    iget v11, v0, Lj3/p;->i:I

    .line 81
    .line 82
    iput v11, v1, Lj3/D;->t0:I

    .line 83
    .line 84
    iput-boolean v9, v1, Lj3/D;->y0:Z

    .line 85
    .line 86
    iget-wide v14, v0, Lj3/p;->p:J

    .line 87
    .line 88
    iput-wide v14, v1, Lj3/D;->X:J

    .line 89
    .line 90
    new-instance v11, Lj3/A;

    .line 91
    .line 92
    invoke-direct {v11, v1}, Lj3/A;-><init>(Lj3/D;)V

    .line 93
    .line 94
    .line 95
    iput-object v11, v1, Lj3/D;->x:Lj3/A;

    .line 96
    .line 97
    new-instance v14, Lj3/B;

    .line 98
    .line 99
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v14, v1, Lj3/D;->y:Lj3/B;

    .line 103
    .line 104
    new-instance v14, Landroid/os/Handler;

    .line 105
    .line 106
    iget-object v15, v0, Lj3/p;->g:Landroid/os/Looper;

    .line 107
    .line 108
    invoke-direct {v14, v15}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 109
    .line 110
    .line 111
    iget-object v15, v0, Lj3/p;->c:LO5/n;

    .line 112
    .line 113
    invoke-interface {v15}, LO5/n;->get()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    move-object/from16 v16, v15

    .line 118
    .line 119
    check-cast v16, Lj3/k;

    .line 120
    .line 121
    move-object/from16 v19, v11

    .line 122
    .line 123
    move-object/from16 v20, v11

    .line 124
    .line 125
    move-object/from16 v21, v11

    .line 126
    .line 127
    move-object/from16 v18, v11

    .line 128
    .line 129
    move-object/from16 v17, v14

    .line 130
    .line 131
    invoke-virtual/range {v16 .. v21}, Lj3/k;->b(Landroid/os/Handler;Lj3/A;Lj3/A;Lj3/A;Lj3/A;)[Lj3/d;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    iput-object v14, v1, Lj3/D;->g:[Lj3/d;

    .line 136
    .line 137
    array-length v15, v14

    .line 138
    if-lez v15, :cond_0

    .line 139
    .line 140
    const/4 v15, 0x1

    .line 141
    goto :goto_0

    .line 142
    :cond_0
    move v15, v9

    .line 143
    :goto_0
    invoke-static {v15}, Ll4/a;->m(Z)V

    .line 144
    .line 145
    .line 146
    iget-object v15, v0, Lj3/p;->e:Lj3/n;

    .line 147
    .line 148
    invoke-virtual {v15}, Lj3/n;->get()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v15

    .line 152
    check-cast v15, Li4/s;

    .line 153
    .line 154
    iput-object v15, v1, Lj3/D;->h:Li4/s;

    .line 155
    .line 156
    iget-object v4, v0, Lj3/p;->d:LO5/n;

    .line 157
    .line 158
    invoke-interface {v4}, LO5/n;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    check-cast v4, LN3/z;

    .line 163
    .line 164
    iput-object v4, v1, Lj3/D;->q:LN3/z;

    .line 165
    .line 166
    iget-object v4, v0, Lj3/p;->f:Lj3/n;

    .line 167
    .line 168
    invoke-virtual {v4}, Lj3/n;->get()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, Lk4/f;

    .line 173
    .line 174
    iput-object v4, v1, Lj3/D;->t:Lk4/f;

    .line 175
    .line 176
    iget-boolean v5, v0, Lj3/p;->j:Z

    .line 177
    .line 178
    iput-boolean v5, v1, Lj3/D;->p:Z

    .line 179
    .line 180
    iget-object v5, v0, Lj3/p;->k:Lj3/x0;

    .line 181
    .line 182
    move/from16 v30, v9

    .line 183
    .line 184
    move-object/from16 v16, v10

    .line 185
    .line 186
    iget-wide v9, v0, Lj3/p;->l:J

    .line 187
    .line 188
    iput-wide v9, v1, Lj3/D;->u:J

    .line 189
    .line 190
    iget-wide v9, v0, Lj3/p;->m:J

    .line 191
    .line 192
    iput-wide v9, v1, Lj3/D;->v:J

    .line 193
    .line 194
    iget-object v9, v0, Lj3/p;->g:Landroid/os/Looper;

    .line 195
    .line 196
    iput-object v9, v1, Lj3/D;->s:Landroid/os/Looper;

    .line 197
    .line 198
    iget-object v10, v0, Lj3/p;->b:Ll4/u;

    .line 199
    .line 200
    iput-object v10, v1, Lj3/D;->w:Ll4/u;

    .line 201
    .line 202
    iput-object v1, v1, Lj3/D;->f:Lj3/D;

    .line 203
    .line 204
    new-instance v6, Ll4/l;

    .line 205
    .line 206
    new-instance v2, Lj3/s;

    .line 207
    .line 208
    invoke-direct {v2, v1}, Lj3/s;-><init>(Lj3/D;)V

    .line 209
    .line 210
    .line 211
    invoke-direct {v6, v9, v10, v2}, Ll4/l;-><init>(Landroid/os/Looper;Ll4/u;Ll4/j;)V

    .line 212
    .line 213
    .line 214
    iput-object v6, v1, Lj3/D;->l:Ll4/l;

    .line 215
    .line 216
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 217
    .line 218
    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 219
    .line 220
    .line 221
    iput-object v2, v1, Lj3/D;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 222
    .line 223
    new-instance v6, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v6, v1, Lj3/D;->o:Ljava/util/ArrayList;

    .line 229
    .line 230
    new-instance v6, LN3/g0;

    .line 231
    .line 232
    invoke-direct {v6}, LN3/g0;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object v6, v1, Lj3/D;->j0:LN3/g0;

    .line 236
    .line 237
    new-instance v6, Li4/w;

    .line 238
    .line 239
    array-length v3, v14

    .line 240
    new-array v3, v3, [Lj3/w0;

    .line 241
    .line 242
    array-length v12, v14

    .line 243
    new-array v12, v12, [Li4/q;

    .line 244
    .line 245
    const/16 v31, 0x1

    .line 246
    .line 247
    sget-object v8, Lj3/G0;->b:Lj3/G0;

    .line 248
    .line 249
    const/4 v7, 0x0

    .line 250
    invoke-direct {v6, v3, v12, v8, v7}, Li4/w;-><init>([Lj3/w0;[Li4/q;Lj3/G0;LF0/b;)V

    .line 251
    .line 252
    .line 253
    iput-object v6, v1, Lj3/D;->b:Li4/w;

    .line 254
    .line 255
    new-instance v3, Lj3/C0;

    .line 256
    .line 257
    invoke-direct {v3}, Lj3/C0;-><init>()V

    .line 258
    .line 259
    .line 260
    iput-object v3, v1, Lj3/D;->n:Lj3/C0;

    .line 261
    .line 262
    new-instance v3, Landroid/util/SparseBooleanArray;

    .line 263
    .line 264
    invoke-direct {v3}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 265
    .line 266
    .line 267
    const/16 v8, 0x15

    .line 268
    .line 269
    new-array v12, v8, [I

    .line 270
    .line 271
    fill-array-data v12, :array_0

    .line 272
    .line 273
    .line 274
    move/from16 v7, v30

    .line 275
    .line 276
    :goto_1
    if-ge v7, v8, :cond_1

    .line 277
    .line 278
    aget v8, v12, v7

    .line 279
    .line 280
    xor-int/lit8 v19, v30, 0x1

    .line 281
    .line 282
    invoke-static/range {v19 .. v19}, Ll4/a;->m(Z)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v19, v4

    .line 286
    .line 287
    move/from16 v4, v31

    .line 288
    .line 289
    invoke-virtual {v3, v8, v4}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 290
    .line 291
    .line 292
    add-int/2addr v7, v4

    .line 293
    move/from16 v31, v4

    .line 294
    .line 295
    move-object/from16 v4, v19

    .line 296
    .line 297
    const/16 v8, 0x15

    .line 298
    .line 299
    goto :goto_1

    .line 300
    :cond_1
    move-object/from16 v19, v4

    .line 301
    .line 302
    move/from16 v4, v31

    .line 303
    .line 304
    xor-int/lit8 v7, v30, 0x1

    .line 305
    .line 306
    invoke-static {v7}, Ll4/a;->m(Z)V

    .line 307
    .line 308
    .line 309
    const/16 v7, 0x1d

    .line 310
    .line 311
    invoke-virtual {v3, v7, v4}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 312
    .line 313
    .line 314
    new-instance v8, Lj3/n0;

    .line 315
    .line 316
    xor-int/lit8 v12, v30, 0x1

    .line 317
    .line 318
    invoke-static {v12}, Ll4/a;->m(Z)V

    .line 319
    .line 320
    .line 321
    new-instance v4, Ll4/f;

    .line 322
    .line 323
    invoke-direct {v4, v3}, Ll4/f;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 324
    .line 325
    .line 326
    invoke-direct {v8, v4}, Lj3/n0;-><init>(Ll4/f;)V

    .line 327
    .line 328
    .line 329
    iput-object v8, v1, Lj3/D;->c:Lj3/n0;

    .line 330
    .line 331
    new-instance v3, Landroid/util/SparseBooleanArray;

    .line 332
    .line 333
    invoke-direct {v3}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 334
    .line 335
    .line 336
    move/from16 v8, v30

    .line 337
    .line 338
    :goto_2
    iget-object v12, v4, Ll4/f;->a:Landroid/util/SparseBooleanArray;

    .line 339
    .line 340
    invoke-virtual {v12}, Landroid/util/SparseBooleanArray;->size()I

    .line 341
    .line 342
    .line 343
    move-result v12

    .line 344
    if-ge v8, v12, :cond_2

    .line 345
    .line 346
    invoke-virtual {v4, v8}, Ll4/f;->a(I)I

    .line 347
    .line 348
    .line 349
    move-result v12

    .line 350
    const/4 v7, 0x1

    .line 351
    xor-int/lit8 v20, v30, 0x1

    .line 352
    .line 353
    invoke-static/range {v20 .. v20}, Ll4/a;->m(Z)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v3, v12, v7}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 357
    .line 358
    .line 359
    add-int/2addr v8, v7

    .line 360
    const/16 v7, 0x1d

    .line 361
    .line 362
    goto :goto_2

    .line 363
    :cond_2
    const/4 v7, 0x1

    .line 364
    xor-int/lit8 v4, v30, 0x1

    .line 365
    .line 366
    invoke-static {v4}, Ll4/a;->m(Z)V

    .line 367
    .line 368
    .line 369
    const/4 v4, 0x4

    .line 370
    invoke-virtual {v3, v4, v7}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 371
    .line 372
    .line 373
    xor-int/lit8 v4, v30, 0x1

    .line 374
    .line 375
    invoke-static {v4}, Ll4/a;->m(Z)V

    .line 376
    .line 377
    .line 378
    const/16 v4, 0xa

    .line 379
    .line 380
    invoke-virtual {v3, v4, v7}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 381
    .line 382
    .line 383
    new-instance v8, Lj3/n0;

    .line 384
    .line 385
    xor-int/lit8 v12, v30, 0x1

    .line 386
    .line 387
    invoke-static {v12}, Ll4/a;->m(Z)V

    .line 388
    .line 389
    .line 390
    new-instance v7, Ll4/f;

    .line 391
    .line 392
    invoke-direct {v7, v3}, Ll4/f;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 393
    .line 394
    .line 395
    invoke-direct {v8, v7}, Lj3/n0;-><init>(Ll4/f;)V

    .line 396
    .line 397
    .line 398
    iput-object v8, v1, Lj3/D;->k0:Lj3/n0;

    .line 399
    .line 400
    const/4 v3, 0x0

    .line 401
    invoke-virtual {v10, v9, v3}, Ll4/u;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll4/w;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    iput-object v7, v1, Lj3/D;->i:Ll4/w;

    .line 406
    .line 407
    new-instance v3, Lj3/s;

    .line 408
    .line 409
    invoke-direct {v3, v1}, Lj3/s;-><init>(Lj3/D;)V

    .line 410
    .line 411
    .line 412
    iput-object v3, v1, Lj3/D;->j:Lj3/s;

    .line 413
    .line 414
    invoke-static {v6}, Lj3/l0;->h(Li4/w;)Lj3/l0;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    iput-object v7, v1, Lj3/D;->F0:Lj3/l0;

    .line 419
    .line 420
    invoke-virtual {v13, v1, v9}, Lk3/e;->U(Lj3/D;Landroid/os/Looper;)V

    .line 421
    .line 422
    .line 423
    sget v7, Ll4/y;->a:I

    .line 424
    .line 425
    const/16 v8, 0x1f

    .line 426
    .line 427
    if-ge v7, v8, :cond_3

    .line 428
    .line 429
    new-instance v8, Lk3/l;

    .line 430
    .line 431
    invoke-direct {v8}, Lk3/l;-><init>()V

    .line 432
    .line 433
    .line 434
    :goto_3
    move-object/from16 v29, v8

    .line 435
    .line 436
    move-object/from16 v21, v13

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :catchall_0
    move-exception v0

    .line 440
    goto/16 :goto_9

    .line 441
    .line 442
    :cond_3
    iget-boolean v8, v0, Lj3/p;->q:Z

    .line 443
    .line 444
    move-object/from16 v12, v16

    .line 445
    .line 446
    invoke-static {v12, v1, v8}, Lj3/x;->a(Landroid/content/Context;Lj3/D;Z)Lk3/l;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    goto :goto_3

    .line 451
    :goto_4
    new-instance v13, Lj3/J;

    .line 452
    .line 453
    move-object/from16 v8, v17

    .line 454
    .line 455
    new-instance v17, Lj3/i;

    .line 456
    .line 457
    invoke-direct/range {v17 .. v17}, Lj3/i;-><init>()V

    .line 458
    .line 459
    .line 460
    iget v12, v1, Lj3/D;->Y:I

    .line 461
    .line 462
    iget-boolean v4, v1, Lj3/D;->Z:Z

    .line 463
    .line 464
    move-object/from16 v28, v3

    .line 465
    .line 466
    iget-object v3, v0, Lj3/p;->n:Lj3/h;

    .line 467
    .line 468
    move-object/from16 v23, v3

    .line 469
    .line 470
    move/from16 v20, v4

    .line 471
    .line 472
    iget-wide v3, v0, Lj3/p;->o:J

    .line 473
    .line 474
    move-wide/from16 v24, v3

    .line 475
    .line 476
    move-object/from16 v22, v5

    .line 477
    .line 478
    move-object/from16 v16, v6

    .line 479
    .line 480
    move-object/from16 v26, v9

    .line 481
    .line 482
    move-object/from16 v27, v10

    .line 483
    .line 484
    move-object/from16 v18, v19

    .line 485
    .line 486
    move/from16 v19, v12

    .line 487
    .line 488
    invoke-direct/range {v13 .. v29}, Lj3/J;-><init>([Lj3/d;Li4/s;Li4/w;Lj3/i;Lk4/f;IZLk3/e;Lj3/x0;Lj3/h;JLandroid/os/Looper;Ll4/u;Lj3/s;Lk3/l;)V

    .line 489
    .line 490
    .line 491
    move-object/from16 v3, v26

    .line 492
    .line 493
    iput-object v13, v1, Lj3/D;->k:Lj3/J;

    .line 494
    .line 495
    const/high16 v4, 0x3f800000    # 1.0f

    .line 496
    .line 497
    iput v4, v1, Lj3/D;->x0:F

    .line 498
    .line 499
    move/from16 v4, v30

    .line 500
    .line 501
    iput v4, v1, Lj3/D;->Y:I

    .line 502
    .line 503
    sget-object v4, Lj3/b0;->Z:Lj3/b0;

    .line 504
    .line 505
    iput-object v4, v1, Lj3/D;->l0:Lj3/b0;

    .line 506
    .line 507
    iput-object v4, v1, Lj3/D;->E0:Lj3/b0;

    .line 508
    .line 509
    const/4 v4, -0x1

    .line 510
    iput v4, v1, Lj3/D;->G0:I

    .line 511
    .line 512
    const/16 v5, 0x15

    .line 513
    .line 514
    if-ge v7, v5, :cond_6

    .line 515
    .line 516
    iget-object v4, v1, Lj3/D;->m0:Landroid/media/AudioTrack;

    .line 517
    .line 518
    if-eqz v4, :cond_4

    .line 519
    .line 520
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    if-eqz v4, :cond_4

    .line 525
    .line 526
    iget-object v4, v1, Lj3/D;->m0:Landroid/media/AudioTrack;

    .line 527
    .line 528
    invoke-virtual {v4}, Landroid/media/AudioTrack;->release()V

    .line 529
    .line 530
    .line 531
    const/4 v4, 0x0

    .line 532
    iput-object v4, v1, Lj3/D;->m0:Landroid/media/AudioTrack;

    .line 533
    .line 534
    :cond_4
    iget-object v4, v1, Lj3/D;->m0:Landroid/media/AudioTrack;

    .line 535
    .line 536
    if-nez v4, :cond_5

    .line 537
    .line 538
    new-instance v19, Landroid/media/AudioTrack;

    .line 539
    .line 540
    const/16 v21, 0xfa0

    .line 541
    .line 542
    const/16 v22, 0x4

    .line 543
    .line 544
    const/16 v23, 0x2

    .line 545
    .line 546
    const/16 v24, 0x2

    .line 547
    .line 548
    const/16 v26, 0x0

    .line 549
    .line 550
    const/16 v20, 0x3

    .line 551
    .line 552
    const/16 v25, 0x0

    .line 553
    .line 554
    invoke-direct/range {v19 .. v26}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    .line 555
    .line 556
    .line 557
    move-object/from16 v4, v19

    .line 558
    .line 559
    iput-object v4, v1, Lj3/D;->m0:Landroid/media/AudioTrack;

    .line 560
    .line 561
    :cond_5
    iget-object v4, v1, Lj3/D;->m0:Landroid/media/AudioTrack;

    .line 562
    .line 563
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 564
    .line 565
    .line 566
    move-result v4

    .line 567
    iput v4, v1, Lj3/D;->v0:I

    .line 568
    .line 569
    goto :goto_6

    .line 570
    :cond_6
    iget-object v5, v1, Lj3/D;->e:Landroid/content/Context;

    .line 571
    .line 572
    const-string v6, "audio"

    .line 573
    .line 574
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v5

    .line 578
    check-cast v5, Landroid/media/AudioManager;

    .line 579
    .line 580
    if-nez v5, :cond_7

    .line 581
    .line 582
    goto :goto_5

    .line 583
    :cond_7
    invoke-virtual {v5}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    :goto_5
    iput v4, v1, Lj3/D;->v0:I

    .line 588
    .line 589
    :goto_6
    sget-object v4, LY3/c;->b:LY3/c;

    .line 590
    .line 591
    iput-object v4, v1, Lj3/D;->z0:LY3/c;

    .line 592
    .line 593
    const/4 v4, 0x1

    .line 594
    iput-boolean v4, v1, Lj3/D;->A0:Z

    .line 595
    .line 596
    iget-object v4, v1, Lj3/D;->r:Lk3/e;

    .line 597
    .line 598
    invoke-virtual {v1, v4}, Lj3/D;->y(Lj3/p0;)V

    .line 599
    .line 600
    .line 601
    new-instance v4, Landroid/os/Handler;

    .line 602
    .line 603
    invoke-direct {v4, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 604
    .line 605
    .line 606
    iget-object v3, v1, Lj3/D;->r:Lk3/e;

    .line 607
    .line 608
    move-object/from16 v5, v18

    .line 609
    .line 610
    check-cast v5, Lk4/s;

    .line 611
    .line 612
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    iget-object v5, v5, Lk4/s;->b:Lc1/a;

    .line 619
    .line 620
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    iget-object v6, v5, Lc1/a;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 624
    .line 625
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    :cond_8
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 630
    .line 631
    .line 632
    move-result v9

    .line 633
    if-eqz v9, :cond_9

    .line 634
    .line 635
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v9

    .line 639
    check-cast v9, Lk4/e;

    .line 640
    .line 641
    iget-object v10, v9, Lk4/e;->b:Lk3/e;

    .line 642
    .line 643
    if-ne v10, v3, :cond_8

    .line 644
    .line 645
    const/4 v10, 0x1

    .line 646
    iput-boolean v10, v9, Lk4/e;->c:Z

    .line 647
    .line 648
    invoke-virtual {v6, v9}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    goto :goto_7

    .line 652
    :cond_9
    iget-object v5, v5, Lc1/a;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 653
    .line 654
    new-instance v6, Lk4/e;

    .line 655
    .line 656
    invoke-direct {v6, v4, v3}, Lk4/e;-><init>(Landroid/os/Handler;Lk3/e;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v5, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2, v11}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    new-instance v2, Lcom/google/android/gms/internal/measurement/C1;

    .line 666
    .line 667
    iget-object v3, v0, Lj3/p;->a:Landroid/content/Context;

    .line 668
    .line 669
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/C1;->b:Ljava/lang/Object;

    .line 677
    .line 678
    new-instance v3, Lj3/a;

    .line 679
    .line 680
    invoke-direct {v3, v2, v8, v11}, Lj3/a;-><init>(Lcom/google/android/gms/internal/measurement/C1;Landroid/os/Handler;Lj3/A;)V

    .line 681
    .line 682
    .line 683
    iput-object v3, v2, Lcom/google/android/gms/internal/measurement/C1;->c:Ljava/lang/Object;

    .line 684
    .line 685
    iput-object v2, v1, Lj3/D;->z:Lcom/google/android/gms/internal/measurement/C1;

    .line 686
    .line 687
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/C1;->d()V

    .line 688
    .line 689
    .line 690
    new-instance v2, Lj3/c;

    .line 691
    .line 692
    iget-object v3, v0, Lj3/p;->a:Landroid/content/Context;

    .line 693
    .line 694
    invoke-direct {v2, v3, v8, v11}, Lj3/c;-><init>(Landroid/content/Context;Landroid/os/Handler;Lj3/A;)V

    .line 695
    .line 696
    .line 697
    iput-object v2, v1, Lj3/D;->A:Lj3/c;

    .line 698
    .line 699
    sget v2, Ll4/y;->a:I

    .line 700
    .line 701
    new-instance v2, Lj3/z0;

    .line 702
    .line 703
    iget-object v3, v0, Lj3/p;->a:Landroid/content/Context;

    .line 704
    .line 705
    invoke-direct {v2, v3, v8, v11}, Lj3/z0;-><init>(Landroid/content/Context;Landroid/os/Handler;Lj3/A;)V

    .line 706
    .line 707
    .line 708
    iput-object v2, v1, Lj3/D;->B:Lj3/z0;

    .line 709
    .line 710
    iget-object v3, v1, Lj3/D;->w0:Ll3/e;

    .line 711
    .line 712
    iget v3, v3, Ll3/e;->c:I

    .line 713
    .line 714
    invoke-static {v3}, Ll4/y;->z(I)I

    .line 715
    .line 716
    .line 717
    move-result v3

    .line 718
    iget v4, v2, Lj3/z0;->f:I

    .line 719
    .line 720
    if-ne v4, v3, :cond_a

    .line 721
    .line 722
    goto :goto_8

    .line 723
    :cond_a
    iput v3, v2, Lj3/z0;->f:I

    .line 724
    .line 725
    invoke-virtual {v2}, Lj3/z0;->b()V

    .line 726
    .line 727
    .line 728
    iget-object v3, v2, Lj3/z0;->c:Lj3/A;

    .line 729
    .line 730
    iget-object v3, v3, Lj3/A;->a:Lj3/D;

    .line 731
    .line 732
    iget-object v4, v3, Lj3/D;->B:Lj3/z0;

    .line 733
    .line 734
    invoke-static {v4}, Lj3/D;->o0(Lj3/z0;)Lj3/l;

    .line 735
    .line 736
    .line 737
    move-result-object v4

    .line 738
    iget-object v5, v3, Lj3/D;->C0:Lj3/l;

    .line 739
    .line 740
    invoke-virtual {v4, v5}, Lj3/l;->equals(Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    move-result v5

    .line 744
    if-nez v5, :cond_b

    .line 745
    .line 746
    iput-object v4, v3, Lj3/D;->C0:Lj3/l;

    .line 747
    .line 748
    new-instance v5, Lj2/b;

    .line 749
    .line 750
    const/4 v6, 0x7

    .line 751
    invoke-direct {v5, v6, v4}, Lj2/b;-><init>(ILjava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    iget-object v3, v3, Lj3/D;->l:Ll4/l;

    .line 755
    .line 756
    const/16 v4, 0x1d

    .line 757
    .line 758
    invoke-virtual {v3, v4, v5}, Ll4/l;->e(ILl4/i;)V

    .line 759
    .line 760
    .line 761
    :cond_b
    :goto_8
    new-instance v3, Ld0/w;

    .line 762
    .line 763
    iget-object v4, v0, Lj3/p;->a:Landroid/content/Context;

    .line 764
    .line 765
    const/4 v5, 0x6

    .line 766
    invoke-direct {v3, v5}, Ld0/w;-><init>(I)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    const-string v5, "power"

    .line 774
    .line 775
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v4

    .line 779
    check-cast v4, Landroid/os/PowerManager;

    .line 780
    .line 781
    iput-object v3, v1, Lj3/D;->C:Ld0/w;

    .line 782
    .line 783
    new-instance v3, Le0/c;

    .line 784
    .line 785
    iget-object v0, v0, Lj3/p;->a:Landroid/content/Context;

    .line 786
    .line 787
    const/4 v5, 0x6

    .line 788
    invoke-direct {v3, v5}, Le0/c;-><init>(I)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    const-string v4, "wifi"

    .line 796
    .line 797
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 802
    .line 803
    iput-object v3, v1, Lj3/D;->D:Le0/c;

    .line 804
    .line 805
    invoke-static {v2}, Lj3/D;->o0(Lj3/z0;)Lj3/l;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    iput-object v0, v1, Lj3/D;->C0:Lj3/l;

    .line 810
    .line 811
    sget-object v0, Lm4/v;->e:Lm4/v;

    .line 812
    .line 813
    iput-object v0, v1, Lj3/D;->D0:Lm4/v;

    .line 814
    .line 815
    sget-object v0, Ll4/t;->c:Ll4/t;

    .line 816
    .line 817
    iput-object v0, v1, Lj3/D;->u0:Ll4/t;

    .line 818
    .line 819
    iget-object v0, v1, Lj3/D;->h:Li4/s;

    .line 820
    .line 821
    iget-object v2, v1, Lj3/D;->w0:Ll3/e;

    .line 822
    .line 823
    check-cast v0, Li4/o;

    .line 824
    .line 825
    iget-object v3, v0, Li4/o;->c:Ljava/lang/Object;

    .line 826
    .line 827
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 828
    :try_start_1
    iget-object v4, v0, Li4/o;->i:Ll3/e;

    .line 829
    .line 830
    invoke-virtual {v4, v2}, Ll3/e;->equals(Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    move-result v4

    .line 834
    iput-object v2, v0, Li4/o;->i:Ll3/e;

    .line 835
    .line 836
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 837
    if-nez v4, :cond_c

    .line 838
    .line 839
    :try_start_2
    invoke-virtual {v0}, Li4/o;->f()V

    .line 840
    .line 841
    .line 842
    :cond_c
    iget v0, v1, Lj3/D;->v0:I

    .line 843
    .line 844
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    const/16 v2, 0xa

    .line 849
    .line 850
    const/4 v4, 0x1

    .line 851
    invoke-virtual {v1, v4, v2, v0}, Lj3/D;->D0(IILjava/lang/Object;)V

    .line 852
    .line 853
    .line 854
    iget v0, v1, Lj3/D;->v0:I

    .line 855
    .line 856
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    const/4 v3, 0x2

    .line 861
    invoke-virtual {v1, v3, v2, v0}, Lj3/D;->D0(IILjava/lang/Object;)V

    .line 862
    .line 863
    .line 864
    iget-object v0, v1, Lj3/D;->w0:Ll3/e;

    .line 865
    .line 866
    const/4 v2, 0x3

    .line 867
    invoke-virtual {v1, v4, v2, v0}, Lj3/D;->D0(IILjava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    iget v0, v1, Lj3/D;->t0:I

    .line 871
    .line 872
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    const/4 v4, 0x4

    .line 877
    invoke-virtual {v1, v3, v4, v0}, Lj3/D;->D0(IILjava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    const/16 v30, 0x0

    .line 881
    .line 882
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    const/4 v2, 0x5

    .line 887
    invoke-virtual {v1, v3, v2, v0}, Lj3/D;->D0(IILjava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    iget-boolean v0, v1, Lj3/D;->y0:Z

    .line 891
    .line 892
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    const/16 v2, 0x9

    .line 897
    .line 898
    const/4 v4, 0x1

    .line 899
    invoke-virtual {v1, v4, v2, v0}, Lj3/D;->D0(IILjava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    iget-object v0, v1, Lj3/D;->y:Lj3/B;

    .line 903
    .line 904
    const/4 v6, 0x7

    .line 905
    invoke-virtual {v1, v3, v6, v0}, Lj3/D;->D0(IILjava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    iget-object v0, v1, Lj3/D;->y:Lj3/B;

    .line 909
    .line 910
    const/16 v2, 0x8

    .line 911
    .line 912
    const/4 v5, 0x6

    .line 913
    invoke-virtual {v1, v5, v2, v0}, Lj3/D;->D0(IILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 914
    .line 915
    .line 916
    iget-object v0, v1, Lj3/D;->d:LH1/k;

    .line 917
    .line 918
    invoke-virtual {v0}, LH1/k;->d()Z

    .line 919
    .line 920
    .line 921
    return-void

    .line 922
    :catchall_1
    move-exception v0

    .line 923
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 924
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 925
    :goto_9
    iget-object v2, v1, Lj3/D;->d:LH1/k;

    .line 926
    .line 927
    invoke-virtual {v2}, LH1/k;->d()Z

    .line 928
    .line 929
    .line 930
    throw v0

    .line 931
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
    .end array-data
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
.end method

.method public static o0(Lj3/z0;)Lj3/l;
    .locals 5

    .line 1
    new-instance v0, Lj3/l;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v1, Ll4/y;->a:I

    .line 7
    .line 8
    const/16 v2, 0x1c

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    iget-object v4, p0, Lj3/z0;->d:Landroid/media/AudioManager;

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lj3/z0;->f:I

    .line 16
    .line 17
    invoke-static {v4, v1}, LC5/f;->b(Landroid/media/AudioManager;I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    iget p0, p0, Lj3/z0;->f:I

    .line 24
    .line 25
    invoke-virtual {v4, p0}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-direct {v0, v3, v1, p0}, Lj3/l;-><init>(III)V

    .line 30
    .line 31
    .line 32
    return-object v0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static v0(Lj3/l0;)J
    .locals 6

    .line 1
    new-instance v0, Lj3/D0;

    .line 2
    .line 3
    invoke-direct {v0}, Lj3/D0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lj3/C0;

    .line 7
    .line 8
    invoke-direct {v1}, Lj3/C0;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lj3/l0;->a:Lj3/E0;

    .line 12
    .line 13
    iget-object v3, p0, Lj3/l0;->b:LN3/A;

    .line 14
    .line 15
    iget-object v3, v3, LN3/y;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 18
    .line 19
    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iget-wide v4, p0, Lj3/l0;->c:J

    .line 26
    .line 27
    cmp-long v2, v4, v2

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget v1, v1, Lj3/C0;->c:I

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    iget-object p0, p0, Lj3/l0;->a:Lj3/E0;

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, v2, v3}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-wide v0, p0, Lj3/D0;->m:J

    .line 42
    .line 43
    return-wide v0

    .line 44
    :cond_0
    iget-wide v0, v1, Lj3/C0;->e:J

    .line 45
    .line 46
    add-long/2addr v0, v4

    .line 47
    return-wide v0
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

.method public static w0(Lj3/l0;)Z
    .locals 2

    .line 1
    iget v0, p0, Lj3/l0;->e:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lj3/l0;->l:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget p0, p0, Lj3/l0;->m:I

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
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
.method public final A0(I)V
    .locals 7

    .line 1
    add-int/lit8 v0, p1, -0x1

    .line 2
    .line 3
    :goto_0
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lj3/D;->o:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lj3/D;->j0:LN3/g0;

    .line 14
    .line 15
    iget-object v1, v0, LN3/g0;->b:[I

    .line 16
    .line 17
    array-length v2, v1

    .line 18
    sub-int/2addr v2, p1

    .line 19
    new-array v2, v2, [I

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_1
    array-length v5, v1

    .line 24
    if-ge v3, v5, :cond_3

    .line 25
    .line 26
    aget v5, v1, v3

    .line 27
    .line 28
    if-ltz v5, :cond_1

    .line 29
    .line 30
    if-ge v5, p1, :cond_1

    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    sub-int v6, v3, v4

    .line 36
    .line 37
    if-ltz v5, :cond_2

    .line 38
    .line 39
    sub-int/2addr v5, p1

    .line 40
    :cond_2
    aput v5, v2, v6

    .line 41
    .line 42
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    new-instance p1, LN3/g0;

    .line 46
    .line 47
    new-instance v1, Ljava/util/Random;

    .line 48
    .line 49
    iget-object v0, v0, LN3/g0;->a:Ljava/util/Random;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    invoke-direct {v1, v3, v4}, Ljava/util/Random;-><init>(J)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, v2, v1}, LN3/g0;-><init>([ILjava/util/Random;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lj3/D;->j0:LN3/g0;

    .line 62
    .line 63
    return-void
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

.method public final B(LP5/S;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lj3/D;->p0(LP5/S;)Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 9
    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    move-object v0, p0

    .line 19
    invoke-virtual/range {v0 .. v5}, Lj3/D;->E0(Ljava/util/ArrayList;IJZ)V

    .line 20
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final B0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj3/D;->q0:Ln4/k;

    .line 2
    .line 3
    iget-object v1, p0, Lj3/D;->x:Lj3/A;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lj3/D;->y:Lj3/B;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lj3/D;->q0(Lj3/s0;)Lj3/t0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-boolean v3, v0, Lj3/t0;->g:Z

    .line 15
    .line 16
    xor-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    invoke-static {v3}, Ll4/a;->m(Z)V

    .line 19
    .line 20
    .line 21
    const/16 v3, 0x2710

    .line 22
    .line 23
    iput v3, v0, Lj3/t0;->d:I

    .line 24
    .line 25
    iget-boolean v3, v0, Lj3/t0;->g:Z

    .line 26
    .line 27
    xor-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    invoke-static {v3}, Ll4/a;->m(Z)V

    .line 30
    .line 31
    .line 32
    iput-object v2, v0, Lj3/t0;->e:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v0}, Lj3/t0;->c()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lj3/D;->q0:Ln4/k;

    .line 38
    .line 39
    iget-object v0, v0, Ln4/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Lj3/D;->q0:Ln4/k;

    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lj3/D;->s0:Landroid/view/TextureView;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eq v0, v1, :cond_1

    .line 55
    .line 56
    const-string v0, "ExoPlayerImpl"

    .line 57
    .line 58
    const-string v3, "SurfaceTextureListener already unset or replaced."

    .line 59
    .line 60
    invoke-static {v0, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget-object v0, p0, Lj3/D;->s0:Landroid/view/TextureView;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    iput-object v2, p0, Lj3/D;->s0:Landroid/view/TextureView;

    .line 70
    .line 71
    :cond_2
    iget-object v0, p0, Lj3/D;->p0:Landroid/view/SurfaceHolder;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, Lj3/D;->p0:Landroid/view/SurfaceHolder;

    .line 79
    .line 80
    :cond_3
    return-void
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

.method public final C(Landroid/view/SurfaceView;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lm4/n;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lj3/D;->B0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lj3/D;->G0(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Lj3/D;->F0(Landroid/view/SurfaceHolder;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v0, p1, Ln4/k;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    iget-object v2, p0, Lj3/D;->x:Lj3/A;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lj3/D;->B0()V

    .line 30
    .line 31
    .line 32
    move-object v0, p1

    .line 33
    check-cast v0, Ln4/k;

    .line 34
    .line 35
    iput-object v0, p0, Lj3/D;->q0:Ln4/k;

    .line 36
    .line 37
    iget-object v0, p0, Lj3/D;->y:Lj3/B;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lj3/D;->q0(Lj3/s0;)Lj3/t0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-boolean v3, v0, Lj3/t0;->g:Z

    .line 44
    .line 45
    xor-int/2addr v3, v1

    .line 46
    invoke-static {v3}, Ll4/a;->m(Z)V

    .line 47
    .line 48
    .line 49
    const/16 v3, 0x2710

    .line 50
    .line 51
    iput v3, v0, Lj3/t0;->d:I

    .line 52
    .line 53
    iget-object v3, p0, Lj3/D;->q0:Ln4/k;

    .line 54
    .line 55
    iget-boolean v4, v0, Lj3/t0;->g:Z

    .line 56
    .line 57
    xor-int/2addr v1, v4

    .line 58
    invoke-static {v1}, Ll4/a;->m(Z)V

    .line 59
    .line 60
    .line 61
    iput-object v3, v0, Lj3/t0;->e:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {v0}, Lj3/t0;->c()V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lj3/D;->q0:Ln4/k;

    .line 67
    .line 68
    iget-object v0, v0, Ln4/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lj3/D;->q0:Ln4/k;

    .line 74
    .line 75
    invoke-virtual {v0}, Ln4/k;->getVideoSurface()Landroid/view/Surface;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p0, v0}, Lj3/D;->G0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, Lj3/D;->F0(Landroid/view/SurfaceHolder;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    const/4 v0, 0x0

    .line 91
    if-nez p1, :cond_2

    .line 92
    .line 93
    move-object p1, v0

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_0
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 100
    .line 101
    .line 102
    if-nez p1, :cond_3

    .line 103
    .line 104
    invoke-virtual {p0}, Lj3/D;->n0()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    invoke-virtual {p0}, Lj3/D;->B0()V

    .line 109
    .line 110
    .line 111
    iput-boolean v1, p0, Lj3/D;->r0:Z

    .line 112
    .line 113
    iput-object p1, p0, Lj3/D;->p0:Landroid/view/SurfaceHolder;

    .line 114
    .line 115
    invoke-interface {p1, v2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_4

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Lj3/D;->G0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-virtual {p0, v0, p1}, Lj3/D;->z0(II)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_4
    invoke-virtual {p0, v0}, Lj3/D;->G0(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    const/4 p1, 0x0

    .line 153
    invoke-virtual {p0, p1, p1}, Lj3/D;->z0(II)V

    .line 154
    .line 155
    .line 156
    return-void
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

.method public final C0(IJZ)V
    .locals 11

    .line 1
    iget-object v2, p0, Lj3/D;->r:Lk3/e;

    .line 2
    .line 3
    iget-boolean v3, v2, Lk3/e;->i:Z

    .line 4
    .line 5
    const/4 v4, 0x1

    .line 6
    if-nez v3, :cond_0

    .line 7
    .line 8
    invoke-virtual {v2}, Lk3/e;->O()Lk3/a;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    iput-boolean v4, v2, Lk3/e;->i:Z

    .line 13
    .line 14
    new-instance v5, Lj3/Z;

    .line 15
    .line 16
    const/16 v6, 0xe

    .line 17
    .line 18
    invoke-direct {v5, v6}, Lj3/Z;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const/4 v6, -0x1

    .line 22
    invoke-virtual {v2, v3, v6, v5}, Lk3/e;->T(Lk3/a;ILl4/i;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v2, p0, Lj3/D;->F0:Lj3/l0;

    .line 26
    .line 27
    iget-object v2, v2, Lj3/l0;->a:Lj3/E0;

    .line 28
    .line 29
    if-ltz p1, :cond_4

    .line 30
    .line 31
    invoke-virtual {v2}, Lj3/E0;->p()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Lj3/E0;->o()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-ge p1, v3, :cond_4

    .line 42
    .line 43
    :cond_1
    iget v3, p0, Lj3/D;->f0:I

    .line 44
    .line 45
    add-int/2addr v3, v4

    .line 46
    iput v3, p0, Lj3/D;->f0:I

    .line 47
    .line 48
    invoke-virtual {p0}, Lj3/D;->g()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    const-string v1, "ExoPlayerImpl"

    .line 55
    .line 56
    const-string v2, "seekTo ignored because an ad is playing"

    .line 57
    .line 58
    invoke-static {v1, v2}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lj3/G;

    .line 62
    .line 63
    iget-object v2, p0, Lj3/D;->F0:Lj3/l0;

    .line 64
    .line 65
    invoke-direct {v1, v2}, Lj3/G;-><init>(Lj3/l0;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v4}, Lj3/G;->a(I)V

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, Lj3/D;->j:Lj3/s;

    .line 72
    .line 73
    iget-object v2, v2, Lj3/s;->a:Lj3/D;

    .line 74
    .line 75
    iget-object v3, v2, Lj3/D;->i:Ll4/w;

    .line 76
    .line 77
    new-instance v4, LA6/r;

    .line 78
    .line 79
    const/16 v5, 0xe

    .line 80
    .line 81
    invoke-direct {v4, v2, v5, v1}, LA6/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v3, Ll4/w;->a:Landroid/os/Handler;

    .line 85
    .line 86
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    invoke-virtual {p0}, Lj3/D;->e()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-ne v3, v4, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    const/4 v4, 0x2

    .line 98
    :goto_0
    invoke-virtual {p0}, Lj3/D;->z()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    iget-object v3, p0, Lj3/D;->F0:Lj3/l0;

    .line 103
    .line 104
    invoke-virtual {v3, v4}, Lj3/l0;->f(I)Lj3/l0;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {p0, v2, p1, p2, p3}, Lj3/D;->y0(Lj3/E0;IJ)Landroid/util/Pair;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {p0, v3, v2, v6}, Lj3/D;->x0(Lj3/l0;Lj3/E0;Landroid/util/Pair;)Lj3/l0;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-static {p2, p3}, Ll4/y;->H(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    iget-object v6, p0, Lj3/D;->k:Lj3/J;

    .line 121
    .line 122
    iget-object v6, v6, Lj3/J;->h:Ll4/w;

    .line 123
    .line 124
    new-instance v7, Lj3/I;

    .line 125
    .line 126
    invoke-direct {v7, v2, p1, v4, v5}, Lj3/I;-><init>(Lj3/E0;IJ)V

    .line 127
    .line 128
    .line 129
    const/4 v1, 0x3

    .line 130
    invoke-virtual {v6, v1, v7}, Ll4/w;->a(ILjava/lang/Object;)Ll4/v;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, Ll4/v;->b()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v3}, Lj3/D;->t0(Lj3/l0;)J

    .line 138
    .line 139
    .line 140
    move-result-wide v7

    .line 141
    const/4 v4, 0x1

    .line 142
    const/4 v5, 0x1

    .line 143
    const/4 v2, 0x0

    .line 144
    move-object v1, v3

    .line 145
    const/4 v3, 0x1

    .line 146
    const/4 v6, 0x1

    .line 147
    move-object v0, p0

    .line 148
    move v10, p4

    .line 149
    invoke-virtual/range {v0 .. v10}, Lj3/D;->K0(Lj3/l0;IIZZIJIZ)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_4
    new-instance v0, La8/o;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 156
    .line 157
    .line 158
    throw v0
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
.end method

.method public final D(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lj3/D;->p0:Landroid/view/SurfaceHolder;

    .line 18
    .line 19
    if-ne p1, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lj3/D;->n0()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
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

.method public final D0(IILjava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lj3/D;->g:[Lj3/d;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget v4, v3, Lj3/d;->a:I

    .line 10
    .line 11
    if-ne v4, p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v3}, Lj3/D;->q0(Lj3/s0;)Lj3/t0;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-boolean v4, v3, Lj3/t0;->g:Z

    .line 18
    .line 19
    xor-int/lit8 v4, v4, 0x1

    .line 20
    .line 21
    invoke-static {v4}, Ll4/a;->m(Z)V

    .line 22
    .line 23
    .line 24
    iput p2, v3, Lj3/t0;->d:I

    .line 25
    .line 26
    iget-boolean v4, v3, Lj3/t0;->g:Z

    .line 27
    .line 28
    xor-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    invoke-static {v4}, Ll4/a;->m(Z)V

    .line 31
    .line 32
    .line 33
    iput-object p3, v3, Lj3/t0;->e:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v3}, Lj3/t0;->c()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
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

.method public final E(LP5/S;IJ)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lj3/D;->p0(LP5/S;)Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    move-object v0, p0

    .line 14
    move-wide v3, p3

    .line 15
    invoke-virtual/range {v0 .. v5}, Lj3/D;->E0(Ljava/util/ArrayList;IJZ)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method public final E0(Ljava/util/ArrayList;IJZ)V
    .locals 14

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    invoke-virtual {p0}, Lj3/D;->u0()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    invoke-virtual {p0}, Lj3/D;->T()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget v5, p0, Lj3/D;->f0:I

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    add-int/2addr v5, v6

    .line 15
    iput v5, p0, Lj3/D;->f0:I

    .line 16
    .line 17
    iget-object v5, p0, Lj3/D;->o:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-nez v7, :cond_0

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-virtual {p0, v7}, Lj3/D;->A0(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    new-instance v9, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    move v8, v7

    .line 39
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    if-ge v8, v10, :cond_1

    .line 44
    .line 45
    new-instance v10, Lj3/i0;

    .line 46
    .line 47
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    check-cast v12, LN3/a;

    .line 52
    .line 53
    iget-boolean v13, p0, Lj3/D;->p:Z

    .line 54
    .line 55
    invoke-direct {v10, v12, v13}, Lj3/i0;-><init>(LN3/a;Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    new-instance v12, Lj3/C;

    .line 62
    .line 63
    iget-object v13, v10, Lj3/i0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    iget-object v10, v10, Lj3/i0;->a:LN3/u;

    .line 66
    .line 67
    iget-object v10, v10, LN3/u;->o:LN3/s;

    .line 68
    .line 69
    invoke-direct {v12, v13, v10}, Lj3/C;-><init>(Ljava/lang/Object;Lj3/E0;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v8, v12}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v8, v8, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iget-object v8, p0, Lj3/D;->j0:LN3/g0;

    .line 79
    .line 80
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    invoke-virtual {v8, v10}, LN3/g0;->a(I)LN3/g0;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    iput-object v8, p0, Lj3/D;->j0:LN3/g0;

    .line 89
    .line 90
    new-instance v10, Lj3/u0;

    .line 91
    .line 92
    invoke-direct {v10, v5, v8}, Lj3/u0;-><init>(Ljava/util/ArrayList;LN3/g0;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10}, Lj3/E0;->p()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    iget v8, v10, Lj3/u0;->d:I

    .line 100
    .line 101
    if-nez v5, :cond_3

    .line 102
    .line 103
    if-ge v1, v8, :cond_2

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    new-instance v1, La8/o;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 109
    .line 110
    .line 111
    throw v1

    .line 112
    :cond_3
    :goto_1
    const/4 v5, -0x1

    .line 113
    if-eqz p5, :cond_4

    .line 114
    .line 115
    iget-boolean v1, p0, Lj3/D;->Z:Z

    .line 116
    .line 117
    invoke-virtual {v10, v1}, Lj3/u0;->a(Z)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    :goto_2
    move v11, v1

    .line 127
    goto :goto_3

    .line 128
    :cond_4
    if-ne v1, v5, :cond_5

    .line 129
    .line 130
    move v11, v2

    .line 131
    move-wide v2, v3

    .line 132
    goto :goto_3

    .line 133
    :cond_5
    move-wide/from16 v2, p3

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :goto_3
    iget-object v1, p0, Lj3/D;->F0:Lj3/l0;

    .line 137
    .line 138
    invoke-virtual {p0, v10, v11, v2, v3}, Lj3/D;->y0(Lj3/E0;IJ)Landroid/util/Pair;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {p0, v1, v10, v4}, Lj3/D;->x0(Lj3/l0;Lj3/E0;Landroid/util/Pair;)Lj3/l0;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget v4, v1, Lj3/l0;->e:I

    .line 147
    .line 148
    if-eq v11, v5, :cond_8

    .line 149
    .line 150
    if-eq v4, v6, :cond_8

    .line 151
    .line 152
    invoke-virtual {v10}, Lj3/E0;->p()Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-nez v4, :cond_7

    .line 157
    .line 158
    if-lt v11, v8, :cond_6

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    const/4 v4, 0x2

    .line 162
    goto :goto_5

    .line 163
    :cond_7
    :goto_4
    const/4 v4, 0x4

    .line 164
    :cond_8
    :goto_5
    invoke-virtual {v1, v4}, Lj3/l0;->f(I)Lj3/l0;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {v2, v3}, Ll4/y;->H(J)J

    .line 169
    .line 170
    .line 171
    move-result-wide v12

    .line 172
    iget-object v10, p0, Lj3/D;->j0:LN3/g0;

    .line 173
    .line 174
    iget-object v2, p0, Lj3/D;->k:Lj3/J;

    .line 175
    .line 176
    iget-object v2, v2, Lj3/J;->h:Ll4/w;

    .line 177
    .line 178
    new-instance v8, Lj3/F;

    .line 179
    .line 180
    invoke-direct/range {v8 .. v13}, Lj3/F;-><init>(Ljava/util/ArrayList;LN3/g0;IJ)V

    .line 181
    .line 182
    .line 183
    const/16 v3, 0x11

    .line 184
    .line 185
    invoke-virtual {v2, v3, v8}, Ll4/w;->a(ILjava/lang/Object;)Ll4/v;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2}, Ll4/v;->b()V

    .line 190
    .line 191
    .line 192
    iget-object v2, p0, Lj3/D;->F0:Lj3/l0;

    .line 193
    .line 194
    iget-object v2, v2, Lj3/l0;->b:LN3/A;

    .line 195
    .line 196
    iget-object v2, v2, LN3/y;->a:Ljava/lang/Object;

    .line 197
    .line 198
    iget-object v3, v1, Lj3/l0;->b:LN3/A;

    .line 199
    .line 200
    iget-object v3, v3, LN3/y;->a:Ljava/lang/Object;

    .line 201
    .line 202
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-nez v2, :cond_9

    .line 207
    .line 208
    iget-object v2, p0, Lj3/D;->F0:Lj3/l0;

    .line 209
    .line 210
    iget-object v2, v2, Lj3/l0;->a:Lj3/E0;

    .line 211
    .line 212
    invoke-virtual {v2}, Lj3/E0;->p()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-nez v2, :cond_9

    .line 217
    .line 218
    move v5, v6

    .line 219
    goto :goto_6

    .line 220
    :cond_9
    move v5, v7

    .line 221
    :goto_6
    invoke-virtual {p0, v1}, Lj3/D;->t0(Lj3/l0;)J

    .line 222
    .line 223
    .line 224
    move-result-wide v7

    .line 225
    const/4 v4, 0x0

    .line 226
    const/4 v6, 0x4

    .line 227
    const/4 v2, 0x0

    .line 228
    const/4 v3, 0x1

    .line 229
    const/4 v9, -0x1

    .line 230
    const/4 v10, 0x0

    .line 231
    move-object v0, p0

    .line 232
    invoke-virtual/range {v0 .. v10}, Lj3/D;->K0(Lj3/l0;IIZZIJIZ)V

    .line 233
    .line 234
    .line 235
    return-void
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

.method public final F()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget v0, v0, Lj3/l0;->m:I

    .line 7
    .line 8
    return v0
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

.method public final F0(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lj3/D;->r0:Z

    .line 3
    .line 4
    iput-object p1, p0, Lj3/D;->p0:Landroid/view/SurfaceHolder;

    .line 5
    .line 6
    iget-object v1, p0, Lj3/D;->x:Lj3/A;

    .line 7
    .line 8
    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lj3/D;->p0:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lj3/D;->p0:Landroid/view/SurfaceHolder;

    .line 26
    .line 27
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p0, v0, p1}, Lj3/D;->z0(II)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {p0, v0, v0}, Lj3/D;->z0(II)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public final G0(Ljava/lang/Object;)V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lj3/D;->g:[Lj3/d;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    if-ge v4, v2, :cond_1

    .line 14
    .line 15
    aget-object v7, v1, v4

    .line 16
    .line 17
    iget v8, v7, Lj3/d;->a:I

    .line 18
    .line 19
    if-ne v8, v5, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v7}, Lj3/D;->q0(Lj3/s0;)Lj3/t0;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-boolean v7, v5, Lj3/t0;->g:Z

    .line 26
    .line 27
    xor-int/2addr v7, v6

    .line 28
    invoke-static {v7}, Ll4/a;->m(Z)V

    .line 29
    .line 30
    .line 31
    iput v6, v5, Lj3/t0;->d:I

    .line 32
    .line 33
    iget-boolean v7, v5, Lj3/t0;->g:Z

    .line 34
    .line 35
    xor-int/2addr v6, v7

    .line 36
    invoke-static {v6}, Ll4/a;->m(Z)V

    .line 37
    .line 38
    .line 39
    iput-object p1, v5, Lj3/t0;->e:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v5}, Lj3/t0;->c()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object v1, p0, Lj3/D;->n0:Ljava/lang/Object;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    if-eq v1, p1, :cond_3

    .line 55
    .line 56
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    move v2, v3

    .line 61
    :goto_1
    if-ge v2, v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    check-cast v4, Lj3/t0;

    .line 70
    .line 71
    iget-wide v7, p0, Lj3/D;->X:J

    .line 72
    .line 73
    invoke-virtual {v4, v7, v8}, Lj3/t0;->a(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catch_0
    move v3, v6

    .line 78
    goto :goto_2

    .line 79
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_2
    iget-object v0, p0, Lj3/D;->n0:Ljava/lang/Object;

    .line 87
    .line 88
    iget-object v1, p0, Lj3/D;->o0:Landroid/view/Surface;

    .line 89
    .line 90
    if-ne v0, v1, :cond_3

    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 93
    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    iput-object v0, p0, Lj3/D;->o0:Landroid/view/Surface;

    .line 97
    .line 98
    :cond_3
    iput-object p1, p0, Lj3/D;->n0:Ljava/lang/Object;

    .line 99
    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    new-instance p1, LA7/b;

    .line 103
    .line 104
    const-string v0, "Detaching surface timed out."

    .line 105
    .line 106
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lj3/m;

    .line 110
    .line 111
    const/16 v1, 0x3eb

    .line 112
    .line 113
    invoke-direct {v0, v5, p1, v1}, Lj3/m;-><init>(ILjava/lang/Exception;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v0}, Lj3/D;->H0(Lj3/m;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    return-void
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
.end method

.method public final H()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj3/D;->g()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 11
    .line 12
    iget-object v1, v0, Lj3/l0;->b:LN3/A;

    .line 13
    .line 14
    iget-object v2, v1, LN3/y;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 17
    .line 18
    iget-object v3, p0, Lj3/D;->n:Lj3/C0;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 21
    .line 22
    .line 23
    iget v0, v1, LN3/y;->b:I

    .line 24
    .line 25
    iget v1, v1, LN3/y;->c:I

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, Lj3/C0;->a(II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Ll4/y;->T(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_0
    invoke-virtual {p0}, Lj3/D;->I()Lj3/E0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    return-wide v0

    .line 52
    :cond_1
    invoke-virtual {p0}, Lj3/D;->z()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const-wide/16 v2, 0x0

    .line 57
    .line 58
    iget-object v4, p0, LD/n;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Lj3/D0;

    .line 61
    .line 62
    invoke-virtual {v0, v1, v4, v2, v3}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-wide v0, v0, Lj3/D0;->n:J

    .line 67
    .line 68
    invoke-static {v0, v1}, Ll4/y;->T(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0
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

.method public final H0(Lj3/m;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 2
    .line 3
    iget-object v1, v0, Lj3/l0;->b:LN3/A;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lj3/l0;->a(LN3/A;)Lj3/l0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, Lj3/l0;->r:J

    .line 10
    .line 11
    iput-wide v1, v0, Lj3/l0;->p:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Lj3/l0;->q:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lj3/l0;->f(I)Lj3/l0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lj3/l0;->d(Lj3/m;)Lj3/l0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, Lj3/D;->f0:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Lj3/D;->f0:I

    .line 33
    .line 34
    iget-object p1, p0, Lj3/D;->k:Lj3/J;

    .line 35
    .line 36
    iget-object p1, p1, Lj3/J;->h:Ll4/w;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ll4/w;->b()Ll4/v;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object p1, p1, Ll4/w;->a:Landroid/os/Handler;

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    invoke-virtual {p1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, v0, Ll4/v;->a:Landroid/os/Message;

    .line 53
    .line 54
    invoke-virtual {v0}, Ll4/v;->b()V

    .line 55
    .line 56
    .line 57
    iget-object p1, v3, Lj3/l0;->a:Lj3/E0;

    .line 58
    .line 59
    invoke-virtual {p1}, Lj3/E0;->p()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    iget-object p1, p0, Lj3/D;->F0:Lj3/l0;

    .line 66
    .line 67
    iget-object p1, p1, Lj3/l0;->a:Lj3/E0;

    .line 68
    .line 69
    invoke-virtual {p1}, Lj3/E0;->p()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_1

    .line 74
    .line 75
    :goto_0
    move v7, v1

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const/4 v1, 0x0

    .line 78
    goto :goto_0

    .line 79
    :goto_1
    invoke-virtual {p0, v3}, Lj3/D;->t0(Lj3/l0;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v9

    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v8, 0x4

    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x1

    .line 87
    const/4 v11, -0x1

    .line 88
    const/4 v12, 0x0

    .line 89
    move-object v2, p0

    .line 90
    invoke-virtual/range {v2 .. v12}, Lj3/D;->K0(Lj3/l0;IIZZIJIZ)V

    .line 91
    .line 92
    .line 93
    return-void
    .line 94
    .line 95
    .line 96
.end method

.method public final I()Lj3/E0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 7
    .line 8
    return-object v0
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

.method public final I0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj3/D;->k0:Lj3/n0;

    .line 2
    .line 3
    iget-object v1, p0, Lj3/D;->f:Lj3/D;

    .line 4
    .line 5
    iget-object v2, p0, Lj3/D;->c:Lj3/n0;

    .line 6
    .line 7
    invoke-static {v1, v2}, Ll4/y;->o(LD/n;Lj3/n0;)Lj3/n0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, Lj3/D;->k0:Lj3/n0;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lj3/n0;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lj3/s;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lj3/s;-><init>(Lj3/D;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lj3/D;->l:Ll4/l;

    .line 25
    .line 26
    const/16 v2, 0xd

    .line 27
    .line 28
    invoke-virtual {v1, v2, v0}, Ll4/l;->c(ILl4/i;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
    .line 32
.end method

.method public final J()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/D;->s:Landroid/os/Looper;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final J0(IIZ)V
    .locals 11

    .line 1
    const/4 v2, 0x0

    .line 2
    const/4 v3, 0x1

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 v4, -0x1

    .line 6
    if-eq p1, v4, :cond_0

    .line 7
    .line 8
    move v4, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v4, v2

    .line 11
    :goto_0
    if-eqz v4, :cond_1

    .line 12
    .line 13
    if-eq p1, v3, :cond_1

    .line 14
    .line 15
    move v2, v3

    .line 16
    :cond_1
    iget-object v1, p0, Lj3/D;->F0:Lj3/l0;

    .line 17
    .line 18
    iget-boolean v5, v1, Lj3/l0;->l:Z

    .line 19
    .line 20
    if-ne v5, v4, :cond_2

    .line 21
    .line 22
    iget v5, v1, Lj3/l0;->m:I

    .line 23
    .line 24
    if-ne v5, v2, :cond_2

    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    iget v5, p0, Lj3/D;->f0:I

    .line 28
    .line 29
    add-int/2addr v5, v3

    .line 30
    iput v5, p0, Lj3/D;->f0:I

    .line 31
    .line 32
    invoke-virtual {v1, v2, v4}, Lj3/l0;->c(IZ)Lj3/l0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v5, p0, Lj3/D;->k:Lj3/J;

    .line 37
    .line 38
    iget-object v5, v5, Lj3/J;->h:Ll4/w;

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ll4/w;->b()Ll4/v;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    iget-object v5, v5, Ll4/w;->a:Landroid/os/Handler;

    .line 48
    .line 49
    invoke-virtual {v5, v3, v4, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iput-object v2, v6, Ll4/v;->a:Landroid/os/Message;

    .line 54
    .line 55
    invoke-virtual {v6}, Ll4/v;->b()V

    .line 56
    .line 57
    .line 58
    const/4 v6, 0x5

    .line 59
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v9, -0x1

    .line 68
    const/4 v10, 0x0

    .line 69
    move-object v0, p0

    .line 70
    move v3, p2

    .line 71
    invoke-virtual/range {v0 .. v10}, Lj3/D;->K0(Lj3/l0;IIZZIJIZ)V

    .line 72
    .line 73
    .line 74
    return-void
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

.method public final K0(Lj3/l0;IIZZIJIZ)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p6

    .line 6
    .line 7
    iget-object v3, v0, Lj3/D;->F0:Lj3/l0;

    .line 8
    .line 9
    iput-object v1, v0, Lj3/D;->F0:Lj3/l0;

    .line 10
    .line 11
    iget-object v4, v3, Lj3/l0;->a:Lj3/E0;

    .line 12
    .line 13
    iget-object v5, v1, Lj3/l0;->a:Lj3/E0;

    .line 14
    .line 15
    invoke-virtual {v4, v5}, Lj3/E0;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, v3, Lj3/l0;->a:Lj3/E0;

    .line 20
    .line 21
    iget-object v6, v1, Lj3/l0;->a:Lj3/E0;

    .line 22
    .line 23
    invoke-virtual {v6}, Lj3/E0;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    const/4 v8, -0x1

    .line 28
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    const/4 v10, 0x1

    .line 33
    const-wide/16 v13, 0x0

    .line 34
    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    invoke-virtual {v5}, Lj3/E0;->p()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_0

    .line 42
    .line 43
    new-instance v5, Landroid/util/Pair;

    .line 44
    .line 45
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-direct {v5, v6, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/16 v16, 0x3

    .line 51
    .line 52
    :goto_0
    const/16 v17, 0x2

    .line 53
    .line 54
    const/16 v18, 0x0

    .line 55
    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_0
    invoke-virtual {v6}, Lj3/E0;->p()Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/16 v16, 0x3

    .line 63
    .line 64
    invoke-virtual {v5}, Lj3/E0;->p()Z

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-eq v7, v12, :cond_1

    .line 69
    .line 70
    new-instance v5, Landroid/util/Pair;

    .line 71
    .line 72
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object v7, v3, Lj3/l0;->b:LN3/A;

    .line 83
    .line 84
    iget-object v12, v7, LN3/y;->a:Ljava/lang/Object;

    .line 85
    .line 86
    const/16 v17, 0x2

    .line 87
    .line 88
    iget-object v11, v0, Lj3/D;->n:Lj3/C0;

    .line 89
    .line 90
    invoke-virtual {v5, v12, v11}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    iget v12, v12, Lj3/C0;->c:I

    .line 95
    .line 96
    iget-object v8, v0, LD/n;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v8, Lj3/D0;

    .line 99
    .line 100
    invoke-virtual {v5, v12, v8, v13, v14}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-object v5, v5, Lj3/D0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iget-object v12, v1, Lj3/l0;->b:LN3/A;

    .line 107
    .line 108
    const/16 v18, 0x0

    .line 109
    .line 110
    iget-object v15, v12, LN3/y;->a:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v6, v15, v11}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    iget v11, v11, Lj3/C0;->c:I

    .line 117
    .line 118
    invoke-virtual {v6, v11, v8, v13, v14}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    iget-object v6, v6, Lj3/D0;->a:Ljava/lang/Object;

    .line 123
    .line 124
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-nez v5, :cond_5

    .line 129
    .line 130
    if-eqz p5, :cond_2

    .line 131
    .line 132
    if-nez v2, :cond_2

    .line 133
    .line 134
    move v5, v10

    .line 135
    goto :goto_1

    .line 136
    :cond_2
    if-eqz p5, :cond_3

    .line 137
    .line 138
    if-ne v2, v10, :cond_3

    .line 139
    .line 140
    move/from16 v5, v17

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    if-nez v4, :cond_4

    .line 144
    .line 145
    move/from16 v5, v16

    .line 146
    .line 147
    :goto_1
    new-instance v6, Landroid/util/Pair;

    .line 148
    .line 149
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-direct {v6, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    move-object v5, v6

    .line 159
    goto :goto_2

    .line 160
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 163
    .line 164
    .line 165
    throw v1

    .line 166
    :cond_5
    if-eqz p5, :cond_6

    .line 167
    .line 168
    if-nez v2, :cond_6

    .line 169
    .line 170
    iget-wide v5, v7, LN3/y;->d:J

    .line 171
    .line 172
    iget-wide v7, v12, LN3/y;->d:J

    .line 173
    .line 174
    cmp-long v5, v5, v7

    .line 175
    .line 176
    if-gez v5, :cond_6

    .line 177
    .line 178
    new-instance v5, Landroid/util/Pair;

    .line 179
    .line 180
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 181
    .line 182
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    if-eqz p5, :cond_7

    .line 191
    .line 192
    if-ne v2, v10, :cond_7

    .line 193
    .line 194
    if-eqz p10, :cond_7

    .line 195
    .line 196
    new-instance v5, Landroid/util/Pair;

    .line 197
    .line 198
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    new-instance v5, Landroid/util/Pair;

    .line 209
    .line 210
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-direct {v5, v6, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :goto_2
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v6, Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v5, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    iget-object v7, v0, Lj3/D;->l0:Lj3/b0;

    .line 232
    .line 233
    if-eqz v6, :cond_9

    .line 234
    .line 235
    iget-object v9, v1, Lj3/l0;->a:Lj3/E0;

    .line 236
    .line 237
    invoke-virtual {v9}, Lj3/E0;->p()Z

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    if-nez v9, :cond_8

    .line 242
    .line 243
    iget-object v9, v1, Lj3/l0;->a:Lj3/E0;

    .line 244
    .line 245
    iget-object v11, v1, Lj3/l0;->b:LN3/A;

    .line 246
    .line 247
    iget-object v11, v11, LN3/y;->a:Ljava/lang/Object;

    .line 248
    .line 249
    iget-object v12, v0, Lj3/D;->n:Lj3/C0;

    .line 250
    .line 251
    invoke-virtual {v9, v11, v12}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    iget v9, v9, Lj3/C0;->c:I

    .line 256
    .line 257
    iget-object v11, v1, Lj3/l0;->a:Lj3/E0;

    .line 258
    .line 259
    iget-object v12, v0, LD/n;->a:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v12, Lj3/D0;

    .line 262
    .line 263
    invoke-virtual {v11, v9, v12, v13, v14}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    iget-object v9, v9, Lj3/D0;->c:Lj3/Y;

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_8
    const/4 v9, 0x0

    .line 271
    :goto_3
    sget-object v11, Lj3/b0;->Z:Lj3/b0;

    .line 272
    .line 273
    iput-object v11, v0, Lj3/D;->E0:Lj3/b0;

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_9
    const/4 v9, 0x0

    .line 277
    :goto_4
    if-nez v6, :cond_a

    .line 278
    .line 279
    iget-object v11, v3, Lj3/l0;->j:Ljava/util/List;

    .line 280
    .line 281
    iget-object v12, v1, Lj3/l0;->j:Ljava/util/List;

    .line 282
    .line 283
    invoke-interface {v11, v12}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    if-nez v11, :cond_d

    .line 288
    .line 289
    :cond_a
    iget-object v7, v0, Lj3/D;->E0:Lj3/b0;

    .line 290
    .line 291
    invoke-virtual {v7}, Lj3/b0;->a()Lj3/a0;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    iget-object v11, v1, Lj3/l0;->j:Ljava/util/List;

    .line 296
    .line 297
    move/from16 v12, v18

    .line 298
    .line 299
    :goto_5
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 300
    .line 301
    .line 302
    move-result v15

    .line 303
    if-ge v12, v15, :cond_c

    .line 304
    .line 305
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v15

    .line 309
    check-cast v15, LD3/c;

    .line 310
    .line 311
    move/from16 v8, v18

    .line 312
    .line 313
    :goto_6
    iget-object v10, v15, LD3/c;->a:[LD3/b;

    .line 314
    .line 315
    array-length v13, v10

    .line 316
    if-ge v8, v13, :cond_b

    .line 317
    .line 318
    aget-object v10, v10, v8

    .line 319
    .line 320
    invoke-interface {v10, v7}, LD3/b;->b(Lj3/a0;)V

    .line 321
    .line 322
    .line 323
    add-int/lit8 v8, v8, 0x1

    .line 324
    .line 325
    const-wide/16 v13, 0x0

    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_b
    add-int/lit8 v12, v12, 0x1

    .line 329
    .line 330
    const/4 v10, 0x1

    .line 331
    const-wide/16 v13, 0x0

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_c
    new-instance v8, Lj3/b0;

    .line 335
    .line 336
    invoke-direct {v8, v7}, Lj3/b0;-><init>(Lj3/a0;)V

    .line 337
    .line 338
    .line 339
    iput-object v8, v0, Lj3/D;->E0:Lj3/b0;

    .line 340
    .line 341
    invoke-virtual {v0}, Lj3/D;->m0()Lj3/b0;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    :cond_d
    iget-object v8, v0, Lj3/D;->l0:Lj3/b0;

    .line 346
    .line 347
    invoke-virtual {v7, v8}, Lj3/b0;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v8

    .line 351
    iput-object v7, v0, Lj3/D;->l0:Lj3/b0;

    .line 352
    .line 353
    iget-boolean v7, v3, Lj3/l0;->l:Z

    .line 354
    .line 355
    iget-boolean v10, v1, Lj3/l0;->l:Z

    .line 356
    .line 357
    if-eq v7, v10, :cond_e

    .line 358
    .line 359
    const/4 v7, 0x1

    .line 360
    goto :goto_7

    .line 361
    :cond_e
    move/from16 v7, v18

    .line 362
    .line 363
    :goto_7
    iget v10, v3, Lj3/l0;->e:I

    .line 364
    .line 365
    iget v11, v1, Lj3/l0;->e:I

    .line 366
    .line 367
    if-eq v10, v11, :cond_f

    .line 368
    .line 369
    const/4 v10, 0x1

    .line 370
    goto :goto_8

    .line 371
    :cond_f
    move/from16 v10, v18

    .line 372
    .line 373
    :goto_8
    if-nez v10, :cond_10

    .line 374
    .line 375
    if-eqz v7, :cond_11

    .line 376
    .line 377
    :cond_10
    invoke-virtual {v0}, Lj3/D;->L0()V

    .line 378
    .line 379
    .line 380
    :cond_11
    iget-boolean v11, v3, Lj3/l0;->g:Z

    .line 381
    .line 382
    iget-boolean v12, v1, Lj3/l0;->g:Z

    .line 383
    .line 384
    if-eq v11, v12, :cond_12

    .line 385
    .line 386
    const/4 v11, 0x1

    .line 387
    goto :goto_9

    .line 388
    :cond_12
    move/from16 v11, v18

    .line 389
    .line 390
    :goto_9
    if-nez v4, :cond_13

    .line 391
    .line 392
    iget-object v4, v0, Lj3/D;->l:Ll4/l;

    .line 393
    .line 394
    new-instance v12, Lj3/w;

    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    move/from16 v14, p2

    .line 398
    .line 399
    invoke-direct {v12, v1, v14, v13}, Lj3/w;-><init>(Lj3/l0;II)V

    .line 400
    .line 401
    .line 402
    move/from16 v13, v18

    .line 403
    .line 404
    invoke-virtual {v4, v13, v12}, Ll4/l;->c(ILl4/i;)V

    .line 405
    .line 406
    .line 407
    :cond_13
    if-eqz p5, :cond_1b

    .line 408
    .line 409
    new-instance v4, Lj3/C0;

    .line 410
    .line 411
    invoke-direct {v4}, Lj3/C0;-><init>()V

    .line 412
    .line 413
    .line 414
    iget-object v12, v3, Lj3/l0;->a:Lj3/E0;

    .line 415
    .line 416
    invoke-virtual {v12}, Lj3/E0;->p()Z

    .line 417
    .line 418
    .line 419
    move-result v12

    .line 420
    if-nez v12, :cond_14

    .line 421
    .line 422
    iget-object v12, v3, Lj3/l0;->b:LN3/A;

    .line 423
    .line 424
    iget-object v12, v12, LN3/y;->a:Ljava/lang/Object;

    .line 425
    .line 426
    iget-object v13, v3, Lj3/l0;->a:Lj3/E0;

    .line 427
    .line 428
    invoke-virtual {v13, v12, v4}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 429
    .line 430
    .line 431
    iget v13, v4, Lj3/C0;->c:I

    .line 432
    .line 433
    iget-object v14, v3, Lj3/l0;->a:Lj3/E0;

    .line 434
    .line 435
    invoke-virtual {v14, v12}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 436
    .line 437
    .line 438
    move-result v14

    .line 439
    iget-object v15, v3, Lj3/l0;->a:Lj3/E0;

    .line 440
    .line 441
    move/from16 v18, v6

    .line 442
    .line 443
    iget-object v6, v0, LD/n;->a:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v6, Lj3/D0;

    .line 446
    .line 447
    move/from16 v20, v7

    .line 448
    .line 449
    move/from16 v19, v8

    .line 450
    .line 451
    const-wide/16 v7, 0x0

    .line 452
    .line 453
    invoke-virtual {v15, v13, v6, v7, v8}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    iget-object v6, v6, Lj3/D0;->a:Ljava/lang/Object;

    .line 458
    .line 459
    iget-object v7, v0, LD/n;->a:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v7, Lj3/D0;

    .line 462
    .line 463
    iget-object v7, v7, Lj3/D0;->c:Lj3/Y;

    .line 464
    .line 465
    move-object/from16 v22, v6

    .line 466
    .line 467
    move-object/from16 v24, v7

    .line 468
    .line 469
    move-object/from16 v25, v12

    .line 470
    .line 471
    move/from16 v23, v13

    .line 472
    .line 473
    move/from16 v26, v14

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_14
    move/from16 v18, v6

    .line 477
    .line 478
    move/from16 v20, v7

    .line 479
    .line 480
    move/from16 v19, v8

    .line 481
    .line 482
    move/from16 v23, p9

    .line 483
    .line 484
    const/16 v22, 0x0

    .line 485
    .line 486
    const/16 v24, 0x0

    .line 487
    .line 488
    const/16 v25, 0x0

    .line 489
    .line 490
    const/16 v26, -0x1

    .line 491
    .line 492
    :goto_a
    if-nez v2, :cond_17

    .line 493
    .line 494
    iget-object v6, v3, Lj3/l0;->b:LN3/A;

    .line 495
    .line 496
    invoke-virtual {v6}, LN3/y;->a()Z

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    if-eqz v6, :cond_15

    .line 501
    .line 502
    iget-object v6, v3, Lj3/l0;->b:LN3/A;

    .line 503
    .line 504
    iget v7, v6, LN3/y;->b:I

    .line 505
    .line 506
    iget v6, v6, LN3/y;->c:I

    .line 507
    .line 508
    invoke-virtual {v4, v7, v6}, Lj3/C0;->a(II)J

    .line 509
    .line 510
    .line 511
    move-result-wide v6

    .line 512
    invoke-static {v3}, Lj3/D;->v0(Lj3/l0;)J

    .line 513
    .line 514
    .line 515
    move-result-wide v12

    .line 516
    goto :goto_d

    .line 517
    :cond_15
    iget-object v6, v3, Lj3/l0;->b:LN3/A;

    .line 518
    .line 519
    iget v6, v6, LN3/y;->e:I

    .line 520
    .line 521
    const/4 v7, -0x1

    .line 522
    if-eq v6, v7, :cond_16

    .line 523
    .line 524
    iget-object v4, v0, Lj3/D;->F0:Lj3/l0;

    .line 525
    .line 526
    invoke-static {v4}, Lj3/D;->v0(Lj3/l0;)J

    .line 527
    .line 528
    .line 529
    move-result-wide v6

    .line 530
    :goto_b
    move-wide v12, v6

    .line 531
    goto :goto_d

    .line 532
    :cond_16
    iget-wide v6, v4, Lj3/C0;->e:J

    .line 533
    .line 534
    iget-wide v12, v4, Lj3/C0;->d:J

    .line 535
    .line 536
    :goto_c
    add-long/2addr v6, v12

    .line 537
    goto :goto_b

    .line 538
    :cond_17
    iget-object v6, v3, Lj3/l0;->b:LN3/A;

    .line 539
    .line 540
    invoke-virtual {v6}, LN3/y;->a()Z

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    if-eqz v6, :cond_18

    .line 545
    .line 546
    iget-wide v6, v3, Lj3/l0;->r:J

    .line 547
    .line 548
    invoke-static {v3}, Lj3/D;->v0(Lj3/l0;)J

    .line 549
    .line 550
    .line 551
    move-result-wide v12

    .line 552
    goto :goto_d

    .line 553
    :cond_18
    iget-wide v6, v4, Lj3/C0;->e:J

    .line 554
    .line 555
    iget-wide v12, v3, Lj3/l0;->r:J

    .line 556
    .line 557
    goto :goto_c

    .line 558
    :goto_d
    new-instance v21, Lj3/q0;

    .line 559
    .line 560
    invoke-static {v6, v7}, Ll4/y;->T(J)J

    .line 561
    .line 562
    .line 563
    move-result-wide v27

    .line 564
    invoke-static {v12, v13}, Ll4/y;->T(J)J

    .line 565
    .line 566
    .line 567
    move-result-wide v29

    .line 568
    iget-object v4, v3, Lj3/l0;->b:LN3/A;

    .line 569
    .line 570
    iget v6, v4, LN3/y;->b:I

    .line 571
    .line 572
    iget v4, v4, LN3/y;->c:I

    .line 573
    .line 574
    move/from16 v32, v4

    .line 575
    .line 576
    move/from16 v31, v6

    .line 577
    .line 578
    invoke-direct/range {v21 .. v32}, Lj3/q0;-><init>(Ljava/lang/Object;ILj3/Y;Ljava/lang/Object;IJJII)V

    .line 579
    .line 580
    .line 581
    move-object/from16 v4, v21

    .line 582
    .line 583
    invoke-virtual {v0}, Lj3/D;->z()I

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    iget-object v7, v0, Lj3/D;->F0:Lj3/l0;

    .line 588
    .line 589
    iget-object v7, v7, Lj3/l0;->a:Lj3/E0;

    .line 590
    .line 591
    invoke-virtual {v7}, Lj3/E0;->p()Z

    .line 592
    .line 593
    .line 594
    move-result v7

    .line 595
    if-nez v7, :cond_19

    .line 596
    .line 597
    iget-object v7, v0, Lj3/D;->F0:Lj3/l0;

    .line 598
    .line 599
    iget-object v8, v7, Lj3/l0;->b:LN3/A;

    .line 600
    .line 601
    iget-object v8, v8, LN3/y;->a:Ljava/lang/Object;

    .line 602
    .line 603
    iget-object v7, v7, Lj3/l0;->a:Lj3/E0;

    .line 604
    .line 605
    iget-object v12, v0, Lj3/D;->n:Lj3/C0;

    .line 606
    .line 607
    invoke-virtual {v7, v8, v12}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 608
    .line 609
    .line 610
    iget-object v7, v0, Lj3/D;->F0:Lj3/l0;

    .line 611
    .line 612
    iget-object v7, v7, Lj3/l0;->a:Lj3/E0;

    .line 613
    .line 614
    invoke-virtual {v7, v8}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    iget-object v12, v0, Lj3/D;->F0:Lj3/l0;

    .line 619
    .line 620
    iget-object v12, v12, Lj3/l0;->a:Lj3/E0;

    .line 621
    .line 622
    iget-object v13, v0, LD/n;->a:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v13, Lj3/D0;

    .line 625
    .line 626
    const-wide/16 v14, 0x0

    .line 627
    .line 628
    invoke-virtual {v12, v6, v13, v14, v15}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 629
    .line 630
    .line 631
    move-result-object v12

    .line 632
    iget-object v12, v12, Lj3/D0;->a:Ljava/lang/Object;

    .line 633
    .line 634
    iget-object v13, v13, Lj3/D0;->c:Lj3/Y;

    .line 635
    .line 636
    move/from16 v26, v7

    .line 637
    .line 638
    move-object/from16 v25, v8

    .line 639
    .line 640
    move-object/from16 v22, v12

    .line 641
    .line 642
    move-object/from16 v24, v13

    .line 643
    .line 644
    goto :goto_e

    .line 645
    :cond_19
    const/16 v22, 0x0

    .line 646
    .line 647
    const/16 v24, 0x0

    .line 648
    .line 649
    const/16 v25, 0x0

    .line 650
    .line 651
    const/16 v26, -0x1

    .line 652
    .line 653
    :goto_e
    invoke-static/range {p7 .. p8}, Ll4/y;->T(J)J

    .line 654
    .line 655
    .line 656
    move-result-wide v27

    .line 657
    new-instance v21, Lj3/q0;

    .line 658
    .line 659
    iget-object v7, v0, Lj3/D;->F0:Lj3/l0;

    .line 660
    .line 661
    iget-object v7, v7, Lj3/l0;->b:LN3/A;

    .line 662
    .line 663
    invoke-virtual {v7}, LN3/y;->a()Z

    .line 664
    .line 665
    .line 666
    move-result v7

    .line 667
    if-eqz v7, :cond_1a

    .line 668
    .line 669
    iget-object v7, v0, Lj3/D;->F0:Lj3/l0;

    .line 670
    .line 671
    invoke-static {v7}, Lj3/D;->v0(Lj3/l0;)J

    .line 672
    .line 673
    .line 674
    move-result-wide v7

    .line 675
    invoke-static {v7, v8}, Ll4/y;->T(J)J

    .line 676
    .line 677
    .line 678
    move-result-wide v7

    .line 679
    move-wide/from16 v29, v7

    .line 680
    .line 681
    goto :goto_f

    .line 682
    :cond_1a
    move-wide/from16 v29, v27

    .line 683
    .line 684
    :goto_f
    iget-object v7, v0, Lj3/D;->F0:Lj3/l0;

    .line 685
    .line 686
    iget-object v7, v7, Lj3/l0;->b:LN3/A;

    .line 687
    .line 688
    iget v8, v7, LN3/y;->b:I

    .line 689
    .line 690
    iget v7, v7, LN3/y;->c:I

    .line 691
    .line 692
    move/from16 v23, v6

    .line 693
    .line 694
    move/from16 v32, v7

    .line 695
    .line 696
    move/from16 v31, v8

    .line 697
    .line 698
    invoke-direct/range {v21 .. v32}, Lj3/q0;-><init>(Ljava/lang/Object;ILj3/Y;Ljava/lang/Object;IJJII)V

    .line 699
    .line 700
    .line 701
    move-object/from16 v6, v21

    .line 702
    .line 703
    iget-object v7, v0, Lj3/D;->l:Ll4/l;

    .line 704
    .line 705
    new-instance v8, Le3/g;

    .line 706
    .line 707
    invoke-direct {v8, v2, v4, v6}, Le3/g;-><init>(ILj3/q0;Lj3/q0;)V

    .line 708
    .line 709
    .line 710
    const/16 v2, 0xb

    .line 711
    .line 712
    invoke-virtual {v7, v2, v8}, Ll4/l;->c(ILl4/i;)V

    .line 713
    .line 714
    .line 715
    goto :goto_10

    .line 716
    :cond_1b
    move/from16 v18, v6

    .line 717
    .line 718
    move/from16 v20, v7

    .line 719
    .line 720
    move/from16 v19, v8

    .line 721
    .line 722
    :goto_10
    if-eqz v18, :cond_1c

    .line 723
    .line 724
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 725
    .line 726
    new-instance v4, LG5/b;

    .line 727
    .line 728
    invoke-direct {v4, v5, v9}, LG5/b;-><init>(ILjava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    const/4 v5, 0x1

    .line 732
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 733
    .line 734
    .line 735
    :cond_1c
    iget-object v2, v3, Lj3/l0;->f:Lj3/m;

    .line 736
    .line 737
    iget-object v4, v1, Lj3/l0;->f:Lj3/m;

    .line 738
    .line 739
    if-eq v2, v4, :cond_1d

    .line 740
    .line 741
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 742
    .line 743
    new-instance v4, Lj3/r;

    .line 744
    .line 745
    const/4 v5, 0x0

    .line 746
    invoke-direct {v4, v1, v5}, Lj3/r;-><init>(Lj3/l0;I)V

    .line 747
    .line 748
    .line 749
    const/16 v5, 0xa

    .line 750
    .line 751
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 752
    .line 753
    .line 754
    iget-object v2, v1, Lj3/l0;->f:Lj3/m;

    .line 755
    .line 756
    if-eqz v2, :cond_1d

    .line 757
    .line 758
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 759
    .line 760
    new-instance v4, Lj3/r;

    .line 761
    .line 762
    const/4 v6, 0x1

    .line 763
    invoke-direct {v4, v1, v6}, Lj3/r;-><init>(Lj3/l0;I)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 767
    .line 768
    .line 769
    :cond_1d
    iget-object v2, v3, Lj3/l0;->i:Li4/w;

    .line 770
    .line 771
    iget-object v4, v1, Lj3/l0;->i:Li4/w;

    .line 772
    .line 773
    if-eq v2, v4, :cond_1e

    .line 774
    .line 775
    iget-object v2, v0, Lj3/D;->h:Li4/s;

    .line 776
    .line 777
    iget-object v4, v4, Li4/w;->e:LF0/b;

    .line 778
    .line 779
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 783
    .line 784
    new-instance v4, Lj3/r;

    .line 785
    .line 786
    const/4 v5, 0x2

    .line 787
    invoke-direct {v4, v1, v5}, Lj3/r;-><init>(Lj3/l0;I)V

    .line 788
    .line 789
    .line 790
    move/from16 v5, v17

    .line 791
    .line 792
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 793
    .line 794
    .line 795
    :cond_1e
    if-nez v19, :cond_1f

    .line 796
    .line 797
    iget-object v2, v0, Lj3/D;->l0:Lj3/b0;

    .line 798
    .line 799
    iget-object v4, v0, Lj3/D;->l:Ll4/l;

    .line 800
    .line 801
    new-instance v5, Lj2/b;

    .line 802
    .line 803
    const/4 v6, 0x1

    .line 804
    invoke-direct {v5, v6, v2}, Lj2/b;-><init>(ILjava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    const/16 v2, 0xe

    .line 808
    .line 809
    invoke-virtual {v4, v2, v5}, Ll4/l;->c(ILl4/i;)V

    .line 810
    .line 811
    .line 812
    :cond_1f
    if-eqz v11, :cond_20

    .line 813
    .line 814
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 815
    .line 816
    new-instance v4, Lj3/r;

    .line 817
    .line 818
    const/4 v5, 0x3

    .line 819
    invoke-direct {v4, v1, v5}, Lj3/r;-><init>(Lj3/l0;I)V

    .line 820
    .line 821
    .line 822
    move/from16 v5, v16

    .line 823
    .line 824
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 825
    .line 826
    .line 827
    :cond_20
    if-nez v10, :cond_21

    .line 828
    .line 829
    if-eqz v20, :cond_22

    .line 830
    .line 831
    :cond_21
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 832
    .line 833
    new-instance v4, Lj3/r;

    .line 834
    .line 835
    const/4 v5, 0x4

    .line 836
    invoke-direct {v4, v1, v5}, Lj3/r;-><init>(Lj3/l0;I)V

    .line 837
    .line 838
    .line 839
    const/4 v7, -0x1

    .line 840
    invoke-virtual {v2, v7, v4}, Ll4/l;->c(ILl4/i;)V

    .line 841
    .line 842
    .line 843
    :cond_22
    if-eqz v10, :cond_23

    .line 844
    .line 845
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 846
    .line 847
    new-instance v4, Lj3/r;

    .line 848
    .line 849
    const/4 v5, 0x5

    .line 850
    invoke-direct {v4, v1, v5}, Lj3/r;-><init>(Lj3/l0;I)V

    .line 851
    .line 852
    .line 853
    const/4 v5, 0x4

    .line 854
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 855
    .line 856
    .line 857
    :cond_23
    if-eqz v20, :cond_24

    .line 858
    .line 859
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 860
    .line 861
    new-instance v4, Lj3/w;

    .line 862
    .line 863
    const/4 v5, 0x1

    .line 864
    move/from16 v6, p3

    .line 865
    .line 866
    invoke-direct {v4, v1, v6, v5}, Lj3/w;-><init>(Lj3/l0;II)V

    .line 867
    .line 868
    .line 869
    const/4 v5, 0x5

    .line 870
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 871
    .line 872
    .line 873
    :cond_24
    iget v2, v3, Lj3/l0;->m:I

    .line 874
    .line 875
    iget v4, v1, Lj3/l0;->m:I

    .line 876
    .line 877
    if-eq v2, v4, :cond_25

    .line 878
    .line 879
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 880
    .line 881
    new-instance v4, Lj3/r;

    .line 882
    .line 883
    const/4 v5, 0x6

    .line 884
    invoke-direct {v4, v1, v5}, Lj3/r;-><init>(Lj3/l0;I)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 888
    .line 889
    .line 890
    :cond_25
    invoke-static {v3}, Lj3/D;->w0(Lj3/l0;)Z

    .line 891
    .line 892
    .line 893
    move-result v2

    .line 894
    invoke-static {v1}, Lj3/D;->w0(Lj3/l0;)Z

    .line 895
    .line 896
    .line 897
    move-result v4

    .line 898
    if-eq v2, v4, :cond_26

    .line 899
    .line 900
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 901
    .line 902
    new-instance v4, Lj3/r;

    .line 903
    .line 904
    const/4 v5, 0x7

    .line 905
    invoke-direct {v4, v1, v5}, Lj3/r;-><init>(Lj3/l0;I)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 909
    .line 910
    .line 911
    :cond_26
    iget-object v2, v3, Lj3/l0;->n:Lj3/m0;

    .line 912
    .line 913
    iget-object v4, v1, Lj3/l0;->n:Lj3/m0;

    .line 914
    .line 915
    invoke-virtual {v2, v4}, Lj3/m0;->equals(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    move-result v2

    .line 919
    if-nez v2, :cond_27

    .line 920
    .line 921
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 922
    .line 923
    new-instance v4, Lj3/r;

    .line 924
    .line 925
    const/16 v5, 0x8

    .line 926
    .line 927
    invoke-direct {v4, v1, v5}, Lj3/r;-><init>(Lj3/l0;I)V

    .line 928
    .line 929
    .line 930
    const/16 v5, 0xc

    .line 931
    .line 932
    invoke-virtual {v2, v5, v4}, Ll4/l;->c(ILl4/i;)V

    .line 933
    .line 934
    .line 935
    :cond_27
    if-eqz p4, :cond_28

    .line 936
    .line 937
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 938
    .line 939
    new-instance v4, LX0/k;

    .line 940
    .line 941
    const/16 v5, 0x16

    .line 942
    .line 943
    invoke-direct {v4, v5}, LX0/k;-><init>(I)V

    .line 944
    .line 945
    .line 946
    const/4 v7, -0x1

    .line 947
    invoke-virtual {v2, v7, v4}, Ll4/l;->c(ILl4/i;)V

    .line 948
    .line 949
    .line 950
    :cond_28
    invoke-virtual {v0}, Lj3/D;->I0()V

    .line 951
    .line 952
    .line 953
    iget-object v2, v0, Lj3/D;->l:Ll4/l;

    .line 954
    .line 955
    invoke-virtual {v2}, Ll4/l;->b()V

    .line 956
    .line 957
    .line 958
    iget-boolean v2, v3, Lj3/l0;->o:Z

    .line 959
    .line 960
    iget-boolean v1, v1, Lj3/l0;->o:Z

    .line 961
    .line 962
    if-eq v2, v1, :cond_29

    .line 963
    .line 964
    iget-object v1, v0, Lj3/D;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 965
    .line 966
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 971
    .line 972
    .line 973
    move-result v2

    .line 974
    if-eqz v2, :cond_29

    .line 975
    .line 976
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    check-cast v2, Lj3/A;

    .line 981
    .line 982
    iget-object v2, v2, Lj3/A;->a:Lj3/D;

    .line 983
    .line 984
    invoke-virtual {v2}, Lj3/D;->L0()V

    .line 985
    .line 986
    .line 987
    goto :goto_11

    .line 988
    :cond_29
    return-void
.end method

.method public final L()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lj3/D;->Z:Z

    .line 5
    .line 6
    return v0
    .line 7
    .line 8
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

.method public final L0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lj3/D;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lj3/D;->D:Le0/c;

    .line 6
    .line 7
    iget-object v2, p0, Lj3/D;->C:Ld0/w;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eq v0, v3, :cond_2

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    const/4 v3, 0x4

    .line 19
    if-ne v0, v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 32
    .line 33
    iget-boolean v0, v0, Lj3/l0;->o:Z

    .line 34
    .line 35
    invoke-virtual {p0}, Lj3/D;->m()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lj3/D;->m()Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    return-void
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

.method public final M()Li4/v;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->h:Li4/s;

    .line 5
    .line 6
    check-cast v0, Li4/o;

    .line 7
    .line 8
    invoke-virtual {v0}, Li4/o;->d()Li4/h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
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

.method public final M0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lj3/D;->d:LH1/k;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    :try_start_0
    iget-boolean v2, v0, LH1/k;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_3

    .line 16
    :catch_0
    move v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    .line 26
    .line 27
    :cond_1
    monitor-exit v0

    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lj3/D;->s:Landroid/os/Looper;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eq v0, v1, :cond_4

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lj3/D;->s:Landroid/os/Looper;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget v2, Ll4/y;->a:I

    .line 59
    .line 60
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 61
    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v4, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 65
    .line 66
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, "\'\nExpected thread: \'"

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v0, "\'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread"

    .line 81
    .line 82
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-boolean v1, p0, Lj3/D;->A0:Z

    .line 90
    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    const-string v1, "ExoPlayerImpl"

    .line 94
    .line 95
    iget-boolean v2, p0, Lj3/D;->B0:Z

    .line 96
    .line 97
    if-eqz v2, :cond_2

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-static {v1, v0, v2}, Ll4/a;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 107
    .line 108
    .line 109
    iput-boolean v3, p0, Lj3/D;->B0:Z

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_4
    :goto_2
    return-void

    .line 119
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 120
    throw v1
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

.method public final N()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-wide v0, p0, Lj3/D;->H0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 18
    .line 19
    iget-object v1, v0, Lj3/l0;->k:LN3/A;

    .line 20
    .line 21
    iget-wide v1, v1, LN3/y;->d:J

    .line 22
    .line 23
    iget-object v3, v0, Lj3/l0;->b:LN3/A;

    .line 24
    .line 25
    iget-wide v3, v3, LN3/y;->d:J

    .line 26
    .line 27
    cmp-long v1, v1, v3

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 32
    .line 33
    invoke-virtual {p0}, Lj3/D;->z()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, LD/n;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lj3/D0;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2, v3, v4}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-wide v0, v0, Lj3/D0;->n:J

    .line 48
    .line 49
    invoke-static {v0, v1}, Ll4/y;->T(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    return-wide v0

    .line 54
    :cond_1
    iget-wide v0, v0, Lj3/l0;->p:J

    .line 55
    .line 56
    iget-object v2, p0, Lj3/D;->F0:Lj3/l0;

    .line 57
    .line 58
    iget-object v2, v2, Lj3/l0;->k:LN3/A;

    .line 59
    .line 60
    invoke-virtual {v2}, LN3/y;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 67
    .line 68
    iget-object v1, v0, Lj3/l0;->a:Lj3/E0;

    .line 69
    .line 70
    iget-object v0, v0, Lj3/l0;->k:LN3/A;

    .line 71
    .line 72
    iget-object v0, v0, LN3/y;->a:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v2, p0, Lj3/D;->n:Lj3/C0;

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v1, p0, Lj3/D;->F0:Lj3/l0;

    .line 81
    .line 82
    iget-object v1, v1, Lj3/l0;->k:LN3/A;

    .line 83
    .line 84
    iget v1, v1, LN3/y;->b:I

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lj3/C0;->d(I)J

    .line 87
    .line 88
    .line 89
    move-result-wide v1

    .line 90
    const-wide/high16 v3, -0x8000000000000000L

    .line 91
    .line 92
    cmp-long v3, v1, v3

    .line 93
    .line 94
    if-nez v3, :cond_2

    .line 95
    .line 96
    iget-wide v0, v0, Lj3/C0;->d:J

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    move-wide v0, v1

    .line 100
    :cond_3
    :goto_0
    iget-object v2, p0, Lj3/D;->F0:Lj3/l0;

    .line 101
    .line 102
    iget-object v3, v2, Lj3/l0;->a:Lj3/E0;

    .line 103
    .line 104
    iget-object v2, v2, Lj3/l0;->k:LN3/A;

    .line 105
    .line 106
    iget-object v2, v2, LN3/y;->a:Ljava/lang/Object;

    .line 107
    .line 108
    iget-object v4, p0, Lj3/D;->n:Lj3/C0;

    .line 109
    .line 110
    invoke-virtual {v3, v2, v4}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 111
    .line 112
    .line 113
    iget-wide v2, v4, Lj3/C0;->e:J

    .line 114
    .line 115
    add-long/2addr v0, v2

    .line 116
    invoke-static {v0, v1}, Ll4/y;->T(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    return-wide v0
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

.method public final O(Landroid/view/TextureView;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lj3/D;->n0()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Lj3/D;->B0()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lj3/D;->s0:Landroid/view/TextureView;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v0, "ExoPlayerImpl"

    .line 22
    .line 23
    const-string v1, "Replacing existing SurfaceTextureListener."

    .line 24
    .line 25
    invoke-static {v0, v1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lj3/D;->x:Lj3/A;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object v0, v1

    .line 46
    :goto_0
    if-nez v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lj3/D;->G0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-virtual {p0, p1, p1}, Lj3/D;->z0(II)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    new-instance v1, Landroid/view/Surface;

    .line 57
    .line 58
    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lj3/D;->G0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Lj3/D;->o0:Landroid/view/Surface;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p0, v0, p1}, Lj3/D;->z0(II)V

    .line 75
    .line 76
    .line 77
    return-void
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

.method public final P(Li4/v;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->h:Li4/s;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    check-cast v0, Li4/o;

    .line 10
    .line 11
    invoke-virtual {v0}, Li4/o;->d()Li4/h;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1, v1}, Li4/v;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v1, p1, Li4/h;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    check-cast v1, Li4/h;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Li4/o;->i(Li4/h;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    new-instance v1, Li4/g;

    .line 33
    .line 34
    invoke-virtual {v0}, Li4/o;->d()Li4/h;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v1, v2}, Li4/g;-><init>(Li4/h;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Li4/u;->c(Li4/v;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Li4/h;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Li4/h;-><init>(Li4/g;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Li4/o;->i(Li4/h;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lj2/b;

    .line 53
    .line 54
    const/4 v1, 0x2

    .line 55
    invoke-direct {v0, v1, p1}, Lj2/b;-><init>(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lj3/D;->l:Ll4/l;

    .line 59
    .line 60
    const/16 v1, 0x13

    .line 61
    .line 62
    invoke-virtual {p1, v1, v0}, Ll4/l;->e(ILl4/i;)V

    .line 63
    .line 64
    .line 65
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
.end method

.method public final Q(JI)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p3, p1, p2, v0}, Lj3/D;->C0(IJZ)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public final R()Lj3/b0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->l0:Lj3/b0;

    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
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

.method public final T()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lj3/D;->t0(Lj3/l0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Ll4/y;->T(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
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

.method public final U()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lj3/D;->u:J

    .line 5
    .line 6
    return-wide v0
    .line 7
    .line 8
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

.method public final a(Lj3/m0;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget-object v0, v0, Lj3/l0;->n:Lj3/m0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lj3/m0;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lj3/l0;->e(Lj3/m0;)Lj3/l0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v0, p0, Lj3/D;->f0:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iput v0, p0, Lj3/D;->f0:I

    .line 26
    .line 27
    iget-object v0, p0, Lj3/D;->k:Lj3/J;

    .line 28
    .line 29
    iget-object v0, v0, Lj3/J;->h:Ll4/w;

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-virtual {v0, v1, p1}, Ll4/w;->a(ILjava/lang/Object;)Ll4/v;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ll4/v;->b()V

    .line 37
    .line 38
    .line 39
    const/4 v7, 0x5

    .line 40
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x1

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v10, -0x1

    .line 50
    const/4 v11, 0x0

    .line 51
    move-object v1, p0

    .line 52
    invoke-virtual/range {v1 .. v11}, Lj3/D;->K0(Lj3/l0;IIZZIJIZ)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public final b()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj3/D;->m()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lj3/D;->A:Lj3/c;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {v1, v2, v0}, Lj3/c;->c(IZ)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    if-eq v1, v3, :cond_0

    .line 19
    .line 20
    move v4, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v4, v3

    .line 23
    :goto_0
    invoke-virtual {p0, v1, v4, v0}, Lj3/D;->J0(IIZ)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 27
    .line 28
    iget v1, v0, Lj3/l0;->e:I

    .line 29
    .line 30
    if-eq v1, v3, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Lj3/l0;->d(Lj3/m;)Lj3/l0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, v0, Lj3/l0;->a:Lj3/E0;

    .line 39
    .line 40
    invoke-virtual {v1}, Lj3/E0;->p()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    :cond_2
    invoke-virtual {v0, v2}, Lj3/l0;->f(I)Lj3/l0;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget v0, p0, Lj3/D;->f0:I

    .line 52
    .line 53
    add-int/2addr v0, v3

    .line 54
    iput v0, p0, Lj3/D;->f0:I

    .line 55
    .line 56
    iget-object v0, p0, Lj3/D;->k:Lj3/J;

    .line 57
    .line 58
    iget-object v0, v0, Lj3/J;->h:Ll4/w;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Ll4/w;->b()Ll4/v;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v0, v0, Ll4/w;->a:Landroid/os/Handler;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, v1, Ll4/v;->a:Landroid/os/Message;

    .line 75
    .line 76
    invoke-virtual {v1}, Ll4/v;->b()V

    .line 77
    .line 78
    .line 79
    const/4 v10, 0x5

    .line 80
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    const/4 v6, 0x1

    .line 86
    const/4 v7, 0x1

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v13, -0x1

    .line 90
    const/4 v14, 0x0

    .line 91
    move-object v4, p0

    .line 92
    invoke-virtual/range {v4 .. v14}, Lj3/D;->K0(Lj3/l0;IIZZIJIZ)V

    .line 93
    .line 94
    .line 95
    return-void
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

.method public final c()Lj3/m0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget-object v0, v0, Lj3/l0;->n:Lj3/m0;

    .line 7
    .line 8
    return-object v0
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

.method public final d()Lj3/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget-object v0, v0, Lj3/l0;->f:Lj3/m;

    .line 7
    .line 8
    return-object v0
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

.method public final e()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget v0, v0, Lj3/l0;->e:I

    .line 7
    .line 8
    return v0
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

.method public final f(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->A:Lj3/c;

    .line 5
    .line 6
    invoke-virtual {p0}, Lj3/D;->e()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1, p1}, Lj3/c;->c(IZ)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    :cond_0
    invoke-virtual {p0, v0, v1, p1}, Lj3/D;->J0(IIZ)V

    .line 21
    .line 22
    .line 23
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

.method public final g()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 7
    .line 8
    invoke-virtual {v0}, LN3/y;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
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

.method public final h(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lj3/D;->Y:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lj3/D;->Y:I

    .line 9
    .line 10
    iget-object v0, p0, Lj3/D;->k:Lj3/J;

    .line 11
    .line 12
    iget-object v0, v0, Lj3/J;->h:Ll4/w;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ll4/w;->b()Ll4/v;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, Ll4/w;->a:Landroid/os/Handler;

    .line 22
    .line 23
    const/16 v2, 0xb

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, Ll4/v;->a:Landroid/os/Message;

    .line 31
    .line 32
    invoke-virtual {v1}, Ll4/v;->b()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lj3/t;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p1, v1}, Lj3/t;-><init>(II)V

    .line 39
    .line 40
    .line 41
    const/16 p1, 0x8

    .line 42
    .line 43
    iget-object v1, p0, Lj3/D;->l:Ll4/l;

    .line 44
    .line 45
    invoke-virtual {v1, p1, v0}, Ll4/l;->c(ILl4/i;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lj3/D;->I0()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ll4/l;->b()V

    .line 52
    .line 53
    .line 54
    :cond_0
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

.method public final h0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj3/D;->z()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-virtual {p0, v0, v1, v2, v3}, Lj3/D;->C0(IJZ)V

    .line 15
    .line 16
    .line 17
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
.end method

.method public final i()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lj3/D;->v:J

    .line 5
    .line 6
    return-wide v0
    .line 7
    .line 8
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

.method public final j()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lj3/D;->Y:I

    .line 5
    .line 6
    return v0
    .line 7
    .line 8
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

.method public final k()J
    .locals 7

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj3/D;->g()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 11
    .line 12
    iget-object v1, v0, Lj3/l0;->a:Lj3/E0;

    .line 13
    .line 14
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 15
    .line 16
    iget-object v0, v0, LN3/y;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v2, p0, Lj3/D;->n:Lj3/C0;

    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 24
    .line 25
    iget-wide v3, v0, Lj3/l0;->c:J

    .line 26
    .line 27
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v1, v3, v5

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 37
    .line 38
    invoke-virtual {p0}, Lj3/D;->z()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    iget-object v4, p0, LD/n;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Lj3/D0;

    .line 47
    .line 48
    invoke-virtual {v0, v1, v4, v2, v3}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-wide v0, v0, Lj3/D0;->m:J

    .line 53
    .line 54
    invoke-static {v0, v1}, Ll4/y;->T(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    return-wide v0

    .line 59
    :cond_0
    iget-wide v0, v2, Lj3/C0;->e:J

    .line 60
    .line 61
    invoke-static {v0, v1}, Ll4/y;->T(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    iget-object v2, p0, Lj3/D;->F0:Lj3/l0;

    .line 66
    .line 67
    iget-wide v2, v2, Lj3/l0;->c:J

    .line 68
    .line 69
    invoke-static {v2, v3}, Ll4/y;->T(J)J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    add-long/2addr v2, v0

    .line 74
    return-wide v2

    .line 75
    :cond_1
    invoke-virtual {p0}, Lj3/D;->T()J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    return-wide v0
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

.method public final l()Lj3/n0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->k0:Lj3/n0;

    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
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

.method public final m()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget-boolean v0, v0, Lj3/l0;->l:Z

    .line 7
    .line 8
    return v0
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

.method public final m0()Lj3/b0;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lj3/D;->I()Lj3/E0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lj3/D;->E0:Lj3/b0;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lj3/D;->z()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    iget-object v4, p0, LD/n;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Lj3/D0;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v4, v2, v3}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, Lj3/D0;->c:Lj3/Y;

    .line 29
    .line 30
    iget-object v1, p0, Lj3/D;->E0:Lj3/b0;

    .line 31
    .line 32
    invoke-virtual {v1}, Lj3/b0;->a()Lj3/a0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v0, v0, Lj3/Y;->d:Lj3/b0;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    iget-object v2, v0, Lj3/b0;->a:Ljava/lang/CharSequence;

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    iput-object v2, v1, Lj3/a0;->a:Ljava/lang/CharSequence;

    .line 47
    .line 48
    :cond_2
    iget-object v2, v0, Lj3/b0;->b:Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iput-object v2, v1, Lj3/a0;->b:Ljava/lang/CharSequence;

    .line 53
    .line 54
    :cond_3
    iget-object v2, v0, Lj3/b0;->c:Ljava/lang/CharSequence;

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    iput-object v2, v1, Lj3/a0;->c:Ljava/lang/CharSequence;

    .line 59
    .line 60
    :cond_4
    iget-object v2, v0, Lj3/b0;->d:Ljava/lang/CharSequence;

    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    iput-object v2, v1, Lj3/a0;->d:Ljava/lang/CharSequence;

    .line 65
    .line 66
    :cond_5
    iget-object v2, v0, Lj3/b0;->e:Ljava/lang/CharSequence;

    .line 67
    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    iput-object v2, v1, Lj3/a0;->e:Ljava/lang/CharSequence;

    .line 71
    .line 72
    :cond_6
    iget-object v2, v0, Lj3/b0;->f:Ljava/lang/CharSequence;

    .line 73
    .line 74
    if-eqz v2, :cond_7

    .line 75
    .line 76
    iput-object v2, v1, Lj3/a0;->f:Ljava/lang/CharSequence;

    .line 77
    .line 78
    :cond_7
    iget-object v2, v0, Lj3/b0;->g:Ljava/lang/CharSequence;

    .line 79
    .line 80
    if-eqz v2, :cond_8

    .line 81
    .line 82
    iput-object v2, v1, Lj3/a0;->g:Ljava/lang/CharSequence;

    .line 83
    .line 84
    :cond_8
    iget-object v2, v0, Lj3/b0;->h:Lj3/v0;

    .line 85
    .line 86
    if-eqz v2, :cond_9

    .line 87
    .line 88
    iput-object v2, v1, Lj3/a0;->h:Lj3/v0;

    .line 89
    .line 90
    :cond_9
    iget-object v2, v0, Lj3/b0;->i:Lj3/v0;

    .line 91
    .line 92
    if-eqz v2, :cond_a

    .line 93
    .line 94
    iput-object v2, v1, Lj3/a0;->i:Lj3/v0;

    .line 95
    .line 96
    :cond_a
    iget-object v2, v0, Lj3/b0;->j:[B

    .line 97
    .line 98
    if-eqz v2, :cond_b

    .line 99
    .line 100
    invoke-virtual {v2}, [B->clone()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, [B

    .line 105
    .line 106
    iput-object v2, v1, Lj3/a0;->j:[B

    .line 107
    .line 108
    iget-object v2, v0, Lj3/b0;->k:Ljava/lang/Integer;

    .line 109
    .line 110
    iput-object v2, v1, Lj3/a0;->k:Ljava/lang/Integer;

    .line 111
    .line 112
    :cond_b
    iget-object v2, v0, Lj3/b0;->l:Landroid/net/Uri;

    .line 113
    .line 114
    if-eqz v2, :cond_c

    .line 115
    .line 116
    iput-object v2, v1, Lj3/a0;->l:Landroid/net/Uri;

    .line 117
    .line 118
    :cond_c
    iget-object v2, v0, Lj3/b0;->m:Ljava/lang/Integer;

    .line 119
    .line 120
    if-eqz v2, :cond_d

    .line 121
    .line 122
    iput-object v2, v1, Lj3/a0;->m:Ljava/lang/Integer;

    .line 123
    .line 124
    :cond_d
    iget-object v2, v0, Lj3/b0;->n:Ljava/lang/Integer;

    .line 125
    .line 126
    if-eqz v2, :cond_e

    .line 127
    .line 128
    iput-object v2, v1, Lj3/a0;->n:Ljava/lang/Integer;

    .line 129
    .line 130
    :cond_e
    iget-object v2, v0, Lj3/b0;->o:Ljava/lang/Integer;

    .line 131
    .line 132
    if-eqz v2, :cond_f

    .line 133
    .line 134
    iput-object v2, v1, Lj3/a0;->o:Ljava/lang/Integer;

    .line 135
    .line 136
    :cond_f
    iget-object v2, v0, Lj3/b0;->p:Ljava/lang/Boolean;

    .line 137
    .line 138
    if-eqz v2, :cond_10

    .line 139
    .line 140
    iput-object v2, v1, Lj3/a0;->p:Ljava/lang/Boolean;

    .line 141
    .line 142
    :cond_10
    iget-object v2, v0, Lj3/b0;->q:Ljava/lang/Integer;

    .line 143
    .line 144
    if-eqz v2, :cond_11

    .line 145
    .line 146
    iput-object v2, v1, Lj3/a0;->q:Ljava/lang/Integer;

    .line 147
    .line 148
    :cond_11
    iget-object v2, v0, Lj3/b0;->r:Ljava/lang/Integer;

    .line 149
    .line 150
    if-eqz v2, :cond_12

    .line 151
    .line 152
    iput-object v2, v1, Lj3/a0;->q:Ljava/lang/Integer;

    .line 153
    .line 154
    :cond_12
    iget-object v2, v0, Lj3/b0;->s:Ljava/lang/Integer;

    .line 155
    .line 156
    if-eqz v2, :cond_13

    .line 157
    .line 158
    iput-object v2, v1, Lj3/a0;->r:Ljava/lang/Integer;

    .line 159
    .line 160
    :cond_13
    iget-object v2, v0, Lj3/b0;->t:Ljava/lang/Integer;

    .line 161
    .line 162
    if-eqz v2, :cond_14

    .line 163
    .line 164
    iput-object v2, v1, Lj3/a0;->s:Ljava/lang/Integer;

    .line 165
    .line 166
    :cond_14
    iget-object v2, v0, Lj3/b0;->u:Ljava/lang/Integer;

    .line 167
    .line 168
    if-eqz v2, :cond_15

    .line 169
    .line 170
    iput-object v2, v1, Lj3/a0;->t:Ljava/lang/Integer;

    .line 171
    .line 172
    :cond_15
    iget-object v2, v0, Lj3/b0;->v:Ljava/lang/Integer;

    .line 173
    .line 174
    if-eqz v2, :cond_16

    .line 175
    .line 176
    iput-object v2, v1, Lj3/a0;->u:Ljava/lang/Integer;

    .line 177
    .line 178
    :cond_16
    iget-object v2, v0, Lj3/b0;->w:Ljava/lang/Integer;

    .line 179
    .line 180
    if-eqz v2, :cond_17

    .line 181
    .line 182
    iput-object v2, v1, Lj3/a0;->v:Ljava/lang/Integer;

    .line 183
    .line 184
    :cond_17
    iget-object v2, v0, Lj3/b0;->x:Ljava/lang/CharSequence;

    .line 185
    .line 186
    if-eqz v2, :cond_18

    .line 187
    .line 188
    iput-object v2, v1, Lj3/a0;->w:Ljava/lang/CharSequence;

    .line 189
    .line 190
    :cond_18
    iget-object v2, v0, Lj3/b0;->y:Ljava/lang/CharSequence;

    .line 191
    .line 192
    if-eqz v2, :cond_19

    .line 193
    .line 194
    iput-object v2, v1, Lj3/a0;->x:Ljava/lang/CharSequence;

    .line 195
    .line 196
    :cond_19
    iget-object v2, v0, Lj3/b0;->z:Ljava/lang/CharSequence;

    .line 197
    .line 198
    if-eqz v2, :cond_1a

    .line 199
    .line 200
    iput-object v2, v1, Lj3/a0;->y:Ljava/lang/CharSequence;

    .line 201
    .line 202
    :cond_1a
    iget-object v2, v0, Lj3/b0;->A:Ljava/lang/Integer;

    .line 203
    .line 204
    if-eqz v2, :cond_1b

    .line 205
    .line 206
    iput-object v2, v1, Lj3/a0;->z:Ljava/lang/Integer;

    .line 207
    .line 208
    :cond_1b
    iget-object v2, v0, Lj3/b0;->B:Ljava/lang/Integer;

    .line 209
    .line 210
    if-eqz v2, :cond_1c

    .line 211
    .line 212
    iput-object v2, v1, Lj3/a0;->A:Ljava/lang/Integer;

    .line 213
    .line 214
    :cond_1c
    iget-object v2, v0, Lj3/b0;->C:Ljava/lang/CharSequence;

    .line 215
    .line 216
    if-eqz v2, :cond_1d

    .line 217
    .line 218
    iput-object v2, v1, Lj3/a0;->B:Ljava/lang/CharSequence;

    .line 219
    .line 220
    :cond_1d
    iget-object v2, v0, Lj3/b0;->D:Ljava/lang/CharSequence;

    .line 221
    .line 222
    if-eqz v2, :cond_1e

    .line 223
    .line 224
    iput-object v2, v1, Lj3/a0;->C:Ljava/lang/CharSequence;

    .line 225
    .line 226
    :cond_1e
    iget-object v2, v0, Lj3/b0;->X:Ljava/lang/CharSequence;

    .line 227
    .line 228
    if-eqz v2, :cond_1f

    .line 229
    .line 230
    iput-object v2, v1, Lj3/a0;->D:Ljava/lang/CharSequence;

    .line 231
    .line 232
    :cond_1f
    iget-object v0, v0, Lj3/b0;->Y:Landroid/os/Bundle;

    .line 233
    .line 234
    if-eqz v0, :cond_20

    .line 235
    .line 236
    iput-object v0, v1, Lj3/a0;->E:Landroid/os/Bundle;

    .line 237
    .line 238
    :cond_20
    :goto_0
    new-instance v0, Lj3/b0;

    .line 239
    .line 240
    invoke-direct {v0, v1}, Lj3/b0;-><init>(Lj3/a0;)V

    .line 241
    .line 242
    .line 243
    return-object v0
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

.method public final n(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lj3/D;->Z:Z

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-boolean p1, p0, Lj3/D;->Z:Z

    .line 9
    .line 10
    iget-object v0, p0, Lj3/D;->k:Lj3/J;

    .line 11
    .line 12
    iget-object v0, v0, Lj3/J;->h:Ll4/w;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ll4/w;->b()Ll4/v;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, Ll4/w;->a:Landroid/os/Handler;

    .line 22
    .line 23
    const/16 v2, 0xc

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, Ll4/v;->a:Landroid/os/Message;

    .line 31
    .line 32
    invoke-virtual {v1}, Ll4/v;->b()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lj3/v;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, v1, p1}, Lj3/v;-><init>(IZ)V

    .line 39
    .line 40
    .line 41
    const/16 p1, 0x9

    .line 42
    .line 43
    iget-object v1, p0, Lj3/D;->l:Ll4/l;

    .line 44
    .line 45
    invoke-virtual {v1, p1, v0}, Ll4/l;->c(ILl4/i;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lj3/D;->I0()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ll4/l;->b()V

    .line 52
    .line 53
    .line 54
    :cond_0
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

.method public final n0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj3/D;->B0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lj3/D;->G0(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0, v0}, Lj3/D;->z0(II)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final p0(LP5/S;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget v2, p1, LP5/S;->d:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, LP5/S;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lj3/Y;

    .line 16
    .line 17
    iget-object v3, p0, Lj3/D;->q:LN3/z;

    .line 18
    .line 19
    invoke-interface {v3, v2}, LN3/z;->b(Lj3/Y;)LN3/a;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object v0
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

.method public final q()Lj3/G0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget-object v0, v0, Lj3/l0;->i:Li4/w;

    .line 7
    .line 8
    iget-object v0, v0, Li4/w;->d:Lj3/G0;

    .line 9
    .line 10
    return-object v0
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

.method public final q0(Lj3/s0;)Lj3/t0;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lj3/D;->u0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Lj3/t0;

    .line 6
    .line 7
    iget-object v2, p0, Lj3/D;->F0:Lj3/l0;

    .line 8
    .line 9
    iget-object v4, v2, Lj3/l0;->a:Lj3/E0;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    move v5, v0

    .line 16
    iget-object v2, p0, Lj3/D;->k:Lj3/J;

    .line 17
    .line 18
    iget-object v7, v2, Lj3/J;->j:Landroid/os/Looper;

    .line 19
    .line 20
    iget-object v6, p0, Lj3/D;->w:Ll4/u;

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    invoke-direct/range {v1 .. v7}, Lj3/t0;-><init>(Lj3/J;Lj3/s0;Lj3/E0;ILl4/u;Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    return-object v1
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

.method public final r()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final r0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj3/D;->g()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 11
    .line 12
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 13
    .line 14
    iget v0, v0, LN3/y;->b:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
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

.method public final s()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lj3/D;->M0()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lj3/D;->o:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const v2, 0x7fffffff

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, v0, Lj3/D;->o:Ljava/util/ArrayList;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-ltz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-gt v1, v5, :cond_0

    .line 29
    .line 30
    move v5, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v5, 0x0

    .line 33
    :goto_0
    invoke-static {v5}, Ll4/a;->h(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lj3/D;->z()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-virtual {v0}, Lj3/D;->I()Lj3/E0;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v13

    .line 48
    iget v7, v0, Lj3/D;->f0:I

    .line 49
    .line 50
    add-int/2addr v7, v4

    .line 51
    iput v7, v0, Lj3/D;->f0:I

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lj3/D;->A0(I)V

    .line 54
    .line 55
    .line 56
    new-instance v12, Lj3/u0;

    .line 57
    .line 58
    iget-object v7, v0, Lj3/D;->j0:LN3/g0;

    .line 59
    .line 60
    invoke-direct {v12, v2, v7}, Lj3/u0;-><init>(Ljava/util/ArrayList;LN3/g0;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, Lj3/D;->F0:Lj3/l0;

    .line 64
    .line 65
    invoke-virtual {v0}, Lj3/D;->k()J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    invoke-virtual {v6}, Lj3/E0;->p()Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    const/4 v10, -0x1

    .line 79
    if-nez v9, :cond_1

    .line 80
    .line 81
    invoke-virtual {v12}, Lj3/E0;->p()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_2

    .line 86
    .line 87
    :cond_1
    move v3, v10

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    invoke-virtual {v0}, Lj3/D;->z()I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    move/from16 v16, v10

    .line 94
    .line 95
    invoke-static {v7, v8}, Ll4/y;->H(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v10

    .line 99
    iget-object v7, v0, LD/n;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Lj3/D0;

    .line 102
    .line 103
    iget-object v8, v0, Lj3/D;->n:Lj3/C0;

    .line 104
    .line 105
    move/from16 v3, v16

    .line 106
    .line 107
    invoke-virtual/range {v6 .. v11}, Lj3/E0;->i(Lj3/D0;Lj3/C0;IJ)Landroid/util/Pair;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    iget-object v10, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-virtual {v12, v10}, Lj3/u0;->b(Ljava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-eq v8, v3, :cond_3

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_3
    iget v8, v0, Lj3/D;->Y:I

    .line 121
    .line 122
    iget-boolean v9, v0, Lj3/D;->Z:Z

    .line 123
    .line 124
    iget-object v7, v0, LD/n;->a:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v7, Lj3/D0;

    .line 127
    .line 128
    move-object v11, v6

    .line 129
    move-object v6, v7

    .line 130
    iget-object v7, v0, Lj3/D;->n:Lj3/C0;

    .line 131
    .line 132
    invoke-static/range {v6 .. v12}, Lj3/J;->G(Lj3/D0;Lj3/C0;IZLjava/lang/Object;Lj3/E0;Lj3/E0;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    if-eqz v6, :cond_4

    .line 137
    .line 138
    iget-object v3, v0, Lj3/D;->n:Lj3/C0;

    .line 139
    .line 140
    invoke-virtual {v12, v6, v3}, Lj3/u0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 141
    .line 142
    .line 143
    iget v3, v3, Lj3/C0;->c:I

    .line 144
    .line 145
    const-wide/16 v6, 0x0

    .line 146
    .line 147
    iget-object v8, v0, LD/n;->a:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v8, Lj3/D0;

    .line 150
    .line 151
    invoke-virtual {v12, v3, v8, v6, v7}, Lj3/u0;->m(ILj3/D0;J)Lj3/D0;

    .line 152
    .line 153
    .line 154
    iget-wide v6, v8, Lj3/D0;->m:J

    .line 155
    .line 156
    invoke-static {v6, v7}, Ll4/y;->T(J)J

    .line 157
    .line 158
    .line 159
    move-result-wide v6

    .line 160
    invoke-virtual {v0, v12, v3, v6, v7}, Lj3/D;->y0(Lj3/E0;IJ)Landroid/util/Pair;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    goto :goto_4

    .line 165
    :cond_4
    invoke-virtual {v0, v12, v3, v14, v15}, Lj3/D;->y0(Lj3/E0;IJ)Landroid/util/Pair;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    goto :goto_4

    .line 170
    :goto_1
    invoke-virtual {v6}, Lj3/E0;->p()Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-nez v6, :cond_5

    .line 175
    .line 176
    invoke-virtual {v12}, Lj3/E0;->p()Z

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-eqz v6, :cond_5

    .line 181
    .line 182
    move v6, v4

    .line 183
    goto :goto_2

    .line 184
    :cond_5
    const/4 v6, 0x0

    .line 185
    :goto_2
    if-eqz v6, :cond_6

    .line 186
    .line 187
    move v10, v3

    .line 188
    goto :goto_3

    .line 189
    :cond_6
    invoke-virtual {v0}, Lj3/D;->u0()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    :goto_3
    if-eqz v6, :cond_7

    .line 194
    .line 195
    move-wide v7, v14

    .line 196
    :cond_7
    invoke-virtual {v0, v12, v10, v7, v8}, Lj3/D;->y0(Lj3/E0;IJ)Landroid/util/Pair;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    :goto_4
    invoke-virtual {v0, v2, v12, v7}, Lj3/D;->x0(Lj3/l0;Lj3/E0;Landroid/util/Pair;)Lj3/l0;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    iget v3, v2, Lj3/l0;->e:I

    .line 205
    .line 206
    if-eq v3, v4, :cond_8

    .line 207
    .line 208
    const/4 v4, 0x4

    .line 209
    if-eq v3, v4, :cond_8

    .line 210
    .line 211
    if-lez v1, :cond_8

    .line 212
    .line 213
    if-ne v1, v13, :cond_8

    .line 214
    .line 215
    iget-object v3, v2, Lj3/l0;->a:Lj3/E0;

    .line 216
    .line 217
    invoke-virtual {v3}, Lj3/E0;->o()I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-lt v5, v3, :cond_8

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Lj3/l0;->f(I)Lj3/l0;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    :cond_8
    iget-object v3, v0, Lj3/D;->j0:LN3/g0;

    .line 228
    .line 229
    iget-object v4, v0, Lj3/D;->k:Lj3/J;

    .line 230
    .line 231
    iget-object v4, v4, Lj3/J;->h:Ll4/w;

    .line 232
    .line 233
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {}, Ll4/w;->b()Ll4/v;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    iget-object v4, v4, Ll4/w;->a:Landroid/os/Handler;

    .line 241
    .line 242
    const/16 v6, 0x14

    .line 243
    .line 244
    const/4 v7, 0x0

    .line 245
    invoke-virtual {v4, v6, v7, v1, v3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    iput-object v1, v5, Ll4/v;->a:Landroid/os/Message;

    .line 250
    .line 251
    invoke-virtual {v5}, Ll4/v;->b()V

    .line 252
    .line 253
    .line 254
    iget-object v1, v2, Lj3/l0;->b:LN3/A;

    .line 255
    .line 256
    iget-object v1, v1, LN3/y;->a:Ljava/lang/Object;

    .line 257
    .line 258
    iget-object v3, v0, Lj3/D;->F0:Lj3/l0;

    .line 259
    .line 260
    iget-object v3, v3, Lj3/l0;->b:LN3/A;

    .line 261
    .line 262
    iget-object v3, v3, LN3/y;->a:Ljava/lang/Object;

    .line 263
    .line 264
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    xor-int/lit8 v5, v1, 0x1

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Lj3/D;->t0(Lj3/l0;)J

    .line 271
    .line 272
    .line 273
    move-result-wide v7

    .line 274
    const/4 v4, 0x0

    .line 275
    const/4 v6, 0x4

    .line 276
    move-object v1, v2

    .line 277
    const/4 v2, 0x0

    .line 278
    const/4 v3, 0x1

    .line 279
    const/4 v9, -0x1

    .line 280
    const/4 v10, 0x0

    .line 281
    invoke-virtual/range {v0 .. v10}, Lj3/D;->K0(Lj3/l0;IIZZIJIZ)V

    .line 282
    .line 283
    .line 284
    return-void
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

.method public final s0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj3/D;->g()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 11
    .line 12
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 13
    .line 14
    iget v0, v0, LN3/y;->c:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
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

.method public final stop()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lj3/D;->A:Lj3/c;

    .line 8
    .line 9
    invoke-virtual {p0}, Lj3/D;->m()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v0, v2, v1}, Lj3/c;->c(IZ)I

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Lj3/D;->H0(Lj3/m;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, LY3/c;

    .line 22
    .line 23
    sget-object v1, LP5/S;->e:LP5/S;

    .line 24
    .line 25
    iget-object v2, p0, Lj3/D;->F0:Lj3/l0;

    .line 26
    .line 27
    iget-wide v2, v2, Lj3/l0;->r:J

    .line 28
    .line 29
    invoke-direct {v0, v2, v3, v1}, LY3/c;-><init>(JLjava/util/List;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lj3/D;->z0:LY3/c;

    .line 33
    .line 34
    return-void
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

.method public final t()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 5
    .line 6
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 17
    .line 18
    iget-object v1, v0, Lj3/l0;->a:Lj3/E0;

    .line 19
    .line 20
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 21
    .line 22
    iget-object v0, v0, LN3/y;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final t0(Lj3/l0;)J
    .locals 4

    .line 1
    iget-object v0, p1, Lj3/l0;->a:Lj3/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lj3/D;->H0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Ll4/y;->H(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-object v0, p1, Lj3/l0;->b:LN3/A;

    .line 17
    .line 18
    invoke-virtual {v0}, LN3/y;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-wide v0, p1, Lj3/l0;->r:J

    .line 25
    .line 26
    return-wide v0

    .line 27
    :cond_1
    iget-object v0, p1, Lj3/l0;->a:Lj3/E0;

    .line 28
    .line 29
    iget-object v1, p1, Lj3/l0;->b:LN3/A;

    .line 30
    .line 31
    iget-wide v2, p1, Lj3/l0;->r:J

    .line 32
    .line 33
    iget-object p1, v1, LN3/y;->a:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v1, p0, Lj3/D;->n:Lj3/C0;

    .line 36
    .line 37
    invoke-virtual {v0, p1, v1}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 38
    .line 39
    .line 40
    iget-wide v0, v1, Lj3/C0;->e:J

    .line 41
    .line 42
    add-long/2addr v2, v0

    .line 43
    return-wide v2
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

.method public final u()LY3/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->z0:LY3/c;

    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
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

.method public final u0()I
    .locals 3

    .line 1
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 2
    .line 3
    iget-object v0, v0, Lj3/l0;->a:Lj3/E0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lj3/E0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lj3/D;->G0:I

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lj3/D;->F0:Lj3/l0;

    .line 15
    .line 16
    iget-object v1, v0, Lj3/l0;->a:Lj3/E0;

    .line 17
    .line 18
    iget-object v0, v0, Lj3/l0;->b:LN3/A;

    .line 19
    .line 20
    iget-object v0, v0, LN3/y;->a:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v2, p0, Lj3/D;->n:Lj3/C0;

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v0, v0, Lj3/C0;->c:I

    .line 29
    .line 30
    return v0
    .line 31
    .line 32
.end method

.method public final v(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lj3/D;->s0:Landroid/view/TextureView;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lj3/D;->n0()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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

.method public final w()Lm4/v;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->D0:Lm4/v;

    .line 5
    .line 6
    return-object v0
    .line 7
    .line 8
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

.method public final x(Lj3/p0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->l:Ll4/l;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ll4/l;->d(Lj3/p0;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public final x0(Lj3/l0;Lj3/E0;Landroid/util/Pair;)Lj3/l0;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Lj3/E0;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v4

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v3, v5

    .line 21
    :goto_1
    invoke-static {v3}, Ll4/a;->h(Z)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    iget-object v6, v3, Lj3/l0;->a:Lj3/E0;

    .line 27
    .line 28
    invoke-virtual/range {p1 .. p2}, Lj3/l0;->g(Lj3/E0;)Lj3/l0;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v1}, Lj3/E0;->p()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    sget-object v8, Lj3/l0;->s:LN3/A;

    .line 39
    .line 40
    iget-wide v1, v0, Lj3/D;->H0:J

    .line 41
    .line 42
    invoke-static {v1, v2}, Ll4/y;->H(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    sget-object v17, LN3/n0;->d:LN3/n0;

    .line 47
    .line 48
    iget-object v1, v0, Lj3/D;->b:Li4/w;

    .line 49
    .line 50
    sget-object v19, LP5/S;->e:LP5/S;

    .line 51
    .line 52
    const-wide/16 v15, 0x0

    .line 53
    .line 54
    move-wide v11, v9

    .line 55
    move-wide v13, v9

    .line 56
    move-object/from16 v18, v1

    .line 57
    .line 58
    invoke-virtual/range {v7 .. v19}, Lj3/l0;->b(LN3/A;JJJJLN3/n0;Li4/w;Ljava/util/List;)Lj3/l0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v8}, Lj3/l0;->a(LN3/A;)Lj3/l0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-wide v2, v1, Lj3/l0;->r:J

    .line 67
    .line 68
    iput-wide v2, v1, Lj3/l0;->p:J

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_2
    iget-object v3, v7, Lj3/l0;->b:LN3/A;

    .line 72
    .line 73
    iget-object v3, v3, LN3/y;->a:Ljava/lang/Object;

    .line 74
    .line 75
    sget v8, Ll4/y;->a:I

    .line 76
    .line 77
    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-nez v8, :cond_3

    .line 84
    .line 85
    new-instance v9, LN3/A;

    .line 86
    .line 87
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-direct {v9, v10}, LN3/A;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    iget-object v9, v7, Lj3/l0;->b:LN3/A;

    .line 94
    .line 95
    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Ljava/lang/Long;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v10

    .line 103
    invoke-virtual {v0}, Lj3/D;->k()J

    .line 104
    .line 105
    .line 106
    move-result-wide v12

    .line 107
    invoke-static {v12, v13}, Ll4/y;->H(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v12

    .line 111
    invoke-virtual {v6}, Lj3/E0;->p()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_4

    .line 116
    .line 117
    iget-object v2, v0, Lj3/D;->n:Lj3/C0;

    .line 118
    .line 119
    invoke-virtual {v6, v3, v2}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget-wide v2, v2, Lj3/C0;->e:J

    .line 124
    .line 125
    sub-long/2addr v12, v2

    .line 126
    :cond_4
    if-eqz v8, :cond_5

    .line 127
    .line 128
    cmp-long v2, v10, v12

    .line 129
    .line 130
    if-gez v2, :cond_6

    .line 131
    .line 132
    :cond_5
    move v1, v8

    .line 133
    move-object v8, v9

    .line 134
    move-wide v9, v10

    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :cond_6
    if-nez v2, :cond_a

    .line 138
    .line 139
    iget-object v2, v7, Lj3/l0;->k:LN3/A;

    .line 140
    .line 141
    iget-object v2, v2, LN3/y;->a:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Lj3/E0;->b(Ljava/lang/Object;)I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    const/4 v3, -0x1

    .line 148
    if-eq v2, v3, :cond_8

    .line 149
    .line 150
    iget-object v3, v0, Lj3/D;->n:Lj3/C0;

    .line 151
    .line 152
    invoke-virtual {v1, v2, v3, v4}, Lj3/E0;->f(ILj3/C0;Z)Lj3/C0;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iget v2, v2, Lj3/C0;->c:I

    .line 157
    .line 158
    iget-object v3, v9, LN3/y;->a:Ljava/lang/Object;

    .line 159
    .line 160
    iget-object v4, v0, Lj3/D;->n:Lj3/C0;

    .line 161
    .line 162
    invoke-virtual {v1, v3, v4}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget v3, v3, Lj3/C0;->c:I

    .line 167
    .line 168
    if-eq v2, v3, :cond_7

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    return-object v7

    .line 172
    :cond_8
    :goto_3
    iget-object v2, v9, LN3/y;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iget-object v3, v0, Lj3/D;->n:Lj3/C0;

    .line 175
    .line 176
    invoke-virtual {v1, v2, v3}, Lj3/E0;->g(Ljava/lang/Object;Lj3/C0;)Lj3/C0;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9}, LN3/y;->a()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_9

    .line 184
    .line 185
    iget-object v1, v0, Lj3/D;->n:Lj3/C0;

    .line 186
    .line 187
    iget v2, v9, LN3/y;->b:I

    .line 188
    .line 189
    iget v3, v9, LN3/y;->c:I

    .line 190
    .line 191
    invoke-virtual {v1, v2, v3}, Lj3/C0;->a(II)J

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    :goto_4
    move-object v8, v9

    .line 196
    goto :goto_5

    .line 197
    :cond_9
    iget-object v1, v0, Lj3/D;->n:Lj3/C0;

    .line 198
    .line 199
    iget-wide v1, v1, Lj3/C0;->d:J

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :goto_5
    iget-wide v9, v7, Lj3/l0;->r:J

    .line 203
    .line 204
    iget-wide v11, v7, Lj3/l0;->r:J

    .line 205
    .line 206
    iget-wide v13, v7, Lj3/l0;->d:J

    .line 207
    .line 208
    iget-wide v3, v7, Lj3/l0;->r:J

    .line 209
    .line 210
    sub-long v15, v1, v3

    .line 211
    .line 212
    iget-object v3, v7, Lj3/l0;->h:LN3/n0;

    .line 213
    .line 214
    iget-object v4, v7, Lj3/l0;->i:Li4/w;

    .line 215
    .line 216
    iget-object v5, v7, Lj3/l0;->j:Ljava/util/List;

    .line 217
    .line 218
    move-object/from16 v17, v3

    .line 219
    .line 220
    move-object/from16 v18, v4

    .line 221
    .line 222
    move-object/from16 v19, v5

    .line 223
    .line 224
    invoke-virtual/range {v7 .. v19}, Lj3/l0;->b(LN3/A;JJJJLN3/n0;Li4/w;Ljava/util/List;)Lj3/l0;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3, v8}, Lj3/l0;->a(LN3/A;)Lj3/l0;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    iput-wide v1, v3, Lj3/l0;->p:J

    .line 233
    .line 234
    return-object v3

    .line 235
    :cond_a
    move-object v8, v9

    .line 236
    invoke-virtual {v8}, LN3/y;->a()Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    xor-int/2addr v1, v5

    .line 241
    invoke-static {v1}, Ll4/a;->m(Z)V

    .line 242
    .line 243
    .line 244
    iget-wide v1, v7, Lj3/l0;->q:J

    .line 245
    .line 246
    sub-long v3, v10, v12

    .line 247
    .line 248
    sub-long/2addr v1, v3

    .line 249
    const-wide/16 v3, 0x0

    .line 250
    .line 251
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 252
    .line 253
    .line 254
    move-result-wide v15

    .line 255
    iget-wide v1, v7, Lj3/l0;->p:J

    .line 256
    .line 257
    iget-object v3, v7, Lj3/l0;->k:LN3/A;

    .line 258
    .line 259
    iget-object v4, v7, Lj3/l0;->b:LN3/A;

    .line 260
    .line 261
    invoke-virtual {v3, v4}, LN3/y;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_b

    .line 266
    .line 267
    add-long v1, v10, v15

    .line 268
    .line 269
    :cond_b
    iget-object v3, v7, Lj3/l0;->h:LN3/n0;

    .line 270
    .line 271
    iget-object v4, v7, Lj3/l0;->i:Li4/w;

    .line 272
    .line 273
    iget-object v5, v7, Lj3/l0;->j:Ljava/util/List;

    .line 274
    .line 275
    move-wide v9, v10

    .line 276
    move-wide v11, v9

    .line 277
    move-wide v13, v9

    .line 278
    move-object/from16 v17, v3

    .line 279
    .line 280
    move-object/from16 v18, v4

    .line 281
    .line 282
    move-object/from16 v19, v5

    .line 283
    .line 284
    invoke-virtual/range {v7 .. v19}, Lj3/l0;->b(LN3/A;JJJJLN3/n0;Li4/w;Ljava/util/List;)Lj3/l0;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    iput-wide v1, v3, Lj3/l0;->p:J

    .line 289
    .line 290
    return-object v3

    .line 291
    :goto_6
    invoke-virtual {v8}, LN3/y;->a()Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    xor-int/2addr v2, v5

    .line 296
    invoke-static {v2}, Ll4/a;->m(Z)V

    .line 297
    .line 298
    .line 299
    if-nez v1, :cond_c

    .line 300
    .line 301
    sget-object v2, LN3/n0;->d:LN3/n0;

    .line 302
    .line 303
    :goto_7
    move-object/from16 v17, v2

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_c
    iget-object v2, v7, Lj3/l0;->h:LN3/n0;

    .line 307
    .line 308
    goto :goto_7

    .line 309
    :goto_8
    if-nez v1, :cond_d

    .line 310
    .line 311
    iget-object v2, v0, Lj3/D;->b:Li4/w;

    .line 312
    .line 313
    :goto_9
    move-object/from16 v18, v2

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_d
    iget-object v2, v7, Lj3/l0;->i:Li4/w;

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :goto_a
    if-nez v1, :cond_e

    .line 320
    .line 321
    sget-object v1, LP5/F;->b:LP5/D;

    .line 322
    .line 323
    sget-object v1, LP5/S;->e:LP5/S;

    .line 324
    .line 325
    :goto_b
    move-object/from16 v19, v1

    .line 326
    .line 327
    goto :goto_c

    .line 328
    :cond_e
    iget-object v1, v7, Lj3/l0;->j:Ljava/util/List;

    .line 329
    .line 330
    goto :goto_b

    .line 331
    :goto_c
    const-wide/16 v15, 0x0

    .line 332
    .line 333
    move-wide v11, v9

    .line 334
    move-wide v13, v9

    .line 335
    invoke-virtual/range {v7 .. v19}, Lj3/l0;->b(LN3/A;JJJJLN3/n0;Li4/w;Ljava/util/List;)Lj3/l0;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-virtual {v1, v8}, Lj3/l0;->a(LN3/A;)Lj3/l0;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    iput-wide v9, v1, Lj3/l0;->p:J

    .line 344
    .line 345
    return-object v1
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
.end method

.method public final y(Lj3/p0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj3/D;->l:Ll4/l;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ll4/l;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public final y0(Lj3/E0;IJ)Landroid/util/Pair;
    .locals 6

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
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput p2, p0, Lj3/D;->G0:I

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long p1, p3, p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    move-wide p3, v1

    .line 21
    :cond_0
    iput-wide p3, p0, Lj3/D;->H0:J

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_1
    const/4 v0, -0x1

    .line 26
    if-eq p2, v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, Lj3/E0;->o()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lt p2, v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    move v3, p2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    iget-boolean p2, p0, Lj3/D;->Z:Z

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Lj3/E0;->a(Z)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget-object p3, p0, LD/n;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p3, Lj3/D0;

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3, v1, v2}, Lj3/E0;->m(ILj3/D0;J)Lj3/D0;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    iget-wide p3, p3, Lj3/D0;->m:J

    .line 52
    .line 53
    invoke-static {p3, p4}, Ll4/y;->T(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p3

    .line 57
    goto :goto_0

    .line 58
    :goto_2
    invoke-static {p3, p4}, Ll4/y;->H(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    iget-object p2, p0, LD/n;->a:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v1, p2

    .line 65
    check-cast v1, Lj3/D0;

    .line 66
    .line 67
    iget-object v2, p0, Lj3/D;->n:Lj3/C0;

    .line 68
    .line 69
    move-object v0, p1

    .line 70
    invoke-virtual/range {v0 .. v5}, Lj3/E0;->i(Lj3/D0;Lj3/C0;IJ)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
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

.method public final z()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lj3/D;->M0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lj3/D;->u0()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    return v0
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

.method public final z0(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/D;->u0:Ll4/t;

    .line 2
    .line 3
    iget v1, v0, Ll4/t;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_1

    .line 6
    .line 7
    iget v0, v0, Ll4/t;->b:I

    .line 8
    .line 9
    if-eq p2, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Ll4/t;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Ll4/t;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lj3/D;->u0:Ll4/t;

    .line 19
    .line 20
    new-instance v0, Lj3/u;

    .line 21
    .line 22
    invoke-direct {v0, p1, p2}, Lj3/u;-><init>(II)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lj3/D;->l:Ll4/l;

    .line 26
    .line 27
    const/16 p2, 0x18

    .line 28
    .line 29
    invoke-virtual {p1, p2, v0}, Ll4/l;->e(ILl4/i;)V

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
