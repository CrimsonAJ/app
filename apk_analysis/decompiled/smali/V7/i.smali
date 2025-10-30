.class public final LV7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV7/j;


# instance fields
.field public final synthetic a:I

.field public final b:LA7/a;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LB2/i;LO7/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LV7/i;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV7/i;->c:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/i;

    iput-object p2, p0, LV7/i;->b:LA7/a;

    return-void
.end method

.method public constructor <init>(LV7/j;LO7/l;I)V
    .locals 0

    iput p3, p0, LV7/i;->a:I

    packed-switch p3, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LV7/i;->c:Ljava/lang/Object;

    .line 3
    check-cast p2, Lkotlin/jvm/internal/i;

    iput-object p2, p0, LV7/i;->b:LA7/a;

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV7/i;->c:Ljava/lang/Object;

    iput-object p2, p0, LV7/i;->b:LA7/a;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/String;LO7/p;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LV7/i;->a:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LV7/i;->c:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, LV7/i;->b:LA7/a;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, LV7/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LB7/B;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LB7/B;-><init>(LV7/i;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, LP/y;

    .line 13
    .line 14
    invoke-direct {v0, p0}, LP/y;-><init>(LV7/i;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, LV7/f;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LV7/f;-><init>(LV7/i;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_2
    new-instance v0, LV7/h;

    .line 25
    .line 26
    invoke-direct {v0, p0}, LV7/h;-><init>(LV7/i;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 32
.end method
