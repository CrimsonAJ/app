.class public final LY2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;


# virtual methods
.method public a()LY2/l;
    .locals 14

    .line 1
    iget-object v0, p0, LY2/k;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LY2/l;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, LY2/n;->a:LY2/o;

    .line 11
    .line 12
    invoke-static {v2}, La3/a;->a(La3/b;)Lz7/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iput-object v2, v1, LY2/l;->a:Lz7/a;

    .line 17
    .line 18
    new-instance v2, LZ2/e;

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    invoke-direct {v2, v3, v0}, LZ2/e;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, v1, LY2/l;->b:LZ2/e;

    .line 25
    .line 26
    new-instance v0, LZ2/e;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v0, v3, v2}, LZ2/e;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v3, LZ2/g;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v3, v2, v0, v4}, LZ2/g;-><init>(La3/b;Lz7/a;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, La3/a;->a(La3/b;)Lz7/a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, v1, LY2/l;->c:Lz7/a;

    .line 43
    .line 44
    iget-object v0, v1, LY2/l;->b:LZ2/e;

    .line 45
    .line 46
    new-instance v2, LZ2/e;

    .line 47
    .line 48
    const/4 v3, 0x2

    .line 49
    invoke-direct {v2, v3, v0}, LZ2/e;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object v2, v1, LY2/l;->d:LZ2/e;

    .line 53
    .line 54
    new-instance v2, LZ2/e;

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    invoke-direct {v2, v3, v0}, LZ2/e;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, La3/a;->a(La3/b;)Lz7/a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v2, v1, LY2/l;->d:LZ2/e;

    .line 65
    .line 66
    new-instance v3, LZ2/g;

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    invoke-direct {v3, v2, v0, v4}, LZ2/g;-><init>(La3/b;Lz7/a;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v3}, La3/a;->a(La3/b;)Lz7/a;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    iput-object v8, v1, LY2/l;->e:Lz7/a;

    .line 77
    .line 78
    new-instance v0, LY2/o;

    .line 79
    .line 80
    const/4 v2, 0x1

    .line 81
    invoke-direct {v0, v2}, LY2/o;-><init>(I)V

    .line 82
    .line 83
    .line 84
    iget-object v2, v1, LY2/l;->b:LZ2/e;

    .line 85
    .line 86
    new-instance v9, LY2/t;

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    invoke-direct {v9, v2, v8, v0, v3}, LY2/t;-><init>(La3/b;Lz7/a;La3/b;I)V

    .line 90
    .line 91
    .line 92
    iget-object v6, v1, LY2/l;->a:Lz7/a;

    .line 93
    .line 94
    iget-object v7, v1, LY2/l;->c:Lz7/a;

    .line 95
    .line 96
    new-instance v5, Ld3/b;

    .line 97
    .line 98
    move-object v10, v8

    .line 99
    move-object v13, v9

    .line 100
    move-object v9, v8

    .line 101
    move-object v8, v13

    .line 102
    invoke-direct/range {v5 .. v10}, Ld3/b;-><init>(Lz7/a;Lz7/a;LY2/t;Lz7/a;Lz7/a;)V

    .line 103
    .line 104
    .line 105
    move-object v0, v9

    .line 106
    move-object v9, v8

    .line 107
    move-object v8, v0

    .line 108
    move-object v0, v5

    .line 109
    new-instance v5, Le3/k;

    .line 110
    .line 111
    move-object v11, v8

    .line 112
    move-object v12, v8

    .line 113
    move-object v10, v6

    .line 114
    move-object v6, v2

    .line 115
    invoke-direct/range {v5 .. v12}, Le3/k;-><init>(LZ2/e;Lz7/a;Lz7/a;LY2/t;Lz7/a;Lz7/a;Lz7/a;)V

    .line 116
    .line 117
    .line 118
    move-object v6, v10

    .line 119
    new-instance v2, Le3/m;

    .line 120
    .line 121
    invoke-direct {v2, v6, v8, v9, v8}, Le3/m;-><init>(Lz7/a;Lz7/a;LY2/t;Lz7/a;)V

    .line 122
    .line 123
    .line 124
    new-instance v3, LY2/t;

    .line 125
    .line 126
    const/4 v4, 0x0

    .line 127
    invoke-direct {v3, v0, v5, v2, v4}, LY2/t;-><init>(La3/b;Lz7/a;La3/b;I)V

    .line 128
    .line 129
    .line 130
    invoke-static {v3}, La3/a;->a(La3/b;)Lz7/a;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, v1, LY2/l;->f:Lz7/a;

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-class v2, Landroid/content/Context;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v2, " must be set"

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0
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
