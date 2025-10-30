.class public final LA3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA3/i;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LA4/r;

.field public final c:LZ3/f;

.field public d:Lq3/u;

.field public e:Ljava/lang/String;

.field public f:Lj3/M;

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:J

.field public l:Z

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:J

.field public r:I

.field public s:J

.field public t:I

.field public u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA3/t;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, LA4/r;

    .line 7
    .line 8
    const/16 v0, 0x400

    .line 9
    .line 10
    invoke-direct {p1, v0}, LA4/r;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LA3/t;->b:LA4/r;

    .line 14
    .line 15
    new-instance v0, LZ3/f;

    .line 16
    .line 17
    iget-object p1, p1, LA4/r;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, [B

    .line 20
    .line 21
    array-length v1, p1

    .line 22
    invoke-direct {v0, v1, p1}, LZ3/f;-><init>(I[B)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LA3/t;->c:LZ3/f;

    .line 26
    .line 27
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide v0, p0, LA3/t;->k:J

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LA3/t;->g:I

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, LA3/t;->k:J

    .line 10
    .line 11
    iput-boolean v0, p0, LA3/t;->l:Z

    .line 12
    .line 13
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
.end method

.method public final c(LA4/r;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LA3/t;->d:Lq3/u;

    .line 4
    .line 5
    invoke-static {v1}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, LA4/r;->e()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_1e

    .line 13
    .line 14
    iget v1, v0, LA3/t;->g:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/16 v3, 0x56

    .line 18
    .line 19
    if-eqz v1, :cond_1d

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eq v1, v2, :cond_1b

    .line 24
    .line 25
    iget-object v3, v0, LA3/t;->b:LA4/r;

    .line 26
    .line 27
    iget-object v6, v0, LA3/t;->c:LZ3/f;

    .line 28
    .line 29
    const/4 v7, 0x3

    .line 30
    const/16 v8, 0x8

    .line 31
    .line 32
    if-eq v1, v4, :cond_19

    .line 33
    .line 34
    if-ne v1, v7, :cond_18

    .line 35
    .line 36
    invoke-virtual/range {p1 .. p1}, LA4/r;->e()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget v9, v0, LA3/t;->i:I

    .line 41
    .line 42
    iget v10, v0, LA3/t;->h:I

    .line 43
    .line 44
    sub-int/2addr v9, v10

    .line 45
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-object v9, v6, LZ3/f;->b:[B

    .line 50
    .line 51
    iget v10, v0, LA3/t;->h:I

    .line 52
    .line 53
    move-object/from16 v11, p1

    .line 54
    .line 55
    invoke-virtual {v11, v9, v10, v1}, LA4/r;->h([BII)V

    .line 56
    .line 57
    .line 58
    iget v9, v0, LA3/t;->h:I

    .line 59
    .line 60
    add-int/2addr v9, v1

    .line 61
    iput v9, v0, LA3/t;->h:I

    .line 62
    .line 63
    iget v1, v0, LA3/t;->i:I

    .line 64
    .line 65
    if-ne v9, v1, :cond_0

    .line 66
    .line 67
    invoke-virtual {v6, v5}, LZ3/f;->o(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, LZ3/f;->h()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v9, 0x0

    .line 75
    if-nez v1, :cond_f

    .line 76
    .line 77
    iput-boolean v2, v0, LA3/t;->l:Z

    .line 78
    .line 79
    invoke-virtual {v6, v2}, LZ3/f;->i(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-ne v1, v2, :cond_1

    .line 84
    .line 85
    invoke-virtual {v6, v2}, LZ3/f;->i(I)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move v10, v5

    .line 91
    :goto_1
    iput v10, v0, LA3/t;->m:I

    .line 92
    .line 93
    if-nez v10, :cond_e

    .line 94
    .line 95
    if-ne v1, v2, :cond_2

    .line 96
    .line 97
    invoke-virtual {v6, v4}, LZ3/f;->i(I)I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    add-int/2addr v10, v2

    .line 102
    mul-int/2addr v10, v8

    .line 103
    invoke-virtual {v6, v10}, LZ3/f;->i(I)I

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v6}, LZ3/f;->h()Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-eqz v10, :cond_d

    .line 111
    .line 112
    const/4 v10, 0x6

    .line 113
    invoke-virtual {v6, v10}, LZ3/f;->i(I)I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    iput v12, v0, LA3/t;->n:I

    .line 118
    .line 119
    const/4 v12, 0x4

    .line 120
    invoke-virtual {v6, v12}, LZ3/f;->i(I)I

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    invoke-virtual {v6, v7}, LZ3/f;->i(I)I

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    if-nez v13, :cond_c

    .line 129
    .line 130
    if-nez v14, :cond_c

    .line 131
    .line 132
    if-nez v1, :cond_3

    .line 133
    .line 134
    invoke-virtual {v6}, LZ3/f;->g()I

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    invoke-virtual {v6}, LZ3/f;->b()I

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    invoke-static {v6, v2}, Ll3/a;->i(LZ3/f;Z)LA4/r;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    iget-object v5, v15, LA4/r;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v5, Ljava/lang/String;

    .line 149
    .line 150
    iput-object v5, v0, LA3/t;->u:Ljava/lang/String;

    .line 151
    .line 152
    iget v5, v15, LA4/r;->a:I

    .line 153
    .line 154
    iput v5, v0, LA3/t;->r:I

    .line 155
    .line 156
    iget v5, v15, LA4/r;->b:I

    .line 157
    .line 158
    iput v5, v0, LA3/t;->t:I

    .line 159
    .line 160
    invoke-virtual {v6}, LZ3/f;->b()I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    sub-int/2addr v14, v5

    .line 165
    invoke-virtual {v6, v13}, LZ3/f;->o(I)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v5, v14, 0x7

    .line 169
    .line 170
    div-int/2addr v5, v8

    .line 171
    new-array v5, v5, [B

    .line 172
    .line 173
    invoke-virtual {v6, v14, v5}, LZ3/f;->j(I[B)V

    .line 174
    .line 175
    .line 176
    new-instance v13, Lj3/L;

    .line 177
    .line 178
    invoke-direct {v13}, Lj3/L;-><init>()V

    .line 179
    .line 180
    .line 181
    iget-object v14, v0, LA3/t;->e:Ljava/lang/String;

    .line 182
    .line 183
    iput-object v14, v13, Lj3/L;->a:Ljava/lang/String;

    .line 184
    .line 185
    const-string v14, "audio/mp4a-latm"

    .line 186
    .line 187
    iput-object v14, v13, Lj3/L;->k:Ljava/lang/String;

    .line 188
    .line 189
    iget-object v14, v0, LA3/t;->u:Ljava/lang/String;

    .line 190
    .line 191
    iput-object v14, v13, Lj3/L;->h:Ljava/lang/String;

    .line 192
    .line 193
    iget v14, v0, LA3/t;->t:I

    .line 194
    .line 195
    iput v14, v13, Lj3/L;->x:I

    .line 196
    .line 197
    iget v14, v0, LA3/t;->r:I

    .line 198
    .line 199
    iput v14, v13, Lj3/L;->y:I

    .line 200
    .line 201
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    iput-object v5, v13, Lj3/L;->m:Ljava/util/List;

    .line 206
    .line 207
    iget-object v5, v0, LA3/t;->a:Ljava/lang/String;

    .line 208
    .line 209
    iput-object v5, v13, Lj3/L;->c:Ljava/lang/String;

    .line 210
    .line 211
    new-instance v5, Lj3/M;

    .line 212
    .line 213
    invoke-direct {v5, v13}, Lj3/M;-><init>(Lj3/L;)V

    .line 214
    .line 215
    .line 216
    iget-object v13, v0, LA3/t;->f:Lj3/M;

    .line 217
    .line 218
    invoke-virtual {v5, v13}, Lj3/M;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    if-nez v13, :cond_4

    .line 223
    .line 224
    iput-object v5, v0, LA3/t;->f:Lj3/M;

    .line 225
    .line 226
    iget v13, v5, Lj3/M;->z:I

    .line 227
    .line 228
    int-to-long v13, v13

    .line 229
    const-wide/32 v16, 0x3d090000

    .line 230
    .line 231
    .line 232
    div-long v13, v16, v13

    .line 233
    .line 234
    iput-wide v13, v0, LA3/t;->s:J

    .line 235
    .line 236
    iget-object v13, v0, LA3/t;->d:Lq3/u;

    .line 237
    .line 238
    invoke-interface {v13, v5}, Lq3/u;->e(Lj3/M;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_3
    invoke-virtual {v6, v4}, LZ3/f;->i(I)I

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    add-int/2addr v5, v2

    .line 247
    mul-int/2addr v5, v8

    .line 248
    invoke-virtual {v6, v5}, LZ3/f;->i(I)I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    int-to-long v13, v5

    .line 253
    long-to-int v5, v13

    .line 254
    invoke-virtual {v6}, LZ3/f;->b()I

    .line 255
    .line 256
    .line 257
    move-result v13

    .line 258
    invoke-static {v6, v2}, Ll3/a;->i(LZ3/f;Z)LA4/r;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    iget-object v15, v14, LA4/r;->c:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v15, Ljava/lang/String;

    .line 265
    .line 266
    iput-object v15, v0, LA3/t;->u:Ljava/lang/String;

    .line 267
    .line 268
    iget v15, v14, LA4/r;->a:I

    .line 269
    .line 270
    iput v15, v0, LA3/t;->r:I

    .line 271
    .line 272
    iget v14, v14, LA4/r;->b:I

    .line 273
    .line 274
    iput v14, v0, LA3/t;->t:I

    .line 275
    .line 276
    invoke-virtual {v6}, LZ3/f;->b()I

    .line 277
    .line 278
    .line 279
    move-result v14

    .line 280
    sub-int/2addr v13, v14

    .line 281
    sub-int/2addr v5, v13

    .line 282
    invoke-virtual {v6, v5}, LZ3/f;->r(I)V

    .line 283
    .line 284
    .line 285
    :cond_4
    :goto_2
    invoke-virtual {v6, v7}, LZ3/f;->i(I)I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    iput v5, v0, LA3/t;->o:I

    .line 290
    .line 291
    if-eqz v5, :cond_9

    .line 292
    .line 293
    if-eq v5, v2, :cond_8

    .line 294
    .line 295
    if-eq v5, v7, :cond_7

    .line 296
    .line 297
    if-eq v5, v12, :cond_7

    .line 298
    .line 299
    const/4 v7, 0x5

    .line 300
    if-eq v5, v7, :cond_7

    .line 301
    .line 302
    if-eq v5, v10, :cond_6

    .line 303
    .line 304
    const/4 v7, 0x7

    .line 305
    if-ne v5, v7, :cond_5

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 309
    .line 310
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 311
    .line 312
    .line 313
    throw v1

    .line 314
    :cond_6
    :goto_3
    invoke-virtual {v6, v2}, LZ3/f;->r(I)V

    .line 315
    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_7
    invoke-virtual {v6, v10}, LZ3/f;->r(I)V

    .line 319
    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_8
    const/16 v5, 0x9

    .line 323
    .line 324
    invoke-virtual {v6, v5}, LZ3/f;->r(I)V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_9
    invoke-virtual {v6, v8}, LZ3/f;->r(I)V

    .line 329
    .line 330
    .line 331
    :goto_4
    invoke-virtual {v6}, LZ3/f;->h()Z

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    iput-boolean v5, v0, LA3/t;->p:Z

    .line 336
    .line 337
    const-wide/16 v12, 0x0

    .line 338
    .line 339
    iput-wide v12, v0, LA3/t;->q:J

    .line 340
    .line 341
    if-eqz v5, :cond_b

    .line 342
    .line 343
    if-ne v1, v2, :cond_a

    .line 344
    .line 345
    invoke-virtual {v6, v4}, LZ3/f;->i(I)I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    add-int/2addr v1, v2

    .line 350
    mul-int/2addr v1, v8

    .line 351
    invoke-virtual {v6, v1}, LZ3/f;->i(I)I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    int-to-long v1, v1

    .line 356
    iput-wide v1, v0, LA3/t;->q:J

    .line 357
    .line 358
    goto :goto_5

    .line 359
    :cond_a
    invoke-virtual {v6}, LZ3/f;->h()Z

    .line 360
    .line 361
    .line 362
    move-result v1

    .line 363
    iget-wide v4, v0, LA3/t;->q:J

    .line 364
    .line 365
    shl-long/2addr v4, v8

    .line 366
    invoke-virtual {v6, v8}, LZ3/f;->i(I)I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    int-to-long v12, v2

    .line 371
    add-long/2addr v4, v12

    .line 372
    iput-wide v4, v0, LA3/t;->q:J

    .line 373
    .line 374
    if-nez v1, :cond_a

    .line 375
    .line 376
    :cond_b
    :goto_5
    invoke-virtual {v6}, LZ3/f;->h()Z

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    if-eqz v1, :cond_10

    .line 381
    .line 382
    invoke-virtual {v6, v8}, LZ3/f;->r(I)V

    .line 383
    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_c
    invoke-static {v9, v9}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    throw v1

    .line 391
    :cond_d
    invoke-static {v9, v9}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    throw v1

    .line 396
    :cond_e
    invoke-static {v9, v9}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    throw v1

    .line 401
    :cond_f
    iget-boolean v1, v0, LA3/t;->l:Z

    .line 402
    .line 403
    if-nez v1, :cond_10

    .line 404
    .line 405
    goto :goto_9

    .line 406
    :cond_10
    :goto_6
    iget v1, v0, LA3/t;->m:I

    .line 407
    .line 408
    if-nez v1, :cond_17

    .line 409
    .line 410
    iget v1, v0, LA3/t;->n:I

    .line 411
    .line 412
    if-nez v1, :cond_16

    .line 413
    .line 414
    iget v1, v0, LA3/t;->o:I

    .line 415
    .line 416
    if-nez v1, :cond_15

    .line 417
    .line 418
    const/4 v1, 0x0

    .line 419
    :goto_7
    invoke-virtual {v6, v8}, LZ3/f;->i(I)I

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    add-int/2addr v1, v2

    .line 424
    const/16 v4, 0xff

    .line 425
    .line 426
    if-eq v2, v4, :cond_14

    .line 427
    .line 428
    invoke-virtual {v6}, LZ3/f;->g()I

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    and-int/lit8 v4, v2, 0x7

    .line 433
    .line 434
    if-nez v4, :cond_11

    .line 435
    .line 436
    shr-int/lit8 v2, v2, 0x3

    .line 437
    .line 438
    invoke-virtual {v3, v2}, LA4/r;->H(I)V

    .line 439
    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_11
    iget-object v2, v3, LA4/r;->c:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v2, [B

    .line 445
    .line 446
    mul-int/lit8 v4, v1, 0x8

    .line 447
    .line 448
    invoke-virtual {v6, v4, v2}, LZ3/f;->j(I[B)V

    .line 449
    .line 450
    .line 451
    const/4 v2, 0x0

    .line 452
    invoke-virtual {v3, v2}, LA4/r;->H(I)V

    .line 453
    .line 454
    .line 455
    :goto_8
    iget-object v2, v0, LA3/t;->d:Lq3/u;

    .line 456
    .line 457
    invoke-interface {v2, v1, v3}, Lq3/u;->c(ILA4/r;)V

    .line 458
    .line 459
    .line 460
    iget-wide v2, v0, LA3/t;->k:J

    .line 461
    .line 462
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    cmp-long v4, v2, v4

    .line 468
    .line 469
    if-eqz v4, :cond_12

    .line 470
    .line 471
    iget-object v4, v0, LA3/t;->d:Lq3/u;

    .line 472
    .line 473
    const/16 v21, 0x0

    .line 474
    .line 475
    const/16 v22, 0x0

    .line 476
    .line 477
    const/16 v19, 0x1

    .line 478
    .line 479
    move/from16 v20, v1

    .line 480
    .line 481
    move-wide/from16 v17, v2

    .line 482
    .line 483
    move-object/from16 v16, v4

    .line 484
    .line 485
    invoke-interface/range {v16 .. v22}, Lq3/u;->d(JIIILq3/t;)V

    .line 486
    .line 487
    .line 488
    iget-wide v1, v0, LA3/t;->k:J

    .line 489
    .line 490
    iget-wide v3, v0, LA3/t;->s:J

    .line 491
    .line 492
    add-long/2addr v1, v3

    .line 493
    iput-wide v1, v0, LA3/t;->k:J

    .line 494
    .line 495
    :cond_12
    iget-boolean v1, v0, LA3/t;->p:Z

    .line 496
    .line 497
    if-eqz v1, :cond_13

    .line 498
    .line 499
    iget-wide v1, v0, LA3/t;->q:J

    .line 500
    .line 501
    long-to-int v1, v1

    .line 502
    invoke-virtual {v6, v1}, LZ3/f;->r(I)V

    .line 503
    .line 504
    .line 505
    :cond_13
    :goto_9
    const/4 v2, 0x0

    .line 506
    iput v2, v0, LA3/t;->g:I

    .line 507
    .line 508
    goto/16 :goto_0

    .line 509
    .line 510
    :cond_14
    move/from16 v20, v1

    .line 511
    .line 512
    goto :goto_7

    .line 513
    :cond_15
    invoke-static {v9, v9}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    throw v1

    .line 518
    :cond_16
    invoke-static {v9, v9}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    throw v1

    .line 523
    :cond_17
    invoke-static {v9, v9}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    throw v1

    .line 528
    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 529
    .line 530
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 531
    .line 532
    .line 533
    throw v1

    .line 534
    :cond_19
    move-object/from16 v11, p1

    .line 535
    .line 536
    iget v1, v0, LA3/t;->j:I

    .line 537
    .line 538
    and-int/lit16 v1, v1, -0xe1

    .line 539
    .line 540
    shl-int/2addr v1, v8

    .line 541
    invoke-virtual {v11}, LA4/r;->x()I

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    or-int/2addr v1, v2

    .line 546
    iput v1, v0, LA3/t;->i:I

    .line 547
    .line 548
    iget-object v2, v3, LA4/r;->c:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v2, [B

    .line 551
    .line 552
    array-length v2, v2

    .line 553
    if-le v1, v2, :cond_1a

    .line 554
    .line 555
    invoke-virtual {v3, v1}, LA4/r;->E(I)V

    .line 556
    .line 557
    .line 558
    iget-object v1, v3, LA4/r;->c:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v1, [B

    .line 561
    .line 562
    array-length v2, v1

    .line 563
    invoke-virtual {v6, v2, v1}, LZ3/f;->n(I[B)V

    .line 564
    .line 565
    .line 566
    :cond_1a
    const/4 v2, 0x0

    .line 567
    iput v2, v0, LA3/t;->h:I

    .line 568
    .line 569
    iput v7, v0, LA3/t;->g:I

    .line 570
    .line 571
    goto/16 :goto_0

    .line 572
    .line 573
    :cond_1b
    move-object/from16 v11, p1

    .line 574
    .line 575
    invoke-virtual {v11}, LA4/r;->x()I

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    and-int/lit16 v2, v1, 0xe0

    .line 580
    .line 581
    const/16 v5, 0xe0

    .line 582
    .line 583
    if-ne v2, v5, :cond_1c

    .line 584
    .line 585
    iput v1, v0, LA3/t;->j:I

    .line 586
    .line 587
    iput v4, v0, LA3/t;->g:I

    .line 588
    .line 589
    goto/16 :goto_0

    .line 590
    .line 591
    :cond_1c
    if-eq v1, v3, :cond_0

    .line 592
    .line 593
    const/4 v2, 0x0

    .line 594
    iput v2, v0, LA3/t;->g:I

    .line 595
    .line 596
    goto/16 :goto_0

    .line 597
    .line 598
    :cond_1d
    move-object/from16 v11, p1

    .line 599
    .line 600
    invoke-virtual {v11}, LA4/r;->x()I

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    if-ne v1, v3, :cond_0

    .line 605
    .line 606
    iput v2, v0, LA3/t;->g:I

    .line 607
    .line 608
    goto/16 :goto_0

    .line 609
    .line 610
    :cond_1e
    return-void
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

.method public final d()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final e(JI)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long p3, p1, v0

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, LA3/t;->k:J

    .line 11
    .line 12
    :cond_0
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

.method public final f(Lq3/l;LA3/I;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, LA3/I;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LA3/I;->b()V

    .line 5
    .line 6
    .line 7
    iget v0, p2, LA3/I;->d:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-interface {p1, v0, v1}, Lq3/l;->u(II)Lq3/u;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, LA3/t;->d:Lq3/u;

    .line 15
    .line 16
    invoke-virtual {p2}, LA3/I;->b()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p2, LA3/I;->e:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, p0, LA3/t;->e:Ljava/lang/String;

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
