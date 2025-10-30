.class public final Lw0/h;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic d:Lw0/f;

.field public final synthetic e:Li0/v;

.field public final synthetic f:Lu0/m;


# direct methods
.method public constructor <init>(Lw0/f;Li0/v;Lu0/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw0/h;->d:Lw0/f;

    .line 2
    .line 3
    iput-object p2, p0, Lw0/h;->e:Li0/v;

    .line 4
    .line 5
    iput-object p3, p0, Lw0/h;->f:Lu0/m;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Landroidx/lifecycle/w;

    .line 2
    .line 3
    iget-object v0, p0, Lw0/h;->d:Lw0/f;

    .line 4
    .line 5
    iget-object v1, v0, Lw0/f;->g:Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move v4, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v4, v2

    .line 14
    :goto_0
    iget-object v5, p0, Lw0/h;->e:Li0/v;

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    move v6, v2

    .line 30
    :cond_2
    if-ge v6, v4, :cond_3

    .line 31
    .line 32
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    add-int/lit8 v6, v6, 0x1

    .line 37
    .line 38
    check-cast v7, LA7/h;

    .line 39
    .line 40
    iget-object v7, v7, LA7/h;->a:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v8, v5, Li0/v;->y:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v7, v8}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    move v2, v3

    .line 51
    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 52
    .line 53
    if-nez v2, :cond_4

    .line 54
    .line 55
    invoke-virtual {v5}, Li0/v;->t()Li0/W;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Li0/W;->b()V

    .line 60
    .line 61
    .line 62
    iget-object p1, p1, Li0/W;->e:Landroidx/lifecycle/y;

    .line 63
    .line 64
    iget-object v1, p1, Landroidx/lifecycle/y;->d:Landroidx/lifecycle/p;

    .line 65
    .line 66
    sget-object v2, Landroidx/lifecycle/p;->c:Landroidx/lifecycle/p;

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-ltz v1, :cond_4

    .line 73
    .line 74
    iget-object v1, p0, Lw0/h;->f:Lu0/m;

    .line 75
    .line 76
    iget-object v0, v0, Lw0/f;->i:LC0/b;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, LC0/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Landroidx/lifecycle/v;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroidx/lifecycle/y;->V(Landroidx/lifecycle/v;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    sget-object p1, LA7/n;->a:LA7/n;

    .line 88
    .line 89
    return-object p1
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
