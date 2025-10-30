.class public final LA3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA3/i;


# static fields
.field public static final l:[F


# instance fields
.field public final a:LA3/D;

.field public final b:LA4/r;

.field public final c:[Z

.field public final d:LA3/l;

.field public final e:LA3/v;

.field public f:LA3/m;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Lq3/u;

.field public j:Z

.field public k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LA3/n;->l:[F

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
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

.method public constructor <init>(LA3/D;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA3/n;->a:LA3/D;

    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, LA3/n;->c:[Z

    .line 10
    .line 11
    new-instance p1, LA3/l;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x80

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    iput-object v0, p1, LA3/l;->e:[B

    .line 21
    .line 22
    iput-object p1, p0, LA3/n;->d:LA3/l;

    .line 23
    .line 24
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide v0, p0, LA3/n;->k:J

    .line 30
    .line 31
    new-instance p1, LA3/v;

    .line 32
    .line 33
    const/16 v0, 0xb2

    .line 34
    .line 35
    invoke-direct {p1, v0}, LA3/v;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LA3/n;->e:LA3/v;

    .line 39
    .line 40
    new-instance p1, LA4/r;

    .line 41
    .line 42
    const/4 v0, 0x5

    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {p1, v0, v1}, LA4/r;-><init>(IZ)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, LA3/n;->b:LA4/r;

    .line 48
    .line 49
    return-void
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


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LA3/n;->c:[Z

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->q([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA3/n;->d:LA3/l;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, LA3/l;->a:Z

    .line 10
    .line 11
    iput v1, v0, LA3/l;->c:I

    .line 12
    .line 13
    iput v1, v0, LA3/l;->b:I

    .line 14
    .line 15
    iget-object v0, p0, LA3/n;->f:LA3/m;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-boolean v1, v0, LA3/m;->b:Z

    .line 20
    .line 21
    iput-boolean v1, v0, LA3/m;->c:Z

    .line 22
    .line 23
    iput-boolean v1, v0, LA3/m;->d:Z

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    iput v1, v0, LA3/m;->e:I

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, LA3/n;->e:LA3/v;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, LA3/v;->f()V

    .line 33
    .line 34
    .line 35
    :cond_1
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    iput-wide v0, p0, LA3/n;->g:J

    .line 38
    .line 39
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    iput-wide v0, p0, LA3/n;->k:J

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

.method public final c(LA4/r;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v5, v0, LA3/n;->f:LA3/m;

    .line 8
    .line 9
    invoke-static {v5}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v5, v0, LA3/n;->i:Lq3/u;

    .line 13
    .line 14
    invoke-static {v5}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget v5, v1, LA4/r;->a:I

    .line 18
    .line 19
    iget v6, v1, LA4/r;->b:I

    .line 20
    .line 21
    iget-object v7, v1, LA4/r;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v7, [B

    .line 24
    .line 25
    iget-wide v8, v0, LA3/n;->g:J

    .line 26
    .line 27
    invoke-virtual {v1}, LA4/r;->e()I

    .line 28
    .line 29
    .line 30
    move-result v10

    .line 31
    int-to-long v10, v10

    .line 32
    add-long/2addr v8, v10

    .line 33
    iput-wide v8, v0, LA3/n;->g:J

    .line 34
    .line 35
    iget-object v8, v0, LA3/n;->i:Lq3/u;

    .line 36
    .line 37
    invoke-virtual {v1}, LA4/r;->e()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    invoke-interface {v8, v9, v1}, Lq3/u;->c(ILA4/r;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object v8, v0, LA3/n;->c:[Z

    .line 45
    .line 46
    invoke-static {v7, v5, v6, v8}, Ll4/a;->w([BII[Z)I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    iget-object v9, v0, LA3/n;->d:LA3/l;

    .line 51
    .line 52
    iget-object v10, v0, LA3/n;->e:LA3/v;

    .line 53
    .line 54
    if-ne v8, v6, :cond_2

    .line 55
    .line 56
    iget-boolean v1, v0, LA3/n;->j:Z

    .line 57
    .line 58
    if-nez v1, :cond_0

    .line 59
    .line 60
    invoke-virtual {v9, v7, v5, v6}, LA3/l;->a([BII)V

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object v1, v0, LA3/n;->f:LA3/m;

    .line 64
    .line 65
    invoke-virtual {v1, v7, v5, v6}, LA3/m;->a([BII)V

    .line 66
    .line 67
    .line 68
    if-eqz v10, :cond_1

    .line 69
    .line 70
    invoke-virtual {v10, v7, v5, v6}, LA3/v;->a([BII)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void

    .line 74
    :cond_2
    iget-object v11, v1, LA4/r;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v11, [B

    .line 77
    .line 78
    add-int/lit8 v12, v8, 0x3

    .line 79
    .line 80
    aget-byte v11, v11, v12

    .line 81
    .line 82
    and-int/lit16 v13, v11, 0xff

    .line 83
    .line 84
    sub-int v14, v8, v5

    .line 85
    .line 86
    iget-boolean v15, v0, LA3/n;->j:Z

    .line 87
    .line 88
    if-nez v15, :cond_18

    .line 89
    .line 90
    if-lez v14, :cond_3

    .line 91
    .line 92
    invoke-virtual {v9, v7, v5, v8}, LA3/l;->a([BII)V

    .line 93
    .line 94
    .line 95
    :cond_3
    if-gez v14, :cond_4

    .line 96
    .line 97
    neg-int v15, v14

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    const/4 v15, 0x0

    .line 100
    :goto_1
    iget v3, v9, LA3/l;->b:I

    .line 101
    .line 102
    if-eqz v3, :cond_16

    .line 103
    .line 104
    const-string v2, "H263Reader"

    .line 105
    .line 106
    move/from16 v17, v6

    .line 107
    .line 108
    const-string v6, "Unexpected start code value"

    .line 109
    .line 110
    if-eq v3, v4, :cond_14

    .line 111
    .line 112
    const/4 v4, 0x2

    .line 113
    if-eq v3, v4, :cond_12

    .line 114
    .line 115
    const/4 v4, 0x4

    .line 116
    move/from16 v19, v12

    .line 117
    .line 118
    const/4 v12, 0x3

    .line 119
    if-eq v3, v12, :cond_10

    .line 120
    .line 121
    if-ne v3, v4, :cond_f

    .line 122
    .line 123
    const/16 v3, 0xb3

    .line 124
    .line 125
    if-eq v13, v3, :cond_5

    .line 126
    .line 127
    const/16 v3, 0xb5

    .line 128
    .line 129
    if-ne v13, v3, :cond_17

    .line 130
    .line 131
    :cond_5
    iget v3, v9, LA3/l;->c:I

    .line 132
    .line 133
    sub-int/2addr v3, v15

    .line 134
    iput v3, v9, LA3/l;->c:I

    .line 135
    .line 136
    const/4 v3, 0x0

    .line 137
    iput-boolean v3, v9, LA3/l;->a:Z

    .line 138
    .line 139
    iget-object v3, v0, LA3/n;->i:Lq3/u;

    .line 140
    .line 141
    iget v6, v9, LA3/l;->d:I

    .line 142
    .line 143
    iget-object v11, v0, LA3/n;->h:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v12, v9, LA3/l;->e:[B

    .line 149
    .line 150
    iget v9, v9, LA3/l;->c:I

    .line 151
    .line 152
    invoke-static {v12, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    new-instance v12, LZ3/f;

    .line 157
    .line 158
    array-length v15, v9

    .line 159
    invoke-direct {v12, v15, v9}, LZ3/f;-><init>(I[B)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v6}, LZ3/f;->s(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v4}, LZ3/f;->s(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 169
    .line 170
    .line 171
    const/16 v6, 0x8

    .line 172
    .line 173
    invoke-virtual {v12, v6}, LZ3/f;->r(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, LZ3/f;->h()Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    if-eqz v15, :cond_6

    .line 181
    .line 182
    invoke-virtual {v12, v4}, LZ3/f;->r(I)V

    .line 183
    .line 184
    .line 185
    const/4 v15, 0x3

    .line 186
    invoke-virtual {v12, v15}, LZ3/f;->r(I)V

    .line 187
    .line 188
    .line 189
    :cond_6
    invoke-virtual {v12, v4}, LZ3/f;->i(I)I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    const-string v15, "Invalid aspect ratio"

    .line 194
    .line 195
    move-object/from16 v20, v9

    .line 196
    .line 197
    const/16 v9, 0xf

    .line 198
    .line 199
    if-ne v4, v9, :cond_8

    .line 200
    .line 201
    invoke-virtual {v12, v6}, LZ3/f;->i(I)I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    invoke-virtual {v12, v6}, LZ3/f;->i(I)I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-nez v6, :cond_7

    .line 210
    .line 211
    invoke-static {v2, v15}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_7
    int-to-float v4, v4

    .line 216
    int-to-float v6, v6

    .line 217
    div-float v15, v4, v6

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_8
    const/4 v6, 0x7

    .line 221
    if-ge v4, v6, :cond_9

    .line 222
    .line 223
    sget-object v6, LA3/n;->l:[F

    .line 224
    .line 225
    aget v15, v6, v4

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_9
    invoke-static {v2, v15}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :goto_2
    const/high16 v15, 0x3f800000    # 1.0f

    .line 232
    .line 233
    :goto_3
    invoke-virtual {v12}, LZ3/f;->h()Z

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-eqz v4, :cond_a

    .line 238
    .line 239
    const/4 v4, 0x2

    .line 240
    invoke-virtual {v12, v4}, LZ3/f;->r(I)V

    .line 241
    .line 242
    .line 243
    const/4 v4, 0x1

    .line 244
    invoke-virtual {v12, v4}, LZ3/f;->r(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12}, LZ3/f;->h()Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_a

    .line 252
    .line 253
    invoke-virtual {v12, v9}, LZ3/f;->r(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v9}, LZ3/f;->r(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v9}, LZ3/f;->r(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 269
    .line 270
    .line 271
    const/4 v4, 0x3

    .line 272
    invoke-virtual {v12, v4}, LZ3/f;->r(I)V

    .line 273
    .line 274
    .line 275
    const/16 v4, 0xb

    .line 276
    .line 277
    invoke-virtual {v12, v4}, LZ3/f;->r(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v9}, LZ3/f;->r(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 287
    .line 288
    .line 289
    :cond_a
    const/4 v4, 0x2

    .line 290
    invoke-virtual {v12, v4}, LZ3/f;->i(I)I

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    if-eqz v6, :cond_b

    .line 295
    .line 296
    const-string v4, "Unhandled video object layer shape"

    .line 297
    .line 298
    invoke-static {v2, v4}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    :cond_b
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 302
    .line 303
    .line 304
    const/16 v4, 0x10

    .line 305
    .line 306
    invoke-virtual {v12, v4}, LZ3/f;->i(I)I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, LZ3/f;->h()Z

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-eqz v6, :cond_e

    .line 318
    .line 319
    if-nez v4, :cond_c

    .line 320
    .line 321
    const-string v4, "Invalid vop_increment_time_resolution"

    .line 322
    .line 323
    invoke-static {v2, v4}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_c
    add-int/lit8 v4, v4, -0x1

    .line 328
    .line 329
    const/4 v2, 0x0

    .line 330
    :goto_4
    if-lez v4, :cond_d

    .line 331
    .line 332
    const/16 v18, 0x1

    .line 333
    .line 334
    add-int/lit8 v2, v2, 0x1

    .line 335
    .line 336
    shr-int/lit8 v4, v4, 0x1

    .line 337
    .line 338
    goto :goto_4

    .line 339
    :cond_d
    invoke-virtual {v12, v2}, LZ3/f;->r(I)V

    .line 340
    .line 341
    .line 342
    :cond_e
    :goto_5
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 343
    .line 344
    .line 345
    const/16 v2, 0xd

    .line 346
    .line 347
    invoke-virtual {v12, v2}, LZ3/f;->i(I)I

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v2}, LZ3/f;->i(I)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12}, LZ3/f;->q()V

    .line 362
    .line 363
    .line 364
    new-instance v6, Lj3/L;

    .line 365
    .line 366
    invoke-direct {v6}, Lj3/L;-><init>()V

    .line 367
    .line 368
    .line 369
    iput-object v11, v6, Lj3/L;->a:Ljava/lang/String;

    .line 370
    .line 371
    const-string v9, "video/mp4v-es"

    .line 372
    .line 373
    iput-object v9, v6, Lj3/L;->k:Ljava/lang/String;

    .line 374
    .line 375
    iput v4, v6, Lj3/L;->p:I

    .line 376
    .line 377
    iput v2, v6, Lj3/L;->q:I

    .line 378
    .line 379
    iput v15, v6, Lj3/L;->t:F

    .line 380
    .line 381
    invoke-static/range {v20 .. v20}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    iput-object v2, v6, Lj3/L;->m:Ljava/util/List;

    .line 386
    .line 387
    invoke-static {v6, v3}, Lcom/google/android/gms/internal/measurement/k1;->u(Lj3/L;Lq3/u;)V

    .line 388
    .line 389
    .line 390
    const/4 v4, 0x1

    .line 391
    iput-boolean v4, v0, LA3/n;->j:Z

    .line 392
    .line 393
    :goto_6
    const/4 v15, 0x3

    .line 394
    goto/16 :goto_8

    .line 395
    .line 396
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 397
    .line 398
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 399
    .line 400
    .line 401
    throw v1

    .line 402
    :cond_10
    and-int/lit16 v3, v11, 0xf0

    .line 403
    .line 404
    const/16 v11, 0x20

    .line 405
    .line 406
    if-eq v3, v11, :cond_11

    .line 407
    .line 408
    invoke-static {v2, v6}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    const/4 v3, 0x0

    .line 412
    iput-boolean v3, v9, LA3/l;->a:Z

    .line 413
    .line 414
    iput v3, v9, LA3/l;->c:I

    .line 415
    .line 416
    iput v3, v9, LA3/l;->b:I

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_11
    const/4 v3, 0x0

    .line 420
    iget v2, v9, LA3/l;->c:I

    .line 421
    .line 422
    iput v2, v9, LA3/l;->d:I

    .line 423
    .line 424
    iput v4, v9, LA3/l;->b:I

    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_12
    move/from16 v19, v12

    .line 428
    .line 429
    const/4 v3, 0x0

    .line 430
    const/16 v4, 0x1f

    .line 431
    .line 432
    if-le v13, v4, :cond_13

    .line 433
    .line 434
    invoke-static {v2, v6}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    iput-boolean v3, v9, LA3/l;->a:Z

    .line 438
    .line 439
    iput v3, v9, LA3/l;->c:I

    .line 440
    .line 441
    iput v3, v9, LA3/l;->b:I

    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_13
    const/4 v15, 0x3

    .line 445
    iput v15, v9, LA3/l;->b:I

    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_14
    move/from16 v19, v12

    .line 449
    .line 450
    const/4 v3, 0x0

    .line 451
    const/16 v4, 0xb5

    .line 452
    .line 453
    if-eq v13, v4, :cond_15

    .line 454
    .line 455
    invoke-static {v2, v6}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    iput-boolean v3, v9, LA3/l;->a:Z

    .line 459
    .line 460
    iput v3, v9, LA3/l;->c:I

    .line 461
    .line 462
    iput v3, v9, LA3/l;->b:I

    .line 463
    .line 464
    goto :goto_7

    .line 465
    :cond_15
    const/4 v4, 0x2

    .line 466
    iput v4, v9, LA3/l;->b:I

    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_16
    move/from16 v17, v6

    .line 470
    .line 471
    move/from16 v19, v12

    .line 472
    .line 473
    const/16 v2, 0xb0

    .line 474
    .line 475
    if-ne v13, v2, :cond_17

    .line 476
    .line 477
    const/4 v4, 0x1

    .line 478
    iput v4, v9, LA3/l;->b:I

    .line 479
    .line 480
    iput-boolean v4, v9, LA3/l;->a:Z

    .line 481
    .line 482
    :cond_17
    :goto_7
    sget-object v2, LA3/l;->f:[B

    .line 483
    .line 484
    const/4 v3, 0x0

    .line 485
    const/4 v15, 0x3

    .line 486
    invoke-virtual {v9, v2, v3, v15}, LA3/l;->a([BII)V

    .line 487
    .line 488
    .line 489
    goto :goto_8

    .line 490
    :cond_18
    move/from16 v17, v6

    .line 491
    .line 492
    move/from16 v19, v12

    .line 493
    .line 494
    goto :goto_6

    .line 495
    :goto_8
    iget-object v2, v0, LA3/n;->f:LA3/m;

    .line 496
    .line 497
    invoke-virtual {v2, v7, v5, v8}, LA3/m;->a([BII)V

    .line 498
    .line 499
    .line 500
    if-eqz v10, :cond_1b

    .line 501
    .line 502
    if-lez v14, :cond_19

    .line 503
    .line 504
    invoke-virtual {v10, v7, v5, v8}, LA3/v;->a([BII)V

    .line 505
    .line 506
    .line 507
    const/4 v2, 0x0

    .line 508
    goto :goto_9

    .line 509
    :cond_19
    neg-int v2, v14

    .line 510
    :goto_9
    invoke-virtual {v10, v2}, LA3/v;->e(I)Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-eqz v2, :cond_1a

    .line 515
    .line 516
    iget-object v2, v10, LA3/v;->f:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v2, [B

    .line 519
    .line 520
    iget v3, v10, LA3/v;->c:I

    .line 521
    .line 522
    invoke-static {v3, v2}, Ll4/a;->O(I[B)I

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    sget v3, Ll4/y;->a:I

    .line 527
    .line 528
    iget-object v3, v10, LA3/v;->f:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v3, [B

    .line 531
    .line 532
    iget-object v4, v0, LA3/n;->b:LA4/r;

    .line 533
    .line 534
    invoke-virtual {v4, v2, v3}, LA4/r;->F(I[B)V

    .line 535
    .line 536
    .line 537
    iget-wide v2, v0, LA3/n;->k:J

    .line 538
    .line 539
    iget-object v5, v0, LA3/n;->a:LA3/D;

    .line 540
    .line 541
    invoke-virtual {v5, v2, v3, v4}, LA3/D;->a(JLA4/r;)V

    .line 542
    .line 543
    .line 544
    :cond_1a
    const/16 v2, 0xb2

    .line 545
    .line 546
    if-ne v13, v2, :cond_1b

    .line 547
    .line 548
    iget-object v2, v1, LA4/r;->c:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v2, [B

    .line 551
    .line 552
    const/16 v16, 0x2

    .line 553
    .line 554
    add-int/lit8 v3, v8, 0x2

    .line 555
    .line 556
    aget-byte v2, v2, v3

    .line 557
    .line 558
    const/4 v4, 0x1

    .line 559
    if-ne v2, v4, :cond_1c

    .line 560
    .line 561
    invoke-virtual {v10, v13}, LA3/v;->g(I)V

    .line 562
    .line 563
    .line 564
    goto :goto_a

    .line 565
    :cond_1b
    const/4 v4, 0x1

    .line 566
    const/16 v16, 0x2

    .line 567
    .line 568
    :cond_1c
    :goto_a
    sub-int v6, v17, v8

    .line 569
    .line 570
    iget-wide v2, v0, LA3/n;->g:J

    .line 571
    .line 572
    int-to-long v8, v6

    .line 573
    sub-long/2addr v2, v8

    .line 574
    iget-object v5, v0, LA3/n;->f:LA3/m;

    .line 575
    .line 576
    iget-boolean v8, v0, LA3/n;->j:Z

    .line 577
    .line 578
    iget v9, v5, LA3/m;->e:I

    .line 579
    .line 580
    const/16 v10, 0xb6

    .line 581
    .line 582
    if-ne v9, v10, :cond_1d

    .line 583
    .line 584
    if-eqz v8, :cond_1d

    .line 585
    .line 586
    iget-boolean v8, v5, LA3/m;->b:Z

    .line 587
    .line 588
    if-eqz v8, :cond_1d

    .line 589
    .line 590
    iget-wide v8, v5, LA3/m;->h:J

    .line 591
    .line 592
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    cmp-long v11, v8, v11

    .line 598
    .line 599
    if-eqz v11, :cond_1d

    .line 600
    .line 601
    iget-wide v11, v5, LA3/m;->g:J

    .line 602
    .line 603
    sub-long v11, v2, v11

    .line 604
    .line 605
    long-to-int v11, v11

    .line 606
    iget-boolean v12, v5, LA3/m;->d:Z

    .line 607
    .line 608
    iget-object v14, v5, LA3/m;->a:Lq3/u;

    .line 609
    .line 610
    const/16 v26, 0x0

    .line 611
    .line 612
    move/from16 v25, v6

    .line 613
    .line 614
    move-wide/from16 v21, v8

    .line 615
    .line 616
    move/from16 v24, v11

    .line 617
    .line 618
    move/from16 v23, v12

    .line 619
    .line 620
    move-object/from16 v20, v14

    .line 621
    .line 622
    invoke-interface/range {v20 .. v26}, Lq3/u;->d(JIIILq3/t;)V

    .line 623
    .line 624
    .line 625
    :cond_1d
    iget v6, v5, LA3/m;->e:I

    .line 626
    .line 627
    const/16 v8, 0xb3

    .line 628
    .line 629
    if-eq v6, v8, :cond_1e

    .line 630
    .line 631
    iput-wide v2, v5, LA3/m;->g:J

    .line 632
    .line 633
    :cond_1e
    iget-object v2, v0, LA3/n;->f:LA3/m;

    .line 634
    .line 635
    iget-wide v5, v0, LA3/n;->k:J

    .line 636
    .line 637
    iput v13, v2, LA3/m;->e:I

    .line 638
    .line 639
    const/4 v3, 0x0

    .line 640
    iput-boolean v3, v2, LA3/m;->d:Z

    .line 641
    .line 642
    if-eq v13, v10, :cond_20

    .line 643
    .line 644
    if-ne v13, v8, :cond_1f

    .line 645
    .line 646
    goto :goto_b

    .line 647
    :cond_1f
    const/4 v3, 0x0

    .line 648
    goto :goto_c

    .line 649
    :cond_20
    :goto_b
    move v3, v4

    .line 650
    :goto_c
    iput-boolean v3, v2, LA3/m;->b:Z

    .line 651
    .line 652
    if-ne v13, v10, :cond_21

    .line 653
    .line 654
    move v3, v4

    .line 655
    goto :goto_d

    .line 656
    :cond_21
    const/4 v3, 0x0

    .line 657
    :goto_d
    iput-boolean v3, v2, LA3/m;->c:Z

    .line 658
    .line 659
    const/4 v3, 0x0

    .line 660
    iput v3, v2, LA3/m;->f:I

    .line 661
    .line 662
    iput-wide v5, v2, LA3/m;->h:J

    .line 663
    .line 664
    move v3, v15

    .line 665
    move/from16 v6, v17

    .line 666
    .line 667
    move/from16 v5, v19

    .line 668
    .line 669
    goto/16 :goto_0
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
    iput-wide p1, p0, LA3/n;->k:J

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
    iget-object v0, p2, LA3/I;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LA3/n;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LA3/I;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, LA3/I;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Lq3/l;->u(II)Lq3/u;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LA3/n;->i:Lq3/u;

    .line 22
    .line 23
    new-instance v1, LA3/m;

    .line 24
    .line 25
    invoke-direct {v1, v0}, LA3/m;-><init>(Lq3/u;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, LA3/n;->f:LA3/m;

    .line 29
    .line 30
    iget-object v0, p0, LA3/n;->a:LA3/D;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, LA3/D;->b(Lq3/l;LA3/I;)V

    .line 33
    .line 34
    .line 35
    return-void
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
