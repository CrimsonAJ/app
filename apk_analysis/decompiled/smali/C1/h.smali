.class public final LC1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:LC1/c;

.field public c:Ljava/lang/Object;

.field public d:LE1/a;

.field public e:Ljava/util/List;

.field public final f:Lf5/o;

.field public final g:Ljava/util/LinkedHashMap;

.field public final h:Z

.field public final i:Z

.field public j:LC1/b;

.field public k:LC1/b;

.field public final l:Lo1/f;

.field public m:LD/n;

.field public n:LD1/i;

.field public o:LD1/g;


# direct methods
.method public constructor <init>(LC1/i;Landroid/content/Context;)V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p2, p0, LC1/h;->a:Landroid/content/Context;

    .line 20
    iget-object v0, p1, LC1/i;->z:LC1/c;

    .line 21
    iput-object v0, p0, LC1/h;->b:LC1/c;

    .line 22
    iget-object v0, p1, LC1/i;->b:Ljava/lang/Object;

    iput-object v0, p0, LC1/h;->c:Ljava/lang/Object;

    .line 23
    iget-object v0, p1, LC1/i;->c:LE1/a;

    iput-object v0, p0, LC1/h;->d:LE1/a;

    .line 24
    iget-object v0, p1, LC1/i;->y:LC1/d;

    .line 25
    iget-object v1, p1, LC1/i;->f:Ljava/util/List;

    iput-object v1, p0, LC1/h;->e:Ljava/util/List;

    .line 26
    iget-object v1, p1, LC1/i;->h:Li8/w;

    invoke-virtual {v1}, Li8/w;->d()Lf5/o;

    move-result-object v1

    iput-object v1, p0, LC1/h;->f:Lf5/o;

    .line 27
    iget-object v1, p1, LC1/i;->i:LC1/q;

    .line 28
    iget-object v1, v1, LC1/q;->a:Ljava/util/Map;

    invoke-static {v1}, LB7/y;->I(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    iput-object v1, p0, LC1/h;->g:Ljava/util/LinkedHashMap;

    .line 29
    iget-boolean v1, p1, LC1/i;->j:Z

    iput-boolean v1, p0, LC1/h;->h:Z

    .line 30
    iget-boolean v1, p1, LC1/i;->m:Z

    iput-boolean v1, p0, LC1/h;->i:Z

    .line 31
    iget-object v1, v0, LC1/d;->a:LC1/b;

    iput-object v1, p0, LC1/h;->j:LC1/b;

    .line 32
    iget-object v0, v0, LC1/d;->b:LC1/b;

    iput-object v0, p0, LC1/h;->k:LC1/b;

    .line 33
    iget-object v0, p1, LC1/i;->x:LC1/n;

    .line 34
    new-instance v1, Lo1/f;

    invoke-direct {v1, v0}, Lo1/f;-><init>(LC1/n;)V

    .line 35
    iput-object v1, p0, LC1/h;->l:Lo1/f;

    .line 36
    iget-object v0, p1, LC1/i;->a:Landroid/content/Context;

    if-ne v0, p2, :cond_0

    .line 37
    iget-object p2, p1, LC1/i;->u:LD/n;

    iput-object p2, p0, LC1/h;->m:LD/n;

    .line 38
    iget-object p2, p1, LC1/i;->v:LD1/i;

    iput-object p2, p0, LC1/h;->n:LD1/i;

    .line 39
    iget-object p1, p1, LC1/i;->w:LD1/g;

    iput-object p1, p0, LC1/h;->o:LD1/g;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 40
    iput-object p1, p0, LC1/h;->m:LD/n;

    .line 41
    iput-object p1, p0, LC1/h;->n:LD1/i;

    .line 42
    iput-object p1, p0, LC1/h;->o:LD1/g;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LC1/h;->a:Landroid/content/Context;

    .line 3
    sget-object p1, LH1/d;->a:LC1/c;

    .line 4
    iput-object p1, p0, LC1/h;->b:LC1/c;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, LC1/h;->c:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, LC1/h;->d:LE1/a;

    .line 7
    sget-object v0, LB7/t;->a:LB7/t;

    iput-object v0, p0, LC1/h;->e:Ljava/util/List;

    .line 8
    iput-object p1, p0, LC1/h;->f:Lf5/o;

    .line 9
    iput-object p1, p0, LC1/h;->g:Ljava/util/LinkedHashMap;

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, LC1/h;->h:Z

    .line 11
    iput-boolean v0, p0, LC1/h;->i:Z

    .line 12
    iput-object p1, p0, LC1/h;->j:LC1/b;

    .line 13
    iput-object p1, p0, LC1/h;->k:LC1/b;

    .line 14
    iput-object p1, p0, LC1/h;->l:Lo1/f;

    .line 15
    iput-object p1, p0, LC1/h;->m:LD/n;

    .line 16
    iput-object p1, p0, LC1/h;->n:LD1/i;

    .line 17
    iput-object p1, p0, LC1/h;->o:LD1/g;

    return-void
.end method


# virtual methods
.method public final a()LC1/i;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LC1/h;->c:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, LC1/k;->b:LC1/k;

    .line 8
    .line 9
    :cond_0
    move-object v4, v1

    .line 10
    iget-object v5, v0, LC1/h;->d:LE1/a;

    .line 11
    .line 12
    iget-object v1, v0, LC1/h;->b:LC1/c;

    .line 13
    .line 14
    iget-object v6, v1, LC1/c;->g:Landroid/graphics/Bitmap$Config;

    .line 15
    .line 16
    iget-object v7, v1, LC1/c;->f:LD1/d;

    .line 17
    .line 18
    iget-object v8, v0, LC1/h;->e:Ljava/util/List;

    .line 19
    .line 20
    iget-object v9, v1, LC1/c;->e:LG1/a;

    .line 21
    .line 22
    iget-object v1, v0, LC1/h;->f:Lf5/o;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Lf5/o;->z()Li8/w;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    if-nez v1, :cond_2

    .line 33
    .line 34
    sget-object v1, LH1/f;->c:Li8/w;

    .line 35
    .line 36
    :goto_1
    move-object v10, v1

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    sget-object v3, LH1/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :goto_2
    iget-object v1, v0, LC1/h;->g:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    new-instance v3, LC1/q;

    .line 46
    .line 47
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/u1;->f0(Ljava/util/Map;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-direct {v3, v1}, LC1/q;-><init>(Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    const/4 v3, 0x0

    .line 56
    :goto_3
    if-nez v3, :cond_4

    .line 57
    .line 58
    sget-object v3, LC1/q;->b:LC1/q;

    .line 59
    .line 60
    :cond_4
    move-object v11, v3

    .line 61
    iget-object v1, v0, LC1/h;->b:LC1/c;

    .line 62
    .line 63
    iget-boolean v13, v1, LC1/c;->h:Z

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v1, v0, LC1/h;->j:LC1/b;

    .line 69
    .line 70
    if-nez v1, :cond_5

    .line 71
    .line 72
    iget-object v1, v0, LC1/h;->b:LC1/c;

    .line 73
    .line 74
    iget-object v1, v1, LC1/c;->i:LC1/b;

    .line 75
    .line 76
    :cond_5
    move-object/from16 v16, v1

    .line 77
    .line 78
    iget-object v1, v0, LC1/h;->k:LC1/b;

    .line 79
    .line 80
    if-nez v1, :cond_6

    .line 81
    .line 82
    iget-object v1, v0, LC1/h;->b:LC1/c;

    .line 83
    .line 84
    iget-object v1, v1, LC1/c;->j:LC1/b;

    .line 85
    .line 86
    :cond_6
    move-object/from16 v17, v1

    .line 87
    .line 88
    iget-object v1, v0, LC1/h;->b:LC1/c;

    .line 89
    .line 90
    iget-object v3, v1, LC1/c;->k:LC1/b;

    .line 91
    .line 92
    iget-object v12, v1, LC1/c;->a:LY7/v;

    .line 93
    .line 94
    iget-object v14, v1, LC1/c;->b:Lf8/d;

    .line 95
    .line 96
    iget-object v15, v1, LC1/c;->c:Lf8/d;

    .line 97
    .line 98
    iget-object v1, v1, LC1/c;->d:Lf8/d;

    .line 99
    .line 100
    iget-object v2, v0, LC1/h;->m:LD/n;

    .line 101
    .line 102
    move-object/from16 v22, v1

    .line 103
    .line 104
    iget-object v1, v0, LC1/h;->a:Landroid/content/Context;

    .line 105
    .line 106
    if-nez v2, :cond_b

    .line 107
    .line 108
    iget-object v2, v0, LC1/h;->d:LE1/a;

    .line 109
    .line 110
    invoke-static {v2}, Lu0/z;->i(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v19

    .line 114
    if-eqz v19, :cond_7

    .line 115
    .line 116
    iget-object v2, v2, LE1/a;->b:Landroid/widget/ImageView;

    .line 117
    .line 118
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    goto :goto_4

    .line 123
    :cond_7
    move-object v2, v1

    .line 124
    :goto_4
    move-object/from16 v19, v3

    .line 125
    .line 126
    :goto_5
    instance-of v3, v2, Landroidx/lifecycle/w;

    .line 127
    .line 128
    if-eqz v3, :cond_8

    .line 129
    .line 130
    check-cast v2, Landroidx/lifecycle/w;

    .line 131
    .line 132
    invoke-interface {v2}, Landroidx/lifecycle/w;->x()LD/n;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    goto :goto_6

    .line 137
    :cond_8
    instance-of v3, v2, Landroid/content/ContextWrapper;

    .line 138
    .line 139
    if-nez v3, :cond_a

    .line 140
    .line 141
    const/4 v2, 0x0

    .line 142
    :goto_6
    if-nez v2, :cond_9

    .line 143
    .line 144
    sget-object v2, LC1/g;->b:LC1/g;

    .line 145
    .line 146
    :cond_9
    :goto_7
    move-object/from16 v23, v2

    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_a
    check-cast v2, Landroid/content/ContextWrapper;

    .line 150
    .line 151
    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    goto :goto_5

    .line 156
    :cond_b
    move-object/from16 v19, v3

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :goto_8
    iget-object v2, v0, LC1/h;->n:LD1/i;

    .line 160
    .line 161
    if-nez v2, :cond_f

    .line 162
    .line 163
    iget-object v2, v0, LC1/h;->d:LE1/a;

    .line 164
    .line 165
    invoke-static {v2}, Lu0/z;->i(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_e

    .line 170
    .line 171
    iget-object v1, v2, LE1/a;->b:Landroid/widget/ImageView;

    .line 172
    .line 173
    if-eqz v1, :cond_d

    .line 174
    .line 175
    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 180
    .line 181
    if-eq v2, v3, :cond_c

    .line 182
    .line 183
    sget-object v3, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 184
    .line 185
    if-ne v2, v3, :cond_d

    .line 186
    .line 187
    :cond_c
    sget-object v1, LD1/h;->c:LD1/h;

    .line 188
    .line 189
    new-instance v1, LD1/e;

    .line 190
    .line 191
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    move-object v2, v1

    .line 195
    goto :goto_9

    .line 196
    :cond_d
    new-instance v2, LD1/f;

    .line 197
    .line 198
    invoke-direct {v2, v1}, LD1/f;-><init>(Landroid/widget/ImageView;)V

    .line 199
    .line 200
    .line 201
    goto :goto_9

    .line 202
    :cond_e
    new-instance v2, LD1/c;

    .line 203
    .line 204
    invoke-direct {v2, v1}, LD1/c;-><init>(Landroid/content/Context;)V

    .line 205
    .line 206
    .line 207
    :cond_f
    :goto_9
    move-object/from16 v24, v2

    .line 208
    .line 209
    iget-object v1, v0, LC1/h;->o:LD1/g;

    .line 210
    .line 211
    if-nez v1, :cond_14

    .line 212
    .line 213
    iget-object v1, v0, LC1/h;->d:LE1/a;

    .line 214
    .line 215
    invoke-static {v1}, Lu0/z;->i(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_10

    .line 220
    .line 221
    goto :goto_a

    .line 222
    :cond_10
    const/4 v1, 0x0

    .line 223
    :goto_a
    if-eqz v1, :cond_11

    .line 224
    .line 225
    iget-object v1, v1, LE1/a;->b:Landroid/widget/ImageView;

    .line 226
    .line 227
    goto :goto_b

    .line 228
    :cond_11
    const/4 v1, 0x0

    .line 229
    :goto_b
    invoke-static {v1}, Lu0/z;->i(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    sget-object v3, LD1/g;->b:LD1/g;

    .line 234
    .line 235
    if-eqz v2, :cond_13

    .line 236
    .line 237
    sget-object v2, LH1/f;->a:[Landroid/graphics/Bitmap$Config;

    .line 238
    .line 239
    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-nez v1, :cond_12

    .line 244
    .line 245
    const/4 v1, -0x1

    .line 246
    goto :goto_c

    .line 247
    :cond_12
    sget-object v2, LH1/e;->a:[I

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    aget v1, v2, v1

    .line 254
    .line 255
    :goto_c
    const/4 v2, 0x1

    .line 256
    if-eq v1, v2, :cond_13

    .line 257
    .line 258
    const/4 v2, 0x2

    .line 259
    if-eq v1, v2, :cond_13

    .line 260
    .line 261
    const/4 v2, 0x3

    .line 262
    if-eq v1, v2, :cond_13

    .line 263
    .line 264
    const/4 v2, 0x4

    .line 265
    if-eq v1, v2, :cond_13

    .line 266
    .line 267
    sget-object v1, LD1/g;->a:LD1/g;

    .line 268
    .line 269
    goto :goto_d

    .line 270
    :cond_13
    move-object v1, v3

    .line 271
    :cond_14
    :goto_d
    move-object/from16 v25, v1

    .line 272
    .line 273
    iget-object v1, v0, LC1/h;->l:Lo1/f;

    .line 274
    .line 275
    if-eqz v1, :cond_15

    .line 276
    .line 277
    new-instance v2, LC1/n;

    .line 278
    .line 279
    iget-object v1, v1, Lo1/f;->b:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 282
    .line 283
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/u1;->f0(Ljava/util/Map;)Ljava/util/Map;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-direct {v2, v1}, LC1/n;-><init>(Ljava/util/Map;)V

    .line 288
    .line 289
    .line 290
    goto :goto_e

    .line 291
    :cond_15
    const/4 v2, 0x0

    .line 292
    :goto_e
    if-nez v2, :cond_16

    .line 293
    .line 294
    sget-object v2, LC1/n;->b:LC1/n;

    .line 295
    .line 296
    :cond_16
    move-object/from16 v26, v2

    .line 297
    .line 298
    new-instance v1, LC1/d;

    .line 299
    .line 300
    iget-object v2, v0, LC1/h;->j:LC1/b;

    .line 301
    .line 302
    iget-object v3, v0, LC1/h;->k:LC1/b;

    .line 303
    .line 304
    invoke-direct {v1, v2, v3}, LC1/d;-><init>(LC1/b;LC1/b;)V

    .line 305
    .line 306
    .line 307
    iget-object v2, v0, LC1/h;->b:LC1/c;

    .line 308
    .line 309
    move-object/from16 v28, v2

    .line 310
    .line 311
    new-instance v2, LC1/i;

    .line 312
    .line 313
    move-object/from16 v18, v19

    .line 314
    .line 315
    move-object/from16 v19, v12

    .line 316
    .line 317
    iget-boolean v12, v0, LC1/h;->h:Z

    .line 318
    .line 319
    move-object/from16 v21, v15

    .line 320
    .line 321
    iget-boolean v15, v0, LC1/h;->i:Z

    .line 322
    .line 323
    iget-object v3, v0, LC1/h;->a:Landroid/content/Context;

    .line 324
    .line 325
    move-object/from16 v20, v14

    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    move-object/from16 v27, v1

    .line 329
    .line 330
    invoke-direct/range {v2 .. v28}, LC1/i;-><init>(Landroid/content/Context;Ljava/lang/Object;LE1/a;Landroid/graphics/Bitmap$Config;LD1/d;Ljava/util/List;LG1/a;Li8/w;LC1/q;ZZZZLC1/b;LC1/b;LC1/b;LY7/v;LY7/v;LY7/v;LY7/v;LD/n;LD1/i;LD1/g;LC1/n;LC1/d;LC1/c;)V

    .line 331
    .line 332
    .line 333
    return-object v2
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

.method public final b(Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    new-instance v0, LE1/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LE1/a;-><init>(Landroid/widget/ImageView;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LC1/h;->d:LE1/a;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, LC1/h;->m:LD/n;

    .line 10
    .line 11
    iput-object p1, p0, LC1/h;->n:LD1/i;

    .line 12
    .line 13
    iput-object p1, p0, LC1/h;->o:LD1/g;

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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
