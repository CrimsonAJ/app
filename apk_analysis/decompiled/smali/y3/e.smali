.class public abstract Ly3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Ll4/y;->a:I

    .line 2
    .line 3
    sget-object v0, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v1, "OpusHead"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ly3/e;->a:[B

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

.method public static a(ILA4/r;)LN3/X;
    .locals 10

    .line 1
    add-int/lit8 p0, p0, 0xc

    .line 2
    .line 3
    invoke-virtual {p1, p0}, LA4/r;->H(I)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, LA4/r;->I(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ly3/e;->b(LA4/r;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p1, v0}, LA4/r;->I(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, LA4/r;->x()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v0}, LA4/r;->I(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, LA4/r;->x()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v2}, LA4/r;->I(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1, v0}, LA4/r;->I(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1, p0}, LA4/r;->I(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Ly3/e;->b(LA4/r;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LA4/r;->x()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Ll4/n;->e(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p1, v0}, LA4/r;->I(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, LA4/r;->y()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p1}, LA4/r;->y()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p1, p0}, LA4/r;->I(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Ly3/e;->b(LA4/r;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    move-wide v4, v3

    .line 105
    new-array v3, p0, [B

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {p1, v3, v6, p0}, LA4/r;->h([BII)V

    .line 109
    .line 110
    .line 111
    move-wide p0, v0

    .line 112
    new-instance v1, LN3/X;

    .line 113
    .line 114
    const-wide/16 v6, 0x0

    .line 115
    .line 116
    cmp-long v0, v4, v6

    .line 117
    .line 118
    const-wide/16 v8, -0x1

    .line 119
    .line 120
    if-lez v0, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    move-wide v4, v8

    .line 124
    :goto_0
    cmp-long v0, p0, v6

    .line 125
    .line 126
    if-lez v0, :cond_5

    .line 127
    .line 128
    move-wide v6, p0

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    move-wide v6, v8

    .line 131
    :goto_1
    invoke-direct/range {v1 .. v7}, LN3/X;-><init>(Ljava/lang/String;[BJJ)V

    .line 132
    .line 133
    .line 134
    return-object v1

    .line 135
    :cond_6
    :goto_2
    new-instance v1, LN3/X;

    .line 136
    .line 137
    const-wide/16 v4, -0x1

    .line 138
    .line 139
    const-wide/16 v6, -0x1

    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    invoke-direct/range {v1 .. v7}, LN3/X;-><init>(Ljava/lang/String;[BJJ)V

    .line 143
    .line 144
    .line 145
    return-object v1
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

.method public static b(LA4/r;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, LA4/r;->x()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, LA4/r;->x()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
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

.method public static c(LA4/r;II)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LA4/r;->a:I

    .line 4
    .line 5
    :goto_0
    sub-int v2, v1, p1

    .line 6
    .line 7
    move/from16 v4, p2

    .line 8
    .line 9
    if-ge v2, v4, :cond_10

    .line 10
    .line 11
    invoke-virtual {v0, v1}, LA4/r;->H(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, LA4/r;->i()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-lez v2, :cond_0

    .line 21
    .line 22
    move v7, v6

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v7, v5

    .line 25
    :goto_1
    const-string v8, "childAtomSize must be positive"

    .line 26
    .line 27
    invoke-static {v8, v7}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LA4/r;->i()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const v8, 0x73696e66

    .line 35
    .line 36
    .line 37
    if-ne v7, v8, :cond_f

    .line 38
    .line 39
    add-int/lit8 v7, v1, 0x8

    .line 40
    .line 41
    const/4 v8, -0x1

    .line 42
    move v12, v5

    .line 43
    move v9, v8

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x0

    .line 46
    :goto_2
    sub-int v13, v7, v1

    .line 47
    .line 48
    const/4 v14, 0x4

    .line 49
    if-ge v13, v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, v7}, LA4/r;->H(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, LA4/r;->i()I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    invoke-virtual {v0}, LA4/r;->i()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const v3, 0x66726d61

    .line 65
    .line 66
    .line 67
    if-ne v15, v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0}, LA4/r;->i()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    const v3, 0x7363686d

    .line 79
    .line 80
    .line 81
    if-ne v15, v3, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0, v14}, LA4/r;->I(I)V

    .line 84
    .line 85
    .line 86
    sget-object v3, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {v0, v14, v3}, LA4/r;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    const v3, 0x73636869

    .line 94
    .line 95
    .line 96
    if-ne v15, v3, :cond_3

    .line 97
    .line 98
    move v9, v7

    .line 99
    move v12, v13

    .line 100
    :cond_3
    :goto_3
    add-int/2addr v7, v13

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    const/16 v16, 0x0

    .line 103
    .line 104
    const-string v3, "cenc"

    .line 105
    .line 106
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_6

    .line 111
    .line 112
    const-string v3, "cbc1"

    .line 113
    .line 114
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    const-string v3, "cens"

    .line 121
    .line 122
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_6

    .line 127
    .line 128
    const-string v3, "cbcs"

    .line 129
    .line 130
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    move-object/from16 v3, v16

    .line 138
    .line 139
    goto/16 :goto_b

    .line 140
    .line 141
    :cond_6
    :goto_4
    if-eqz v10, :cond_7

    .line 142
    .line 143
    move v3, v6

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    move v3, v5

    .line 146
    :goto_5
    const-string v7, "frma atom is mandatory"

    .line 147
    .line 148
    invoke-static {v7, v3}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    if-eq v9, v8, :cond_8

    .line 152
    .line 153
    move v3, v6

    .line 154
    goto :goto_6

    .line 155
    :cond_8
    move v3, v5

    .line 156
    :goto_6
    const-string v7, "schi atom is mandatory"

    .line 157
    .line 158
    invoke-static {v7, v3}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v3, v9, 0x8

    .line 162
    .line 163
    :goto_7
    sub-int v7, v3, v9

    .line 164
    .line 165
    if-ge v7, v12, :cond_d

    .line 166
    .line 167
    invoke-virtual {v0, v3}, LA4/r;->H(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, LA4/r;->i()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-virtual {v0}, LA4/r;->i()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    const v13, 0x74656e63

    .line 179
    .line 180
    .line 181
    if-ne v8, v13, :cond_c

    .line 182
    .line 183
    invoke-virtual {v0}, LA4/r;->i()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-static {v3}, LQ0/b;->q(I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v0, v6}, LA4/r;->I(I)V

    .line 192
    .line 193
    .line 194
    if-nez v3, :cond_9

    .line 195
    .line 196
    invoke-virtual {v0, v6}, LA4/r;->I(I)V

    .line 197
    .line 198
    .line 199
    move v14, v5

    .line 200
    move v15, v14

    .line 201
    goto :goto_8

    .line 202
    :cond_9
    invoke-virtual {v0}, LA4/r;->x()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    and-int/lit16 v7, v3, 0xf0

    .line 207
    .line 208
    shr-int/2addr v7, v14

    .line 209
    and-int/lit8 v3, v3, 0xf

    .line 210
    .line 211
    move v15, v3

    .line 212
    move v14, v7

    .line 213
    :goto_8
    invoke-virtual {v0}, LA4/r;->x()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-ne v3, v6, :cond_a

    .line 218
    .line 219
    move-object v3, v10

    .line 220
    move v10, v6

    .line 221
    goto :goto_9

    .line 222
    :cond_a
    move-object v3, v10

    .line 223
    move v10, v5

    .line 224
    :goto_9
    invoke-virtual {v0}, LA4/r;->x()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    const/16 v7, 0x10

    .line 229
    .line 230
    new-array v13, v7, [B

    .line 231
    .line 232
    invoke-virtual {v0, v13, v5, v7}, LA4/r;->h([BII)V

    .line 233
    .line 234
    .line 235
    if-eqz v10, :cond_b

    .line 236
    .line 237
    if-nez v12, :cond_b

    .line 238
    .line 239
    invoke-virtual {v0}, LA4/r;->x()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    new-array v8, v7, [B

    .line 244
    .line 245
    invoke-virtual {v0, v8, v5, v7}, LA4/r;->h([BII)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v16, v8

    .line 249
    .line 250
    :cond_b
    new-instance v9, Ly3/p;

    .line 251
    .line 252
    move-object v8, v3

    .line 253
    invoke-direct/range {v9 .. v16}, Ly3/p;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 254
    .line 255
    .line 256
    move-object v3, v9

    .line 257
    goto :goto_a

    .line 258
    :cond_c
    move-object v8, v10

    .line 259
    add-int/2addr v3, v7

    .line 260
    goto :goto_7

    .line 261
    :cond_d
    move-object v8, v10

    .line 262
    move-object/from16 v3, v16

    .line 263
    .line 264
    :goto_a
    if-eqz v3, :cond_e

    .line 265
    .line 266
    move v5, v6

    .line 267
    :cond_e
    const-string v6, "tenc atom is mandatory"

    .line 268
    .line 269
    invoke-static {v6, v5}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 270
    .line 271
    .line 272
    sget v5, Ll4/y;->a:I

    .line 273
    .line 274
    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    :goto_b
    if-eqz v3, :cond_f

    .line 279
    .line 280
    return-object v3

    .line 281
    :cond_f
    add-int/2addr v1, v2

    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_10
    const/16 v16, 0x0

    .line 285
    .line 286
    return-object v16
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

.method public static d(Ly3/o;Ly3/a;Lq3/o;)Ly3/r;
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const v3, 0x7374737a

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v3}, Ly3/a;->s(I)Ly3/b;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    iget-object v4, v1, Ly3/o;->f:Lj3/M;

    .line 13
    .line 14
    if-eqz v3, :cond_3

    .line 15
    .line 16
    new-instance v6, LA4/r;

    .line 17
    .line 18
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v3, v3, Ly3/b;->c:LA4/r;

    .line 22
    .line 23
    iput-object v3, v6, LA4/r;->c:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 v7, 0xc

    .line 26
    .line 27
    invoke-virtual {v3, v7}, LA4/r;->H(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, LA4/r;->A()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    iget-object v8, v4, Lj3/M;->l:Ljava/lang/String;

    .line 35
    .line 36
    const-string v9, "audio/raw"

    .line 37
    .line 38
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_1

    .line 43
    .line 44
    iget v8, v4, Lj3/M;->A:I

    .line 45
    .line 46
    iget v9, v4, Lj3/M;->y:I

    .line 47
    .line 48
    invoke-static {v8, v9}, Ll4/y;->x(II)I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v7, :cond_0

    .line 53
    .line 54
    rem-int v9, v7, v8

    .line 55
    .line 56
    if-eqz v9, :cond_1

    .line 57
    .line 58
    :cond_0
    new-instance v9, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v10, "Audio sample size mismatch. stsd sample size: "

    .line 61
    .line 62
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v10, ", stsz sample size: "

    .line 69
    .line 70
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    const-string v9, "AtomParsers"

    .line 81
    .line 82
    invoke-static {v9, v7}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move v7, v8

    .line 86
    :cond_1
    if-nez v7, :cond_2

    .line 87
    .line 88
    const/4 v7, -0x1

    .line 89
    :cond_2
    iput v7, v6, LA4/r;->a:I

    .line 90
    .line 91
    invoke-virtual {v3}, LA4/r;->A()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    iput v3, v6, LA4/r;->b:I

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    const v3, 0x73747a32

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3}, Ly3/a;->s(I)Ly3/b;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eqz v3, :cond_37

    .line 106
    .line 107
    new-instance v6, LB3/e;

    .line 108
    .line 109
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    iget-object v3, v3, Ly3/b;->c:LA4/r;

    .line 113
    .line 114
    iput-object v3, v6, LB3/e;->e:Ljava/lang/Object;

    .line 115
    .line 116
    const/16 v7, 0xc

    .line 117
    .line 118
    invoke-virtual {v3, v7}, LA4/r;->H(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, LA4/r;->A()I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    and-int/lit16 v7, v7, 0xff

    .line 126
    .line 127
    iput v7, v6, LB3/e;->b:I

    .line 128
    .line 129
    invoke-virtual {v3}, LA4/r;->A()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    iput v3, v6, LB3/e;->a:I

    .line 134
    .line 135
    :goto_0
    invoke-interface {v6}, Ly3/d;->b()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    const/4 v7, 0x0

    .line 140
    if-nez v3, :cond_4

    .line 141
    .line 142
    new-instance v0, Ly3/r;

    .line 143
    .line 144
    new-array v2, v7, [J

    .line 145
    .line 146
    new-array v3, v7, [I

    .line 147
    .line 148
    new-array v5, v7, [J

    .line 149
    .line 150
    new-array v6, v7, [I

    .line 151
    .line 152
    const-wide/16 v7, 0x0

    .line 153
    .line 154
    const/4 v4, 0x0

    .line 155
    invoke-direct/range {v0 .. v8}, Ly3/r;-><init>(Ly3/o;[J[II[J[IJ)V

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_4
    const v8, 0x7374636f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v8}, Ly3/a;->s(I)Ly3/b;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    const/4 v9, 0x1

    .line 167
    if-nez v8, :cond_5

    .line 168
    .line 169
    const v8, 0x636f3634

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v8}, Ly3/a;->s(I)Ly3/b;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move v10, v9

    .line 180
    goto :goto_1

    .line 181
    :cond_5
    move v10, v7

    .line 182
    :goto_1
    const v11, 0x73747363

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v11}, Ly3/a;->s(I)Ly3/b;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    const v12, 0x73747473

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v12}, Ly3/a;->s(I)Ly3/b;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    const v13, 0x73747373

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v13}, Ly3/a;->s(I)Ly3/b;

    .line 206
    .line 207
    .line 208
    move-result-object v13

    .line 209
    if-eqz v13, :cond_6

    .line 210
    .line 211
    iget-object v13, v13, Ly3/b;->c:LA4/r;

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_6
    const/4 v13, 0x0

    .line 215
    :goto_2
    const v14, 0x63747473

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v14}, Ly3/a;->s(I)Ly3/b;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-eqz v0, :cond_7

    .line 223
    .line 224
    iget-object v0, v0, Ly3/b;->c:LA4/r;

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_7
    const/4 v0, 0x0

    .line 228
    :goto_3
    new-instance v14, Ly3/c;

    .line 229
    .line 230
    iget-object v11, v11, Ly3/b;->c:LA4/r;

    .line 231
    .line 232
    iget-object v8, v8, Ly3/b;->c:LA4/r;

    .line 233
    .line 234
    invoke-direct {v14, v11, v8, v10}, Ly3/c;-><init>(LA4/r;LA4/r;Z)V

    .line 235
    .line 236
    .line 237
    iget-object v8, v12, Ly3/b;->c:LA4/r;

    .line 238
    .line 239
    const/16 v10, 0xc

    .line 240
    .line 241
    invoke-virtual {v8, v10}, LA4/r;->H(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8}, LA4/r;->A()I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    sub-int/2addr v11, v9

    .line 249
    invoke-virtual {v8}, LA4/r;->A()I

    .line 250
    .line 251
    .line 252
    move-result v12

    .line 253
    invoke-virtual {v8}, LA4/r;->A()I

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    if-eqz v0, :cond_8

    .line 258
    .line 259
    invoke-virtual {v0, v10}, LA4/r;->H(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, LA4/r;->A()I

    .line 263
    .line 264
    .line 265
    move-result v16

    .line 266
    goto :goto_4

    .line 267
    :cond_8
    move/from16 v16, v7

    .line 268
    .line 269
    :goto_4
    const/4 v5, -0x1

    .line 270
    if-eqz v13, :cond_a

    .line 271
    .line 272
    invoke-virtual {v13, v10}, LA4/r;->H(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v13}, LA4/r;->A()I

    .line 276
    .line 277
    .line 278
    move-result v10

    .line 279
    if-lez v10, :cond_9

    .line 280
    .line 281
    invoke-virtual {v13}, LA4/r;->A()I

    .line 282
    .line 283
    .line 284
    move-result v17

    .line 285
    add-int/lit8 v17, v17, -0x1

    .line 286
    .line 287
    move/from16 v18, v7

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_9
    move/from16 v17, v5

    .line 291
    .line 292
    move/from16 v18, v7

    .line 293
    .line 294
    const/4 v13, 0x0

    .line 295
    goto :goto_5

    .line 296
    :cond_a
    move/from16 v17, v5

    .line 297
    .line 298
    move v10, v7

    .line 299
    move/from16 v18, v10

    .line 300
    .line 301
    :goto_5
    invoke-interface {v6}, Ly3/d;->a()I

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    move/from16 v19, v9

    .line 306
    .line 307
    iget-object v9, v4, Lj3/M;->l:Ljava/lang/String;

    .line 308
    .line 309
    if-eq v7, v5, :cond_c

    .line 310
    .line 311
    const-string v5, "audio/raw"

    .line 312
    .line 313
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-nez v5, :cond_b

    .line 318
    .line 319
    const-string v5, "audio/g711-mlaw"

    .line 320
    .line 321
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    if-nez v5, :cond_b

    .line 326
    .line 327
    const-string v5, "audio/g711-alaw"

    .line 328
    .line 329
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    if-eqz v5, :cond_c

    .line 334
    .line 335
    :cond_b
    if-nez v11, :cond_c

    .line 336
    .line 337
    if-nez v16, :cond_c

    .line 338
    .line 339
    if-nez v10, :cond_c

    .line 340
    .line 341
    move/from16 p1, v19

    .line 342
    .line 343
    :goto_6
    move-object v9, v6

    .line 344
    goto :goto_7

    .line 345
    :cond_c
    move/from16 p1, v18

    .line 346
    .line 347
    goto :goto_6

    .line 348
    :goto_7
    if-eqz p1, :cond_11

    .line 349
    .line 350
    iget v0, v14, Ly3/c;->a:I

    .line 351
    .line 352
    new-array v8, v0, [J

    .line 353
    .line 354
    new-array v9, v0, [I

    .line 355
    .line 356
    :goto_8
    invoke-virtual {v14}, Ly3/c;->a()Z

    .line 357
    .line 358
    .line 359
    move-result v10

    .line 360
    if-eqz v10, :cond_d

    .line 361
    .line 362
    iget v10, v14, Ly3/c;->b:I

    .line 363
    .line 364
    iget-wide v11, v14, Ly3/c;->d:J

    .line 365
    .line 366
    aput-wide v11, v8, v10

    .line 367
    .line 368
    iget v11, v14, Ly3/c;->c:I

    .line 369
    .line 370
    aput v11, v9, v10

    .line 371
    .line 372
    goto :goto_8

    .line 373
    :cond_d
    int-to-long v10, v15

    .line 374
    const/16 v12, 0x2000

    .line 375
    .line 376
    div-int/2addr v12, v7

    .line 377
    move/from16 v13, v18

    .line 378
    .line 379
    move v14, v13

    .line 380
    :goto_9
    if-ge v13, v0, :cond_e

    .line 381
    .line 382
    aget v15, v9, v13

    .line 383
    .line 384
    invoke-static {v15, v12}, Ll4/y;->f(II)I

    .line 385
    .line 386
    .line 387
    move-result v15

    .line 388
    add-int/2addr v14, v15

    .line 389
    add-int/lit8 v13, v13, 0x1

    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_e
    new-array v13, v14, [J

    .line 393
    .line 394
    new-array v15, v14, [I

    .line 395
    .line 396
    const-wide/16 v20, 0x0

    .line 397
    .line 398
    new-array v5, v14, [J

    .line 399
    .line 400
    new-array v6, v14, [I

    .line 401
    .line 402
    move-object/from16 v16, v5

    .line 403
    .line 404
    move/from16 v5, v18

    .line 405
    .line 406
    move v14, v5

    .line 407
    move/from16 v17, v14

    .line 408
    .line 409
    move/from16 v22, v17

    .line 410
    .line 411
    :goto_a
    if-ge v14, v0, :cond_10

    .line 412
    .line 413
    aget v23, v9, v14

    .line 414
    .line 415
    aget-wide v24, v8, v14

    .line 416
    .line 417
    move/from16 v37, v22

    .line 418
    .line 419
    move/from16 v22, v0

    .line 420
    .line 421
    move/from16 v0, v17

    .line 422
    .line 423
    move/from16 v17, v37

    .line 424
    .line 425
    move/from16 v37, v23

    .line 426
    .line 427
    move-object/from16 v23, v6

    .line 428
    .line 429
    move/from16 v6, v37

    .line 430
    .line 431
    :goto_b
    if-lez v6, :cond_f

    .line 432
    .line 433
    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    .line 434
    .line 435
    .line 436
    move-result v26

    .line 437
    aput-wide v24, v13, v17

    .line 438
    .line 439
    move/from16 p1, v6

    .line 440
    .line 441
    mul-int v6, v7, v26

    .line 442
    .line 443
    aput v6, v15, v17

    .line 444
    .line 445
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    move/from16 v27, v7

    .line 450
    .line 451
    int-to-long v6, v5

    .line 452
    mul-long/2addr v6, v10

    .line 453
    aput-wide v6, v16, v17

    .line 454
    .line 455
    aput v19, v23, v17

    .line 456
    .line 457
    aget v6, v15, v17

    .line 458
    .line 459
    int-to-long v6, v6

    .line 460
    add-long v24, v24, v6

    .line 461
    .line 462
    add-int v5, v5, v26

    .line 463
    .line 464
    sub-int v6, p1, v26

    .line 465
    .line 466
    add-int/lit8 v17, v17, 0x1

    .line 467
    .line 468
    move/from16 v7, v27

    .line 469
    .line 470
    goto :goto_b

    .line 471
    :cond_f
    move/from16 v27, v7

    .line 472
    .line 473
    add-int/lit8 v14, v14, 0x1

    .line 474
    .line 475
    move/from16 v6, v17

    .line 476
    .line 477
    move/from16 v17, v0

    .line 478
    .line 479
    move/from16 v0, v22

    .line 480
    .line 481
    move/from16 v22, v6

    .line 482
    .line 483
    move-object/from16 v6, v23

    .line 484
    .line 485
    goto :goto_a

    .line 486
    :cond_10
    move-object/from16 v23, v6

    .line 487
    .line 488
    int-to-long v5, v5

    .line 489
    mul-long/2addr v10, v5

    .line 490
    move-object/from16 v25, v4

    .line 491
    .line 492
    move-wide v7, v10

    .line 493
    move-object v2, v13

    .line 494
    move-object/from16 v5, v16

    .line 495
    .line 496
    move/from16 v4, v17

    .line 497
    .line 498
    move-object/from16 v6, v23

    .line 499
    .line 500
    goto/16 :goto_15

    .line 501
    .line 502
    :cond_11
    const-wide/16 v20, 0x0

    .line 503
    .line 504
    new-array v5, v3, [J

    .line 505
    .line 506
    new-array v6, v3, [I

    .line 507
    .line 508
    new-array v7, v3, [J

    .line 509
    .line 510
    move-object/from16 p1, v0

    .line 511
    .line 512
    new-array v0, v3, [I

    .line 513
    .line 514
    move-object/from16 v25, v4

    .line 515
    .line 516
    move-object/from16 v22, v8

    .line 517
    .line 518
    move-object/from16 v23, v13

    .line 519
    .line 520
    move/from16 v8, v17

    .line 521
    .line 522
    move/from16 v4, v18

    .line 523
    .line 524
    move v13, v4

    .line 525
    move/from16 v24, v13

    .line 526
    .line 527
    move/from16 v30, v24

    .line 528
    .line 529
    move-wide/from16 v26, v20

    .line 530
    .line 531
    move-wide/from16 v28, v26

    .line 532
    .line 533
    move-object/from16 v17, v9

    .line 534
    .line 535
    move/from16 v9, v30

    .line 536
    .line 537
    :goto_c
    const-string v2, "AtomParsers"

    .line 538
    .line 539
    if-ge v9, v3, :cond_1a

    .line 540
    .line 541
    move-wide/from16 v31, v28

    .line 542
    .line 543
    move/from16 v28, v24

    .line 544
    .line 545
    move/from16 v24, v19

    .line 546
    .line 547
    :goto_d
    if-nez v28, :cond_12

    .line 548
    .line 549
    invoke-virtual {v14}, Ly3/c;->a()Z

    .line 550
    .line 551
    .line 552
    move-result v24

    .line 553
    if-eqz v24, :cond_12

    .line 554
    .line 555
    move/from16 v29, v11

    .line 556
    .line 557
    move/from16 v33, v12

    .line 558
    .line 559
    iget-wide v11, v14, Ly3/c;->d:J

    .line 560
    .line 561
    move/from16 v34, v3

    .line 562
    .line 563
    iget v3, v14, Ly3/c;->c:I

    .line 564
    .line 565
    move/from16 v28, v3

    .line 566
    .line 567
    move-wide/from16 v31, v11

    .line 568
    .line 569
    move/from16 v11, v29

    .line 570
    .line 571
    move/from16 v12, v33

    .line 572
    .line 573
    move/from16 v3, v34

    .line 574
    .line 575
    goto :goto_d

    .line 576
    :cond_12
    move/from16 v34, v3

    .line 577
    .line 578
    move/from16 v29, v11

    .line 579
    .line 580
    move/from16 v33, v12

    .line 581
    .line 582
    if-nez v24, :cond_13

    .line 583
    .line 584
    const-string v3, "Unexpected end of chunk data"

    .line 585
    .line 586
    invoke-static {v2, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([II)[I

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 598
    .line 599
    .line 600
    move-result-object v6

    .line 601
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([II)[I

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    move-object v15, v5

    .line 606
    move-object v5, v6

    .line 607
    move/from16 v7, v28

    .line 608
    .line 609
    move-object v6, v0

    .line 610
    move-object v0, v3

    .line 611
    move v3, v9

    .line 612
    goto/16 :goto_11

    .line 613
    .line 614
    :cond_13
    if-eqz p1, :cond_15

    .line 615
    .line 616
    move/from16 v2, v30

    .line 617
    .line 618
    :goto_e
    if-nez v2, :cond_14

    .line 619
    .line 620
    if-lez v16, :cond_14

    .line 621
    .line 622
    invoke-virtual/range {p1 .. p1}, LA4/r;->A()I

    .line 623
    .line 624
    .line 625
    move-result v2

    .line 626
    invoke-virtual/range {p1 .. p1}, LA4/r;->i()I

    .line 627
    .line 628
    .line 629
    move-result v13

    .line 630
    add-int/lit8 v16, v16, -0x1

    .line 631
    .line 632
    goto :goto_e

    .line 633
    :cond_14
    add-int/lit8 v2, v2, -0x1

    .line 634
    .line 635
    move/from16 v30, v2

    .line 636
    .line 637
    :cond_15
    aput-wide v31, v5, v9

    .line 638
    .line 639
    invoke-interface/range {v17 .. v17}, Ly3/d;->d()I

    .line 640
    .line 641
    .line 642
    move-result v2

    .line 643
    aput v2, v6, v9

    .line 644
    .line 645
    if-le v2, v4, :cond_16

    .line 646
    .line 647
    move v4, v2

    .line 648
    :cond_16
    int-to-long v2, v13

    .line 649
    add-long v2, v26, v2

    .line 650
    .line 651
    aput-wide v2, v7, v9

    .line 652
    .line 653
    if-nez v23, :cond_17

    .line 654
    .line 655
    move/from16 v2, v19

    .line 656
    .line 657
    goto :goto_f

    .line 658
    :cond_17
    move/from16 v2, v18

    .line 659
    .line 660
    :goto_f
    aput v2, v0, v9

    .line 661
    .line 662
    if-ne v9, v8, :cond_18

    .line 663
    .line 664
    aput v19, v0, v9

    .line 665
    .line 666
    add-int/lit8 v10, v10, -0x1

    .line 667
    .line 668
    if-lez v10, :cond_18

    .line 669
    .line 670
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v23 .. v23}, LA4/r;->A()I

    .line 674
    .line 675
    .line 676
    move-result v2

    .line 677
    add-int/lit8 v2, v2, -0x1

    .line 678
    .line 679
    move v8, v2

    .line 680
    :cond_18
    int-to-long v2, v15

    .line 681
    add-long v26, v26, v2

    .line 682
    .line 683
    add-int/lit8 v12, v33, -0x1

    .line 684
    .line 685
    if-nez v12, :cond_19

    .line 686
    .line 687
    if-lez v29, :cond_19

    .line 688
    .line 689
    invoke-virtual/range {v22 .. v22}, LA4/r;->A()I

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    invoke-virtual/range {v22 .. v22}, LA4/r;->i()I

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    add-int/lit8 v11, v29, -0x1

    .line 698
    .line 699
    move v12, v2

    .line 700
    move v15, v3

    .line 701
    goto :goto_10

    .line 702
    :cond_19
    move/from16 v11, v29

    .line 703
    .line 704
    :goto_10
    aget v2, v6, v9

    .line 705
    .line 706
    int-to-long v2, v2

    .line 707
    add-long v2, v31, v2

    .line 708
    .line 709
    add-int/lit8 v24, v28, -0x1

    .line 710
    .line 711
    add-int/lit8 v9, v9, 0x1

    .line 712
    .line 713
    move-wide/from16 v28, v2

    .line 714
    .line 715
    move/from16 v3, v34

    .line 716
    .line 717
    goto/16 :goto_c

    .line 718
    .line 719
    :cond_1a
    move/from16 v34, v3

    .line 720
    .line 721
    move/from16 v29, v11

    .line 722
    .line 723
    move/from16 v33, v12

    .line 724
    .line 725
    move-object v15, v6

    .line 726
    move-object v6, v0

    .line 727
    move-object v0, v5

    .line 728
    move-object v5, v7

    .line 729
    move/from16 v7, v24

    .line 730
    .line 731
    :goto_11
    int-to-long v8, v13

    .line 732
    add-long v8, v26, v8

    .line 733
    .line 734
    if-eqz p1, :cond_1c

    .line 735
    .line 736
    :goto_12
    if-lez v16, :cond_1c

    .line 737
    .line 738
    invoke-virtual/range {p1 .. p1}, LA4/r;->A()I

    .line 739
    .line 740
    .line 741
    move-result v11

    .line 742
    if-eqz v11, :cond_1b

    .line 743
    .line 744
    move/from16 v11, v18

    .line 745
    .line 746
    goto :goto_13

    .line 747
    :cond_1b
    invoke-virtual/range {p1 .. p1}, LA4/r;->i()I

    .line 748
    .line 749
    .line 750
    add-int/lit8 v16, v16, -0x1

    .line 751
    .line 752
    goto :goto_12

    .line 753
    :cond_1c
    move/from16 v11, v19

    .line 754
    .line 755
    :goto_13
    if-nez v10, :cond_1d

    .line 756
    .line 757
    if-nez v33, :cond_1d

    .line 758
    .line 759
    if-nez v7, :cond_1d

    .line 760
    .line 761
    if-nez v29, :cond_1d

    .line 762
    .line 763
    if-nez v30, :cond_1d

    .line 764
    .line 765
    if-nez v11, :cond_1f

    .line 766
    .line 767
    :cond_1d
    new-instance v12, Ljava/lang/StringBuilder;

    .line 768
    .line 769
    const-string v13, "Inconsistent stbl box for track "

    .line 770
    .line 771
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    iget v13, v1, Ly3/o;->a:I

    .line 775
    .line 776
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    const-string v13, ": remainingSynchronizationSamples "

    .line 780
    .line 781
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    const-string v10, ", remainingSamplesAtTimestampDelta "

    .line 788
    .line 789
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    move/from16 v10, v33

    .line 793
    .line 794
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    const-string v10, ", remainingSamplesInChunk "

    .line 798
    .line 799
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    const-string v7, ", remainingTimestampDeltaChanges "

    .line 806
    .line 807
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    move/from16 v7, v29

    .line 811
    .line 812
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    const-string v7, ", remainingSamplesAtTimestampOffset "

    .line 816
    .line 817
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 818
    .line 819
    .line 820
    move/from16 v7, v30

    .line 821
    .line 822
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 823
    .line 824
    .line 825
    if-nez v11, :cond_1e

    .line 826
    .line 827
    const-string v7, ", ctts invalid"

    .line 828
    .line 829
    goto :goto_14

    .line 830
    :cond_1e
    const-string v7, ""

    .line 831
    .line 832
    :goto_14
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v7

    .line 839
    invoke-static {v2, v7}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    :cond_1f
    move-object v2, v0

    .line 843
    move-wide v7, v8

    .line 844
    :goto_15
    const-wide/32 v9, 0xf4240

    .line 845
    .line 846
    .line 847
    iget-wide v11, v1, Ly3/o;->c:J

    .line 848
    .line 849
    invoke-static/range {v7 .. v12}, Ll4/y;->O(JJJ)J

    .line 850
    .line 851
    .line 852
    move-result-wide v9

    .line 853
    iget-wide v11, v1, Ly3/o;->c:J

    .line 854
    .line 855
    iget-object v0, v1, Ly3/o;->h:[J

    .line 856
    .line 857
    if-nez v0, :cond_20

    .line 858
    .line 859
    invoke-static {v5, v11, v12}, Ll4/y;->P([JJ)V

    .line 860
    .line 861
    .line 862
    new-instance v0, Ly3/r;

    .line 863
    .line 864
    move-wide v7, v9

    .line 865
    move-object v3, v15

    .line 866
    invoke-direct/range {v0 .. v8}, Ly3/r;-><init>(Ly3/o;[J[II[J[IJ)V

    .line 867
    .line 868
    .line 869
    return-object v0

    .line 870
    :cond_20
    move v9, v3

    .line 871
    move-object v3, v15

    .line 872
    array-length v10, v0

    .line 873
    iget v13, v1, Ly3/o;->b:I

    .line 874
    .line 875
    iget-object v14, v1, Ly3/o;->i:[J

    .line 876
    .line 877
    move/from16 v15, v19

    .line 878
    .line 879
    if-ne v10, v15, :cond_25

    .line 880
    .line 881
    if-ne v13, v15, :cond_25

    .line 882
    .line 883
    array-length v10, v5

    .line 884
    const/4 v15, 0x2

    .line 885
    if-lt v10, v15, :cond_25

    .line 886
    .line 887
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    aget-wide v15, v14, v18

    .line 891
    .line 892
    aget-wide v26, v0, v18

    .line 893
    .line 894
    move-object/from16 p1, v2

    .line 895
    .line 896
    move-object v10, v3

    .line 897
    iget-wide v2, v1, Ly3/o;->c:J

    .line 898
    .line 899
    move-wide/from16 v28, v2

    .line 900
    .line 901
    iget-wide v2, v1, Ly3/o;->d:J

    .line 902
    .line 903
    move-wide/from16 v30, v2

    .line 904
    .line 905
    invoke-static/range {v26 .. v31}, Ll4/y;->O(JJJ)J

    .line 906
    .line 907
    .line 908
    move-result-wide v2

    .line 909
    add-long/2addr v2, v15

    .line 910
    move-wide/from16 v22, v2

    .line 911
    .line 912
    array-length v2, v5

    .line 913
    const/16 v19, 0x1

    .line 914
    .line 915
    add-int/lit8 v2, v2, -0x1

    .line 916
    .line 917
    const/4 v3, 0x4

    .line 918
    move/from16 v17, v4

    .line 919
    .line 920
    move/from16 v4, v18

    .line 921
    .line 922
    invoke-static {v3, v4, v2}, Ll4/y;->i(III)I

    .line 923
    .line 924
    .line 925
    move-result v24

    .line 926
    move/from16 v18, v3

    .line 927
    .line 928
    array-length v3, v5

    .line 929
    add-int/lit8 v3, v3, -0x4

    .line 930
    .line 931
    invoke-static {v3, v4, v2}, Ll4/y;->i(III)I

    .line 932
    .line 933
    .line 934
    move-result v2

    .line 935
    aget-wide v26, v5, v4

    .line 936
    .line 937
    cmp-long v3, v26, v15

    .line 938
    .line 939
    if-gtz v3, :cond_21

    .line 940
    .line 941
    aget-wide v3, v5, v24

    .line 942
    .line 943
    cmp-long v3, v15, v3

    .line 944
    .line 945
    if-gez v3, :cond_21

    .line 946
    .line 947
    aget-wide v2, v5, v2

    .line 948
    .line 949
    cmp-long v2, v2, v22

    .line 950
    .line 951
    if-gez v2, :cond_21

    .line 952
    .line 953
    cmp-long v2, v22, v7

    .line 954
    .line 955
    if-gtz v2, :cond_21

    .line 956
    .line 957
    const/4 v2, 0x1

    .line 958
    goto :goto_16

    .line 959
    :cond_21
    const/4 v2, 0x0

    .line 960
    :goto_16
    if-eqz v2, :cond_24

    .line 961
    .line 962
    sub-long v28, v7, v22

    .line 963
    .line 964
    sub-long v30, v15, v26

    .line 965
    .line 966
    move-object/from16 v2, v25

    .line 967
    .line 968
    iget v3, v2, Lj3/M;->z:I

    .line 969
    .line 970
    int-to-long v3, v3

    .line 971
    move-wide/from16 v32, v3

    .line 972
    .line 973
    iget-wide v3, v1, Ly3/o;->c:J

    .line 974
    .line 975
    move-wide/from16 v34, v3

    .line 976
    .line 977
    invoke-static/range {v30 .. v35}, Ll4/y;->O(JJJ)J

    .line 978
    .line 979
    .line 980
    move-result-wide v3

    .line 981
    iget v2, v2, Lj3/M;->z:I

    .line 982
    .line 983
    move-wide v15, v7

    .line 984
    move-object v8, v6

    .line 985
    int-to-long v6, v2

    .line 986
    move-wide/from16 v30, v6

    .line 987
    .line 988
    iget-wide v6, v1, Ly3/o;->c:J

    .line 989
    .line 990
    move-wide/from16 v32, v6

    .line 991
    .line 992
    invoke-static/range {v28 .. v33}, Ll4/y;->O(JJJ)J

    .line 993
    .line 994
    .line 995
    move-result-wide v6

    .line 996
    cmp-long v2, v3, v20

    .line 997
    .line 998
    if-nez v2, :cond_23

    .line 999
    .line 1000
    cmp-long v2, v6, v20

    .line 1001
    .line 1002
    if-eqz v2, :cond_22

    .line 1003
    .line 1004
    goto :goto_18

    .line 1005
    :cond_22
    move-object/from16 v2, p1

    .line 1006
    .line 1007
    move-object v6, v8

    .line 1008
    :goto_17
    move-object v3, v10

    .line 1009
    move/from16 v4, v17

    .line 1010
    .line 1011
    goto :goto_19

    .line 1012
    :cond_23
    :goto_18
    const-wide/32 v22, 0x7fffffff

    .line 1013
    .line 1014
    .line 1015
    cmp-long v2, v3, v22

    .line 1016
    .line 1017
    if-gtz v2, :cond_22

    .line 1018
    .line 1019
    cmp-long v2, v6, v22

    .line 1020
    .line 1021
    if-gtz v2, :cond_22

    .line 1022
    .line 1023
    long-to-int v2, v3

    .line 1024
    move-object/from16 v3, p2

    .line 1025
    .line 1026
    iput v2, v3, Lq3/o;->a:I

    .line 1027
    .line 1028
    long-to-int v2, v6

    .line 1029
    iput v2, v3, Lq3/o;->b:I

    .line 1030
    .line 1031
    invoke-static {v5, v11, v12}, Ll4/y;->P([JJ)V

    .line 1032
    .line 1033
    .line 1034
    const/16 v18, 0x0

    .line 1035
    .line 1036
    aget-wide v11, v0, v18

    .line 1037
    .line 1038
    const-wide/32 v13, 0xf4240

    .line 1039
    .line 1040
    .line 1041
    iget-wide v2, v1, Ly3/o;->d:J

    .line 1042
    .line 1043
    move-wide v15, v2

    .line 1044
    invoke-static/range {v11 .. v16}, Ll4/y;->O(JJJ)J

    .line 1045
    .line 1046
    .line 1047
    move-result-wide v2

    .line 1048
    new-instance v0, Ly3/r;

    .line 1049
    .line 1050
    move-object v6, v8

    .line 1051
    move/from16 v4, v17

    .line 1052
    .line 1053
    move-wide v7, v2

    .line 1054
    move-object v3, v10

    .line 1055
    move-object/from16 v2, p1

    .line 1056
    .line 1057
    invoke-direct/range {v0 .. v8}, Ly3/r;-><init>(Ly3/o;[J[II[J[IJ)V

    .line 1058
    .line 1059
    .line 1060
    return-object v0

    .line 1061
    :cond_24
    move-object/from16 v2, p1

    .line 1062
    .line 1063
    move-wide v15, v7

    .line 1064
    goto :goto_17

    .line 1065
    :cond_25
    move-wide v15, v7

    .line 1066
    :goto_19
    array-length v7, v0

    .line 1067
    const/4 v8, 0x1

    .line 1068
    const/16 v18, 0x0

    .line 1069
    .line 1070
    if-ne v7, v8, :cond_28

    .line 1071
    .line 1072
    aget-wide v7, v0, v18

    .line 1073
    .line 1074
    cmp-long v7, v7, v20

    .line 1075
    .line 1076
    if-nez v7, :cond_27

    .line 1077
    .line 1078
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    aget-wide v7, v14, v18

    .line 1082
    .line 1083
    move/from16 v0, v18

    .line 1084
    .line 1085
    :goto_1a
    array-length v9, v5

    .line 1086
    if-ge v0, v9, :cond_26

    .line 1087
    .line 1088
    aget-wide v9, v5, v0

    .line 1089
    .line 1090
    sub-long v17, v9, v7

    .line 1091
    .line 1092
    const-wide/32 v19, 0xf4240

    .line 1093
    .line 1094
    .line 1095
    iget-wide v9, v1, Ly3/o;->c:J

    .line 1096
    .line 1097
    move-wide/from16 v21, v9

    .line 1098
    .line 1099
    invoke-static/range {v17 .. v22}, Ll4/y;->O(JJJ)J

    .line 1100
    .line 1101
    .line 1102
    move-result-wide v9

    .line 1103
    aput-wide v9, v5, v0

    .line 1104
    .line 1105
    add-int/lit8 v0, v0, 0x1

    .line 1106
    .line 1107
    goto :goto_1a

    .line 1108
    :cond_26
    sub-long v9, v15, v7

    .line 1109
    .line 1110
    const-wide/32 v11, 0xf4240

    .line 1111
    .line 1112
    .line 1113
    iget-wide v13, v1, Ly3/o;->c:J

    .line 1114
    .line 1115
    invoke-static/range {v9 .. v14}, Ll4/y;->O(JJJ)J

    .line 1116
    .line 1117
    .line 1118
    move-result-wide v7

    .line 1119
    new-instance v0, Ly3/r;

    .line 1120
    .line 1121
    invoke-direct/range {v0 .. v8}, Ly3/r;-><init>(Ly3/o;[J[II[J[IJ)V

    .line 1122
    .line 1123
    .line 1124
    return-object v0

    .line 1125
    :cond_27
    const/4 v15, 0x1

    .line 1126
    goto :goto_1b

    .line 1127
    :cond_28
    move v15, v8

    .line 1128
    :goto_1b
    if-ne v13, v15, :cond_29

    .line 1129
    .line 1130
    const/4 v15, 0x1

    .line 1131
    goto :goto_1c

    .line 1132
    :cond_29
    move/from16 v15, v18

    .line 1133
    .line 1134
    :goto_1c
    array-length v7, v0

    .line 1135
    new-array v7, v7, [I

    .line 1136
    .line 1137
    array-length v8, v0

    .line 1138
    new-array v8, v8, [I

    .line 1139
    .line 1140
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1141
    .line 1142
    .line 1143
    move/from16 v17, v4

    .line 1144
    .line 1145
    move/from16 v10, v18

    .line 1146
    .line 1147
    move v11, v10

    .line 1148
    move v12, v11

    .line 1149
    move v13, v12

    .line 1150
    :goto_1d
    array-length v4, v0

    .line 1151
    if-ge v10, v4, :cond_2d

    .line 1152
    .line 1153
    move-object v4, v7

    .line 1154
    move-object/from16 v16, v8

    .line 1155
    .line 1156
    aget-wide v7, v14, v10

    .line 1157
    .line 1158
    const-wide/16 v22, -0x1

    .line 1159
    .line 1160
    cmp-long v22, v7, v22

    .line 1161
    .line 1162
    if-eqz v22, :cond_2c

    .line 1163
    .line 1164
    aget-wide v23, v0, v10

    .line 1165
    .line 1166
    move/from16 v22, v10

    .line 1167
    .line 1168
    move/from16 p1, v11

    .line 1169
    .line 1170
    iget-wide v10, v1, Ly3/o;->c:J

    .line 1171
    .line 1172
    move-wide/from16 v25, v10

    .line 1173
    .line 1174
    iget-wide v10, v1, Ly3/o;->d:J

    .line 1175
    .line 1176
    move-wide/from16 v27, v10

    .line 1177
    .line 1178
    invoke-static/range {v23 .. v28}, Ll4/y;->O(JJJ)J

    .line 1179
    .line 1180
    .line 1181
    move-result-wide v10

    .line 1182
    move-object/from16 p2, v4

    .line 1183
    .line 1184
    const/4 v4, 0x1

    .line 1185
    invoke-static {v5, v7, v8, v4}, Ll4/y;->e([JJZ)I

    .line 1186
    .line 1187
    .line 1188
    move-result v19

    .line 1189
    aput v19, p2, v22

    .line 1190
    .line 1191
    add-long/2addr v7, v10

    .line 1192
    invoke-static {v5, v7, v8, v15}, Ll4/y;->b([JJZ)I

    .line 1193
    .line 1194
    .line 1195
    move-result v7

    .line 1196
    aput v7, v16, v22

    .line 1197
    .line 1198
    :goto_1e
    aget v7, p2, v22

    .line 1199
    .line 1200
    aget v8, v16, v22

    .line 1201
    .line 1202
    if-ge v7, v8, :cond_2a

    .line 1203
    .line 1204
    aget v10, v6, v7

    .line 1205
    .line 1206
    and-int/2addr v10, v4

    .line 1207
    if-nez v10, :cond_2a

    .line 1208
    .line 1209
    add-int/lit8 v7, v7, 0x1

    .line 1210
    .line 1211
    aput v7, p2, v22

    .line 1212
    .line 1213
    goto :goto_1e

    .line 1214
    :cond_2a
    sub-int v10, v8, v7

    .line 1215
    .line 1216
    add-int/2addr v10, v12

    .line 1217
    if-eq v13, v7, :cond_2b

    .line 1218
    .line 1219
    move v7, v4

    .line 1220
    goto :goto_1f

    .line 1221
    :cond_2b
    move/from16 v7, v18

    .line 1222
    .line 1223
    :goto_1f
    or-int v7, p1, v7

    .line 1224
    .line 1225
    move v11, v7

    .line 1226
    move v13, v8

    .line 1227
    move v12, v10

    .line 1228
    goto :goto_20

    .line 1229
    :cond_2c
    move-object/from16 p2, v4

    .line 1230
    .line 1231
    move/from16 v22, v10

    .line 1232
    .line 1233
    move/from16 p1, v11

    .line 1234
    .line 1235
    const/4 v4, 0x1

    .line 1236
    :goto_20
    add-int/lit8 v10, v22, 0x1

    .line 1237
    .line 1238
    move-object/from16 v7, p2

    .line 1239
    .line 1240
    move-object/from16 v8, v16

    .line 1241
    .line 1242
    goto :goto_1d

    .line 1243
    :cond_2d
    move-object/from16 p2, v7

    .line 1244
    .line 1245
    move-object/from16 v16, v8

    .line 1246
    .line 1247
    move/from16 p1, v11

    .line 1248
    .line 1249
    const/4 v4, 0x1

    .line 1250
    if-eq v12, v9, :cond_2e

    .line 1251
    .line 1252
    move v9, v4

    .line 1253
    goto :goto_21

    .line 1254
    :cond_2e
    move/from16 v9, v18

    .line 1255
    .line 1256
    :goto_21
    or-int v4, p1, v9

    .line 1257
    .line 1258
    if-eqz v4, :cond_2f

    .line 1259
    .line 1260
    new-array v7, v12, [J

    .line 1261
    .line 1262
    goto :goto_22

    .line 1263
    :cond_2f
    move-object v7, v2

    .line 1264
    :goto_22
    if-eqz v4, :cond_30

    .line 1265
    .line 1266
    new-array v15, v12, [I

    .line 1267
    .line 1268
    goto :goto_23

    .line 1269
    :cond_30
    move-object v15, v3

    .line 1270
    :goto_23
    if-eqz v4, :cond_31

    .line 1271
    .line 1272
    move/from16 v17, v18

    .line 1273
    .line 1274
    :cond_31
    if-eqz v4, :cond_32

    .line 1275
    .line 1276
    new-array v8, v12, [I

    .line 1277
    .line 1278
    goto :goto_24

    .line 1279
    :cond_32
    move-object v8, v6

    .line 1280
    :goto_24
    new-array v9, v12, [J

    .line 1281
    .line 1282
    move/from16 v10, v18

    .line 1283
    .line 1284
    move v11, v10

    .line 1285
    move-wide/from16 v22, v20

    .line 1286
    .line 1287
    :goto_25
    array-length v12, v0

    .line 1288
    if-ge v10, v12, :cond_36

    .line 1289
    .line 1290
    aget-wide v12, v14, v10

    .line 1291
    .line 1292
    move-object/from16 v18, v0

    .line 1293
    .line 1294
    aget v0, p2, v10

    .line 1295
    .line 1296
    move/from16 p1, v4

    .line 1297
    .line 1298
    aget v4, v16, v10

    .line 1299
    .line 1300
    move-object/from16 v19, v5

    .line 1301
    .line 1302
    if-eqz p1, :cond_33

    .line 1303
    .line 1304
    sub-int v5, v4, v0

    .line 1305
    .line 1306
    invoke-static {v2, v0, v7, v11, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1307
    .line 1308
    .line 1309
    invoke-static {v3, v0, v15, v11, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1310
    .line 1311
    .line 1312
    invoke-static {v6, v0, v8, v11, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1313
    .line 1314
    .line 1315
    :cond_33
    move/from16 v5, v17

    .line 1316
    .line 1317
    :goto_26
    if-ge v0, v4, :cond_35

    .line 1318
    .line 1319
    const-wide/32 v24, 0xf4240

    .line 1320
    .line 1321
    .line 1322
    move-object/from16 v28, v2

    .line 1323
    .line 1324
    move-object/from16 v29, v3

    .line 1325
    .line 1326
    iget-wide v2, v1, Ly3/o;->d:J

    .line 1327
    .line 1328
    move-wide/from16 v26, v2

    .line 1329
    .line 1330
    invoke-static/range {v22 .. v27}, Ll4/y;->O(JJJ)J

    .line 1331
    .line 1332
    .line 1333
    move-result-wide v2

    .line 1334
    aget-wide v24, v19, v0

    .line 1335
    .line 1336
    move-wide/from16 v26, v2

    .line 1337
    .line 1338
    sub-long v2, v24, v12

    .line 1339
    .line 1340
    move-object/from16 v24, v6

    .line 1341
    .line 1342
    move-object/from16 v30, v7

    .line 1343
    .line 1344
    move-wide/from16 v6, v20

    .line 1345
    .line 1346
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 1347
    .line 1348
    .line 1349
    move-result-wide v31

    .line 1350
    const-wide/32 v33, 0xf4240

    .line 1351
    .line 1352
    .line 1353
    iget-wide v2, v1, Ly3/o;->c:J

    .line 1354
    .line 1355
    move-wide/from16 v35, v2

    .line 1356
    .line 1357
    invoke-static/range {v31 .. v36}, Ll4/y;->O(JJJ)J

    .line 1358
    .line 1359
    .line 1360
    move-result-wide v2

    .line 1361
    add-long v2, v26, v2

    .line 1362
    .line 1363
    aput-wide v2, v9, v11

    .line 1364
    .line 1365
    if-eqz p1, :cond_34

    .line 1366
    .line 1367
    aget v2, v15, v11

    .line 1368
    .line 1369
    if-le v2, v5, :cond_34

    .line 1370
    .line 1371
    aget v5, v29, v0

    .line 1372
    .line 1373
    :cond_34
    add-int/lit8 v11, v11, 0x1

    .line 1374
    .line 1375
    add-int/lit8 v0, v0, 0x1

    .line 1376
    .line 1377
    move-wide/from16 v20, v6

    .line 1378
    .line 1379
    move-object/from16 v6, v24

    .line 1380
    .line 1381
    move-object/from16 v2, v28

    .line 1382
    .line 1383
    move-object/from16 v3, v29

    .line 1384
    .line 1385
    move-object/from16 v7, v30

    .line 1386
    .line 1387
    goto :goto_26

    .line 1388
    :cond_35
    move-object/from16 v28, v2

    .line 1389
    .line 1390
    move-object/from16 v29, v3

    .line 1391
    .line 1392
    move-object/from16 v24, v6

    .line 1393
    .line 1394
    move-object/from16 v30, v7

    .line 1395
    .line 1396
    move-wide/from16 v6, v20

    .line 1397
    .line 1398
    aget-wide v2, v18, v10

    .line 1399
    .line 1400
    add-long v22, v22, v2

    .line 1401
    .line 1402
    add-int/lit8 v10, v10, 0x1

    .line 1403
    .line 1404
    move/from16 v4, p1

    .line 1405
    .line 1406
    move/from16 v17, v5

    .line 1407
    .line 1408
    move-object/from16 v0, v18

    .line 1409
    .line 1410
    move-object/from16 v5, v19

    .line 1411
    .line 1412
    move-object/from16 v6, v24

    .line 1413
    .line 1414
    move-object/from16 v2, v28

    .line 1415
    .line 1416
    move-object/from16 v3, v29

    .line 1417
    .line 1418
    move-object/from16 v7, v30

    .line 1419
    .line 1420
    goto/16 :goto_25

    .line 1421
    .line 1422
    :cond_36
    move-object/from16 v30, v7

    .line 1423
    .line 1424
    const-wide/32 v24, 0xf4240

    .line 1425
    .line 1426
    .line 1427
    iget-wide v2, v1, Ly3/o;->d:J

    .line 1428
    .line 1429
    move-wide/from16 v26, v2

    .line 1430
    .line 1431
    invoke-static/range {v22 .. v27}, Ll4/y;->O(JJJ)J

    .line 1432
    .line 1433
    .line 1434
    move-result-wide v2

    .line 1435
    new-instance v0, Ly3/r;

    .line 1436
    .line 1437
    move-object v6, v8

    .line 1438
    move-object v5, v9

    .line 1439
    move/from16 v4, v17

    .line 1440
    .line 1441
    move-wide v7, v2

    .line 1442
    move-object v3, v15

    .line 1443
    move-object/from16 v2, v30

    .line 1444
    .line 1445
    invoke-direct/range {v0 .. v8}, Ly3/r;-><init>(Ly3/o;[J[II[J[IJ)V

    .line 1446
    .line 1447
    .line 1448
    return-object v0

    .line 1449
    :cond_37
    const-string v0, "Track has no sample table size information"

    .line 1450
    .line 1451
    const/4 v1, 0x0

    .line 1452
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v0

    .line 1456
    throw v0
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
.end method

.method public static e(Ly3/a;Lq3/o;JLn3/g;ZZLO5/f;)Ljava/util/ArrayList;
    .locals 71

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    .line 2
    :goto_0
    iget-object v5, v0, Ly3/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v4, v6, :cond_a1

    .line 3
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/a;

    .line 4
    iget v6, v5, LQ0/b;->b:I

    const v7, 0x7472616b

    if-eq v6, v7, :cond_0

    move-object/from16 v3, p1

    move-object/from16 v0, p7

    move/from16 v33, v4

    goto/16 :goto_70

    :cond_0
    const v6, 0x6d766864

    .line 5
    invoke-virtual {v0, v6}, Ly3/a;->s(I)Ly3/b;

    move-result-object v6

    .line 6
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v7, 0x6d646961

    .line 7
    invoke-virtual {v5, v7}, Ly3/a;->r(I)Ly3/a;

    move-result-object v8

    .line 8
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v9, 0x68646c72    # 4.3148E24f

    .line 9
    invoke-virtual {v8, v9}, Ly3/a;->s(I)Ly3/b;

    move-result-object v9

    .line 10
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iget-object v9, v9, Ly3/b;->c:LA4/r;

    const/16 v10, 0x10

    invoke-virtual {v9, v10}, LA4/r;->H(I)V

    .line 12
    invoke-virtual {v9}, LA4/r;->i()I

    move-result v9

    const v11, 0x736f756e

    const/4 v12, -0x1

    const/16 v16, 0x5

    if-ne v9, v11, :cond_1

    const/4 v9, 0x1

    goto :goto_2

    :cond_1
    const v11, 0x76696465

    if-ne v9, v11, :cond_2

    const/4 v9, 0x2

    goto :goto_2

    :cond_2
    const v11, 0x74657874

    if-eq v9, v11, :cond_5

    const v11, 0x7362746c

    if-eq v9, v11, :cond_5

    const v11, 0x73756274

    if-eq v9, v11, :cond_5

    const v11, 0x636c6370

    if-ne v9, v11, :cond_3

    goto :goto_1

    :cond_3
    const v11, 0x6d657461

    if-ne v9, v11, :cond_4

    move/from16 v9, v16

    goto :goto_2

    :cond_4
    move v9, v12

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v9, 0x3

    :goto_2
    const/16 v17, 0x3

    if-ne v9, v12, :cond_6

    move-object/from16 v0, p7

    move-object/from16 v39, v2

    move/from16 v33, v4

    const/4 v13, 0x0

    goto/16 :goto_6f

    :cond_6
    const v13, 0x746b6864

    .line 13
    invoke-virtual {v5, v13}, Ly3/a;->s(I)Ly3/b;

    move-result-object v13

    .line 14
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    iget-object v13, v13, Ly3/b;->c:LA4/r;

    const/16 v15, 0x8

    invoke-virtual {v13, v15}, LA4/r;->H(I)V

    .line 16
    invoke-virtual {v13}, LA4/r;->i()I

    move-result v20

    .line 17
    invoke-static/range {v20 .. v20}, LQ0/b;->q(I)I

    move-result v20

    if-nez v20, :cond_7

    move v14, v15

    goto :goto_3

    :cond_7
    move v14, v10

    .line 18
    :goto_3
    invoke-virtual {v13, v14}, LA4/r;->I(I)V

    .line 19
    invoke-virtual {v13}, LA4/r;->i()I

    move-result v14

    const/4 v3, 0x4

    .line 20
    invoke-virtual {v13, v3}, LA4/r;->I(I)V

    .line 21
    iget v11, v13, LA4/r;->a:I

    if-nez v20, :cond_8

    move v7, v3

    goto :goto_4

    :cond_8
    move v7, v15

    :goto_4
    const/4 v15, 0x0

    :goto_5
    const-wide/16 v23, 0x0

    const-wide v25, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v15, v7, :cond_b

    .line 22
    iget-object v3, v13, LA4/r;->c:Ljava/lang/Object;

    check-cast v3, [B

    add-int v28, v11, v15

    .line 23
    aget-byte v3, v3, v28

    if-eq v3, v12, :cond_a

    if-nez v20, :cond_9

    .line 24
    invoke-virtual {v13}, LA4/r;->y()J

    move-result-wide v28

    goto :goto_6

    :cond_9
    invoke-virtual {v13}, LA4/r;->B()J

    move-result-wide v28

    :goto_6
    cmp-long v3, v28, v23

    if-nez v3, :cond_c

    :goto_7
    move-wide/from16 v28, v25

    goto :goto_8

    :cond_a
    add-int/lit8 v15, v15, 0x1

    const/4 v3, 0x4

    goto :goto_5

    .line 25
    :cond_b
    invoke-virtual {v13, v7}, LA4/r;->I(I)V

    goto :goto_7

    .line 26
    :cond_c
    :goto_8
    invoke-virtual {v13, v10}, LA4/r;->I(I)V

    .line 27
    invoke-virtual {v13}, LA4/r;->i()I

    move-result v3

    .line 28
    invoke-virtual {v13}, LA4/r;->i()I

    move-result v7

    const/4 v11, 0x4

    .line 29
    invoke-virtual {v13, v11}, LA4/r;->I(I)V

    .line 30
    invoke-virtual {v13}, LA4/r;->i()I

    move-result v11

    .line 31
    invoke-virtual {v13}, LA4/r;->i()I

    move-result v13

    const/high16 v15, -0x10000

    const/high16 v12, 0x10000

    if-nez v3, :cond_d

    if-ne v7, v12, :cond_d

    if-ne v11, v15, :cond_d

    if-nez v13, :cond_d

    const/16 v3, 0x5a

    goto :goto_9

    :cond_d
    if-nez v3, :cond_e

    if-ne v7, v15, :cond_e

    if-ne v11, v12, :cond_e

    if-nez v13, :cond_e

    const/16 v3, 0x10e

    goto :goto_9

    :cond_e
    if-ne v3, v15, :cond_f

    if-nez v7, :cond_f

    if-nez v11, :cond_f

    if-ne v13, v15, :cond_f

    const/16 v3, 0xb4

    goto :goto_9

    :cond_f
    const/4 v3, 0x0

    :goto_9
    cmp-long v7, p2, v25

    if-nez v7, :cond_10

    move-wide/from16 v33, v28

    goto :goto_a

    :cond_10
    move-wide/from16 v33, p2

    .line 32
    :goto_a
    iget-object v6, v6, Ly3/b;->c:LA4/r;

    const/16 v7, 0x8

    invoke-virtual {v6, v7}, LA4/r;->H(I)V

    .line 33
    invoke-virtual {v6}, LA4/r;->i()I

    move-result v7

    .line 34
    invoke-static {v7}, LQ0/b;->q(I)I

    move-result v7

    if-nez v7, :cond_11

    const/16 v7, 0x8

    goto :goto_b

    :cond_11
    move v7, v10

    .line 35
    :goto_b
    invoke-virtual {v6, v7}, LA4/r;->I(I)V

    .line 36
    invoke-virtual {v6}, LA4/r;->y()J

    move-result-wide v37

    cmp-long v6, v33, v25

    if-nez v6, :cond_12

    :goto_c
    const v6, 0x6d696e66

    goto :goto_d

    :cond_12
    const-wide/32 v35, 0xf4240

    .line 37
    invoke-static/range {v33 .. v38}, Ll4/y;->O(JJJ)J

    move-result-wide v25

    goto :goto_c

    .line 38
    :goto_d
    invoke-virtual {v8, v6}, Ly3/a;->r(I)Ly3/a;

    move-result-object v7

    .line 39
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x7374626c

    .line 40
    invoke-virtual {v7, v6}, Ly3/a;->r(I)Ly3/a;

    move-result-object v7

    .line 41
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x6d646864

    .line 42
    invoke-virtual {v8, v6}, Ly3/a;->s(I)Ly3/b;

    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    iget-object v6, v6, Ly3/b;->c:LA4/r;

    const/16 v8, 0x8

    invoke-virtual {v6, v8}, LA4/r;->H(I)V

    .line 45
    invoke-virtual {v6}, LA4/r;->i()I

    move-result v8

    .line 46
    invoke-static {v8}, LQ0/b;->q(I)I

    move-result v8

    if-nez v8, :cond_13

    const/16 v11, 0x8

    goto :goto_e

    :cond_13
    move v11, v10

    .line 47
    :goto_e
    invoke-virtual {v6, v11}, LA4/r;->I(I)V

    .line 48
    invoke-virtual {v6}, LA4/r;->y()J

    move-result-wide v11

    if-nez v8, :cond_14

    const/4 v8, 0x4

    goto :goto_f

    :cond_14
    const/16 v8, 0x8

    .line 49
    :goto_f
    invoke-virtual {v6, v8}, LA4/r;->I(I)V

    .line 50
    invoke-virtual {v6}, LA4/r;->C()I

    move-result v6

    .line 51
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v13, ""

    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    shr-int/lit8 v13, v6, 0xa

    and-int/lit8 v13, v13, 0x1f

    add-int/lit8 v13, v13, 0x60

    int-to-char v13, v13

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v13, v6, 0x5

    and-int/lit8 v13, v13, 0x1f

    add-int/lit8 v13, v13, 0x60

    int-to-char v13, v13

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v6, v6, 0x1f

    add-int/lit8 v6, v6, 0x60

    int-to-char v6, v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 52
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-static {v8, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v6

    const v8, 0x73747364

    .line 53
    invoke-virtual {v7, v8}, Ly3/a;->s(I)Ly3/b;

    move-result-object v7

    .line 54
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    iget-object v8, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .line 56
    iget-object v7, v7, Ly3/b;->c:LA4/r;

    const/16 v11, 0xc

    invoke-virtual {v7, v11}, LA4/r;->H(I)V

    .line 57
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v11

    .line 58
    new-array v12, v11, [Ly3/p;

    move-wide/from16 v28, v23

    move-wide/from16 v24, v25

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    :goto_10
    if-ge v13, v11, :cond_97

    .line 59
    iget v10, v7, LA4/r;->a:I

    .line 60
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v0

    move/from16 v33, v4

    if-lez v0, :cond_15

    const/4 v4, 0x1

    :goto_11
    move/from16 v31, v9

    goto :goto_12

    :cond_15
    const/4 v4, 0x0

    goto :goto_11

    .line 61
    :goto_12
    const-string v9, "childAtomSize must be positive"

    invoke-static {v9, v4}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 62
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v4

    move/from16 v34, v11

    const v11, 0x61766331

    if-eq v4, v11, :cond_16

    const v11, 0x61766333

    if-eq v4, v11, :cond_16

    const v11, 0x656e6376

    if-eq v4, v11, :cond_16

    const v11, 0x6d317620

    if-eq v4, v11, :cond_16

    const v11, 0x6d703476

    if-eq v4, v11, :cond_16

    const v11, 0x68766331

    if-eq v4, v11, :cond_16

    const v11, 0x68657631

    if-eq v4, v11, :cond_16

    const v11, 0x73323633

    if-eq v4, v11, :cond_16

    const v11, 0x48323633

    if-eq v4, v11, :cond_16

    const v11, 0x76703038

    if-eq v4, v11, :cond_16

    const v11, 0x76703039

    if-eq v4, v11, :cond_16

    const v11, 0x61763031

    if-eq v4, v11, :cond_16

    const v11, 0x64766176

    if-eq v4, v11, :cond_16

    const v11, 0x64766131

    if-eq v4, v11, :cond_16

    const v11, 0x64766865

    if-eq v4, v11, :cond_16

    const v11, 0x64766831

    if-ne v4, v11, :cond_17

    :cond_16
    move/from16 v48, v0

    move-object/from16 v39, v2

    move/from16 v46, v3

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move/from16 v47, v10

    move-object/from16 v63, v12

    move/from16 v64, v13

    move/from16 v53, v14

    move/from16 v70, v15

    const/4 v5, 0x0

    goto/16 :goto_3f

    :cond_17
    const v11, 0x656e6361

    move-object/from16 v63, v12

    const v12, 0x6d703461

    if-eq v4, v12, :cond_18

    if-eq v4, v11, :cond_18

    const v12, 0x61632d33

    if-eq v4, v12, :cond_18

    const v12, 0x65632d33

    if-eq v4, v12, :cond_18

    const v12, 0x61632d34

    if-eq v4, v12, :cond_18

    const v12, 0x6d6c7061

    if-eq v4, v12, :cond_18

    const v12, 0x64747363

    if-eq v4, v12, :cond_18

    const v12, 0x64747365

    if-eq v4, v12, :cond_18

    const v12, 0x64747368

    if-eq v4, v12, :cond_18

    const v12, 0x6474736c

    if-eq v4, v12, :cond_18

    const v12, 0x64747378

    if-eq v4, v12, :cond_18

    const v12, 0x73616d72

    if-eq v4, v12, :cond_18

    const v12, 0x73617762

    if-eq v4, v12, :cond_18

    const v12, 0x6c70636d

    if-eq v4, v12, :cond_18

    const v12, 0x736f7774

    if-eq v4, v12, :cond_18

    const v12, 0x74776f73

    if-eq v4, v12, :cond_18

    const v12, 0x2e6d7032

    if-eq v4, v12, :cond_18

    const v12, 0x2e6d7033

    if-eq v4, v12, :cond_18

    const v12, 0x6d686131

    if-eq v4, v12, :cond_18

    const v12, 0x6d686d31

    if-eq v4, v12, :cond_18

    const v12, 0x616c6163

    if-eq v4, v12, :cond_18

    const v12, 0x616c6177

    if-eq v4, v12, :cond_18

    const v12, 0x756c6177

    if-eq v4, v12, :cond_18

    const v12, 0x4f707573

    if-eq v4, v12, :cond_18

    const v12, 0x664c6143

    if-ne v4, v12, :cond_19

    :cond_18
    move/from16 v64, v13

    move/from16 v53, v14

    goto/16 :goto_1a

    :cond_19
    const v12, 0x77767474

    const v9, 0x74783367

    const v11, 0x54544d4c

    if-eq v4, v11, :cond_1d

    if-eq v4, v9, :cond_1d

    if-eq v4, v12, :cond_1d

    const v12, 0x73747070

    if-eq v4, v12, :cond_1d

    const v12, 0x63363038

    if-ne v4, v12, :cond_1a

    goto/16 :goto_16

    :cond_1a
    const v9, 0x6d657474

    if-ne v4, v9, :cond_1c

    add-int/lit8 v11, v10, 0x10

    .line 63
    invoke-virtual {v7, v11}, LA4/r;->H(I)V

    if-ne v4, v9, :cond_1b

    .line 64
    invoke-virtual {v7}, LA4/r;->r()Ljava/lang/String;

    .line 65
    invoke-virtual {v7}, LA4/r;->r()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1b

    .line 66
    new-instance v9, Lj3/L;

    invoke-direct {v9}, Lj3/L;-><init>()V

    .line 67
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v9, Lj3/L;->a:Ljava/lang/String;

    .line 68
    iput-object v4, v9, Lj3/L;->k:Ljava/lang/String;

    .line 69
    new-instance v4, Lj3/M;

    invoke-direct {v4, v9}, Lj3/M;-><init>(Lj3/L;)V

    move-object/from16 v26, v4

    :cond_1b
    move/from16 v55, v0

    move-object/from16 v39, v2

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move-object/from16 v41, v8

    :goto_13
    move/from16 v47, v10

    move/from16 v64, v13

    move/from16 v53, v14

    :goto_14
    move/from16 v4, v17

    :goto_15
    const/4 v0, -0x1

    const/4 v6, 0x0

    const/16 v12, 0x10

    goto/16 :goto_69

    :cond_1c
    const v9, 0x63616d6d

    if-ne v4, v9, :cond_1b

    .line 70
    new-instance v4, Lj3/L;

    invoke-direct {v4}, Lj3/L;-><init>()V

    .line 71
    invoke-static {v14}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    iput-object v9, v4, Lj3/L;->a:Ljava/lang/String;

    .line 72
    const-string v9, "application/x-camera-motion"

    iput-object v9, v4, Lj3/L;->k:Ljava/lang/String;

    .line 73
    new-instance v9, Lj3/M;

    invoke-direct {v9, v4}, Lj3/M;-><init>(Lj3/L;)V

    move/from16 v55, v0

    move-object/from16 v39, v2

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move-object/from16 v41, v8

    move-object/from16 v26, v9

    goto :goto_13

    :cond_1d
    :goto_16
    add-int/lit8 v12, v10, 0x10

    .line 74
    invoke-virtual {v7, v12}, LA4/r;->H(I)V

    .line 75
    const-string v12, "application/ttml+xml"

    const-wide v40, 0x7fffffffffffffffL

    if-ne v4, v11, :cond_1e

    :goto_17
    move/from16 v64, v13

    move/from16 v53, v14

    move-wide/from16 v13, v40

    :goto_18
    const/4 v4, 0x0

    goto :goto_19

    :cond_1e
    if-ne v4, v9, :cond_1f

    add-int/lit8 v4, v0, -0x10

    .line 76
    new-array v9, v4, [B

    const/4 v11, 0x0

    .line 77
    invoke-virtual {v7, v9, v11, v4}, LA4/r;->h([BII)V

    .line 78
    invoke-static {v9}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    move-result-object v4

    .line 79
    const-string v12, "application/x-quicktime-tx3g"

    move/from16 v64, v13

    move/from16 v53, v14

    move-wide/from16 v13, v40

    goto :goto_19

    :cond_1f
    const v9, 0x77767474

    if-ne v4, v9, :cond_20

    .line 80
    const-string v12, "application/x-mp4-vtt"

    goto :goto_17

    :cond_20
    const v9, 0x73747070

    if-ne v4, v9, :cond_21

    move/from16 v64, v13

    move/from16 v53, v14

    move-wide/from16 v13, v28

    goto :goto_18

    :cond_21
    const v12, 0x63363038

    if-ne v4, v12, :cond_22

    .line 81
    const-string v12, "application/x-mp4-cea-608"

    move/from16 v64, v13

    move/from16 v53, v14

    move-wide/from16 v13, v40

    const/4 v4, 0x0

    const/4 v15, 0x1

    .line 82
    :goto_19
    new-instance v9, Lj3/L;

    invoke-direct {v9}, Lj3/L;-><init>()V

    .line 83
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    iput-object v11, v9, Lj3/L;->a:Ljava/lang/String;

    .line 84
    iput-object v12, v9, Lj3/L;->k:Ljava/lang/String;

    .line 85
    iput-object v8, v9, Lj3/L;->c:Ljava/lang/String;

    .line 86
    iput-wide v13, v9, Lj3/L;->o:J

    .line 87
    iput-object v4, v9, Lj3/L;->m:Ljava/util/List;

    .line 88
    new-instance v4, Lj3/M;

    invoke-direct {v4, v9}, Lj3/M;-><init>(Lj3/L;)V

    move/from16 v55, v0

    move-object/from16 v39, v2

    move-object/from16 v26, v4

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move-object/from16 v41, v8

    move/from16 v47, v10

    goto/16 :goto_14

    .line 89
    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :goto_1a
    add-int/lit8 v12, v10, 0x10

    .line 90
    invoke-virtual {v7, v12}, LA4/r;->H(I)V

    if-eqz p6, :cond_23

    .line 91
    invoke-virtual {v7}, LA4/r;->C()I

    move-result v12

    const/4 v13, 0x6

    .line 92
    invoke-virtual {v7, v13}, LA4/r;->I(I)V

    goto :goto_1b

    :cond_23
    const/16 v12, 0x8

    .line 93
    invoke-virtual {v7, v12}, LA4/r;->I(I)V

    const/4 v12, 0x0

    :goto_1b
    const/16 v13, 0x14

    if-eqz v12, :cond_26

    const/4 v14, 0x1

    if-ne v12, v14, :cond_24

    goto :goto_1c

    :cond_24
    const/4 v14, 0x2

    if-ne v12, v14, :cond_25

    const/16 v12, 0x10

    .line 94
    invoke-virtual {v7, v12}, LA4/r;->I(I)V

    .line 95
    invoke-virtual {v7}, LA4/r;->q()J

    move-result-wide v65

    invoke-static/range {v65 .. v66}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v65

    .line 96
    invoke-static/range {v65 .. v66}, Ljava/lang/Math;->round(D)J

    move-result-wide v11

    long-to-int v11, v11

    .line 97
    invoke-virtual {v7}, LA4/r;->A()I

    move-result v12

    .line 98
    invoke-virtual {v7, v13}, LA4/r;->I(I)V

    const/4 v13, 0x0

    goto :goto_1d

    :cond_25
    move/from16 v48, v0

    move-object/from16 v39, v2

    move/from16 v46, v3

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move/from16 v47, v10

    move/from16 v70, v15

    const/4 v5, 0x0

    goto/16 :goto_3e

    .line 99
    :cond_26
    :goto_1c
    invoke-virtual {v7}, LA4/r;->C()I

    move-result v11

    const/4 v14, 0x6

    .line 100
    invoke-virtual {v7, v14}, LA4/r;->I(I)V

    .line 101
    iget-object v14, v7, LA4/r;->c:Ljava/lang/Object;

    check-cast v14, [B

    iget v13, v7, LA4/r;->a:I

    move/from16 v67, v11

    add-int/lit8 v11, v13, 0x1

    iput v11, v7, LA4/r;->a:I

    move/from16 v68, v11

    aget-byte v11, v14, v13

    and-int/lit16 v11, v11, 0xff

    const/16 v22, 0x8

    shl-int/lit8 v11, v11, 0x8

    move/from16 v69, v11

    add-int/lit8 v11, v13, 0x2

    iput v11, v7, LA4/r;->a:I

    aget-byte v11, v14, v68

    and-int/lit16 v11, v11, 0xff

    or-int v11, v69, v11

    add-int/lit8 v14, v13, 0x4

    .line 102
    iput v14, v7, LA4/r;->a:I

    .line 103
    invoke-virtual {v7, v13}, LA4/r;->H(I)V

    .line 104
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v13

    const/4 v14, 0x1

    if-ne v12, v14, :cond_27

    const/16 v12, 0x10

    .line 105
    invoke-virtual {v7, v12}, LA4/r;->I(I)V

    :cond_27
    move/from16 v12, v67

    .line 106
    :goto_1d
    iget v14, v7, LA4/r;->a:I

    move/from16 v67, v11

    const v11, 0x656e6361

    if-ne v4, v11, :cond_2a

    .line 107
    invoke-static {v7, v10, v0}, Ly3/e;->c(LA4/r;II)Landroid/util/Pair;

    move-result-object v11

    if-eqz v11, :cond_29

    .line 108
    iget-object v4, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez v1, :cond_28

    move/from16 v65, v4

    const/4 v4, 0x0

    goto :goto_1e

    :cond_28
    move/from16 v65, v4

    .line 109
    iget-object v4, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ly3/p;

    iget-object v4, v4, Ly3/p;->b:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ln3/g;->a(Ljava/lang/String;)Ln3/g;

    move-result-object v4

    .line 110
    :goto_1e
    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Ly3/p;

    aput-object v11, v63, v64

    move-object v11, v4

    move/from16 v4, v65

    goto :goto_1f

    :cond_29
    move-object v11, v1

    .line 111
    :goto_1f
    invoke-virtual {v7, v14}, LA4/r;->H(I)V

    :goto_20
    move/from16 v65, v12

    goto :goto_21

    :cond_2a
    move-object v11, v1

    goto :goto_20

    .line 112
    :goto_21
    const-string v12, "audio/ac4"

    const-string v68, "audio/eac3"

    move/from16 v69, v14

    const-string v14, "audio/ac3"

    move/from16 v70, v15

    const v15, 0x61632d33

    if-ne v4, v15, :cond_2b

    move-object v4, v14

    :goto_22
    const/4 v15, -0x1

    goto/16 :goto_26

    :cond_2b
    const v15, 0x65632d33

    if-ne v4, v15, :cond_2c

    move-object/from16 v4, v68

    goto :goto_22

    :cond_2c
    const v15, 0x61632d34

    if-ne v4, v15, :cond_2d

    move-object v4, v12

    goto :goto_22

    :cond_2d
    const v15, 0x64747363

    if-ne v4, v15, :cond_2e

    .line 113
    const-string v4, "audio/vnd.dts"

    goto :goto_22

    :cond_2e
    const v15, 0x64747368

    if-eq v4, v15, :cond_41

    const v15, 0x6474736c

    if-ne v4, v15, :cond_2f

    goto/16 :goto_25

    :cond_2f
    const v15, 0x64747365

    if-ne v4, v15, :cond_30

    .line 114
    const-string v4, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_22

    :cond_30
    const v15, 0x64747378

    if-ne v4, v15, :cond_31

    .line 115
    const-string v4, "audio/vnd.dts.uhd;profile=p2"

    goto :goto_22

    :cond_31
    const v15, 0x73616d72

    if-ne v4, v15, :cond_32

    .line 116
    const-string v4, "audio/3gpp"

    goto :goto_22

    :cond_32
    const v15, 0x73617762

    if-ne v4, v15, :cond_33

    .line 117
    const-string v4, "audio/amr-wb"

    goto :goto_22

    .line 118
    :cond_33
    const-string v15, "audio/raw"

    move-object/from16 v51, v15

    const v15, 0x6c70636d

    if-eq v4, v15, :cond_40

    const v15, 0x736f7774

    if-ne v4, v15, :cond_34

    goto/16 :goto_24

    :cond_34
    const v15, 0x74776f73

    if-ne v4, v15, :cond_35

    const/high16 v4, 0x10000000

    move v15, v4

    move-object/from16 v4, v51

    goto :goto_26

    :cond_35
    const v15, 0x2e6d7032

    if-eq v4, v15, :cond_3f

    const v15, 0x2e6d7033

    if-ne v4, v15, :cond_36

    goto :goto_23

    :cond_36
    const v15, 0x6d686131

    if-ne v4, v15, :cond_37

    .line 119
    const-string v4, "audio/mha1"

    goto :goto_22

    :cond_37
    const v15, 0x6d686d31

    if-ne v4, v15, :cond_38

    .line 120
    const-string v4, "audio/mhm1"

    goto :goto_22

    :cond_38
    const v15, 0x616c6163

    if-ne v4, v15, :cond_39

    .line 121
    const-string v4, "audio/alac"

    goto/16 :goto_22

    :cond_39
    const v15, 0x616c6177

    if-ne v4, v15, :cond_3a

    .line 122
    const-string v4, "audio/g711-alaw"

    goto/16 :goto_22

    :cond_3a
    const v15, 0x756c6177

    if-ne v4, v15, :cond_3b

    .line 123
    const-string v4, "audio/g711-mlaw"

    goto/16 :goto_22

    :cond_3b
    const v15, 0x4f707573

    if-ne v4, v15, :cond_3c

    .line 124
    const-string v4, "audio/opus"

    goto/16 :goto_22

    :cond_3c
    const v15, 0x664c6143

    if-ne v4, v15, :cond_3d

    .line 125
    const-string v4, "audio/flac"

    goto/16 :goto_22

    :cond_3d
    const v15, 0x6d6c7061

    if-ne v4, v15, :cond_3e

    .line 126
    const-string v4, "audio/true-hd"

    goto/16 :goto_22

    :cond_3e
    const/4 v4, 0x0

    goto/16 :goto_22

    .line 127
    :cond_3f
    :goto_23
    const-string v4, "audio/mpeg"

    goto/16 :goto_22

    :cond_40
    :goto_24
    move-object/from16 v4, v51

    const/4 v15, 0x2

    goto :goto_26

    .line 128
    :cond_41
    :goto_25
    const-string v4, "audio/vnd.dts.hd"

    goto/16 :goto_22

    :goto_26
    move-object/from16 v39, v2

    move/from16 v46, v3

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move/from16 v47, v10

    move/from16 v10, v65

    move/from16 v2, v67

    move/from16 v6, v69

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v40, 0x0

    :goto_27
    sub-int v1, v6, v47

    if-ge v1, v0, :cond_5c

    .line 129
    invoke-virtual {v7, v6}, LA4/r;->H(I)V

    .line 130
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v1

    move/from16 v48, v0

    if-lez v1, :cond_42

    const/4 v0, 0x1

    goto :goto_28

    :cond_42
    const/4 v0, 0x0

    .line 131
    :goto_28
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 132
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v0

    move-object/from16 v41, v3

    const v3, 0x6d686143

    if-ne v0, v3, :cond_43

    add-int/lit8 v0, v1, -0xd

    .line 133
    new-array v3, v0, [B

    move/from16 v42, v15

    add-int/lit8 v15, v6, 0xd

    .line 134
    invoke-virtual {v7, v15}, LA4/r;->H(I)V

    const/4 v15, 0x0

    .line 135
    invoke-virtual {v7, v3, v15, v0}, LA4/r;->h([BII)V

    .line 136
    invoke-static {v3}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    move-result-object v0

    move-object v3, v0

    move-object/from16 v50, v5

    move-object/from16 v49, v14

    :goto_29
    const/4 v5, 0x0

    :goto_2a
    const v15, 0x616c6163

    goto/16 :goto_3d

    :cond_43
    move/from16 v42, v15

    const v3, 0x65736473

    if-eq v0, v3, :cond_44

    if-eqz p6, :cond_45

    const v3, 0x77617665

    if-ne v0, v3, :cond_45

    const v3, 0x65736473

    :cond_44
    move-object/from16 v50, v5

    move-object/from16 v49, v14

    const/4 v5, 0x4

    const/16 v14, 0x14

    const v15, 0x616c6163

    goto/16 :goto_33

    .line 137
    :cond_45
    sget-object v3, Ll3/a;->f:[I

    sget-object v15, Ll3/a;->d:[I

    move-object/from16 v49, v3

    const v3, 0x64616333

    if-ne v0, v3, :cond_47

    add-int/lit8 v0, v6, 0x8

    .line 138
    invoke-virtual {v7, v0}, LA4/r;->H(I)V

    .line 139
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 140
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v3

    and-int/lit16 v3, v3, 0xc0

    const/16 v36, 0x6

    shr-int/lit8 v3, v3, 0x6

    .line 141
    aget v3, v15, v3

    .line 142
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v15

    and-int/lit8 v26, v15, 0x38

    shr-int/lit8 v26, v26, 0x3

    .line 143
    aget v26, v49, v26

    const/16 v27, 0x4

    and-int/lit8 v15, v15, 0x4

    if-eqz v15, :cond_46

    add-int/lit8 v26, v26, 0x1

    :cond_46
    move-object/from16 v50, v5

    move/from16 v15, v26

    .line 144
    new-instance v5, Lj3/L;

    invoke-direct {v5}, Lj3/L;-><init>()V

    .line 145
    iput-object v0, v5, Lj3/L;->a:Ljava/lang/String;

    .line 146
    iput-object v14, v5, Lj3/L;->k:Ljava/lang/String;

    .line 147
    iput v15, v5, Lj3/L;->x:I

    .line 148
    iput v3, v5, Lj3/L;->y:I

    .line 149
    iput-object v11, v5, Lj3/L;->n:Ln3/g;

    .line 150
    iput-object v8, v5, Lj3/L;->c:Ljava/lang/String;

    .line 151
    new-instance v0, Lj3/M;

    invoke-direct {v0, v5}, Lj3/M;-><init>(Lj3/L;)V

    move-object/from16 v26, v0

    move-object/from16 v49, v14

    :goto_2b
    const/4 v5, 0x4

    const/16 v14, 0x14

    const v15, 0x616c6163

    goto/16 :goto_32

    :cond_47
    move-object/from16 v50, v5

    const v3, 0x64656333

    if-ne v0, v3, :cond_4b

    add-int/lit8 v0, v6, 0x8

    .line 152
    invoke-virtual {v7, v0}, LA4/r;->H(I)V

    .line 153
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    .line 154
    invoke-virtual {v7, v3}, LA4/r;->I(I)V

    .line 155
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v3

    and-int/lit16 v3, v3, 0xc0

    const/16 v36, 0x6

    shr-int/lit8 v3, v3, 0x6

    .line 156
    aget v3, v15, v3

    .line 157
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v5

    and-int/lit8 v15, v5, 0xe

    const/16 v21, 0x1

    shr-int/lit8 v15, v15, 0x1

    .line 158
    aget v15, v49, v15

    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_48

    add-int/lit8 v15, v15, 0x1

    .line 159
    :cond_48
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v5

    and-int/lit8 v5, v5, 0x1e

    shr-int/lit8 v5, v5, 0x1

    if-lez v5, :cond_49

    .line 160
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v5

    const/16 v19, 0x2

    and-int/lit8 v5, v5, 0x2

    if-eqz v5, :cond_49

    add-int/lit8 v15, v15, 0x2

    .line 161
    :cond_49
    invoke-virtual {v7}, LA4/r;->e()I

    move-result v5

    if-lez v5, :cond_4a

    .line 162
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v5

    const/16 v21, 0x1

    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_4a

    .line 163
    const-string v5, "audio/eac3-joc"

    :goto_2c
    move-object/from16 v49, v14

    goto :goto_2d

    :cond_4a
    move-object/from16 v5, v68

    goto :goto_2c

    .line 164
    :goto_2d
    new-instance v14, Lj3/L;

    invoke-direct {v14}, Lj3/L;-><init>()V

    .line 165
    iput-object v0, v14, Lj3/L;->a:Ljava/lang/String;

    .line 166
    iput-object v5, v14, Lj3/L;->k:Ljava/lang/String;

    .line 167
    iput v15, v14, Lj3/L;->x:I

    .line 168
    iput v3, v14, Lj3/L;->y:I

    .line 169
    iput-object v11, v14, Lj3/L;->n:Ln3/g;

    .line 170
    iput-object v8, v14, Lj3/L;->c:Ljava/lang/String;

    .line 171
    new-instance v0, Lj3/M;

    invoke-direct {v0, v14}, Lj3/M;-><init>(Lj3/L;)V

    :goto_2e
    move-object/from16 v26, v0

    goto/16 :goto_2b

    :cond_4b
    move-object/from16 v49, v14

    const v3, 0x64616334

    if-ne v0, v3, :cond_4d

    add-int/lit8 v0, v6, 0x8

    .line 172
    invoke-virtual {v7, v0}, LA4/r;->H(I)V

    .line 173
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v14, 0x1

    .line 174
    invoke-virtual {v7, v14}, LA4/r;->I(I)V

    .line 175
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v3

    and-int/lit8 v3, v3, 0x20

    shr-int/lit8 v3, v3, 0x5

    if-ne v3, v14, :cond_4c

    const v3, 0xbb80

    goto :goto_2f

    :cond_4c
    const v3, 0xac44

    .line 176
    :goto_2f
    new-instance v5, Lj3/L;

    invoke-direct {v5}, Lj3/L;-><init>()V

    .line 177
    iput-object v0, v5, Lj3/L;->a:Ljava/lang/String;

    .line 178
    iput-object v12, v5, Lj3/L;->k:Ljava/lang/String;

    const/4 v14, 0x2

    .line 179
    iput v14, v5, Lj3/L;->x:I

    .line 180
    iput v3, v5, Lj3/L;->y:I

    .line 181
    iput-object v11, v5, Lj3/L;->n:Ln3/g;

    .line 182
    iput-object v8, v5, Lj3/L;->c:Ljava/lang/String;

    .line 183
    new-instance v0, Lj3/M;

    invoke-direct {v0, v5}, Lj3/M;-><init>(Lj3/L;)V

    goto :goto_2e

    :cond_4d
    const v3, 0x646d6c70

    if-ne v0, v3, :cond_4f

    if-lez v13, :cond_4e

    move v2, v13

    move-object/from16 v3, v41

    const/4 v5, 0x0

    const/4 v10, 0x2

    goto/16 :goto_2a

    .line 184
    :cond_4e
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    move-result-object v0

    throw v0

    :cond_4f
    const v3, 0x64647473

    if-ne v0, v3, :cond_50

    .line 185
    new-instance v0, Lj3/L;

    invoke-direct {v0}, Lj3/L;-><init>()V

    .line 186
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lj3/L;->a:Ljava/lang/String;

    .line 187
    iput-object v4, v0, Lj3/L;->k:Ljava/lang/String;

    .line 188
    iput v10, v0, Lj3/L;->x:I

    .line 189
    iput v2, v0, Lj3/L;->y:I

    .line 190
    iput-object v11, v0, Lj3/L;->n:Ln3/g;

    .line 191
    iput-object v8, v0, Lj3/L;->c:Ljava/lang/String;

    .line 192
    new-instance v3, Lj3/M;

    invoke-direct {v3, v0}, Lj3/M;-><init>(Lj3/L;)V

    move-object/from16 v26, v3

    goto/16 :goto_2b

    :cond_50
    const v3, 0x644f7073

    if-ne v0, v3, :cond_51

    add-int/lit8 v0, v1, -0x8

    .line 193
    sget-object v3, Ly3/e;->a:[B

    array-length v5, v3

    add-int/2addr v5, v0

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    add-int/lit8 v14, v6, 0x8

    .line 194
    invoke-virtual {v7, v14}, LA4/r;->H(I)V

    .line 195
    array-length v3, v3

    invoke-virtual {v7, v5, v3, v0}, LA4/r;->h([BII)V

    .line 196
    invoke-static {v5}, Ll3/a;->c([B)Ljava/util/ArrayList;

    move-result-object v0

    :goto_30
    move-object v3, v0

    goto/16 :goto_29

    :cond_51
    const v3, 0x64664c61

    if-ne v0, v3, :cond_52

    add-int/lit8 v0, v1, -0xc

    add-int/lit8 v3, v1, -0x8

    .line 197
    new-array v3, v3, [B

    const/16 v5, 0x66

    const/16 v32, 0x0

    .line 198
    aput-byte v5, v3, v32

    const/16 v5, 0x4c

    const/16 v21, 0x1

    .line 199
    aput-byte v5, v3, v21

    const/16 v5, 0x61

    const/16 v19, 0x2

    .line 200
    aput-byte v5, v3, v19

    const/16 v5, 0x43

    .line 201
    aput-byte v5, v3, v17

    add-int/lit8 v5, v6, 0xc

    .line 202
    invoke-virtual {v7, v5}, LA4/r;->H(I)V

    const/4 v5, 0x4

    .line 203
    invoke-virtual {v7, v3, v5, v0}, LA4/r;->h([BII)V

    .line 204
    invoke-static {v3}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    move-result-object v0

    goto :goto_30

    :cond_52
    const/4 v5, 0x4

    const v15, 0x616c6163

    if-ne v0, v15, :cond_53

    add-int/lit8 v0, v1, -0xc

    .line 205
    new-array v2, v0, [B

    add-int/lit8 v3, v6, 0xc

    .line 206
    invoke-virtual {v7, v3}, LA4/r;->H(I)V

    const/4 v3, 0x0

    .line 207
    invoke-virtual {v7, v2, v3, v0}, LA4/r;->h([BII)V

    .line 208
    new-instance v0, LA4/r;

    invoke-direct {v0, v2}, LA4/r;-><init>([B)V

    const/16 v3, 0x9

    .line 209
    invoke-virtual {v0, v3}, LA4/r;->H(I)V

    .line 210
    invoke-virtual {v0}, LA4/r;->x()I

    move-result v3

    const/16 v14, 0x14

    .line 211
    invoke-virtual {v0, v14}, LA4/r;->H(I)V

    .line 212
    invoke-virtual {v0}, LA4/r;->A()I

    move-result v0

    .line 213
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    .line 214
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 215
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 216
    invoke-static {v2}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    move-result-object v2

    move v5, v3

    move-object v3, v2

    move v2, v5

    move v10, v0

    :goto_31
    const/4 v5, 0x0

    goto/16 :goto_3d

    :cond_53
    const/16 v14, 0x14

    :goto_32
    move-object/from16 v3, v41

    goto :goto_31

    :goto_33
    if-ne v0, v3, :cond_54

    move v0, v6

    :goto_34
    const/4 v3, -0x1

    goto :goto_39

    .line 217
    :cond_54
    iget v0, v7, LA4/r;->a:I

    if-lt v0, v6, :cond_55

    const/4 v3, 0x1

    :goto_35
    const/4 v5, 0x0

    goto :goto_36

    :cond_55
    const/4 v3, 0x0

    goto :goto_35

    .line 218
    :goto_36
    invoke-static {v5, v3}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    :goto_37
    sub-int v3, v0, v6

    if-ge v3, v1, :cond_58

    .line 219
    invoke-virtual {v7, v0}, LA4/r;->H(I)V

    .line 220
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v3

    if-lez v3, :cond_56

    const/4 v5, 0x1

    goto :goto_38

    :cond_56
    const/4 v5, 0x0

    .line 221
    :goto_38
    invoke-static {v9, v5}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 222
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v5

    const v14, 0x65736473

    if-ne v5, v14, :cond_57

    goto :goto_34

    :cond_57
    add-int/2addr v0, v3

    const/16 v14, 0x14

    goto :goto_37

    :cond_58
    const/4 v0, -0x1

    goto :goto_34

    :goto_39
    if-eq v0, v3, :cond_5b

    .line 223
    invoke-static {v0, v7}, Ly3/e;->a(ILA4/r;)LN3/X;

    move-result-object v0

    .line 224
    iget-object v3, v0, LN3/X;->c:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    iget-object v3, v0, LN3/X;->d:Ljava/lang/Object;

    check-cast v3, [B

    if-eqz v3, :cond_5a

    .line 225
    const-string v5, "audio/mp4a-latm"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_59

    .line 226
    new-instance v2, LZ3/f;

    .line 227
    array-length v5, v3

    invoke-direct {v2, v5, v3}, LZ3/f;-><init>(I[B)V

    const/4 v5, 0x0

    .line 228
    invoke-static {v2, v5}, Ll3/a;->i(LZ3/f;Z)LA4/r;

    move-result-object v2

    .line 229
    iget v10, v2, LA4/r;->a:I

    iget v14, v2, LA4/r;->b:I

    iget-object v2, v2, LA4/r;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    move-object/from16 v50, v2

    move v2, v10

    move v10, v14

    goto :goto_3a

    :cond_59
    const/4 v5, 0x0

    .line 230
    :goto_3a
    invoke-static {v3}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    move-result-object v3

    goto :goto_3c

    :cond_5a
    const/4 v5, 0x0

    :goto_3b
    move-object/from16 v3, v41

    goto :goto_3c

    :cond_5b
    const/4 v5, 0x0

    move-object/from16 v0, v40

    goto :goto_3b

    :goto_3c
    move-object/from16 v40, v0

    :goto_3d
    add-int/2addr v6, v1

    move/from16 v15, v42

    move/from16 v0, v48

    move-object/from16 v14, v49

    move-object/from16 v5, v50

    goto/16 :goto_27

    :cond_5c
    move/from16 v48, v0

    move-object/from16 v41, v3

    move-object/from16 v50, v5

    move/from16 v42, v15

    const/4 v5, 0x0

    if-nez v26, :cond_5e

    if-eqz v4, :cond_5e

    .line 231
    new-instance v0, Lj3/L;

    invoke-direct {v0}, Lj3/L;-><init>()V

    .line 232
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lj3/L;->a:Ljava/lang/String;

    .line 233
    iput-object v4, v0, Lj3/L;->k:Ljava/lang/String;

    move-object/from16 v1, v50

    .line 234
    iput-object v1, v0, Lj3/L;->h:Ljava/lang/String;

    .line 235
    iput v10, v0, Lj3/L;->x:I

    .line 236
    iput v2, v0, Lj3/L;->y:I

    move/from16 v4, v42

    .line 237
    iput v4, v0, Lj3/L;->z:I

    move-object/from16 v3, v41

    .line 238
    iput-object v3, v0, Lj3/L;->m:Ljava/util/List;

    .line 239
    iput-object v11, v0, Lj3/L;->n:Ln3/g;

    .line 240
    iput-object v8, v0, Lj3/L;->c:Ljava/lang/String;

    if-eqz v40, :cond_5d

    move-object/from16 v1, v40

    .line 241
    iget-wide v2, v1, LN3/X;->a:J

    invoke-static {v2, v3}, Lv4/e;->L(J)I

    move-result v2

    .line 242
    iput v2, v0, Lj3/L;->f:I

    .line 243
    iget-wide v1, v1, LN3/X;->b:J

    invoke-static {v1, v2}, Lv4/e;->L(J)I

    move-result v1

    .line 244
    iput v1, v0, Lj3/L;->g:I

    .line 245
    :cond_5d
    new-instance v1, Lj3/M;

    invoke-direct {v1, v0}, Lj3/M;-><init>(Lj3/L;)V

    move-object/from16 v26, v1

    :cond_5e
    :goto_3e
    move-object/from16 v41, v8

    move/from16 v4, v17

    move/from16 v3, v46

    move/from16 v55, v48

    move/from16 v15, v70

    goto/16 :goto_15

    :goto_3f
    add-int/lit8 v10, v47, 0x10

    .line 246
    invoke-virtual {v7, v10}, LA4/r;->H(I)V

    const/16 v12, 0x10

    .line 247
    invoke-virtual {v7, v12}, LA4/r;->I(I)V

    .line 248
    invoke-virtual {v7}, LA4/r;->C()I

    move-result v0

    .line 249
    invoke-virtual {v7}, LA4/r;->C()I

    move-result v1

    const/16 v2, 0x32

    .line 250
    invoke-virtual {v7, v2}, LA4/r;->I(I)V

    .line 251
    iget v2, v7, LA4/r;->a:I

    const v11, 0x656e6376

    if-ne v4, v11, :cond_61

    move/from16 v3, v47

    move/from16 v6, v48

    .line 252
    invoke-static {v7, v3, v6}, Ly3/e;->c(LA4/r;II)Landroid/util/Pair;

    move-result-object v10

    if-eqz v10, :cond_60

    .line 253
    iget-object v4, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez p4, :cond_5f

    move-object/from16 v12, p4

    const/4 v11, 0x0

    goto :goto_40

    .line 254
    :cond_5f
    iget-object v11, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Ly3/p;

    iget-object v11, v11, Ly3/p;->b:Ljava/lang/String;

    move-object/from16 v12, p4

    invoke-virtual {v12, v11}, Ln3/g;->a(Ljava/lang/String;)Ln3/g;

    move-result-object v11

    .line 255
    :goto_40
    iget-object v10, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ly3/p;

    aput-object v10, v63, v64

    goto :goto_41

    :cond_60
    move-object/from16 v12, p4

    move-object v11, v12

    .line 256
    :goto_41
    invoke-virtual {v7, v2}, LA4/r;->H(I)V

    goto :goto_42

    :cond_61
    move-object/from16 v12, p4

    move/from16 v3, v47

    move/from16 v6, v48

    move-object v11, v12

    .line 257
    :goto_42
    const-string v10, "video/3gpp"

    const v13, 0x6d317620

    if-ne v4, v13, :cond_62

    .line 258
    const-string v13, "video/mpeg"

    goto :goto_43

    :cond_62
    const v13, 0x48323633

    if-ne v4, v13, :cond_63

    move-object v13, v10

    goto :goto_43

    :cond_63
    const/4 v13, 0x0

    :goto_43
    const/high16 v14, 0x3f800000    # 1.0f

    move/from16 v47, v3

    move/from16 v43, v5

    move-object/from16 v41, v8

    move-object/from16 v42, v10

    move-object v5, v13

    move v15, v14

    move/from16 v50, v23

    const/4 v8, -0x1

    const/4 v10, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v23, 0x0

    const/16 v48, 0x0

    const/16 v49, -0x1

    const/16 v51, -0x1

    move v3, v2

    const/4 v2, 0x0

    :goto_44
    sub-int v12, v3, v47

    if-ge v12, v6, :cond_90

    .line 259
    invoke-virtual {v7, v3}, LA4/r;->H(I)V

    .line 260
    iget v12, v7, LA4/r;->a:I

    move/from16 v52, v3

    .line 261
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v3

    move/from16 v54, v10

    if-nez v3, :cond_64

    .line 262
    iget v10, v7, LA4/r;->a:I

    sub-int v10, v10, v47

    if-ne v10, v6, :cond_64

    :goto_45
    move-object/from16 v59, v2

    move/from16 v55, v6

    move/from16 v60, v8

    move-object/from16 v58, v11

    move-object/from16 v61, v14

    move/from16 v62, v15

    move/from16 v4, v17

    const/4 v6, 0x0

    const/16 v12, 0x10

    goto/16 :goto_65

    :cond_64
    if-lez v3, :cond_65

    const/4 v10, 0x1

    goto :goto_46

    :cond_65
    const/4 v10, 0x0

    .line 263
    :goto_46
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 264
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v10

    move/from16 v55, v6

    const v6, 0x61766343

    if-ne v10, v6, :cond_68

    if-nez v5, :cond_66

    const/4 v2, 0x1

    :goto_47
    const/4 v5, 0x0

    goto :goto_48

    :cond_66
    const/4 v2, 0x0

    goto :goto_47

    .line 265
    :goto_48
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    add-int/lit8 v12, v12, 0x8

    .line 266
    invoke-virtual {v7, v12}, LA4/r;->H(I)V

    .line 267
    invoke-static {v7}, Lm4/a;->a(LA4/r;)Lm4/a;

    move-result-object v2

    if-nez v43, :cond_67

    .line 268
    iget v15, v2, Lm4/a;->e:F

    .line 269
    :cond_67
    iget-object v5, v2, Lm4/a;->a:Ljava/util/ArrayList;

    iget v6, v2, Lm4/a;->b:I

    const-string v10, "video/avc"

    iget-object v2, v2, Lm4/a;->f:Ljava/lang/String;

    move-object v13, v2

    move/from16 v56, v4

    move-object v2, v5

    move/from16 v50, v6

    move-object/from16 v57, v9

    move-object v5, v10

    :goto_49
    move-object/from16 v58, v11

    move-object/from16 v61, v14

    move/from16 v4, v17

    :goto_4a
    const/4 v6, 0x0

    :goto_4b
    const/4 v10, 0x6

    const/16 v12, 0x10

    const v14, 0x65736473

    goto/16 :goto_64

    :cond_68
    const v6, 0x68766343

    if-ne v10, v6, :cond_6b

    if-nez v5, :cond_69

    const/4 v2, 0x1

    :goto_4c
    const/4 v5, 0x0

    goto :goto_4d

    :cond_69
    const/4 v2, 0x0

    goto :goto_4c

    .line 270
    :goto_4d
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    add-int/lit8 v12, v12, 0x8

    .line 271
    invoke-virtual {v7, v12}, LA4/r;->H(I)V

    .line 272
    invoke-static {v7}, Lm4/e;->a(LA4/r;)Lm4/e;

    move-result-object v2

    if-nez v43, :cond_6a

    .line 273
    iget v15, v2, Lm4/e;->c:F

    .line 274
    :cond_6a
    iget v5, v2, Lm4/e;->b:I

    const-string v6, "video/hevc"

    iget-object v10, v2, Lm4/e;->a:Ljava/util/List;

    iget-object v2, v2, Lm4/e;->d:Ljava/lang/String;

    move-object v13, v2

    move/from16 v56, v4

    move/from16 v50, v5

    move-object v5, v6

    move-object/from16 v57, v9

    move-object v2, v10

    goto :goto_49

    :cond_6b
    const v6, 0x64766343

    if-eq v10, v6, :cond_6c

    const v6, 0x64767643

    if-ne v10, v6, :cond_6d

    :cond_6c
    move-object/from16 v59, v2

    move/from16 v56, v4

    move/from16 v60, v8

    move-object/from16 v57, v9

    move-object/from16 v58, v11

    move-object/from16 v61, v14

    move/from16 v62, v15

    move/from16 v4, v17

    const/4 v6, 0x0

    const/4 v10, 0x6

    const/16 v12, 0x10

    const v14, 0x65736473

    goto/16 :goto_63

    :cond_6d
    const v6, 0x76706343

    if-ne v10, v6, :cond_70

    if-nez v5, :cond_6e

    const/4 v5, 0x1

    :goto_4e
    const/4 v6, 0x0

    goto :goto_4f

    :cond_6e
    const/4 v5, 0x0

    goto :goto_4e

    .line 275
    :goto_4f
    invoke-static {v6, v5}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    const v6, 0x76703038

    if-ne v4, v6, :cond_6f

    .line 276
    const-string v5, "video/x-vnd.on2.vp8"

    goto :goto_50

    :cond_6f
    const-string v5, "video/x-vnd.on2.vp9"

    :goto_50
    move/from16 v56, v4

    :goto_51
    move-object/from16 v57, v9

    goto :goto_49

    :cond_70
    const v6, 0x61763143

    if-ne v10, v6, :cond_72

    if-nez v5, :cond_71

    const/4 v5, 0x1

    :goto_52
    const/4 v6, 0x0

    goto :goto_53

    :cond_71
    const/4 v5, 0x0

    goto :goto_52

    .line 277
    :goto_53
    invoke-static {v6, v5}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 278
    const-string v5, "video/av01"

    goto :goto_50

    :cond_72
    const v6, 0x636c6c69

    const/16 v56, 0x19

    if-ne v10, v6, :cond_74

    if-nez v23, :cond_73

    .line 279
    invoke-static/range {v56 .. v56}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v6

    goto :goto_54

    :cond_73
    move-object/from16 v6, v23

    :goto_54
    const/16 v10, 0x15

    .line 280
    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 281
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v10

    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 282
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v10

    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move/from16 v56, v4

    move-object/from16 v23, v6

    goto :goto_51

    :cond_74
    const v6, 0x6d646376

    if-ne v10, v6, :cond_76

    if-nez v23, :cond_75

    .line 283
    invoke-static/range {v56 .. v56}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v6

    goto :goto_55

    :cond_75
    move-object/from16 v6, v23

    .line 284
    :goto_55
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v10

    .line 285
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v12

    move/from16 v56, v4

    .line 286
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v4

    move-object/from16 v57, v9

    .line 287
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v9

    move-object/from16 v58, v11

    .line 288
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v11

    move-object/from16 v59, v2

    .line 289
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v2

    move/from16 v60, v8

    .line 290
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v8

    move-object/from16 v61, v14

    .line 291
    invoke-virtual {v7}, LA4/r;->u()S

    move-result v14

    .line 292
    invoke-virtual {v7}, LA4/r;->y()J

    move-result-wide v65

    .line 293
    invoke-virtual {v7}, LA4/r;->y()J

    move-result-wide v67

    move/from16 v62, v15

    const/4 v15, 0x1

    .line 294
    invoke-virtual {v6, v15}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 295
    invoke-virtual {v6, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 296
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 297
    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 298
    invoke-virtual {v6, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 299
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 300
    invoke-virtual {v6, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 301
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 302
    invoke-virtual {v6, v14}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v8, 0x2710

    .line 303
    div-long v10, v65, v8

    long-to-int v2, v10

    int-to-short v2, v2

    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 304
    div-long v8, v67, v8

    long-to-int v2, v8

    int-to-short v2, v2

    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v23, v6

    move/from16 v4, v17

    move-object/from16 v2, v59

    move/from16 v8, v60

    move/from16 v15, v62

    goto/16 :goto_4a

    :cond_76
    move-object/from16 v59, v2

    move/from16 v56, v4

    move/from16 v60, v8

    move-object/from16 v57, v9

    move-object/from16 v58, v11

    move-object/from16 v61, v14

    move/from16 v62, v15

    const v2, 0x64323633

    if-ne v10, v2, :cond_78

    if-nez v5, :cond_77

    const/4 v2, 0x1

    :goto_56
    const/4 v6, 0x0

    goto :goto_57

    :cond_77
    const/4 v2, 0x0

    goto :goto_56

    .line 305
    :goto_57
    invoke-static {v6, v2}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    move/from16 v4, v17

    move-object/from16 v5, v42

    move-object/from16 v2, v59

    move/from16 v8, v60

    move/from16 v15, v62

    goto/16 :goto_4b

    :cond_78
    const/4 v6, 0x0

    const v14, 0x65736473

    if-ne v10, v14, :cond_7c

    if-nez v5, :cond_79

    const/4 v2, 0x1

    goto :goto_58

    :cond_79
    const/4 v2, 0x0

    .line 306
    :goto_58
    invoke-static {v6, v2}, Lcom/google/android/gms/internal/measurement/u1;->h(Ljava/lang/String;Z)V

    .line 307
    invoke-static {v12, v7}, Ly3/e;->a(ILA4/r;)LN3/X;

    move-result-object v2

    .line 308
    iget-object v4, v2, LN3/X;->d:Ljava/lang/Object;

    check-cast v4, [B

    if-eqz v4, :cond_7a

    .line 309
    invoke-static {v4}, LP5/F;->s(Ljava/lang/Object;)LP5/S;

    move-result-object v4

    move-object/from16 v59, v4

    .line 310
    :cond_7a
    iget-object v4, v2, LN3/X;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    move-object/from16 v48, v2

    move-object v5, v4

    :goto_59
    move/from16 v4, v17

    :cond_7b
    :goto_5a
    move-object/from16 v2, v59

    move/from16 v8, v60

    move/from16 v15, v62

    const/4 v10, 0x6

    const/16 v12, 0x10

    goto/16 :goto_64

    :cond_7c
    const v2, 0x70617370

    if-ne v10, v2, :cond_7d

    add-int/lit8 v12, v12, 0x8

    .line 311
    invoke-virtual {v7, v12}, LA4/r;->H(I)V

    .line 312
    invoke-virtual {v7}, LA4/r;->A()I

    move-result v2

    .line 313
    invoke-virtual {v7}, LA4/r;->A()I

    move-result v4

    int-to-float v2, v2

    int-to-float v4, v4

    div-float/2addr v2, v4

    move v15, v2

    move/from16 v4, v17

    move-object/from16 v2, v59

    move/from16 v8, v60

    const/4 v10, 0x6

    const/16 v12, 0x10

    const/16 v43, 0x1

    goto/16 :goto_64

    :cond_7d
    const v2, 0x73763364

    if-ne v10, v2, :cond_80

    add-int/lit8 v2, v12, 0x8

    :goto_5b
    sub-int v4, v2, v12

    if-ge v4, v3, :cond_7f

    .line 314
    invoke-virtual {v7, v2}, LA4/r;->H(I)V

    .line 315
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v4

    .line 316
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v8

    const v9, 0x70726f6a

    if-ne v8, v9, :cond_7e

    .line 317
    iget-object v8, v7, LA4/r;->c:Ljava/lang/Object;

    check-cast v8, [B

    add-int/2addr v4, v2

    .line 318
    invoke-static {v8, v2, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    goto :goto_5c

    :cond_7e
    add-int/2addr v2, v4

    goto :goto_5b

    :cond_7f
    move-object v2, v6

    :goto_5c
    move-object/from16 v61, v2

    goto :goto_59

    :cond_80
    const v2, 0x73743364

    if-ne v10, v2, :cond_85

    .line 319
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v2

    move/from16 v4, v17

    .line 320
    invoke-virtual {v7, v4}, LA4/r;->I(I)V

    if-nez v2, :cond_7b

    .line 321
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v2

    if-eqz v2, :cond_84

    const/4 v15, 0x1

    if-eq v2, v15, :cond_83

    const/4 v8, 0x2

    if-eq v2, v8, :cond_82

    if-eq v2, v4, :cond_81

    goto :goto_5a

    :cond_81
    move/from16 v60, v4

    goto :goto_5a

    :cond_82
    const/16 v60, 0x2

    goto :goto_5a

    :cond_83
    const/16 v60, 0x1

    goto/16 :goto_5a

    :cond_84
    const/16 v60, 0x0

    goto/16 :goto_5a

    :cond_85
    move/from16 v4, v17

    const v2, 0x636f6c72

    if-ne v10, v2, :cond_87

    .line 322
    invoke-virtual {v7}, LA4/r;->i()I

    move-result v2

    const v8, 0x6e636c78

    if-eq v2, v8, :cond_88

    const v8, 0x6e636c63

    if-ne v2, v8, :cond_86

    goto :goto_5d

    .line 323
    :cond_86
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Unsupported color type: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, LQ0/b;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v8, "AtomParsers"

    invoke-static {v8, v2}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    :cond_87
    const/4 v10, 0x6

    const/16 v12, 0x10

    goto :goto_62

    .line 324
    :cond_88
    :goto_5d
    invoke-virtual {v7}, LA4/r;->C()I

    move-result v2

    .line 325
    invoke-virtual {v7}, LA4/r;->C()I

    move-result v8

    const/4 v9, 0x2

    .line 326
    invoke-virtual {v7, v9}, LA4/r;->I(I)V

    const/16 v9, 0x13

    if-ne v3, v9, :cond_89

    .line 327
    invoke-virtual {v7}, LA4/r;->x()I

    move-result v9

    and-int/lit16 v9, v9, 0x80

    if-eqz v9, :cond_89

    const/4 v9, 0x1

    goto :goto_5e

    :cond_89
    const/4 v9, 0x0

    .line 328
    :goto_5e
    invoke-static {v2}, Lm4/b;->a(I)I

    move-result v2

    if-eqz v9, :cond_8a

    const/4 v9, 0x1

    :goto_5f
    const/4 v15, 0x1

    goto :goto_60

    :cond_8a
    const/4 v9, 0x2

    goto :goto_5f

    :goto_60
    if-eq v8, v15, :cond_8d

    const/16 v12, 0x10

    if-eq v8, v12, :cond_8c

    const/16 v10, 0x12

    const/4 v11, 0x7

    if-eq v8, v10, :cond_8b

    const/4 v10, 0x6

    if-eq v8, v10, :cond_8e

    if-eq v8, v11, :cond_8e

    const/4 v11, -0x1

    goto :goto_61

    :cond_8b
    const/4 v10, 0x6

    goto :goto_61

    :cond_8c
    const/4 v10, 0x6

    move v11, v10

    goto :goto_61

    :cond_8d
    const/4 v10, 0x6

    const/16 v12, 0x10

    :cond_8e
    move v11, v4

    :goto_61
    move/from16 v54, v2

    move/from16 v51, v9

    move/from16 v49, v11

    :cond_8f
    :goto_62
    move-object/from16 v2, v59

    move/from16 v8, v60

    move/from16 v15, v62

    goto :goto_64

    .line 329
    :goto_63
    invoke-static {v7}, LQ2/i;->a(LA4/r;)LQ2/i;

    move-result-object v2

    if-eqz v2, :cond_8f

    .line 330
    iget-object v13, v2, LQ2/i;->a:Ljava/lang/String;

    const-string v5, "video/dolby-vision"

    goto :goto_62

    :goto_64
    add-int v3, v52, v3

    move/from16 v17, v4

    move/from16 v10, v54

    move/from16 v6, v55

    move/from16 v4, v56

    move-object/from16 v9, v57

    move-object/from16 v11, v58

    move-object/from16 v14, v61

    goto/16 :goto_44

    :cond_90
    move/from16 v54, v10

    goto/16 :goto_45

    :goto_65
    if-nez v5, :cond_91

    move/from16 v3, v46

    const/4 v0, -0x1

    goto/16 :goto_68

    .line 331
    :cond_91
    new-instance v2, Lj3/L;

    invoke-direct {v2}, Lj3/L;-><init>()V

    .line 332
    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lj3/L;->a:Ljava/lang/String;

    .line 333
    iput-object v5, v2, Lj3/L;->k:Ljava/lang/String;

    .line 334
    iput-object v13, v2, Lj3/L;->h:Ljava/lang/String;

    .line 335
    iput v0, v2, Lj3/L;->p:I

    .line 336
    iput v1, v2, Lj3/L;->q:I

    move/from16 v14, v62

    .line 337
    iput v14, v2, Lj3/L;->t:F

    move/from16 v3, v46

    .line 338
    iput v3, v2, Lj3/L;->s:I

    move-object/from16 v0, v61

    .line 339
    iput-object v0, v2, Lj3/L;->u:[B

    move/from16 v8, v60

    .line 340
    iput v8, v2, Lj3/L;->v:I

    move-object/from16 v0, v59

    .line 341
    iput-object v0, v2, Lj3/L;->m:Ljava/util/List;

    move-object/from16 v11, v58

    .line 342
    iput-object v11, v2, Lj3/L;->n:Ln3/g;

    move/from16 v1, v54

    const/4 v0, -0x1

    if-ne v1, v0, :cond_92

    move/from16 v5, v51

    move/from16 v8, v49

    if-ne v5, v0, :cond_93

    if-ne v8, v0, :cond_93

    if-eqz v23, :cond_95

    goto :goto_66

    :cond_92
    move/from16 v8, v49

    move/from16 v5, v51

    .line 343
    :cond_93
    :goto_66
    new-instance v9, Lm4/b;

    if-eqz v23, :cond_94

    .line 344
    invoke-virtual/range {v23 .. v23}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v10

    goto :goto_67

    :cond_94
    move-object v10, v6

    :goto_67
    invoke-direct {v9, v1, v5, v8, v10}, Lm4/b;-><init>(III[B)V

    .line 345
    iput-object v9, v2, Lj3/L;->w:Lm4/b;

    :cond_95
    if-eqz v48, :cond_96

    move-object/from16 v1, v48

    .line 346
    iget-wide v8, v1, LN3/X;->a:J

    invoke-static {v8, v9}, Lv4/e;->L(J)I

    move-result v5

    .line 347
    iput v5, v2, Lj3/L;->f:I

    .line 348
    iget-wide v8, v1, LN3/X;->b:J

    invoke-static {v8, v9}, Lv4/e;->L(J)I

    move-result v1

    .line 349
    iput v1, v2, Lj3/L;->g:I

    .line 350
    :cond_96
    new-instance v1, Lj3/M;

    invoke-direct {v1, v2}, Lj3/M;-><init>(Lj3/L;)V

    move-object/from16 v26, v1

    :goto_68
    move/from16 v23, v50

    move/from16 v15, v70

    :goto_69
    add-int v10, v47, v55

    .line 351
    invoke-virtual {v7, v10}, LA4/r;->H(I)V

    add-int/lit8 v13, v64, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move/from16 v17, v4

    move v10, v12

    move/from16 v9, v31

    move/from16 v4, v33

    move/from16 v11, v34

    move-object/from16 v2, v39

    move-object/from16 v8, v41

    move-object/from16 v6, v44

    move-object/from16 v5, v45

    move/from16 v14, v53

    move-object/from16 v12, v63

    goto/16 :goto_10

    :cond_97
    move-object/from16 v39, v2

    move/from16 v33, v4

    move-object/from16 v45, v5

    move-object/from16 v44, v6

    move/from16 v31, v9

    move-object/from16 v63, v12

    move/from16 v53, v14

    move/from16 v70, v15

    const/4 v6, 0x0

    if-nez p5, :cond_9d

    const v0, 0x65647473

    move-object/from16 v5, v45

    .line 352
    invoke-virtual {v5, v0}, Ly3/a;->r(I)Ly3/a;

    move-result-object v0

    if-eqz v0, :cond_9e

    const v1, 0x656c7374

    .line 353
    invoke-virtual {v0, v1}, Ly3/a;->s(I)Ly3/b;

    move-result-object v0

    if-nez v0, :cond_98

    move-object v1, v6

    goto :goto_6d

    .line 354
    :cond_98
    iget-object v0, v0, Ly3/b;->c:LA4/r;

    const/16 v8, 0x8

    invoke-virtual {v0, v8}, LA4/r;->H(I)V

    .line 355
    invoke-virtual {v0}, LA4/r;->i()I

    move-result v1

    .line 356
    invoke-static {v1}, LQ0/b;->q(I)I

    move-result v1

    .line 357
    invoke-virtual {v0}, LA4/r;->A()I

    move-result v2

    .line 358
    new-array v3, v2, [J

    .line 359
    new-array v4, v2, [J

    const/4 v11, 0x0

    :goto_6a
    if-ge v11, v2, :cond_9c

    const/4 v14, 0x1

    if-ne v1, v14, :cond_99

    .line 360
    invoke-virtual {v0}, LA4/r;->B()J

    move-result-wide v7

    goto :goto_6b

    :cond_99
    invoke-virtual {v0}, LA4/r;->y()J

    move-result-wide v7

    :goto_6b
    aput-wide v7, v3, v11

    if-ne v1, v14, :cond_9a

    .line 361
    invoke-virtual {v0}, LA4/r;->q()J

    move-result-wide v7

    goto :goto_6c

    :cond_9a
    invoke-virtual {v0}, LA4/r;->i()I

    move-result v7

    int-to-long v7, v7

    :goto_6c
    aput-wide v7, v4, v11

    .line 362
    invoke-virtual {v0}, LA4/r;->u()S

    move-result v7

    if-ne v7, v14, :cond_9b

    const/4 v8, 0x2

    .line 363
    invoke-virtual {v0, v8}, LA4/r;->I(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_6a

    .line 364
    :cond_9b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported media rate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 365
    :cond_9c
    invoke-static {v3, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    :goto_6d
    if-eqz v1, :cond_9e

    .line 366
    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, [J

    .line 367
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [J

    move-object/from16 v30, v0

    goto :goto_6e

    :cond_9d
    move-object/from16 v5, v45

    :cond_9e
    move-object v1, v6

    move-object/from16 v30, v1

    :goto_6e
    if-nez v26, :cond_9f

    move-object/from16 v0, p7

    move-object v13, v6

    goto :goto_6f

    .line 368
    :cond_9f
    new-instance v17, Ly3/o;

    move-object/from16 v0, v44

    .line 369
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    .line 370
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v20

    move/from16 v29, v23

    move/from16 v19, v31

    move-wide/from16 v22, v37

    move/from16 v18, v53

    move-object/from16 v28, v63

    move/from16 v27, v70

    move-object/from16 v31, v1

    invoke-direct/range {v17 .. v31}, Ly3/o;-><init>(IIJJJLj3/M;I[Ly3/p;I[J[J)V

    move-object/from16 v0, p7

    move-object/from16 v13, v17

    .line 371
    :goto_6f
    invoke-interface {v0, v13}, LO5/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/o;

    if-nez v1, :cond_a0

    move-object/from16 v3, p1

    move-object/from16 v2, v39

    goto :goto_70

    :cond_a0
    const v2, 0x6d646961

    .line 372
    invoke-virtual {v5, v2}, Ly3/a;->r(I)Ly3/a;

    move-result-object v2

    .line 373
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x6d696e66

    .line 374
    invoke-virtual {v2, v6}, Ly3/a;->r(I)Ly3/a;

    move-result-object v2

    .line 375
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x7374626c

    .line 376
    invoke-virtual {v2, v6}, Ly3/a;->r(I)Ly3/a;

    move-result-object v2

    .line 377
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v3, p1

    .line 378
    invoke-static {v1, v2, v3}, Ly3/e;->d(Ly3/o;Ly3/a;Lq3/o;)Ly3/r;

    move-result-object v1

    move-object/from16 v2, v39

    .line 379
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_70
    add-int/lit8 v4, v33, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    goto/16 :goto_0

    :cond_a1
    return-object v2
.end method
