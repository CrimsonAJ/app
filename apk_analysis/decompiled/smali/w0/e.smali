.class public final synthetic Lw0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/S;


# instance fields
.field public final synthetic a:Lu0/o;

.field public final synthetic b:Lw0/f;


# direct methods
.method public synthetic constructor <init>(Lu0/o;Lw0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/e;->a:Lu0/o;

    iput-object p2, p0, Lw0/e;->b:Lw0/f;

    return-void
.end method


# virtual methods
.method public final a(Li0/M;Li0/v;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lw0/e;->a:Lu0/o;

    .line 2
    .line 3
    iget-object v1, p0, Lw0/e;->b:Lw0/f;

    .line 4
    .line 5
    const-string v2, "this$0"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "<anonymous parameter 0>"

    .line 11
    .line 12
    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string p1, "fragment"

    .line 16
    .line 17
    invoke-static {p2, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, Lu0/o;->e:Lb8/H;

    .line 21
    .line 22
    iget-object p1, p1, Lb8/H;->a:Lb8/F;

    .line 23
    .line 24
    check-cast p1, Lb8/Q;

    .line 25
    .line 26
    invoke-virtual {p1}, Lb8/Q;->h()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-interface {p1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    move-object v3, v2

    .line 51
    check-cast v3, Lu0/m;

    .line 52
    .line 53
    iget-object v3, v3, Lu0/m;->f:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v4, p2, Li0/v;->y:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 v2, 0x0

    .line 65
    :goto_0
    check-cast v2, Lu0/m;

    .line 66
    .line 67
    invoke-static {}, Lw0/f;->n()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    new-instance p1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v3, "Attaching fragment "

    .line 76
    .line 77
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v3, " associated with entry "

    .line 84
    .line 85
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v3, " to FragmentManager "

    .line 92
    .line 93
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-object v3, v1, Lw0/f;->d:Li0/M;

    .line 97
    .line 98
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string v3, "FragmentNavigator"

    .line 106
    .line 107
    invoke-static {v3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_2
    if-eqz v2, :cond_3

    .line 111
    .line 112
    new-instance p1, Lw0/h;

    .line 113
    .line 114
    invoke-direct {p1, v1, p2, v2}, Lw0/h;-><init>(Lw0/f;Li0/v;Lu0/m;)V

    .line 115
    .line 116
    .line 117
    new-instance v3, Ld2/u;

    .line 118
    .line 119
    const/4 v4, 0x1

    .line 120
    invoke-direct {v3, v4, p1}, Ld2/u;-><init>(ILO7/l;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p2, Li0/v;->o0:Landroidx/lifecycle/E;

    .line 124
    .line 125
    invoke-virtual {p1, p2, v3}, Landroidx/lifecycle/E;->d(Landroidx/lifecycle/w;Landroidx/lifecycle/F;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p2, Li0/v;->m0:Landroidx/lifecycle/y;

    .line 129
    .line 130
    iget-object v3, v1, Lw0/f;->h:LN0/c;

    .line 131
    .line 132
    invoke-virtual {p1, v3}, Landroidx/lifecycle/y;->V(Landroidx/lifecycle/v;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, p2, v2, v0}, Lw0/f;->l(Li0/v;Lu0/m;Lu0/o;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    return-void
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
