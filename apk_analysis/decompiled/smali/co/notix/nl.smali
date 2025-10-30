.class public final Lco/notix/nl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/gb;


# instance fields
.field public final synthetic a:Lco/notix/gb;


# direct methods
.method public constructor <init>(Lco/notix/rj;)V
    .locals 0

    iput-object p1, p0, Lco/notix/nl;->a:Lco/notix/gb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Lorg/json/JSONObject;

    .line 2
    .line 3
    const-string v0, "from"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "id"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v0, "from.getString(\"id\")"

    .line 15
    .line 16
    invoke-static {v2, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "level"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "it"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lco/notix/ql;->values()[Lco/notix/ql;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    array-length v3, v1

    .line 35
    const/4 v4, 0x0

    .line 36
    move v5, v4

    .line 37
    :goto_0
    const/4 v6, 0x0

    .line 38
    if-ge v5, v3, :cond_1

    .line 39
    .line 40
    aget-object v7, v1, v5

    .line 41
    .line 42
    iget-object v8, v7, Lco/notix/ql;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v8, v0}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    if-eqz v8, :cond_0

    .line 49
    .line 50
    move-object v3, v7

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v3, v6

    .line 56
    :goto_1
    invoke-static {v3}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const-string v0, "message"

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "from.getString(\"message\")"

    .line 66
    .line 67
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, "stacktrace"

    .line 71
    .line 72
    invoke-static {p1, v1}, Lco/notix/jc;->d(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const-string v1, "timestamp"

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v7

    .line 82
    const-string v1, "tags"

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eqz v1, :cond_2

    .line 89
    .line 90
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    const-string v10, "obj.keys()"

    .line 95
    .line 96
    invoke-static {v9, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v9}, LV7/l;->f0(Ljava/util/Iterator;)LV7/j;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-interface {v9}, LV7/j;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    if-eqz v11, :cond_3

    .line 117
    .line 118
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    move-object v12, v11

    .line 123
    check-cast v12, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v1, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    invoke-interface {v10, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_2
    move-object v10, v6

    .line 134
    :cond_3
    const-string v1, "prev"

    .line 135
    .line 136
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-eqz p1, :cond_4

    .line 141
    .line 142
    new-instance v1, Lco/notix/ml;

    .line 143
    .line 144
    iget-object v6, p0, Lco/notix/nl;->a:Lco/notix/gb;

    .line 145
    .line 146
    invoke-direct {v1, v6}, Lco/notix/ml;-><init>(Lco/notix/gb;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    invoke-static {v4, v6}, LB6/u0;->N(II)LT7/c;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-static {v4}, LB7/k;->H0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    new-instance v6, Ljava/util/ArrayList;

    .line 162
    .line 163
    const/16 v9, 0xa

    .line 164
    .line 165
    invoke-static {v4, v9}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-eqz v9, :cond_4

    .line 181
    .line 182
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    check-cast v9, Ljava/lang/Number;

    .line 187
    .line 188
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    invoke-virtual {p1, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    const-string v11, "getJSONObject(index)"

    .line 197
    .line 198
    invoke-static {v9, v11}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v9}, Lco/notix/ml;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_4
    move-object v9, v6

    .line 210
    new-instance v1, Lco/notix/pl;

    .line 211
    .line 212
    move-object v4, v0

    .line 213
    move-wide v6, v7

    .line 214
    move-object v8, v10

    .line 215
    invoke-direct/range {v1 .. v9}, Lco/notix/pl;-><init>(Ljava/lang/String;Lco/notix/ql;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Ljava/util/List;)V

    .line 216
    .line 217
    .line 218
    return-object v1
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
