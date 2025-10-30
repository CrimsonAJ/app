.class public final Li7/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ll7/c;

.field public final c:Ll7/c;

.field public final d:Lz7/a;

.field public final e:Lz7/a;

.field public final f:Lz7/a;


# direct methods
.method public synthetic constructor <init>(Ll7/c;Ll7/c;Lz7/a;Lz7/a;Lz7/a;I)V
    .locals 0

    .line 1
    iput p6, p0, Li7/U;->a:I

    iput-object p1, p0, Li7/U;->b:Ll7/c;

    iput-object p2, p0, Li7/U;->c:Ll7/c;

    iput-object p3, p0, Li7/U;->d:Lz7/a;

    iput-object p4, p0, Li7/U;->e:Lz7/a;

    iput-object p5, p0, Li7/U;->f:Lz7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Li7/U;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li7/U;->b:Ll7/c;

    .line 7
    .line 8
    iget-object v0, v0, Ll7/c;->a:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, LE7/i;

    .line 12
    .line 13
    iget-object v0, p0, Li7/U;->c:Ll7/c;

    .line 14
    .line 15
    iget-object v0, v0, Ll7/c;->a:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v3, v0

    .line 18
    check-cast v3, LT6/e;

    .line 19
    .line 20
    iget-object v0, p0, Li7/U;->d:Lz7/a;

    .line 21
    .line 22
    invoke-interface {v0}, Lz7/a;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v4, v0

    .line 27
    check-cast v4, Li7/b;

    .line 28
    .line 29
    iget-object v0, p0, Li7/U;->e:Lz7/a;

    .line 30
    .line 31
    invoke-interface {v0}, Lz7/a;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v5, v0

    .line 36
    check-cast v5, Lm7/g;

    .line 37
    .line 38
    iget-object v0, p0, Li7/U;->f:Lz7/a;

    .line 39
    .line 40
    instance-of v1, v0, Lk7/a;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    check-cast v0, Lk7/a;

    .line 45
    .line 46
    move-object v6, v0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v1, Ll7/a;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Ll7/a;-><init>(Lz7/a;)V

    .line 51
    .line 52
    .line 53
    move-object v6, v1

    .line 54
    :goto_0
    new-instance v1, Lm7/e;

    .line 55
    .line 56
    invoke-direct/range {v1 .. v6}, Lm7/e;-><init>(LE7/i;LT6/e;Li7/b;Lm7/g;Lk7/a;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :pswitch_0
    iget-object v0, p0, Li7/U;->b:Ll7/c;

    .line 61
    .line 62
    iget-object v0, v0, Ll7/c;->a:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v2, v0

    .line 65
    check-cast v2, Ll6/f;

    .line 66
    .line 67
    iget-object v0, p0, Li7/U;->c:Ll7/c;

    .line 68
    .line 69
    iget-object v0, v0, Ll7/c;->a:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v3, v0

    .line 72
    check-cast v3, LT6/e;

    .line 73
    .line 74
    iget-object v0, p0, Li7/U;->d:Lz7/a;

    .line 75
    .line 76
    invoke-interface {v0}, Lz7/a;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    move-object v4, v0

    .line 81
    check-cast v4, Lm7/j;

    .line 82
    .line 83
    iget-object v0, p0, Li7/U;->e:Lz7/a;

    .line 84
    .line 85
    invoke-interface {v0}, Lz7/a;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object v5, v0

    .line 90
    check-cast v5, Li7/l;

    .line 91
    .line 92
    iget-object v0, p0, Li7/U;->f:Lz7/a;

    .line 93
    .line 94
    check-cast v0, Ll7/c;

    .line 95
    .line 96
    iget-object v0, v0, Ll7/c;->a:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v6, v0

    .line 99
    check-cast v6, LE7/i;

    .line 100
    .line 101
    new-instance v1, Li7/T;

    .line 102
    .line 103
    invoke-direct/range {v1 .. v6}, Li7/T;-><init>(Ll6/f;LT6/e;Lm7/j;Li7/l;LE7/i;)V

    .line 104
    .line 105
    .line 106
    return-object v1

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 108
.end method
