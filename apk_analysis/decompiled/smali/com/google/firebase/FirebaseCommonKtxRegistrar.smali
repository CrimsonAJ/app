.class public final Lcom/google/firebase/FirebaseCommonKtxRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls6/b;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, Ls6/p;

    .line 4
    .line 5
    const-class v3, Lr6/a;

    .line 6
    .line 7
    const-class v4, LY7/v;

    .line 8
    .line 9
    invoke-direct {v2, v3, v4}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Ls6/b;->b(Ls6/p;)Ls6/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v5, Ls6/p;

    .line 17
    .line 18
    const-class v6, Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    invoke-direct {v5, v3, v6}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Ls6/h;

    .line 24
    .line 25
    invoke-direct {v3, v5, v1, v0}, Ls6/h;-><init>(Ls6/p;II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ls6/a;->a(Ls6/h;)V

    .line 29
    .line 30
    .line 31
    sget-object v3, Ll6/g;->b:Ll6/g;

    .line 32
    .line 33
    iput-object v3, v2, Ls6/a;->f:Ls6/d;

    .line 34
    .line 35
    invoke-virtual {v2}, Ls6/a;->b()Ls6/b;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, Ls6/p;

    .line 40
    .line 41
    const-class v5, Lr6/c;

    .line 42
    .line 43
    invoke-direct {v3, v5, v4}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v3}, Ls6/b;->b(Ls6/p;)Ls6/a;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    new-instance v7, Ls6/p;

    .line 51
    .line 52
    invoke-direct {v7, v5, v6}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    new-instance v5, Ls6/h;

    .line 56
    .line 57
    invoke-direct {v5, v7, v1, v0}, Ls6/h;-><init>(Ls6/p;II)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v5}, Ls6/a;->a(Ls6/h;)V

    .line 61
    .line 62
    .line 63
    sget-object v5, Ll6/g;->c:Ll6/g;

    .line 64
    .line 65
    iput-object v5, v3, Ls6/a;->f:Ls6/d;

    .line 66
    .line 67
    invoke-virtual {v3}, Ls6/a;->b()Ls6/b;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    new-instance v5, Ls6/p;

    .line 72
    .line 73
    const-class v7, Lr6/b;

    .line 74
    .line 75
    invoke-direct {v5, v7, v4}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v5}, Ls6/b;->b(Ls6/p;)Ls6/a;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    new-instance v8, Ls6/p;

    .line 83
    .line 84
    invoke-direct {v8, v7, v6}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 85
    .line 86
    .line 87
    new-instance v7, Ls6/h;

    .line 88
    .line 89
    invoke-direct {v7, v8, v1, v0}, Ls6/h;-><init>(Ls6/p;II)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v7}, Ls6/a;->a(Ls6/h;)V

    .line 93
    .line 94
    .line 95
    sget-object v7, Ll6/g;->d:Ll6/g;

    .line 96
    .line 97
    iput-object v7, v5, Ls6/a;->f:Ls6/d;

    .line 98
    .line 99
    invoke-virtual {v5}, Ls6/a;->b()Ls6/b;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    new-instance v7, Ls6/p;

    .line 104
    .line 105
    const-class v8, Lr6/d;

    .line 106
    .line 107
    invoke-direct {v7, v8, v4}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v7}, Ls6/b;->b(Ls6/p;)Ls6/a;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    new-instance v7, Ls6/p;

    .line 115
    .line 116
    invoke-direct {v7, v8, v6}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 117
    .line 118
    .line 119
    new-instance v6, Ls6/h;

    .line 120
    .line 121
    invoke-direct {v6, v7, v1, v0}, Ls6/h;-><init>(Ls6/p;II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v6}, Ls6/a;->a(Ls6/h;)V

    .line 125
    .line 126
    .line 127
    sget-object v6, Ll6/g;->e:Ll6/g;

    .line 128
    .line 129
    iput-object v6, v4, Ls6/a;->f:Ls6/d;

    .line 130
    .line 131
    invoke-virtual {v4}, Ls6/a;->b()Ls6/b;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    const/4 v6, 0x4

    .line 136
    new-array v6, v6, [Ls6/b;

    .line 137
    .line 138
    aput-object v2, v6, v0

    .line 139
    .line 140
    aput-object v3, v6, v1

    .line 141
    .line 142
    const/4 v0, 0x2

    .line 143
    aput-object v5, v6, v0

    .line 144
    .line 145
    const/4 v0, 0x3

    .line 146
    aput-object v4, v6, v0

    .line 147
    .line 148
    invoke-static {v6}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0
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
