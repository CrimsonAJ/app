.class public final Lco/notix/sa;
.super Lco/notix/ua;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Irrecoverable"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lco/notix/ua;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lco/notix/sa;->b:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lco/notix/sa;->b:Ljava/lang/Throwable;

    return-object v0
.end method
