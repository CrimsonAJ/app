.class public final synthetic LA6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, LA6/q;->a:I

    iput-object p1, p0, LA6/q;->b:Ljava/lang/Object;

    iput-object p2, p0, LA6/q;->c:Ljava/lang/Object;

    iput-object p3, p0, LA6/q;->d:Ljava/lang/Object;

    iput-object p4, p0, LA6/q;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, LA6/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA6/q;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LY2/j;

    .line 9
    .line 10
    iget-object v1, v0, LY2/j;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, LA6/q;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, LV2/g;

    .line 15
    .line 16
    iget-object v3, p0, LA6/q;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, LY2/i;

    .line 19
    .line 20
    iget-object v4, p0, LA6/q;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Ld3/a;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v5, Ld3/a;->f:Ljava/util/logging/Logger;

    .line 28
    .line 29
    const-string v6, "Transport backend \'"

    .line 30
    .line 31
    :try_start_0
    iget-object v7, v4, Ld3/a;->c:LZ2/f;

    .line 32
    .line 33
    invoke-virtual {v7, v1}, LZ2/f;->a(Ljava/lang/String;)LZ2/h;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    if-nez v7, :cond_0

    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, "\' is not registered"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v5, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v2, v1}, LV2/g;->b(Ljava/lang/Exception;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catch_0
    move-exception v0

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    check-cast v7, LW2/b;

    .line 71
    .line 72
    invoke-virtual {v7, v3}, LW2/b;->a(LY2/i;)LY2/i;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v3, v4, Ld3/a;->e:Lg3/c;

    .line 77
    .line 78
    new-instance v6, Lc7/d;

    .line 79
    .line 80
    const/4 v7, 0x2

    .line 81
    invoke-direct {v6, v4, v0, v1, v7}, Lc7/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    check-cast v3, Lf3/h;

    .line 85
    .line 86
    invoke-virtual {v3, v6}, Lf3/h;->F(Lg3/b;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    invoke-interface {v2, v0}, LV2/g;->b(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v3, "Error scheduling event "

    .line 97
    .line 98
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v5, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v2, v0}, LV2/g;->b(Ljava/lang/Exception;)V

    .line 116
    .line 117
    .line 118
    :goto_1
    return-void

    .line 119
    :pswitch_0
    iget-object v0, p0, LA6/q;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, LN3/G;

    .line 122
    .line 123
    iget v0, v0, LN3/G;->a:I

    .line 124
    .line 125
    iget-object v1, p0, LA6/q;->c:Ljava/lang/Object;

    .line 126
    .line 127
    iget-object v2, p0, LA6/q;->e:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, LN3/v;

    .line 130
    .line 131
    iget-object v3, p0, LA6/q;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, LN3/A;

    .line 134
    .line 135
    invoke-interface {v1, v0, v3, v2}, LN3/H;->J(ILN3/A;LN3/v;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_1
    iget-object v0, p0, LA6/q;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, LE6/e;

    .line 142
    .line 143
    iget-object v1, v0, LE6/e;->g:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Ljava/lang/String;

    .line 152
    .line 153
    iget-object v2, p0, LA6/q;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v2, Ljava/lang/String;

    .line 156
    .line 157
    iget-object v3, v0, LE6/e;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v3, LA6/h;

    .line 160
    .line 161
    if-eqz v1, :cond_1

    .line 162
    .line 163
    iget-object v0, v0, LE6/e;->g:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Ljava/lang/String;

    .line 172
    .line 173
    const-string v1, "Failed to close user metadata file."

    .line 174
    .line 175
    iget-object v4, v3, LA6/h;->a:LE6/e;

    .line 176
    .line 177
    const-string v5, "user-data"

    .line 178
    .line 179
    invoke-virtual {v4, v2, v5}, LE6/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    const/4 v5, 0x0

    .line 184
    :try_start_1
    new-instance v6, LA6/g;

    .line 185
    .line 186
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string v7, "userId"

    .line 190
    .line 191
    invoke-virtual {v6, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    new-instance v6, Ljava/io/BufferedWriter;

    .line 199
    .line 200
    new-instance v7, Ljava/io/OutputStreamWriter;

    .line 201
    .line 202
    new-instance v8, Ljava/io/FileOutputStream;

    .line 203
    .line 204
    invoke-direct {v8, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 205
    .line 206
    .line 207
    sget-object v4, LA6/h;->b:Ljava/nio/charset/Charset;

    .line 208
    .line 209
    invoke-direct {v7, v8, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 210
    .line 211
    .line 212
    invoke-direct {v6, v7}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    .line 214
    .line 215
    :try_start_2
    invoke-virtual {v6, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6}, Ljava/io/Writer;->flush()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 219
    .line 220
    .line 221
    invoke-static {v6, v1}, Ly6/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    goto :goto_4

    .line 225
    :catchall_0
    move-exception v0

    .line 226
    move-object v5, v6

    .line 227
    goto :goto_3

    .line 228
    :catch_1
    move-exception v0

    .line 229
    move-object v5, v6

    .line 230
    goto :goto_2

    .line 231
    :catchall_1
    move-exception v0

    .line 232
    goto :goto_3

    .line 233
    :catch_2
    move-exception v0

    .line 234
    :goto_2
    :try_start_3
    const-string v4, "Error serializing user metadata."

    .line 235
    .line 236
    const-string v6, "FirebaseCrashlytics"

    .line 237
    .line 238
    invoke-static {v6, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 239
    .line 240
    .line 241
    invoke-static {v5, v1}, Ly6/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    goto :goto_4

    .line 245
    :goto_3
    invoke-static {v5, v1}, Ly6/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v0

    .line 249
    :cond_1
    :goto_4
    iget-object v0, p0, LA6/q;->d:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Ljava/util/Map;

    .line 252
    .line 253
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-nez v1, :cond_2

    .line 258
    .line 259
    const/4 v1, 0x0

    .line 260
    invoke-virtual {v3, v2, v0, v1}, LA6/h;->h(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 261
    .line 262
    .line 263
    :cond_2
    iget-object v0, p0, LA6/q;->e:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Ljava/util/List;

    .line 266
    .line 267
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-nez v1, :cond_3

    .line 272
    .line 273
    invoke-virtual {v3, v2, v0}, LA6/h;->i(Ljava/lang/String;Ljava/util/List;)V

    .line 274
    .line 275
    .line 276
    :cond_3
    return-void

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
